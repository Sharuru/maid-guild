package com.mbp.MaidGuild.dao;

import com.mbp.MaidGuild.model.MetroInfoModel;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * Created by peixun on 2015/12/31.
 */
public interface MetroInfoMapper {

    @Select("SELECT "+
            "station_name " +
            "FROM "+
            "metro_info " +
            "WHERE " +
            "station_id = #{stationId} " +
            "AND city_id = #{cityId}  " +
            "AND delete_flag = '0' ")
    @Results({
            @Result(property = "stationName", column = "station_name")
    })
    String selectStationNameByStationId(@Param("stationId")String stationId, @Param("cityId")String cityId);

    @Select("SELECT " +
            "station_id, station_name " +
            "FROM " +
            "metro_info " +
            "WHERE city_id = #{cityId} AND delete_flag='0'")
    @Results({
            @Result(property="stationId",column ="station_id"),
            @Result(property = "stationName",column = "station_name")

    })
    List<MetroInfoModel> selectAllStationByCityId(String cityId);
}
