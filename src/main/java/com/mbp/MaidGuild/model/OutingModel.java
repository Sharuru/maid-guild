package com.mbp.MaidGuild.model;

import com.google.gson.annotations.SerializedName;
import sun.plugin.javascript.navig.Array;

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
    }

    // 公交出行
    public static class busOutingJson {
        // 状态码
        String status;
        // 状态对应信息
        String message;
        // 版权信息
        Info info;
        // 结果集
        busOutingResult result;
    }

    public static class busOutingResult {
        // 出行线路
        busOutingRoutes[] routes;
        // 起点信息
        Origin origin;
        // 终点信息
        Destination destination;
        // 出租车信息
        Taxi taxi;
        // 路况评价
        String traffic_condition;
    }

    public static class busOutingRoutes {
        // 线路信息
        busOutingScheme[] scheme;
    }

    public static class busOutingScheme {
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
        stepsList[] steps;
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
    }

    public static class LinePrice {
        // 票价格
        String line_price;
        // 票类型
        String line_type;
    }

    public static class stepsList {
        // 线路分段信息集合
        busOutingSteps[] stepsList;
    }

    public static class busOutingSteps {
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
    }

    public static class walkingResult {
        // 出行线路
        walkingRoutes[] routes;
        // 起点信息
        Origin origin;
        // 终点信息
        Destination destination;
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
    }

    public static class ridingResult {
        // 出行线路
        ridingRoutes[] routes;
        // 起点信息
        Origin origin;
        // 终点信息
        Destination destination;
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
    }

    //共用的
    public static class Info {
        // 版权
        Copyright copyright;
    }

    public static class Copyright {
        // 文字
        String text;
        // 图片链接
        String imageUrl;
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
    }

    public static class Taxi {
        // 详细信息
        Detail detail;
        // 起终点间距离
        String distance;
        // 耗时
        String duration;
        // 备注
        String remark;
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
    }

    public static class Location {
        // 经度
        String lng;
        // 纬度
        String lat;
    }
}
