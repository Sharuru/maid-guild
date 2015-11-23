package com.mbp.MaidGuild.model;

/**
 * Created by Sharuru on 2015/11/23 0023.
 */
public class LongDBusModel {
    public static class LongDBusJson {
        //请求结果
        String reason;
        //结果集
        Result result;
        //错误码
        String error_code;

        public String getReason() {
            return reason;
        }

        public void setReason(String reason) {
            this.reason = reason;
        }

        public Result getResult() {
            return result;
        }

        public void setResult(Result result) {
            this.result = result;
        }

        public String getError_code() {
            return error_code;
        }

        public void setError_code(String error_code) {
            this.error_code = error_code;
        }
    }

    public static class Result {
        //结果标题
        String title;
        //结果列表
        List[] list;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public List[] getList() {
            return list;
        }

        public void setList(List[] list) {
            this.list = list;
        }
    }

    public static class List {
        //始发站
        String start;
        //到达站
        String arrive;
        //出发时间
        String date;
        //票价
        String price;

        public String getStart() {
            return start;
        }

        public void setStart(String start) {
            this.start = start;
        }

        public String getArrive() {
            return arrive;
        }

        public void setArrive(String arrive) {
            this.arrive = arrive;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }
    }
}
