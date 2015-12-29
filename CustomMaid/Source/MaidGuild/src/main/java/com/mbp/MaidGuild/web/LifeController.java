package com.mbp.MaidGuild.web;

import com.mbp.MaidGuild.model.PlaceSearchModel.PlaceSearchJson;
import com.mbp.MaidGuild.service.LifeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Sharuru on 2015/11/24 0024.
 */
@RestController
@RequestMapping(value = "/life")
public class LifeController {
    //日志记录支持
    private final Logger logger = LoggerFactory.getLogger(TestController.class);
    //服务声明
    private final LifeService lifeService;

    @Autowired
    public LifeController(LifeService lifeService) {
        this.lifeService = lifeService;
    }

    @RequestMapping(value = "/place", method = RequestMethod.GET)
    @ResponseBody
    public PlaceSearchJson place(@RequestParam String query, @RequestParam String location, @RequestParam String radius, @RequestParam String pageNum) {
        logger.info("In /place $query:{}, $location:{}, $radius:{}, $pageNum:{}", query, location, radius, pageNum);
        //根据参数返回数据
        return lifeService.getPlaceSearchJson(query, location, radius, pageNum);
    }
}
