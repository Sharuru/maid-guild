package com.mbp.MaidGuild.model;

/**
 * Created by S1507109 on 2016/04/08.
 */
public class BusInfoModel {

    public static class BusInfoJson {
        //请求结果
        String reason;
        //结果集
        Result[] result;
        //错误码
        String error_code;

        public String getReason() {
            return reason;
        }

        public void setReason(String reason) {
            this.reason = reason;
        }

        public Result[] getResult() {
            return result;
        }

        public void setResult(Result[] result) {
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
        //终点站名称
        String terminal_name;
        //线路编号
        String line_id;
        //线路名称
        String key_name;
        //首发站名称
        String front_name;
        //站台列表
        Stationdes[] stationdes;
        //早班车时间
        String start_time;
        //公交公司名称
        String company;
        //是否环线，0-否，1-是
        String loop;
        //是否自动（无人）售票，0-人工售票，1-无人售票
        String status;
        //末班车时间
        String end_time;
        //线路名称
        String name;

        public String getTerminal_name() { return terminal_name; }

        public void setTerminal_name(String terminal_name) { this.terminal_name = terminal_name; }

        public String getLine_id() { return line_id; }

        public void setLine_id(String line_id) { this.line_id = line_id; }

        public String getKey_name() { return key_name; }

        public void setKey_name(String key_name) { this.key_name = key_name; }

        public String getFront_name() { return front_name; }

        public void setFront_name(String front_name) { this.front_name = front_name; }

        public Stationdes[] getStationdes() { return stationdes; }

        public void setStationdes(Stationdes[] stationdes) { this.stationdes = stationdes; }

        public String getStart_time() { return start_time; }

        public void setStart_time(String start_time) { this.start_time = start_time; }

        public String getCompany() { return company; }

        public void setCompany(String company) { this.company = company; }

        public String getLoop() { return loop; }

        public void setLoop(String loop) { this.loop = loop; }

        public String getStatus() { return status; }

        public void setStatus(String status) { this.status = status; }

        public String getEnd_time() { return end_time; }

        public void setEnd_time(String end_time) { this.end_time = end_time; }

        public String getName() { return name; }

        public void setName(String name) { this.name = name; }
    }

    public static class Stationdes {
        //站台编号
        String code;
        //公交线路序号
        String stationNum;
        //站台名称
        String name;
        //站台坐标
        String xy;

        public String getCode() { return code; }

        public void setCode(String code) { this.code = code; }

        public String getStationNum() { return stationNum; }

        public void setStationNum(String stationNum) { this.stationNum = stationNum; }

        public String getName() { return name; }

        public void setName(String name) { this.name = name; }

        public String getXy() { return xy; }

        public void setXy(String xy) { this.xy = xy; }
    }
}
