package com.mbp.MaidGuild.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class TestService {

    private static final Logger logger = LoggerFactory.getLogger(TestService.class);

    public String getDesc() {

        logger.debug("getDesc() is executed!");

        return "API Test Panel";

    }

    public String getTitle(String param) {

        logger.debug("getTitle() is executed! $param : {}", param);

        if (StringUtils.isEmpty(param)) {
            return "MaidGuild → N/A";
        } else {
            return "MaidGuild → " + param;
        }

    }

}