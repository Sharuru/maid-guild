package com.mbp.MaidGuild.service;

import com.google.gson.Gson;
import com.mbp.MaidGuild.model.WeatherModel.WeatherJson;
import com.mbp.MaidGuild.utils.APIUtil;
import com.mbp.MaidGuild.web.TestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sharuru on 2015/11/19 0019.
 */
@Service
public class WeatherService {
    //日志记录支持
    private final Logger logger = LoggerFactory.getLogger(TestController.class);
    //服务声明
    APIKeyService apiKeyService = new APIKeyService();

    public WeatherJson getWeatherInfoByCityId(String cityId) {
        String jsonStr;
        WeatherJson obj = null;
        Map<String, String> param = new HashMap<>();
        param.put("apikey", apiKeyService.getUsableAPIKeyByProvider("BAIDUAPISTORE"));
        //拼接请求字符串获得内容
        try {
            jsonStr = APIUtil.readUrl("http://apis.baidu.com/apistore/weatherservice/recentweathers?cityid=" + cityId, param);
            Gson gson = new Gson();
            obj = gson.fromJson(jsonStr, WeatherJson.class);
        } catch (Exception e) {
            logger.error(e.getMessage());
            //e.printStackTrace();
        }
        return obj;
    }
}
