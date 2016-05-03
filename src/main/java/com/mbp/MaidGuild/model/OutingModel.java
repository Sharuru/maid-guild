package com.mbp.MaidGuild.model;

import java.util.List;

/**
 * Created by S1507109 on 2016/04/25.
 */
public class OutingModel {
    // 驾车出行
    public static class drivingJson {
        // 状态码
        String status;
        // 状态对应信息
        String message;
        // 版权信息
        Info info;
        // 结果集
        drivingResult result;

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

        public Info getInfo() {
            return info;
        }

        public void setInfo(Info info) {
            this.info = info;
        }

        public drivingResult getResult() {
            return result;
        }

        public void setResult(drivingResult result) {
            this.result = result;
        }
    }

    public static class drivingResult {
        // 出行线路
        drivingRoutes[] routes;
        // 起点信息
        Origin origin;
        // 终点信息
        Destination destination;
        // 出租车信息
        Taxi taxi;
        // 路况评价
        String traffic_condition;

        public drivingRoutes[] getRoutes() {
            return routes;
        }

        public void setRoutes(drivingRoutes[] routes) {
            this.routes = routes;
        }

        public Origin getOrigin() {
            return origin;
        }

        public void setOrigin(Origin origin) {
            this.origin = origin;
        }

        public Destination getDestination() {
            return destination;
        }

        public void setDestination(Destination destination) {
            this.destination = destination;
        }

        public Taxi getTaxi() {
            return taxi;
        }

        public void setTaxi(Taxi taxi) {
            this.taxi = taxi;
        }

        public String getTraffic_condition() {
            return traffic_condition;
        }

        public void setTraffic_condition(String traffic_condition) {
            this.traffic_condition = traffic_condition;
        }
    }

    public static class drivingRoutes {
        // 路段距离
        String distance;
        // 线路耗时
        String duration;
        // 线路分段信息
        drivingSteps[] steps;
        // 过路费
        String toll;
        // 起点经纬度
        Location originLocation;
        // 终点经纬度
        Location destinationLocation;

        public String getDistance() {
            return distance;
        }

        public void setDistance(String distance) {
            this.distance = distance;
        }

        public String getDuration() {
            return duration;
        }

        public void setDuration(String duration) {
            this.duration = duration;
        }

        public drivingSteps[] getSteps() {
            return steps;
        }

        public void setSteps(drivingSteps[] steps) {
            this.steps = steps;
        }

        public String getToll() {
            return toll;
        }

        public void setToll(String toll) {
            this.toll = toll;
        }

        public Location getOriginLocation() {
            return originLocation;
        }

        public void setOriginLocation(Location originLocation) {
            this.originLocation = originLocation;
        }

        public Location getDestinationLocation() {
            return destinationLocation;
        }

        public void setDestinationLocation(Location destinationLocation) {
            this.destinationLocation = destinationLocation;
        }
    }

    public static class drivingSteps {
        // 路段距离
        String distance;
        // 路段耗时
        String duration;
        // 路段描述
        String instructions;
        // 路段坐标点
        String path;
        // 路段起点经纬度
        Location stepOriginLocation;
        // 路段终点经纬度
        Location stepDestinationLocation;

        public String getDistance() {
            return distance;
        }

        public void setDistance(String distance) {
            this.distance = distance;
        }

        public String getDuration() {
            return duration;
        }

        public void setDuration(String duration) {
            this.duration = duration;
        }

        public String getInstructions() {
            return instructions;
        }

        public void setInstructions(String instructions) {
            this.instructions = instructions;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public Location getStepOriginLocation() {
            return stepOriginLocation;
        }

        public void setStepOriginLocation(Location stepOriginLocation) {
            this.stepOriginLocation = stepOriginLocation;
        }

        public Location getStepDestinationLocation() {
            return stepDestinationLocation;
        }

        public void setStepDestinationLocation(Location stepDestinationLocation) {
            this.stepDestinationLocation = stepDestinationLocation;
        }
    }

