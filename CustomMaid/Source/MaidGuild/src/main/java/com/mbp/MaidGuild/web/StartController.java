package com.mbp.MaidGuild.web;

import com.mbp.MaidGuild.model.BaiduJson.BaiduGeocoderJson;
import com.mbp.MaidGuild.model.GuildJson.StartJson;
import com.mbp.MaidGuild.service.StartService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Sharuru on 2015/11/18 0018.
 * 这个 Controller 主要负责在 APP 启动时进行一系列的信息上报功能
 */

@Controller
@RequestMapping(value = "/start")
public class StartController {

    //日志记录支持
    private final Logger logger = LoggerFactory.getLogger(TestController.class);
    //服务声明
    private final StartService startService;

    @Autowired
    public StartController(StartService startService) {
        this.startService = startService;
    }

    @RequestMapping(value = "/getCity&location={location:.+}", method = RequestMethod.GET)
    @ResponseBody
    public StartJson getCity(@PathVariable("location") String location) {
        logger.info("In /getCity! $location:{}", location);
        //对象声明
        //发起 API 请求获取所在城市位置
        BaiduGeocoderJson bgj = startService.getBaiduGeocoderJson(location);
        //拼装 Json 对象
        StartJson respJson = new StartJson();
        respJson.setProvince(bgj.getResult().getAddressComponent().getProvince());
        respJson.setAvalModuleList(startService.getModuleListByCityCode(bgj.getResult().getCityCode()));
        return respJson;
    }

}
