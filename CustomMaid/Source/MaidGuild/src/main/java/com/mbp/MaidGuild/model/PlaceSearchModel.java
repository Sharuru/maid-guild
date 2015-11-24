package com.mbp.MaidGuild.model;

/**
 * Created by Sharuru on 2015/11/24 0024.
 */
public class PlaceSearchModel {
    public static class PlaceSearchJson {
        //状态码
        String status;
        //响应信息
        String message;
        //结果条目数
        String total;
        //结果集
        Results[] results;

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getTotal() {
            return total;
        }

        public void setTotal(String total) {
            this.total = total;
        }

        public Results[] getResults() {
            return results;
        }

        public void setResults(Results[] results) {
            this.results = results;
        }
    }

    public static class Results {
        //点名称
        String name;
        //点坐标
        Location location;
        //点位置
        String address;
        //街道 ID
        String street_id;
        //点电话
        String telephone;
        //详细级数
        String detail;
        //点 ID
        String uid;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Location getLocation() {
            return location;
        }

        public void setLocation(Location location) {
            this.location = location;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getStreet_id() {
            return street_id;
        }

        public void setStreet_id(String street_id) {
            this.street_id = street_id;
        }

        public String getTelephone() {
            return telephone;
        }

        public void setTelephone(String telephone) {
            this.telephone = telephone;
        }

        public String getDetail() {
            return detail;
        }

        public void setDetail(String detail) {
            this.detail = detail;
        }

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }
    }

    public static class Location {
        //纬度
        String lat;
        //经度
        String lng;

        public String getLat() {
            return lat;
        }

        public void setLat(String lat) {
            this.lat = lat;
        }

        public String getLng() {
            return lng;
        }

        public void setLng(String lng) {
            this.lng = lng;
        }
    }
}