    // 公交出行
    public static class transitJson {
        // 状态码
        String status;
        // 状态对应信息
        String message;
        // 版权信息
        Info info;
        // 结果集
        transitResult result;

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

        public Info getInfo() {
            return info;
        }

        public void setInfo(Info info) {
            this.info = info;
        }

        public transitResult getResult() {
            return result;
        }

        public void setResult(transitResult result) {
            this.result = result;
        }
    }

    public static class transitResult {
        // 出行线路
        transitRoutes[] routes;
        // 起点信息
        Origin origin;
        // 终点信息
        Destination destination;
        // 出租车信息
        Taxi taxi;
        // 路况评价
        String traffic_condition;

        public transitRoutes[] getRoutes() {
            return routes;
        }

        public void setRoutes(transitRoutes[] routes) {
            this.routes = routes;
        }

        public Origin getOrigin() {
            return origin;
        }

        public void setOrigin(Origin origin) {
            this.origin = origin;
        }

        public Destination getDestination() {
            return destination;
        }

        public void setDestination(Destination destination) {
            this.destination = destination;
        }

        public Taxi getTaxi() {
            return taxi;
        }

        public void setTaxi(Taxi taxi) {
            this.taxi = taxi;
        }

        public String getTraffic_condition() {
            return traffic_condition;
        }

        public void setTraffic_condition(String traffic_condition) {
            this.traffic_condition = traffic_condition;
        }
    }

    public static class transitRoutes {
        // 线路信息
        transitScheme[] scheme;

        public transitScheme[] getScheme() {
            return scheme;
        }

        public void setScheme(transitScheme[] scheme) {
            this.scheme = scheme;
        }
    }

    public static class transitScheme {
        // 到达时间
        String arrive_time;
        // 路段距离
        String distance;
        // 路段耗时
        String duration;
        // 票信息
        LinePrice[] line_price;
        // 公交总票价
        String price;
        // 线路分段信息
        List<transitSteps[]> steps;
        // 方案
        String tip_label;
        // 方案类型
        String tip_label_type;
        // 路况信息
        String traffic_type;
        // 起点经纬度
        Location originLocation;
        // 终点经纬度
        Location destinationLocation;

        public String getArrive_time() {
            return arrive_time;
        }

        public void setArrive_time(String arrive_time) {
            this.arrive_time = arrive_time;
        }

        public String getDistance() {
            return distance;
        }

        public void setDistance(String distance) {
            this.distance = distance;
        }

        public String getDuration() {
            return duration;
        }

        public void setDuration(String duration) {
            this.duration = duration;
        }

        public LinePrice[] getLine_price() {
            return line_price;
        }

        public void setLine_price(LinePrice[] line_price) {
            this.line_price = line_price;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public List<transitSteps[]> getSteps() {
            return steps;
        }

        public void setSteps(List<transitSteps[]> steps) {
            this.steps = steps;
        }

        public String getTip_label() {
            return tip_label;
        }

        public void setTip_label(String tip_label) {
            this.tip_label = tip_label;
        }

        public String getTip_label_type() {
            return tip_label_type;
        }

        public void setTip_label_type(String tip_label_type) {
            this.tip_label_type = tip_label_type;
        }

        public String getTraffic_type() {
            return traffic_type;
        }

        public void setTraffic_type(String traffic_type) {
            this.traffic_type = traffic_type;
        }

        public Location getOriginLocation() {
            return originLocation;
        }

        public void setOriginLocation(Location originLocation) {
            this.originLocation = originLocation;
        }

        public Location getDestinationLocation() {
            return destinationLocation;
        }

        public void setDestinationLocation(Location destinationLocation) {
            this.destinationLocation = destinationLocation;
        }
    }

    public static class LinePrice {
        // 票价格
        String line_price;
        // 票类型
        String line_type;

        public String getLine_price() {
            return line_price;
        }

        public void setLine_price(String line_price) {
            this.line_price = line_price;
        }

        public String getLine_type() {
            return line_type;
        }

        public void setLine_type(String line_type) {
            this.line_type = line_type;
        }
    }

