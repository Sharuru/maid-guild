package com.mbp.MaidGuild.dao;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Sharuru on 2015/11/18 0018.
 */
public interface ModuleListMapper {
    @Select("SELECT " +
                    "avbl_module_id " +
                "FROM " +
                     "module_list " +
                "WHERE " +
                     "city_code = #{cityCode} AND delete_flag = '0'")
    @Results({
            @Result(property = "apiRecord", column = "api_record")
    })
    List<String> selectModuleListByCityCode(String cityCode);
}
