package com.mbp.MaidGuild.service;

import com.google.gson.Gson;
import com.mbp.MaidGuild.model.PlaceSearchModel.PlaceSearchJson;
import com.mbp.MaidGuild.utils.APIUtil;
import com.mbp.MaidGuild.web.TestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.net.URLEncoder;

/**
 * Created by Sharuru on 2015/11/24 0024.
 */
@Service
public class LifeService {
    //日志记录支持
    private final Logger logger = LoggerFactory.getLogger(TestController.class);
    //服务声明
    APIKeyService apiKeyService = new APIKeyService();

    public PlaceSearchJson getPlaceSearchJson(String query, String location, String radius, String pageNum) {
        String jsonStr;
        PlaceSearchJson obj = null;
        //拼接请求字符串获得内容
        try {
            jsonStr = APIUtil.readUrl("http://api.map.baidu.com/place/v2/search?query=" + URLEncoder.encode(query,"UTF-8") + "&location=" + location + "&radius=" + radius + "&output=json&page_size=10&page_num=" + pageNum + "&ak=" + apiKeyService.getUsableAPIKeyByProvider("BAIDUWEB"), null);
            Gson gson = new Gson();
            obj = gson.fromJson(jsonStr, PlaceSearchJson.class);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return obj;
    }
}
