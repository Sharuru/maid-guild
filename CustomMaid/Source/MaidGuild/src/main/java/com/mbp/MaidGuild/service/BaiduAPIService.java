package com.mbp.MaidGuild.service;

import com.google.gson.Gson;
import com.mbp.MaidGuild.model.BaiduJson.BaiduGeocoderJson;
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

    public BaiduGeocoderJson selectBaiduGeocoderJson(String location) {
        String jsonStr;
        BaiduGeocoderJson obj = null;
        // 拼接请求字符串获得内容
        try {
            jsonStr = APIUtil.readUrl("http://api.map.baidu.com/geocoder/v2/?ak=" + apiKeyService.selectUsableAPIKeyByProvider("BAIDUWEB") + "&location=" + location + "&output=json");
            Gson gson = new Gson();
            obj = gson.fromJson(jsonStr, BaiduGeocoderJson.class);
        } catch (Exception e) {
            logger.error(e.getMessage());
            //e.printStackTrace();
        }
        return obj;
    }

}
