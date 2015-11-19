package com.mbp.MaidGuild.dao;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * Created by Sharuru on 2015/11/19 0019.
 */
public interface CityIdMapper {
    @Select("SELECT " +
            "id_record " +
            "FROM " +
            "city_id " +
            "WHERE " +
            "city_name LIKE #{cityName} || '%' AND delete_flag ='0'")
    @Results({
            @Result(property = "idRecord", column = "id_record")
    })
    String getCityIdByCityName(String cityName);
}
