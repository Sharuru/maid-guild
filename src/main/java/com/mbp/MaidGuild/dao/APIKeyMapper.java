package com.mbp.MaidGuild.dao;

import com.mbp.MaidGuild.model.TestModel;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by AKI on 2015/11/18.
 */
public interface APIKeyMapper {
    @Results({
            @Result(property = "recordId", column = "record_id"),
            @Result(property = "apiRecord", column = "api_record"),
            @Result(property = "provider", column = "provider"),
            @Result(property = "amount", column = "amount"),
            @Result(property = "lastCall", column = "lastCall")
    })
    @Select("SELECT api_record FROM api_key WHERE provider = #{provider} ORDER BY amount ASC")
    String selectUsableAPIKeyByProvider(String provider);
}
