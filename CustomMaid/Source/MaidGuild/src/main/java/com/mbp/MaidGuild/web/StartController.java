package com.mbp.MaidGuild.web;

import com.mbp.MaidGuild.service.StartService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Sharuru on 2015/11/18 0018.
 * 这个 Controller 主要负责在 APP 启动时进行一系列的信息上报功能
 */

@Controller
@RequestMapping(value="/start")
public class StartController {

    //日志记录支持
    private final Logger logger = LoggerFactory.getLogger(TestController.class);
    //服务声明
    private final StartService startService;
    @Autowired
    public StartController(StartService startService){this.startService = startService;}

    @RequestMapping(value = "/getCity&location={location}", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView getCity(ModelAndView model ,@PathVariable("location") String location){
        //ModelAndView model = new ModelAndView();
        logger.info("In /getCity! $location:{}",location);
        //startService.getBaiduGeocoderJson(location).getAddressComponent().getCity());
        //startService.getModuleListByCityCode();
        return model;
    }

}