    public static class transitSteps {
        // 路段距离
        String distance;
        // 路段耗时
        String duration;
        // 路段交通类型
        // 1.火车
        // 2.飞机
        // 3.公交
        // 4.驾车
        // 5.步行
        // 6.大巴
        String type;
        // 公交信息
        Vechicle vechicle;
        // 路段起点经纬度
        Location stepOriginLocation;
        // 路段终点经纬度
        Location stepDestinationLocation;
        // 路段说明
        String stepInstruction;
        // 路段坐标集
        String path;

        public String getDistance() {
            return distance;
        }

        public void setDistance(String distance) {
            this.distance = distance;
        }

        public String getDuration() {
            return duration;
        }

        public void setDuration(String duration) {
            this.duration = duration;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Vechicle getVechicle() {
            return vechicle;
        }

        public void setVechicle(Vechicle vechicle) {
            this.vechicle = vechicle;
        }

        public Location getStepOriginLocation() {
            return stepOriginLocation;
        }

        public void setStepOriginLocation(Location stepOriginLocation) {
            this.stepOriginLocation = stepOriginLocation;
        }

        public Location getStepDestinationLocation() {
            return stepDestinationLocation;
        }

        public void setStepDestinationLocation(Location stepDestinationLocation) {
            this.stepDestinationLocation = stepDestinationLocation;
        }

        public String getStepInstruction() {
            return stepInstruction;
        }

        public void setStepInstruction(String stepInstruction) {
            this.stepInstruction = stepInstruction;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }
    }

    public static class Vechicle {
        // 公交线路终点名称
        String end_name;
        // 公交线路末班车时间
        String end_time;
        // 公交线路名称
        String name;
        // 公交线路起点名称
        String start_name;
        // 公交线路首班车时间
        String start_time;
        // 途经站点数量
        String stop_num;
        // 价格
        String total_price;
        // 公交线路类型
        String type;
        // 区间价
        String zone_price;

        public String getEnd_name() {
            return end_name;
        }

        public void setEnd_name(String end_name) {
            this.end_name = end_name;
        }

        public String getEnd_time() {
            return end_time;
        }

