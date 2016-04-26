package com.mbp.MaidGuild.service;

import com.google.gson.Gson;
import com.mbp.MaidGuild.dao.MetroInfoMapper;
import com.mbp.MaidGuild.model.*;
import com.mbp.MaidGuild.model.LongDBusModel.LongDBusJson;
import com.mbp.MaidGuild.model.TrainTimeModel.TrainTimeByIdJson;
import com.mbp.MaidGuild.model.TrainTimeModel.TrainTimeByStationJson;
import com.mbp.MaidGuild.model.RoadsModel.RoadsJson;
import com.mbp.MaidGuild.utils.APIUtil;
import com.mbp.MaidGuild.utils.MyBatisUtil;
import com.mbp.MaidGuild.web.TestController;
import org.apache.commons.io.output.StringBuilderWriter;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.apache.ibatis.reflection.factory.ObjectFactory;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Sharuru on 2015/11/23 0023.
 */
@Service
public class TravelService {
    //日志记录支持
    private final Logger logger = LoggerFactory.getLogger(TestController.class);
    //服务声明
    private APIKeyService apiKeyService = new APIKeyService();

    private Map<String, String> shMetroMap = new HashMap<>();

    public LongDBusJson getLongDBusJson(String from, String to) {
        String jsonStr;
        LongDBusJson obj = null;
        //拼接请求字符串获得内容
        try {
            jsonStr = APIUtil.readUrl("http://op.juhe.cn/onebox/bus/query_ab?key=" + apiKeyService.getUsableAPIKeyByProvider("LONGDBUS") + "&from=" + URLEncoder.encode(from, "UTF-8") + "&to=" + URLEncoder.encode(to, "UTF-8"), null);
            //结果去重处理
            //先获得list结果
            int listHead = jsonStr.indexOf("\"list\":[");
            int listTail = jsonStr.indexOf("\"error_code\"");
            String listStr = jsonStr.substring(listHead + 8);
            //对list去重
            String regex = "\\{.*?}";
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(listStr);
            //原始头拼接
            StringBuilder trimmedJsonSlr = new StringBuilder(jsonStr.substring(0, listHead + 8));
            //匹配
            while (m.find()) {
                //且不存在相同记录
                if (trimmedJsonSlr.indexOf(m.group(0)) == -1) {
                    //拼接
                    trimmedJsonSlr.append(m.group(0));
                    trimmedJsonSlr.append(",");
                }
            }
            //list尾修正
            trimmedJsonSlr.deleteCharAt(trimmedJsonSlr.length() - 1);
            trimmedJsonSlr.append("]},");
            //原始尾拼接
            trimmedJsonSlr.append(jsonStr.substring(listTail));
            Gson gson = new Gson();
            obj = gson.fromJson(trimmedJsonSlr.toString(), LongDBusJson.class);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return obj;
    }

    public TrainTimeByIdJson getTrainTimeByIdJson(String Id) {
        String jsonStr;
        TrainTimeByIdJson obj = null;
        //根据检索类型拼接字符串
        try {
            jsonStr = APIUtil.readUrl("http://op.juhe.cn/onebox/train/query?key=" + apiKeyService.getUsableAPIKeyByProvider("TRAINTIME") + "&train=" + Id, null);
            Gson gson = new Gson();
            obj = gson.fromJson(jsonStr, TrainTimeByIdJson.class);
        } catch (Exception e) {
            logger.error(e.getMessage());
            e.printStackTrace();
        }
        return obj;
    }

    public TrainTimeByStationJson getTrainTimeByStationJson(String from, String to) {
        String jsonStr;
        TrainTimeByStationJson obj = null;
        //根据检索类型拼接字符串
        try {
            jsonStr = APIUtil.readUrl("http://op.juhe.cn/onebox/train/query_ab.php?key=" + apiKeyService.getUsableAPIKeyByProvider("TRAINTIME") + "&from=" + URLEncoder.encode(from, "UTF-8") + "&to=" + URLEncoder.encode(to, "UTF-8"), null);
            Gson gson = new Gson();
            obj = gson.fromJson(jsonStr, TrainTimeByStationJson.class);
        } catch (Exception e) {
            logger.error(e.getMessage());
            e.printStackTrace();
        }
        return obj;
    }

    //The following API is unstable
    public RoadsJson getRoadsJson(String location) {
        String jsonStr;
        RoadsJson obj = null;
        Map<String, String> param = new HashMap<>();
        param.put("apikey", apiKeyService.getUsableAPIKeyByProvider("BAIDUAPISTORE"));
        //拼接请求字符串获得内容
        try {
            jsonStr = APIUtil.readUrl("http://apis.baidu.com/apistore/trafficevent/search?location=北京&output=json", param);
            Gson gson = new Gson();
            obj = gson.fromJson(jsonStr, RoadsJson.class);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return obj;
    }

    public MetroModel.MetroJson getShanghaiMetroJson(String o, String d, String t) {
        //首先先获取原始 Json
        //路径
        ShMetroModel.ShMetroCJson cObj = null;
        try {
            Gson gson = new Gson();
            String cJsonStr = APIUtil.readUrl("http://service.shmetro.com/i/c?o=" + o + "&d=" + d + "&t=" + t, null);
            //云盾 CC 防御处理
            if ("<html>".equals(cJsonStr.substring(0, 6))) {
                cJsonStr = breakYunDun(cJsonStr);
            }
            cObj = gson.fromJson(cJsonStr, ShMetroModel.ShMetroCJson.class);
        } catch (Exception e) {
            System.out.println("cObj error");
            logger.error(e.getMessage());
        }
        //票价
        ShMetroModel.ShMetroPJson pObj = null;
        try {
            Gson gson = new Gson();
            String pJsonStr = APIUtil.readUrl("http://service.shmetro.com/i/p?o=" + o + "&d=" + d + "&t=" + t, null);
            if ("<html>".equals(pJsonStr.substring(0, 6))) {
                pJsonStr = breakYunDun(pJsonStr);
            }
            pObj = gson.fromJson(pJsonStr, ShMetroModel.ShMetroPJson.class);
        } catch (Exception e) {
            System.out.println("pObj error");
            logger.error(e.getMessage());
        }
        //拼接
        MetroModel.MetroJson obj = new MetroModel.MetroJson();
        //生成 data model
        List<MetroModel.Data> list = new ArrayList<>();
        for (int i = 0; i < cObj.getData().getTotal(); i++) {
            //总觉得这里的实现很糟糕 :(
            MetroModel.Data data = new MetroModel.Data();
            data.setDestinationStationName(trimStationIdForShMetro(cObj.getData().getList()[i].getD(), "Single"));
            data.setNo(cObj.getData().getList()[i].getNo());
            data.setInterchangeDuration(cObj.getData().getList()[i].getPttm());
            data.setPassedStationAmount(cObj.getData().getList()[i].getPsnm());
            data.setOriginStationName(trimStationIdForShMetro(cObj.getData().getList()[i].getO(), "Single"));
            data.setOlasttime(cObj.getData().getList()[i].getOlasttime());
            data.setPassedStationName(trimStationIdForShMetro(cObj.getData().getList()[i].getPsid(), "Passed"));
            data.setLttm(cObj.getData().getList()[i].getLttm());
            data.setInterchangeStationName(trimStationIdForShMetro(cObj.getData().getList()[i].getPtid(), "Inter"));
            data.setLstm(cObj.getData().getList()[i].getLstm());
            data.setPassedDuration(cObj.getData().getList()[i].getPstm());
            data.setInterchangeLine(cObj.getData().getList()[i].getPlid());
            data.setBstm(cObj.getData().getList()[i].getBstm());
            data.setPrice(pObj.getData().getP());
            list.add(data);
        }
        obj.setData(list);
        return obj;
    }

    private String trimStationIdForShMetro(String raw, String trimType) {
        //查询字典没有数据的场合
        if (shMetroMap.size() == 0) {
            SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
            MetroInfoMapper mim = sqlSession.getMapper(MetroInfoMapper.class);
            List<MetroInfoModel> mimList = null;
            try {
                mimList = mim.selectAllStationByCityId("101020100");
                sqlSession.commit();
            } catch (Exception e) {
                sqlSession.rollback();
                logger.error(e.getMessage());
            } finally {
                sqlSession.close();
            }
            if (mimList != null) {
                for (MetroInfoModel currObj : mimList) {
                    shMetroMap.put(currObj.getStationId(), currObj.getStationName());
                }
            }
        }
        //单一去0:0111 -> 111 -> STATION_NAME
        switch (trimType) {
            case "Single":
                //ASCII(48)="0"
                if (raw.charAt(0) == 48) {
                    raw = raw.substring(1);
                }
                raw = shMetroMap.get(raw);
                break;
            //途径站列:111-112-113 -> STATION_NAME_1-STATION_NAME_2
            case "Passed": {
                StringBuilder strb = new StringBuilder();
                String[] rawArr = raw.split("-");
                for (String currRaw : rawArr) {
                    strb.append(shMetroMap.get(currRaw));
                    strb.append("-");
                }
                raw = strb.toString().substring(0, strb.toString().length() - 1);
                break;
            }
            //换乘:111(112)-113(114) -> STATION_NAME_1(STATION_NAME_2)-STATION_NAME_3(STATION_NAME_4)
            case "Inter": {
                //匹配出所有站点 ID
                String regex = "\\d{3,4}";
                Pattern p = Pattern.compile(regex);
                Matcher m = p.matcher(raw);
                StringBuilder strb = new StringBuilder();
                Boolean appendFlag = true;
                while (m.find()) {
                    strb.append(shMetroMap.get(m.group()));
                    if (appendFlag) {
                        strb.append("(");
                        appendFlag = !appendFlag;
                    } else {
                        strb.append(")-");
                        appendFlag = !appendFlag;
                    }
                }
                if (strb.length() != 0) {
                    raw = strb.toString().substring(0, strb.toString().length() - 1);
                } else {
                    raw = strb.toString();
                }
                break;
            }
        }
        return raw;
    }

    private String breakYunDun(String rawJs) {
        logger.info("breakYunDun() engage...");
        //提取 JS 代码
        String rawScript = rawJs.substring(rawJs.indexOf("window.onload=") + 14, rawJs.indexOf("</script>"));
        //新建 Script engine 实例
        ScriptEngineManager sem = new ScriptEngineManager();
        ScriptEngine js = sem.getEngineByExtension("js");
        //修改 JS 代码
        String script = rawScript.substring(27, rawScript.indexOf("eval(\"qo=eval;qo(po);\");"));
        //获得调用参数
        String regEx = "function .+?\\((.+?)\\) \\{";
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(rawScript);
        matcher.find();
        String jsParamName = matcher.group(1);
        //获得调用值
        regEx = "setTimeout\\(.+?\\((.+?)\\)";
        pattern = Pattern.compile(regEx);
        matcher = pattern.matcher(rawScript);
        matcher.find();
        String jsParamValue = matcher.group(1);
        //替换 script 对应值
        script = script.substring(16);
        script = script.replaceAll(jsParamName + "\\);", jsParamValue + "\\);");
        Object eval = null;
        try {
            eval = js.eval(script);
        } catch (ScriptException e) {
            System.out.println("ERR_JS_EXECUTE");
            e.printStackTrace();
        }
        String pass = eval != null ? eval.toString().substring(17, eval.toString().length() - 1) : null;
        try {
            rawJs = APIUtil.readUrl("http://service.shmetro.com" + pass, null);
        } catch (Exception e) {
            System.out.println("ERR_READ_URL");
        }
        return rawJs;
    }

    public BusInfoModel.BusInfoJson getBusJson(String cityStr, String busCode) {
        String jsonStr;
        BusInfoModel.BusInfoJson obj = null;
        //拼接请求字符串获得内容
        try {
            jsonStr = APIUtil.readUrl("http://op.juhe.cn/189/bus/busline?key=" + apiKeyService.getUsableAPIKeyByProvider("BUS") + "&city=" + URLEncoder.encode(cityStr, "UTF-8") + "&bus=" + URLEncoder.encode(busCode, "UTF-8"), null);
            Gson gson = new Gson();
            obj = gson.fromJson(jsonStr, BusInfoModel.BusInfoJson.class);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return obj;
    }

    public BusModel.BusJson getBusListJson(String cityStr, String stationStr) {
        String jsonStr;
        BusModel.BusJson obj = null;
        try {
            jsonStr = APIUtil.readUrl("http://op.juhe.cn/189/bus/station?key=" + apiKeyService.getUsableAPIKeyByProvider("BUS") + "&city=" + URLEncoder.encode(cityStr, "UTF-8") + "&station=" + URLEncoder.encode(stationStr, "UTF-8"), null);
            Gson gson = new Gson();
            obj = gson.fromJson(jsonStr, BusModel.BusJson.class);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return obj;
    }

    public OutingModel.drivingJson getDrivingInfo(String origin, String destination, String origin_region, String destination_region) {
        String jsonStr;
        OutingModel.drivingJson obj = null;
        try {
            jsonStr = APIUtil.readUrl("http://api.map.baidu.com/direction/v1?mode=driving&origin=" + URLEncoder.encode(origin, "UTF-8") + "&destination=" + URLEncoder.encode(destination, "UTF-8") + "&origin_region=" + URLEncoder.encode(origin_region, "UTF-8") + "&destination_region=" + URLEncoder.encode(destination_region, "UTF-8") + "&output=json&ak=" + apiKeyService.getUsableAPIKeyByProvider("BAIDUWEB"), null);
            Gson gson = new Gson();
            obj = gson.fromJson(jsonStr, OutingModel.drivingJson.class);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return obj;
    }
}
