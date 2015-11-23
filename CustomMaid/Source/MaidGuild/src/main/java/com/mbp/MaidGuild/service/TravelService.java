package com.mbp.MaidGuild.service;

import com.google.gson.Gson;
import com.mbp.MaidGuild.model.LongDBusModel.LongDBusJson;
import com.mbp.MaidGuild.model.TrainTimeModel.TrainTimeByIdJson;
import com.mbp.MaidGuild.model.TrainTimeModel.TrainTimeByStationJson;
import com.mbp.MaidGuild.utils.APIUtil;
import com.mbp.MaidGuild.web.TestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.net.URLEncoder;

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
            Gson gson = new Gson();
            obj = gson.fromJson(jsonStr, LongDBusJson.class);
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
}
