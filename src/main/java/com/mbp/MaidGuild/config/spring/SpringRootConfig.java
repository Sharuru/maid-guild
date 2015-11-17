package com.mbp.MaidGuild.config.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "com.mbp.MaidGuild.service" })
public class SpringRootConfig {
}