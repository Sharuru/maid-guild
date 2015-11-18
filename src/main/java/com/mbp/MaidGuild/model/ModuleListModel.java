package com.mbp.MaidGuild.model;

/**
 * Created by Sharuru on 2015/11/18 0018.
 */
public class ModuleListModel {
    //记录 ID
    Integer recordId;
    //城市编码
    String cityCode;
    //可用模块列表
    String avblModuleId;
    //删除标记
    Integer deleteFlag;

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getAvblModuleId() {
        return avblModuleId;
    }

    public void setAvblModuleId(String avblModuleId) {
        this.avblModuleId = avblModuleId;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}
