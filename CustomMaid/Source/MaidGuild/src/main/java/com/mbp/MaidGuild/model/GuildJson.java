package com.mbp.MaidGuild.model;

import java.util.List;

/**
 * Created by Sharuru on 2015/11/18 0018.
 */
public class GuildJson {

    public static class StartJson {
        //响应结果
        String response;
        //省市名
        String province;
        //可用模块列表
        List<String> avalModuleList;

        public String getResponse() {
            return response;
        }

        public void setResponse(String response) {
            this.response = response;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public List<String> getAvalModuleList() {
            return avalModuleList;
        }

        public void setAvalModuleList(List<String> avalModuleList) {
            this.avalModuleList = avalModuleList;
        }
    }
}
