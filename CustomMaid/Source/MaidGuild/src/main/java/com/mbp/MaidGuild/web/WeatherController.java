package com.mbp.MaidGuild.web;

import com.mbp.MaidGuild.model.WeatherModel.WeatherJson;
import com.mbp.MaidGuild.service.CityIdService;
import com.mbp.MaidGuild.service.WeatherService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Sharuru on 2015/11/19 0019.
 */
@RestController
@RequestMapping(value = "/weather")
public class WeatherController {

    //日志记录支持
    private final Logger logger = LoggerFactory.getLogger(TestController.class);
    //服务声明
    private final WeatherService weatherService;
    CityIdService cityIdService = new CityIdService();

    @Autowired
    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @RequestMapping(value = "/recent", method = RequestMethod.GET)
    @ResponseBody
    public WeatherJson recentWeather(@RequestParam String cityName) {
        logger.info("In /recent! $cityName:{}", cityName);
        //根据城市 ID 获取对应天气信息
        return weatherService.getWeatherInfoByCityId(cityIdService.getCityIdByCityName(cityName.substring(0, 2)));
    }


}
