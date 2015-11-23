package com.mbp.MaidGuild.model;

/**
 * Created by Sharuru on 2015/11/23 0023.
 */
public class TrainTimeModel {
    public static class TrainTimeByIdJson {
        //结果状态
        String reason;
        //查询结果
        IdResult result;
        //错误码
        String error_code;

        public String getReason() {
            return reason;
        }

        public void setReason(String reason) {
            this.reason = reason;
        }

        public IdResult getResult() {
            return result;
        }

        public void setResult(IdResult result) {
            this.result = result;
        }

        public String getError_code() {
            return error_code;
        }

        public void setError_code(String error_code) {
            this.error_code = error_code;
        }
    }

    public static class IdResult {
        //查询结果标题
        String title;
        //结果集
        IdList list;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public IdList getList() {
            return list;
        }

        public void setList(IdList list) {
            this.list = list;
        }
    }

    public static class IdList {
        //车次
        String train_no;
        //车次类型
        String train_type;
        //始发站
        String start_station;
        //始发站类型
        String start_station_type;
        //终到站
        String end_station;
        //终到站类型
        String end_station_type;
        //发车时间
        String start_time;
        //到站时间
        String end_time;
        //运行时长
        String run_time;
        //路程总长
        String run_distance;
        //价格表
        PriceList price_list;

        public String getTrain_no() {
            return train_no;
        }

        public void setTrain_no(String train_no) {
            this.train_no = train_no;
        }

        public String getTrain_type() {
            return train_type;
        }

        public void setTrain_type(String train_type) {
            this.train_type = train_type;
        }

        public String getStart_station() {
            return start_station;
        }

        public void setStart_station(String start_station) {
            this.start_station = start_station;
        }

        public String getStart_station_type() {
            return start_station_type;
        }

        public void setStart_station_type(String start_station_type) {
            this.start_station_type = start_station_type;
        }

        public String getEnd_station() {
            return end_station;
        }

        public void setEnd_station(String end_station) {
            this.end_station = end_station;
        }

        public String getEnd_station_type() {
            return end_station_type;
        }

        public void setEnd_station_type(String end_station_type) {
            this.end_station_type = end_station_type;
        }

        public String getStart_time() {
            return start_time;
        }

        public void setStart_time(String start_time) {
            this.start_time = start_time;
        }

        public String getEnd_time() {
            return end_time;
        }

        public void setEnd_time(String end_time) {
            this.end_time = end_time;
        }

        public String getRun_time() {
            return run_time;
        }

        public void setRun_time(String run_time) {
            this.run_time = run_time;
        }

        public String getRun_distance() {
            return run_distance;
        }

        public void setRun_distance(String run_distance) {
            this.run_distance = run_distance;
        }

        public PriceList getPrice_list() {
            return price_list;
        }

        public void setPrice_list(PriceList price_list) {
            this.price_list = price_list;
        }

    }

    public static class PriceList {
        //价格元素
        Item[] item;

        public Item[] getItem() {
            return item;
        }

        public void setItem(Item[] item) {
            this.item = item;
        }
    }

    public static class Item {
        //坐席
        String price_type;
        //价格
        String price;

        public String getPrice_type() {
            return price_type;
        }

        public void setPrice_type(String price_type) {
            this.price_type = price_type;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }
    }

    public static class TrainTimeByStationJson {
        //结果状态
        String reason;
        //查询结果
        StationResult result;
        //错误码
        String error_code;

        public String getReason() {
            return reason;
        }

        public void setReason(String reason) {
            this.reason = reason;
        }

        public StationResult getResult() {
            return result;
        }

        public void setResult(StationResult result) {
            this.result = result;
        }

        public String getError_code() {
            return error_code;
        }

        public void setError_code(String error_code) {
            this.error_code = error_code;
        }
    }

    public static class StationResult {
        //查询结果标题
        String title;
        //结果集
        StationList[] list;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public StationList[] getList() {
            return list;
        }

        public void setList(StationList[] list) {
            this.list = list;
        }
    }

    public static class StationList {
        //车次
        String train_no;
        //详细时刻表链接
        String m_train_url;
        //车次类型
        String train_type;
        //始发站
        String start_station;
        //始发站类型
        String start_station_type;
        //终到站
        String end_station;
        //终到站类型
        String end_station_type;
        //发车时间
        String start_time;
        //到站时间
        String end_time;
        //运行时长
        String run_time;
        //路程总长
        String run_distance;
        //价格表
        StationPriceList[] price_liist;
        //购票链接
        String m_chaxun_url;

        public String getTrain_no() {
            return train_no;
        }

        public void setTrain_no(String train_no) {
            this.train_no = train_no;
        }

        public String getM_train_url() {
            return m_train_url;
        }

        public void setM_train_url(String m_train_url) {
            this.m_train_url = m_train_url;
        }

        public String getTrain_type() {
            return train_type;
        }

        public void setTrain_type(String train_type) {
            this.train_type = train_type;
        }

        public String getStart_station() {
            return start_station;
        }

        public void setStart_station(String start_station) {
            this.start_station = start_station;
        }

        public String getStart_station_type() {
            return start_station_type;
        }

        public void setStart_station_type(String start_station_type) {
            this.start_station_type = start_station_type;
        }

        public String getEnd_station() {
            return end_station;
        }

        public void setEnd_station(String end_station) {
            this.end_station = end_station;
        }

        public String getEnd_station_type() {
            return end_station_type;
        }

        public void setEnd_station_type(String end_station_type) {
            this.end_station_type = end_station_type;
        }

        public String getStart_time() {
            return start_time;
        }

        public void setStart_time(String start_time) {
            this.start_time = start_time;
        }

        public String getEnd_time() {
            return end_time;
        }

        public void setEnd_time(String end_time) {
            this.end_time = end_time;
        }

        public String getRun_time() {
            return run_time;
        }

        public void setRun_time(String run_time) {
            this.run_time = run_time;
        }

        public String getRun_distance() {
            return run_distance;
        }

        public void setRun_distance(String run_distance) {
            this.run_distance = run_distance;
        }

        public StationPriceList[] getPrice_liist() {
            return price_liist;
        }

        public void setPrice_liist(StationPriceList[] price_liist) {
            this.price_liist = price_liist;
        }

        public String getM_chaxun_url() {
            return m_chaxun_url;
        }

        public void setM_chaxun_url(String m_chaxun_url) {
            this.m_chaxun_url = m_chaxun_url;
        }
    }

    public static class StationPriceList {
        //坐席
        String price_type;
        //价格
        String price;

        public String getPrice_type() {
            return price_type;
        }

        public void setPrice_type(String price_type) {
            this.price_type = price_type;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }
    }
}
