package com.mbp.MaidGuild.model;

/**
 * Created by Sharuru on 2015/11/24 0024.
 */
public class LotteryModel {
    public static class LotteryJson {
        //记录数
        String rows;
        //彩种
        String code;
        //附加信息
        String info;
        //开奖数据
        Data[] data;

        public String getRows() {
            return rows;
        }

        public void setRows(String rows) {
            this.rows = rows;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }

        public Data[] getData() {
            return data;
        }

        public void setData(Data[] data) {
            this.data = data;
        }
    }

    public static class Data {
        //期数
        String expect;
        //开奖号码
        String opencode;
        //开奖时间
        String opentime;
        //开奖时间戳
        String opentimestamp;

        public String getExpect() {
            return expect;
        }

        public void setExpect(String expect) {
            this.expect = expect;
        }

        public String getOpencode() {
            return opencode;
        }

        public void setOpencode(String opencode) {
            this.opencode = opencode;
        }

        public String getOpentime() {
            return opentime;
        }

        public void setOpentime(String opentime) {
            this.opentime = opentime;
        }

        public String getOpentimestamp() {
            return opentimestamp;
        }

        public void setOpentimestamp(String opentimestamp) {
            this.opentimestamp = opentimestamp;
        }
    }
}
