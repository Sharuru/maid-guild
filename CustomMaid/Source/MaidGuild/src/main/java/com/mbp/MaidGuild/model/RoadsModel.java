package com.mbp.MaidGuild.model;

/**
 * Created by peixun on 2015/12/24.
 */
public class RoadsModel {

    public static class RoadsJson {
        //错误码
        String error;
        //响应状态
        String status;
        //当前城市
        String currentCity;
        //请求时间
        String dataTime;
        //结果
        Results[] results;

        public String getError() {
            return error;
        }

        public void setError(String error) {
            this.error = error;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getCurrentCity() {
            return currentCity;
        }

        public void setCurrentCity(String currentCity) {
            this.currentCity = currentCity;
        }

        public String getDataTime() {
            return dataTime;
        }

        public void setDataTime(String dataTime) {
            this.dataTime = dataTime;
        }

        public Results[] getResults() {
            return results;
        }

        public void setResults(Results[] results) {
            this.results = results;
        }
    }

    public static class Results {
        //开始时间
        String startTime;
        //结束时间
        String endTime;
        //标题
        String title;
        //描述
        String description;
        //位置
        Location location;
        //种类
        String type;

        public String getStartTime() {
            return startTime;
        }

        public void setStartTime(String startTime) {
            this.startTime = startTime;
        }

        public String getEndTime() {
            return endTime;
        }

        public void setEndTime(String endTime) {
            this.endTime = endTime;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Location getLocation() {
            return location;
        }

        public void setLocation(Location location) {
            this.location = location;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

    public static class Location {
        String lng;
        String lat;

        public String getLng() {
            return lng;
        }

        public void setLng(String lng) {
            this.lng = lng;
        }

        public String getLat() {
            return lat;
        }

        public void setLat(String lat) {
            this.lat = lat;
        }
    }
}
