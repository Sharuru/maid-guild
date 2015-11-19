package com.mbp.MaidGuild.service;

import com.google.gson.Gson;
import com.mbp.MaidGuild.model.TranslationModel.TranslationJson;
import com.mbp.MaidGuild.utils.APIUtil;
import com.mbp.MaidGuild.web.TestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sharuru on 2015/11/19 0019.
 */
@Service
public class ToolsService {
    //日志记录支持
    private final Logger logger = LoggerFactory.getLogger(TestController.class);
    //服务声明
    APIKeyService apiKeyService = new APIKeyService();

    public TranslationJson getTranslation(String from, String to, String src) {
        String jsonStr;
        TranslationJson obj = null;
        Map<String, String> param = new HashMap<>();
        param.put("apikey", apiKeyService.selectUsableAPIKeyByProvider("BAIDUAPISTORE"));
        //拼接请求字符串获得内容
        try {
            String url = "http://apis.baidu.com/apistore/tranlateservice/translate?query=" + URLEncoder.encode(src, "UTF-8") + "&from=" + from + "&to=" + to;
            System.out.println(url);
            jsonStr = APIUtil.readUrl( "http://apis.baidu.com/apistore/tranlateservice/translate?query=" + URLEncoder.encode(src, "UTF-8") + "&from=" + from + "&to=" + to, param);
            Gson gson = new Gson();
            obj = gson.fromJson(jsonStr, TranslationJson.class);
        } catch (Exception e) {
            logger.error(e.getMessage());
            //e.printStackTrace();
        }
        return obj;
    }
}
