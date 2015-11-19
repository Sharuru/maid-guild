package com.mbp.MaidGuild.model;

/**
 * Created by Sharuru on 2015/11/19 0019.
 */
public class WeatherModel {
    public static class WeatherJson {
        //状态码
        String errNum;
        //状态信息
        String errMsg;
        //返回数据
        RetData retData;

        public String getErrNum() {
            return errNum;
        }

        public void setErrNum(String errNum) {
            this.errNum = errNum;
        }

        public String getErrMsg() {
            return errMsg;
        }

        public void setErrMsg(String errMsg) {
            this.errMsg = errMsg;
        }

        public RetData getRetData() {
            return retData;
        }

        public void setRetData(RetData retData) {
            this.retData = retData;
        }
    }

    public static class RetData {
        //城市
        String city;
        //城市 ID
        String cityid;
        //今日天气情报
        Today today;
        //未来天气情报
        Forecast[] forecast;
        //历史天气情报
        History[] history;

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCityid() {
            return cityid;
        }

        public void setCityid(String cityid) {
            this.cityid = cityid;
        }

        public Today getToday() {
            return today;
        }

        public void setToday(Today today) {
            this.today = today;
        }

        public Forecast[] getForecast() {
            return forecast;
        }

        public void setForecast(Forecast[] forecast) {
            this.forecast = forecast;
        }

        public History[] getHistory() {
            return history;
        }

        public void setHistory(History[] history) {
            this.history = history;
        }
    }

    public static class Today {
        //日期
        String data;
        //星期
        String week;
        //当前温度
        String curTemp;
        //AQI 指数
        String aqi;
        //风向
        String fengxiang;
        //风力
        String fengli;
        //最高温度
        String hightemp;
        //最低温度
        String lowtemp;
        //天气状况类型
        String type;
        //生活指数
        Index[] index;

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public String getWeek() {
            return week;
        }

        public void setWeek(String week) {
            this.week = week;
        }

        public String getCurTemp() {
            return curTemp;
        }

        public void setCurTemp(String curTemp) {
            this.curTemp = curTemp;
        }

        public String getAqi() {
            return aqi;
        }

        public void setAqi(String aqi) {
            this.aqi = aqi;
        }

        public String getFengxiang() {
            return fengxiang;
        }

        public void setFengxiang(String fengxiang) {
            this.fengxiang = fengxiang;
        }

        public String getFengli() {
            return fengli;
        }

        public void setFengli(String fengli) {
            this.fengli = fengli;
        }

        public String getHightemp() {
            return hightemp;
        }

        public void setHightemp(String hightemp) {
            this.hightemp = hightemp;
        }

        public String getLowtemp() {
            return lowtemp;
        }

        public void setLowtemp(String lowtemp) {
            this.lowtemp = lowtemp;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Index[] getIndex() {
            return index;
        }

        public void setIndex(Index[] index) {
            this.index = index;
        }
    }

    public static class Index {
        //指数名称
        String name;
        //指数代码
        String code;
        //指数类型
        String index;
        //详情
        String details;
        //别名
        String otherName;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getIndex() {
            return index;
        }

        public void setIndex(String index) {
            this.index = index;
        }

        public String getDetails() {
            return details;
        }

        public void setDetails(String details) {
            this.details = details;
        }

        public String getOtherName() {
            return otherName;
        }

        public void setOtherName(String otherName) {
            this.otherName = otherName;
        }
    }

    public static class Forecast {
        String data;
        String week;
        String fengxiang;
        String fengli;
        String hightemp;
        String lowtemp;
        String type;

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public String getWeek() {
            return week;
        }

        public void setWeek(String week) {
            this.week = week;
        }

        public String getFengxiang() {
            return fengxiang;
        }

        public void setFengxiang(String fengxiang) {
            this.fengxiang = fengxiang;
        }

        public String getFengli() {
            return fengli;
        }

        public void setFengli(String fengli) {
            this.fengli = fengli;
        }

        public String getHightemp() {
            return hightemp;
        }

        public void setHightemp(String hightemp) {
            this.hightemp = hightemp;
        }

        public String getLowtemp() {
            return lowtemp;
        }

        public void setLowtemp(String lowtemp) {
            this.lowtemp = lowtemp;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

    public static class History {
        String data;
        String week;
        String aqi;
        String fengxiang;
        String fengli;
        String hightemp;
        String lowtemp;
        String type;

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public String getWeek() {
            return week;
        }

        public void setWeek(String week) {
            this.week = week;
        }

        public String getAqi() {
            return aqi;
        }

        public void setAqi(String aqi) {
            this.aqi = aqi;
        }

        public String getFengxiang() {
            return fengxiang;
        }

        public void setFengxiang(String fengxiang) {
            this.fengxiang = fengxiang;
        }

        public String getFengli() {
            return fengli;
        }

        public void setFengli(String fengli) {
            this.fengli = fengli;
        }

        public String getHightemp() {
            return hightemp;
        }

        public void setHightemp(String hightemp) {
            this.hightemp = hightemp;
        }

        public String getLowtemp() {
            return lowtemp;
        }

        public void setLowtemp(String lowtemp) {
            this.lowtemp = lowtemp;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

}
