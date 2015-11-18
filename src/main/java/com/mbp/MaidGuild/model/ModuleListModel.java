package com.mbp.MaidGuild.model;

/**
 * Created by Sharuru on 2015/11/18 0018.
 */
public class ModuleListModel {
    Integer record_id;
    String city_code;
    String avbl_module_id;
    Integer delete_flag;

    public Integer getRecord_id() {
        return record_id;
    }

    public void setRecord_id(Integer record_id) {
        this.record_id = record_id;
    }

    public String getCity_code() {
        return city_code;
    }

    public void setCity_code(String city_code) {
        this.city_code = city_code;
    }

    public String getAvbl_module_id() {
        return avbl_module_id;
    }

    public void setAvbl_module_id(String avbl_module_id) {
        this.avbl_module_id = avbl_module_id;
    }

    public Integer getDelete_flag() {
        return delete_flag;
    }

    public void setDelete_flag(Integer delete_flag) {
        this.delete_flag = delete_flag;
    }
}
