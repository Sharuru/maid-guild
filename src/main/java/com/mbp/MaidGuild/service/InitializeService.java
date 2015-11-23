package com.mbp.MaidGuild.service;

import com.mbp.MaidGuild.model.GeocoderModel.GeocoderJson;
import com.mbp.MaidGuild.model.InitializeModel.StartJson;
import com.mbp.MaidGuild.web.TestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by Sharuru on 2015/11/18 0018.
 */
@Service
public class InitializeService {

    //日志记录支持
    private final Logger logger = LoggerFactory.getLogger(TestController.class);
    //服务声明
    BaiduAPIService baiduAPIService = new BaiduAPIService();
    ModuleListService moduleListService = new ModuleListService();

    public GeocoderJson getBaiduGeocoderJson(String location) {
        return baiduAPIService.getBaiduGeocoderJson(location);
    }

    public List<String> getModuleListByCityCode(String cityCode) {
        return moduleListService.selectModuleListByCityCode(cityCode);
    }

    public StartJson parseStartJson(GeocoderJson bgj) {
        //拼装自定义 Json
        StartJson respJson = new StartJson();
        //成功响应
        if ("0".equals(bgj.getStatus())) {
            //且有可读解析结果
            if (!StringUtils.isEmpty(bgj.getResult().getAddressComponent().getProvince())) {
                respJson.setResponse(bgj.getStatus());
                respJson.setProvince(bgj.getResult().getAddressComponent().getProvince());
                respJson.setAvalModuleList(getModuleListByCityCode(bgj.getResult().getCityCode()));
            } else {
                //虽成功响应但无可读结果
                respJson.setResponse(bgj.getStatus() + ": No result found");
            }
        } else {
            respJson.setResponse(bgj.getStatus() + ": " + bgj.getMsg());
        }
        return respJson;
    }
}
