package com.attraining.salecontract.bean;

import java.util.Date;

public class MstTreadelanInfo {
    private String treadelanCd;

    private String treadelanName;

    private String memo;

    private String createUser;

    private Date createDate;

    private String updateUser;

    private Date updateDate;

    public String getTreadelanCd() {
        return treadelanCd;
    }

    public void setTreadelanCd(String treadelanCd) {
        this.treadelanCd = treadelanCd == null ? null : treadelanCd.trim();
    }

    public String getTreadelanName() {
        return treadelanName;
    }

    public void setTreadelanName(String treadelanName) {
        this.treadelanName = treadelanName == null ? null : treadelanName.trim();
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