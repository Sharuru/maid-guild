package com.mbp.MaidGuild.model;

/**
 * Created by Sharuru on 2015/11/23 0023.
 */
public class ExpressModel {

    public static class ExpressJson {
        //响应信息
        String message;
        //快递单号
        String nu;
        //不明
        String ischeck;
        //公司名
        String com;
        //响应状态
        String status;
        //不明
        String condition;
        //配送状态
        //0: 运输中
        //1: 已揽件
        //2: 疑难件
        //3: 已签收
        //4: 已退回
        //5: 派件中
        //6: 退回中
        String state;
        //溯源信息
        Data[] data;

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getNu() {
            return nu;
        }

        public void setNu(String nu) {
            this.nu = nu;
        }

        public String getIscheck() {
            return ischeck;
        }

        public void setIscheck(String ischeck) {
            this.ischeck = ischeck;
        }

        public String getCom() {
            return com;
        }

        public void setCom(String com) {
            this.com = com;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getCondition() {
            return condition;
        }

        public void setCondition(String condition) {
            this.condition = condition;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public Data[] getData() {
            return data;
        }

        public void setData(Data[] data) {
            this.data = data;
        }
    }

    public static class Data {
        //时间
        String time;
        //信息
        String context;
        //不明
        String ftime;

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getContext() {
            return context;
        }

        public void setContext(String context) {
            this.context = context;
        }

        public String getFtime() {
            return ftime;
        }

        public void setFtime(String ftime) {
            this.ftime = ftime;
        }
    }
}
