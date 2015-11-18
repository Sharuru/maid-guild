package com.mbp.MaidGuild.service;

import com.mbp.MaidGuild.model.BaiduJson.*;
import com.mbp.MaidGuild.utils.APIUtil;
import com.mbp.MaidGuild.web.TestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.net.URLEncoder;

/**
 * Created by Sharuru on 2015/11/18 0018.
 */
@Service
public class StartService {

    //日志记录支持
    private final Logger logger = LoggerFactory.getLogger(TestController.class);

    public BaiduGeocoderJson getBaiduGeocoderJson(String location){
        String[] pos = location.split(",");
        // 拼接请求字符串获得内容
        String reqUrl = 'http://api.map.baidu.com/geocoder/v2/?ak=E4805d16520de693a3fe707cdc962045&callback=renderReverse&location=39.983424,116.322987&output=json&pois=1
    }

}
