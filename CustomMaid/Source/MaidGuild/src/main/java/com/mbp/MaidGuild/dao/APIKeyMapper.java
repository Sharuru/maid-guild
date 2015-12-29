package com.mbp.MaidGuild.dao;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * Created by AKI on 2015/11/18.
 */
public interface APIKeyMapper {

    @Select("SELECT " +
            "api_record " +
            "FROM " +
            "api_key " +
            "WHERE " +
            "provider = #{provider} AND delete_flag = '0' " +
            "ORDER BY " +
            "amount ASC")
    @Results({
            @Result(property = "apiRecord", column = "api_record")
    })
    String selectUsableAPIKeyByProvider(String provider);
}