        public void setEnd_time(String end_time) {
            this.end_time = end_time;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getStart_name() {
            return start_name;
        }

        public void setStart_name(String start_name) {
            this.start_name = start_name;
        }

        public String getStart_time() {
            return start_time;
        }

        public void setStart_time(String start_time) {
            this.start_time = start_time;
        }

        public String getStop_num() {
            return stop_num;
        }

        public void setStop_num(String stop_num) {
            this.stop_num = stop_num;
        }

        public String getTotal_price() {
            return total_price;
        }

        public void setTotal_price(String total_price) {
            this.total_price = total_price;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getZone_price() {
            return zone_price;
        }

        public void setZone_price(String zone_price) {
            this.zone_price = zone_price;
        }
    }

    // 步行
    public static class walkingJson {
        // 状态码
        String status;
        // 状态对应信息
        String message;
        // 版权信息
        Info info;
        // 结果集
        walkingResult result;

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

        public Info getInfo() {
            return info;
        }

        public void setInfo(Info info) {
            this.info = info;
        }

        public walkingResult getResult() {
            return result;
        }

        public void setResult(walkingResult result) {
            this.result = result;
        }
    }

    public static class walkingResult {
        // 出行线路
        walkingRoutes[] routes;
        // 起点信息
        Origin origin;
        // 终点信息
        Destination destination;

        public walkingRoutes[] getRoutes() {
            return routes;
        }

        public void setRoutes(walkingRoutes[] routes) {
            this.routes = routes;
        }

        public Origin getOrigin() {
            return origin;
        }

        public void setOrigin(Origin origin) {
            this.origin = origin;
        }

        public Destination getDestination() {
            return destination;
        }

        public void setDestination(Destination destination) {
            this.destination = destination;
        }
    }

    public static class walkingRoutes {
        // 路段距离
        String distance;
        // 线路耗时
        String duration;
        // 线路分段信息
        walkingSteps[] steps;
        // 起点经纬度
        Location originLocation;
        // 终点经纬度
        Location destinationLocation;

        public String getDistance() {
            return distance;
        }

        public void setDistance(String distance) {
            this.distance = distance;
        }

        public String getDuration() {
            return duration;
        }

        public void setDuration(String duration) {
            this.duration = duration;
        }

        public walkingSteps[] getSteps() {
            return steps;
        }

        public void setSteps(walkingSteps[] steps) {
            this.steps = steps;
        }

        public Location getOriginLocation() {
            return originLocation;
        }

        public void setOriginLocation(Location originLocation) {
            this.originLocation = originLocation;
        }

        public Location getDestinationLocation() {
            return destinationLocation;
        }

        public void setDestinationLocation(Location destinationLocation) {
            this.destinationLocation = destinationLocation;
        }
    }

    public static class walkingSteps {
        // 路段距离
        String distance;
        // 路段耗时
        String duration;
        // 路段描述
        String instructions;
        // 路段坐标点
        String path;
        // 路段起点经纬度
        Location stepOriginLocation;
        // 路段终点经纬度
        Location stepDestinationLocation;

        public String getDistance() {
            return distance;
        }

        public void setDistance(String distance) {
            this.distance = distance;
        }

        public String getDuration() {
            return duration;
        }

        public void setDuration(String duration) {
            this.duration = duration;
        }

        public String getInstructions() {
            return instructions;
        }

        public void setInstructions(String instructions) {
            this.instructions = instructions;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public Location getStepOriginLocation() {
            return stepOriginLocation;
        }

        public void setStepOriginLocation(Location stepOriginLocation) {
            this.stepOriginLocation = stepOriginLocation;
        }

        public Location getStepDestinationLocation() {
            return stepDestinationLocation;
        }

        public void setStepDestinationLocation(Location stepDestinationLocation) {
            this.stepDestinationLocation = stepDestinationLocation;
        }
    }

    // 骑行
    public static class ridingJson {
        // 状态码
        String status;
        // 状态对应信息
        String message;
        // 版权信息
        Info info;
        // 结果集
        ridingResult result;

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

        public Info getInfo() {
            return info;
        }

        public void setInfo(Info info) {
            this.info = info;
        }

        public ridingResult getResult() {
            return result;
        }

        public void setResult(ridingResult result) {
            this.result = result;
        }
    }

    public static class ridingResult {
        // 出行线路
        ridingRoutes[] routes;
        // 起点信息
        Origin origin;
        // 终点信息
        Destination destination;

        public ridingRoutes[] getRoutes() {
            return routes;
        }

        public void setRoutes(ridingRoutes[] routes) {
            this.routes = routes;
        }

        public Origin getOrigin() {
            return origin;
        }

        public void setOrigin(Origin origin) {
            this.origin = origin;
        }

        public Destination getDestination() {
            return destination;
        }

        public void setDestination(Destination destination) {
            this.destination = destination;
        }
    }

    public static class ridingRoutes {
        // 路段距离
        String distance;
        // 线路耗时
        String duration;
        // 线路分段信息
        ridingSteps[] steps;
        // 起点经纬度
        Location originLocation;
        // 终点经纬度
        Location destinationLocation;

        public String getDistance() {
            return distance;
        }

        public void setDistance(String distance) {
            this.distance = distance;
        }

        public String getDuration() {
            return duration;
        }

        public void setDuration(String duration) {
            this.duration = duration;
        }

        public ridingSteps[] getSteps() {
            return steps;
        }

        public void setSteps(ridingSteps[] steps) {
            this.steps = steps;
        }

        public Location getOriginLocation() {
            return originLocation;
        }

        public void setOriginLocation(Location originLocation) {
            this.originLocation = originLocation;
        }

        public Location getDestinationLocation() {
            return destinationLocation;
        }

        public void setDestinationLocation(Location destinationLocation) {
            this.destinationLocation = destinationLocation;
        }
    }

    public static class ridingSteps {
        // 路段距离
        String distance;
        // 路段耗时
        String duration;
        // 路段描述
        String instructions;
        // 路段坐标点
        String path;
        // 路段起点经纬度
        Location stepOriginLocation;
        // 路段终点经纬度
        Location stepDestinationLocation;

        public String getDistance() {
            return distance;
        }

        public void setDistance(String distance) {
            this.distance = distance;
        }

        public String getDuration() {
            return duration;
        }

        public void setDuration(String duration) {
            this.duration = duration;
        }

        public String getInstructions() {
            return instructions;
        }

        public void setInstructions(String instructions) {
            this.instructions = instructions;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public Location getStepOriginLocation() {
            return stepOriginLocation;
        }

        public void setStepOriginLocation(Location stepOriginLocation) {
            this.stepOriginLocation = stepOriginLocation;
        }

        public Location getStepDestinationLocation() {
            return stepDestinationLocation;
        }

        public void setStepDestinationLocation(Location stepDestinationLocation) {
            this.stepDestinationLocation = stepDestinationLocation;
        }
    }

    //共用的
    public static class Info {
        // 版权
        Copyright copyright;

        public Copyright getCopyright() {
            return copyright;
        }

        public void setCopyright(Copyright copyright) {
            this.copyright = copyright;
        }
    }

    public static class Copyright {
        // 文字
        String text;
        // 图片链接
        String imageUrl;

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }
    }

    public static class Origin {
        // 所在城市代码
        String area_id;
        // 城市名称
        String cname;
        // id
        String uid;
        // 搜索关键字
        String wd;
        // 经纬度坐标
        Location originPt;

        public String getArea_id() {
            return area_id;
        }

        public void setArea_id(String area_id) {
            this.area_id = area_id;
        }

        public String getCname() {
            return cname;
        }

        public void setCname(String cname) {
            this.cname = cname;
        }

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public String getWd() {
            return wd;
        }

        public void setWd(String wd) {
            this.wd = wd;
        }

        public Location getOriginPt() {
            return originPt;
        }

        public void setOriginPt(Location originPt) {
            this.originPt = originPt;
        }
    }

    public static class Destination {
        // 所在城市代码
        String area_id;
        // 城市名称
        String cname;
        // id
        String uid;
        // 搜索关键字
        String wd;
        // 经纬度坐标
        Location destinationPt;

        public String getArea_id() {
            return area_id;
        }

        public void setArea_id(String area_id) {
            this.area_id = area_id;
        }

        public String getCname() {
            return cname;
        }

        public void setCname(String cname) {
            this.cname = cname;
        }

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public String getWd() {
            return wd;
        }

        public void setWd(String wd) {
            this.wd = wd;
        }

        public Location getDestinationPt() {
            return destinationPt;
        }

        public void setDestinationPt(Location destinationPt) {
            this.destinationPt = destinationPt;
        }
    }

    public static class Taxi {
        // 详细信息
        Detail[] detail;
        // 起终点间距离
        String distance;
        // 耗时
        String duration;
        // 备注
        String remark;

        public Detail[] getDetail() {
            return detail;
        }

        public void setDetail(Detail[] detail) {
            this.detail = detail;
        }

        public String getDistance() {
            return distance;
        }

        public void setDistance(String distance) {
            this.distance = distance;
        }

        public String getDuration() {
            return duration;
        }

        public void setDuration(String duration) {
            this.duration = duration;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }
    }

    public static class Detail {
        // 描述
        String desc;
        // 每公里价格
        String km_price;
        // 起步价
        String start_price;
        // 总价
        String total_price;

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getKm_price() {
            return km_price;
        }

        public void setKm_price(String km_price) {
            this.km_price = km_price;
        }

        public String getStart_price() {
            return start_price;
        }

        public void setStart_price(String start_price) {
            this.start_price = start_price;
        }

        public String getTotal_price() {
            return total_price;
        }

        public void setTotal_price(String total_price) {
            this.total_price = total_price;
        }
    }

    public static class Location {
        // 经度
        String lng;
        // 纬度
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
