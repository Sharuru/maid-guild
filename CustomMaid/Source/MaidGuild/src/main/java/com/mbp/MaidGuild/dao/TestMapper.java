package com.mbp.MaidGuild.dao;
import com.mbp.MaidGuild.model.TestModel;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface TestMapper {
    @Results({
            @Result(property = "recordId", column = "record_id"),
            @Result(property = "record", column = "record")
    })
    @Select("SELECT record_id, record FROM test")
    List<TestModel> selectAllFromTest();

}
