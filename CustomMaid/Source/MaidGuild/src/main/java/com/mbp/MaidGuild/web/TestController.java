package com.mbp.MaidGuild.web;

import com.mbp.MaidGuild.dao.TestMapper;
import com.mbp.MaidGuild.model.TestModel;
import com.mbp.MaidGuild.service.TestService;
import com.mbp.MaidGuild.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
public class TestController {

    private final Logger logger = LoggerFactory.getLogger(TestController.class);
    private final TestService helloWorldService;

    @Autowired
    public TestController(TestService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Map<String, Object> model) {

        logger.debug("index() is executed!");

        model.put("title", helloWorldService.getTitle(""));
        model.put("msg", helloWorldService.getDesc());

        return "index";
    }

    @RequestMapping(value = "/hello/{name:.+}", method = RequestMethod.GET)
    public ModelAndView hello(@PathVariable("name") String name) {

        logger.debug("hello() is executed - $name {}", name);

        ModelAndView model = new ModelAndView();
        model.setViewName("index");

        model.addObject("title", helloWorldService.getTitle(name));
        model.addObject("msg", helloWorldService.getDesc());
        //Following in service
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        TestMapper tm = session.getMapper(TestMapper.class);
        List<TestModel> res = tm.selectAllFromTest();
        for(int i=0;i<res.size();i++){
            System.out.println(res.get(i).getRecord());
        }
        return model;

    }

}