package com.mbp.MaidGuild.service;

import com.google.gson.Gson;
import com.mbp.MaidGuild.model.LongDBusModel.LongDBusJson;
import com.mbp.MaidGuild.model.TrainTimeModel.TrainTimeByIdJson;
import com.mbp.MaidGuild.model.TrainTimeModel.TrainTimeByStationJson;
import com.mbp.MaidGuild.model.RoadsModel.RoadsJson;
import com.mbp.MaidGuild.utils.APIUtil;
import com.mbp.MaidGuild.web.TestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.net.URLEncoder;
import java.util.HashMap;
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
    APIKeyService apiKeyService = new APIKeyService();

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
            //jsonStr = APIUtil.readUrl("http://api.map.baidu.com/telematics/v3/trafficEvent?location=" + URLEncoder.encode(location, "UTF-8") + "&output=json&ak=" + apiKeyService.getUsableAPIKeyByProvider("BAIDUWEB"), null);
            Gson gson = new Gson();
            obj = gson.fromJson(jsonStr, RoadsJson.class);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return obj;
    }
}
