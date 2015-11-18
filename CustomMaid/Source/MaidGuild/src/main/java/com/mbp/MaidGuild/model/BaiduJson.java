package com.mbp.MaidGuild.model;

/**
 * Created by Sharuru on 2015/11/18 0018.
 * 解析 Json 时需要的对应 POJO
 */
public class BaiduJson {

    //Baidu 逆地理编码 POJO
    //根据对应 API 接口返回的状态字段进行声明
    // 一般默认都是 String 型，特别类型看以下的 Sample 应该能明白
    //每个 POJO 都要有对应的 getter/setter 方法
    //理论上只要写全需要获取数据部分的状态字段即可，此 Sample 是写完整的
    public static class BaiduGeocoderJson {
        //结果状态值
        String status;
        //坐标
        BaiduLocation location;
        //结构化地址信息
        String formatted_address;
        //所在商圈信息
        String business;
        //地址组
        BaiduAddressComponent addressComponent;
        //周边兴趣点组
        BaiduPois[] pois;
        //语义化描述
        String sematic_description;
        //城市代码（文档中没用，但实际返回存在此字段）
        String cityCode;

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public BaiduLocation getLocation() {
            return location;
        }

        public void setLocation(BaiduLocation location) {
            this.location = location;
        }

        public String getFormatted_address() {
            return formatted_address;
        }

        public void setFormatted_address(String formatted_address) {
            this.formatted_address = formatted_address;
        }

        public String getBusiness() {
            return business;
        }

        public void setBusiness(String business) {
            this.business = business;
        }

        public BaiduAddressComponent getAddressComponent() {
            return addressComponent;
        }

        public void setAddressComponent(BaiduAddressComponent addressComponent) {
            this.addressComponent = addressComponent;
        }

        public BaiduPois[] getPois() {
            return pois;
        }

        public void setPois(BaiduPois[] pois) {
            this.pois = pois;
        }

        public String getSematic_description() {
            return sematic_description;
        }

        public void setSematic_description(String sematic_description) {
            this.sematic_description = sematic_description;
        }

        public String getCityCode() {
            return cityCode;
        }

        public void setCityCode(String cityCode) {
            this.cityCode = cityCode;
        }
    }

    //坐标
    public static class BaiduLocation {
        //纬度坐标
        String lat;
        //经度坐标
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

    //地址组
    public static class BaiduAddressComponent {
        //城市名
        String city;
        //国家
        String country;
        //和当前坐标点方向，有门牌号时返回数据
        String direction;
        //和当前坐标点距离，有门牌号时返回数据
        String distance;
        //区县名
        String district;
        //省名
        String province;
        //街道名
        String street;
        //街道门牌号
        String street_number;
        //国家编码
        String country_code;

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getDirection() {
            return direction;
        }

        public void setDirection(String direction) {
            this.direction = direction;
        }

        public String getDistance() {
            return distance;
        }

        public void setDistance(String distance) {
            this.distance = distance;
        }

        public String getDistrict() {
            return district;
        }

        public void setDistrict(String district) {
            this.district = district;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getStreet_number() {
            return street_number;
        }

        public void setStreet_number(String street_number) {
            this.street_number = street_number;
        }

        public String getCountry_code() {
            return country_code;
        }

        public void setCountry_code(String country_code) {
            this.country_code = country_code;
        }
    }

    //周边兴趣点组
    public static class BaiduPois {
        //地址信息
        String addr;
        //数据来源
        String cp;
        //和当前坐标点方向
        String direction;
        //和当前坐标点距离
        String distance;
        //POI 名称
        String name;
        //POI 类型
        String poiType;
        //POI 坐标
        BaiduPoint point;
        //POI 标签
        String tag;
        //电话
        String tel;
        //POI 唯一标识别
        String uid;
        //邮编
        String zip;

        public String getAddr() {
            return addr;
        }

        public void setAddr(String addr) {
            this.addr = addr;
        }

        public String getCp() {
            return cp;
        }

        public void setCp(String cp) {
            this.cp = cp;
        }

        public String getDirection() {
            return direction;
        }

        public void setDirection(String direction) {
            this.direction = direction;
        }

        public String getDistance() {
            return distance;
        }

        public void setDistance(String distance) {
            this.distance = distance;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPoiType() {
            return poiType;
        }

        public void setPoiType(String poiType) {
            this.poiType = poiType;
        }

        public BaiduPoint getPoint() {
            return point;
        }

        public void setPoint(BaiduPoint point) {
            this.point = point;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public String getTel() {
            return tel;
        }

        public void setTel(String tel) {
            this.tel = tel;
        }

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public String getZip() {
            return zip;
        }

        public void setZip(String zip) {
            this.zip = zip;
        }
    }

    //POI 坐标
    public static class BaiduPoint {
        //POI X
        String x;
        //POI Y
        String y;

        public String getX() {
            return x;
        }

        public void setX(String x) {
            this.x = x;
        }

        public String getY() {
            return y;
        }

        public void setY(String y) {
            this.y = y;
        }
    }
}
