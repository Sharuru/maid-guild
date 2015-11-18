package com.mbp.MaidGuild.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mbp.MaidGuild.dao.APIKeyMapper;
import com.mbp.MaidGuild.model.BaiduJson.BaiduGeocoderJson;
import com.mbp.MaidGuild.utils.APIUtil;
import com.mbp.MaidGuild.utils.MyBatisUtil;
import com.mbp.MaidGuild.web.TestController;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Sharuru on 2015/11/18 0018.
 */
@Service
public class StartService {

    //日志记录支持
    private final Logger logger = LoggerFactory.getLogger(TestController.class);
    BaiduAPIService baiduAPIService = new BaiduAPIService();
    ModuleListService moduleListService = new ModuleListService();

    public BaiduGeocoderJson getBaiduGeocoderJson(String location) {
        return baiduAPIService.selectBaiduGeocoderJson(location);
    }

    public List<String> getModuleListByCityCode(String cityCode){
        return moduleListService.selectModuleListByCityCode(cityCode);
    }

}
