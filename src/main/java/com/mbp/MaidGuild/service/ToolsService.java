package com.mbp.MaidGuild.service;

import com.google.gson.Gson;
import com.mbp.MaidGuild.model.ExchangeModel.ExchangeJson;
import com.mbp.MaidGuild.model.ExpressModel.ExpressJson;
import com.mbp.MaidGuild.model.LotteryModel.LotteryJson;
import com.mbp.MaidGuild.model.StockModel.StockJson;
import com.mbp.MaidGuild.model.TranslationModel.TranslationJson;
import com.mbp.MaidGuild.utils.APIUtil;
import com.mbp.MaidGuild.web.TestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by Sharuru on 2015/11/19 0019.
 */
@Service
public class ToolsService {
    //日志记录支持
    private final Logger logger = LoggerFactory.getLogger(TestController.class);
    //服务声明
    APIKeyService apiKeyService = new APIKeyService();
    //随机方法
    private final Random random = new Random();

    public TranslationJson getTranslation(String from, String to, String src) {
        String jsonStr;
        TranslationJson obj = null;
        Map<String, String> param = new HashMap<>();
        //MD5 加密处理
        String appId = "20160510000020610";
        int salt = random.nextInt(1000000);
        //int salt = 6690;
        String apiKeyStr = apiKeyService.getUsableAPIKeyByProvider("BAIDUTRANS");
        param.put("apikey", apiKeyStr);
        //拼接请求字符串获得内容
        try {
            //src = new String(src.getBytes(), "UTF-8");
            String md5String = appId + src + salt + apiKeyStr;
            md5String = new String(md5String.getBytes(), "UTF-8");
            String md5Str = DigestUtils.md5DigestAsHex(md5String.getBytes());
            //TODO：部分字串会被丢弃，比如賢い可愛いの絵里就会报错
            jsonStr = APIUtil.readUrl("http://api.fanyi.baidu.com/api/trans/vip/translate?q=" + URLEncoder.encode(src, "UTF-8") + "&from=" + from + "&to=" + to + "&appid=" + URLEncoder.encode(appId, "UTF-8") + "&salt=" + salt + "&sign=" + URLEncoder.encode(md5Str, "UTF-8"), param);
            Gson gson = new Gson();
            obj = gson.fromJson(jsonStr, TranslationJson.class);
        } catch (Exception e) {
            logger.error(e.getMessage());
            //e.printStackTrace();
        }
        return obj;
    }

    public ExpressJson getExpressJson(String company, String postId) {
        String jsonStr;
        ExpressJson obj = null;
        //拼接请求字符串获得内容
        try {
            jsonStr = APIUtil.readUrl("http://www.kuaidi100.com/query?type=" + company + "&postid=" + postId, null);
            Gson gson = new Gson();
            obj = gson.fromJson(jsonStr, ExpressJson.class);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return obj;
    }

    public LotteryJson getLotteryJson(String code) {
        String jsonStr;
        LotteryJson obj = null;
        //拼接请求字符串获得内容
        try {
            jsonStr = APIUtil.readUrl("http://f.apiplus.cn/" + code + ".json", null);
            Gson gson = new Gson();
            obj = gson.fromJson(jsonStr, LotteryJson.class);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return obj;
    }

    public StockJson getStockJson(String code) {
        String jsonStr;
        StockJson obj = null;
        //拼接请求字符串获得内容
        try {
            jsonStr = APIUtil.readUrl("http://web.juhe.cn:8080/finance/stock/hs?gid=" + code + "&key=" + apiKeyService.getUsableAPIKeyByProvider("STOCK"), null);
            Gson gson = new Gson();
            obj = gson.fromJson(jsonStr, StockJson.class);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return obj;
    }

    public ExchangeJson getExchangeJson(String bank) {
        String jsonStr;
        ExchangeJson obj = null;
        //拼接请求字符串获得内容
        try {
            jsonStr = APIUtil.readUrl("http://web.juhe.cn:8080/finance/exchange/rmbquot?bank=" + bank + "&key=" + apiKeyService.getUsableAPIKeyByProvider("EXCHANGE"), null);
            Gson gson = new Gson();
            obj = gson.fromJson(jsonStr, ExchangeJson.class);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return obj;
    }


}
