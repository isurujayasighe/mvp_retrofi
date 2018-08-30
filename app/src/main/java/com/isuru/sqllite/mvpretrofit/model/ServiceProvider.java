package com.isuru.sqllite.mvpretrofit.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ServiceProvider {

    @SerializedName("serviceProviderId")
    @Expose
    private Integer serviceProviderId;
    @SerializedName("businessName")
    @Expose
    private String businessName;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("brNo")
    @Expose
    private String brNo;
    @SerializedName("commonHotLine")
    @Expose
    private String commonHotLine;

    public Integer getServiceProviderId() {
        return serviceProviderId;
    }

    public void setServiceProviderId(Integer serviceProviderId) {
        this.serviceProviderId = serviceProviderId;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBrNo() {
        return brNo;
    }

    public void setBrNo(String brNo) {
        this.brNo = brNo;
    }

    public String getCommonHotLine() {
        return commonHotLine;
    }

    public void setCommonHotLine(String commonHotLine) {
        this.commonHotLine = commonHotLine;
    }
}
