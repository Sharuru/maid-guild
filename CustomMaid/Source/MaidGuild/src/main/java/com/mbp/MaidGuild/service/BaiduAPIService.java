package com.mbp.MaidGuild.service;

import com.google.gson.Gson;
import com.mbp.MaidGuild.model.GeocoderModel.GeocoderJson;
import com.mbp.MaidGuild.utils.APIUtil;
import com.mbp.MaidGuild.web.TestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by Sharuru on 2015/11/18 0018.
 */
@Service
public class BaiduAPIService {
    //日志记录支持
    private final Logger logger = LoggerFactory.getLogger(TestController.class);
    APIKeyService apiKeyService = new APIKeyService();

    public GeocoderJson getBaiduGeocoderJson(String location) {
        String jsonStr;
        GeocoderJson obj = null;
        // 拼接请求字符串获得内容
        try {
            jsonStr = APIUtil.readUrl("http://api.map.baidu.com/geocoder/v2/?ak=" + apiKeyService.getUsableAPIKeyByProvider("BAIDUWEB") + "&location=" + location + "&output=json", null);
            Gson gson = new Gson();
            obj = gson.fromJson(jsonStr, GeocoderJson.class);
        } catch (Exception e) {
            logger.error(e.getMessage());
            //e.printStackTrace();
        }
        return obj;
    }

}
