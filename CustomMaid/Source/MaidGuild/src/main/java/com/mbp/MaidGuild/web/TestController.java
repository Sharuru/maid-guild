package com.mbp.MaidGuild.web;

import com.mbp.MaidGuild.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class TestController {

    private final Logger logger = LoggerFactory.getLogger(TestController.class);
    private final TestService testService;

    @Autowired
    public TestController(TestService helloWorldService) {
        this.testService = helloWorldService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Map<String, Object> model) {
        logger.debug("index() is executed!");
        model.put("title", "MaidGuild");
        model.put("msg", "API Test Panel");
        return "index";
    }

    @RequestMapping(value = "/test/{param:.+}", method = RequestMethod.GET)
    public ModelAndView hello(@PathVariable("param") String param) {
        logger.debug("hello() is executed - $param {}", param);
        ModelAndView model = new ModelAndView();
        model.setViewName("index");
        model.addObject("title", testService.getTitle(param));
        model.addObject("msg", testService.getDesc());
        return model;

    }

}