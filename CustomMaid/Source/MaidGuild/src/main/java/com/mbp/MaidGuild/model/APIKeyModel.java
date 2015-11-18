package com.mbp.MaidGuild.model;

import java.util.Date;

/**
 * Created by AKI on 2015/11/18.
 */
public class APIKeyModel {

    // 记录 ID
    private Integer recordId;
    // API KEY
    private String apiRecord;
    // 提供者
    private String provider;
    // 使用次数
    private Integer amount;
    // 上一次使用时间
    private Date lastCall;

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public String getApiRecord() {
        return apiRecord;
    }

    public void setApiRecord(String apiRecord) {
        this.apiRecord = apiRecord;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Date getLastCall() {
        return lastCall;
    }

    public void setLastCall(Date lastCall) {
        this.lastCall = lastCall;
    }
}
