package com.mbp.MaidGuild.web;

import com.mbp.MaidGuild.model.LongDBusModel.LongDBusJson;
import com.mbp.MaidGuild.model.TrainTimeModel.TrainTimeByIdJson;
import com.mbp.MaidGuild.model.TrainTimeModel.TrainTimeByStationJson;
import com.mbp.MaidGuild.service.TravelService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Sharuru on 2015/11/23 0023.
 */
@RestController
@RequestMapping(value = "/travel")
public class TravelController {
    //日志记录支持
    private final Logger logger = LoggerFactory.getLogger(TestController.class);
    //服务声明
    private final TravelService travelService;

    @Autowired
    public TravelController(TravelService travelService) {
        this.travelService = travelService;
    }

    @RequestMapping(value = "/longDBus", method = RequestMethod.GET)
    @ResponseBody
    public LongDBusJson longDBus(@RequestParam String from, @RequestParam String to) {
        logger.info("In /longDBus $from:{}, $to:{}", from, to);
        //根据参数查询
        return travelService.getLongDBusJson(from, to);
    }

    @RequestMapping(value = "/train/id", method = RequestMethod.GET)
    @ResponseBody
    public TrainTimeByIdJson trainId(@RequestParam String id) {
        logger.info("In /train/id $id:{}", id);
        return travelService.getTrainTimeByIdJson(id);
    }

    @RequestMapping(value = "/train/station", method = RequestMethod.GET)
    @ResponseBody
    public TrainTimeByStationJson trainStation(@RequestParam String from, @RequestParam String to) {
        logger.info("In /train/station $from:{}, $to:{}", from, to);
        return travelService.getTrainTimeByStationJson(from, to);
    }
}