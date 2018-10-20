package com.attraining.salecontract.bean;

import java.util.Date;

public class MstCurrencyInfo {
    private String currencyCd;

    private String currencyName;

    private String memo;

    private String createUser;

    private Date createDate;

    private String updateUser;

    private Date updateDate;

    public String getCurrencyCd() {
        return currencyCd;
    }

    public void setCurrencyCd(String currencyCd) {
        this.currencyCd = currencyCd == null ? null : currencyCd.trim();
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName == null ? null : currencyName.trim();
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