package com.mbp.MaidGuild.model;

/**
 * Created by S1507109 on 2016/04/08.
 */
public class BusModel {

    public static class BusJson {
        //请求结果
        String reason;
        //结果集
        Result[] result;
        //错误码
        String error_code;

        public String getReason() { return reason; }

        public void setReason(String reason) { this.reason = reason; }

        public Result[] getResult() { return result; }

        public void setResult(Result[] result) { this.result = result; }

        public String getError_code() { return error_code; }

        public void setError_code(String error_code) { this.error_code = error_code; }
    }

    public static class Result{
        //线路编号
        String line_id;
        //线路说明
        String name;
        //线路名称
        String key_name;
        //始发站
        String front_name;
        //终点站
        String terminal_name;
        //首班车时间
        String start_time;
        //末班车时间
        String end_time;
        //基本票价
        String basic_price;
        //总票价
        String total_price;
        //公交公司
        String company;
        //线路长度
        String length;

        public String getLine_id() { return line_id; }

        public void setLine_id(String line_id) { this.line_id = line_id; }

        public String getName() { return name; }

        public void setName(String name) { this.name = name; }

        public String getKey_name() { return key_name; }

        public void setKey_name(String key_name) { this.key_name = key_name; }

        public String getFront_name() { return front_name; }

        public void setFront_name(String front_name) { this.front_name = front_name; }

        public String getTerminal_name() { return terminal_name; }

        public void setTerminal_name(String terminal_name) { this.terminal_name = terminal_name; }

        public String getStart_time() { return start_time; }

        public void setStart_time(String start_time) { this.start_time = start_time; }

        public String getEnd_time() { return end_time; }

        public void setEnd_time(String end_time) { this.end_time = end_time; }

        public String getBasic_price() { return basic_price; }

        public void setBasic_price(String basic_price) { this.basic_price = basic_price; }

        public String getTotal_price() { return total_price; }

        public void setTotal_price(String total_price) { this.total_price = total_price; }

        public String getCompany() { return company; }

        public void setCompany(String company) { this.company = company; }

        public String getLength() { return length; }

        public void setLength(String length) { this.length = length; }
    }
}
