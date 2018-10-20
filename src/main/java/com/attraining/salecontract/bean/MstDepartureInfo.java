package com.attraining.salecontract.bean;

import java.util.Date;

public class MstDepartureInfo {
    private String departureCd;

    private String departureName;

    private String memo;

    private String createUser;

    private Date createDate;

    private String updateUser;

    private Date updateDate;

    public String getDepartureCd() {
        return departureCd;
    }

    public void setDepartureCd(String departureCd) {
        this.departureCd = departureCd == null ? null : departureCd.trim();
    }

    public String getDepartureName() {
        return departureName;
    }

    public void setDepartureName(String departureName) {
        this.departureName = departureName == null ? null : departureName.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}