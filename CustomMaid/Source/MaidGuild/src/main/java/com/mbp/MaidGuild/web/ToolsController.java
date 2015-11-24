package com.mbp.MaidGuild.web;

import com.mbp.MaidGuild.model.ExpressModel.ExpressJson;
import com.mbp.MaidGuild.model.LotteryModel.LotteryJson;
import com.mbp.MaidGuild.model.TranslationModel.TranslationJson;
import com.mbp.MaidGuild.service.ToolsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Sharuru on 2015/11/19 0019.
 */
@RestController
@RequestMapping(value = "/tools")
public class ToolsController {
    //日志记录支持
    private final Logger logger = LoggerFactory.getLogger(TestController.class);
    //服务声明
    private final ToolsService toolsService;

    @Autowired
    public ToolsController(ToolsService toolsService) {
        this.toolsService = toolsService;
    }

    @RequestMapping(value = "/translation", method = RequestMethod.GET)
    @ResponseBody
    public TranslationJson translation(@RequestParam String query, @RequestParam String from, @RequestParam String to) {
        logger.info("In /translation $query:{}, $from:{}, $to:{}", query, from, to);
        //根据参数翻译
        return toolsService.getTranslation(from, to, query);
    }

    @RequestMapping(value = "/express", method = RequestMethod.GET)
    @ResponseBody
    public ExpressJson express(@RequestParam String company, @RequestParam String postid) {
        logger.info("In /express $company:{}, $postId{}", company, postid);
        //根据公司与单号返回数据
        return toolsService.getExpressJson(company, postid);
    }

    @RequestMapping(value = "/lottery", method = RequestMethod.GET)
    @ResponseBody
    public LotteryJson lottery(@RequestParam String code) {
        logger.info("In /lottery $code:{}", code);
        //根据彩种返回数据
        return toolsService.getLotteryJson(code);
    }

}
