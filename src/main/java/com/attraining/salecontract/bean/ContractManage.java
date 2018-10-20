package com.attraining.salecontract.bean;

import java.math.BigDecimal;
import java.util.Date;

public class ContractManage {
    private String contractNo;

    private String currencyCd;

    private String unitCd;

    private String statusCd;

    private String saleMan;

    private Date saleDate;

    private String custemerName;

    private String shippingmark;

    private String deliveryDate;

    private String departureCd;

    private String arrivalCd;

    private String tradeLanguagelCd;

    private String paymentlCd;

    private String creditNo;

    private BigDecimal amounts;

    private String memo;

    private String bankCd;

    private String createUser;

    private Date createDate;

    private String updateUser;

    private Date updateDate;

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo == null ? null : contractNo.trim();
    }

    public String getCurrencyCd() {
        return currencyCd;
    }

    public void setCurrencyCd(String currencyCd) {
        this.currencyCd = currencyCd == null ? null : currencyCd.trim();
    }

    public String getUnitCd() {
        return unitCd;
    }

    public void setUnitCd(String unitCd) {
        this.unitCd = unitCd == null ? null : unitCd.trim();
    }

    public String getStatusCd() {
        return statusCd;
    }

    public void setStatusCd(String statusCd) {
        this.statusCd = statusCd == null ? null : statusCd.trim();
    }

    public String getSaleMan() {
        return saleMan;
    }

    public void setSaleMan(String saleMan) {
        this.saleMan = saleMan == null ? null : saleMan.trim();
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    public String getCustemerName() {
        return custemerName;
    }

    public void setCustemerName(String custemerName) {
        this.custemerName = custemerName == null ? null : custemerName.trim();
    }

    public String getShippingmark() {
        return shippingmark;
    }

    public void setShippingmark(String shippingmark) {
        this.shippingmark = shippingmark == null ? null : shippingmark.trim();
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate == null ? null : deliveryDate.trim();
    }

    public String getDepartureCd() {
        return departureCd;
    }

    public void setDepartureCd(String departureCd) {
        this.departureCd = departureCd == null ? null : departureCd.trim();
    }

    public String getArrivalCd() {
        return arrivalCd;
    }

    public void setArrivalCd(String arrivalCd) {
        this.arrivalCd = arrivalCd == null ? null : arrivalCd.trim();
    }

    public String getTradeLanguagelCd() {
        return tradeLanguagelCd;
    }

    public void setTradeLanguagelCd(String tradeLanguagelCd) {
        this.tradeLanguagelCd = tradeLanguagelCd == null ? null : tradeLanguagelCd.trim();
    }

    public String getPaymentlCd() {
        return paymentlCd;
    }

    public void setPaymentlCd(String paymentlCd) {
        this.paymentlCd = paymentlCd == null ? null : paymentlCd.trim();
    }

    public String getCreditNo() {
        return creditNo;
    }

    public void setCreditNo(String creditNo) {
        this.creditNo = creditNo == null ? null : creditNo.trim();
    }

    public BigDecimal getAmounts() {
        return amounts;
    }

    public void setAmounts(BigDecimal amounts) {
        this.amounts = amounts;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getBankCd() {
        return bankCd;
    }

    public void setBankCd(String bankCd) {
        this.bankCd = bankCd == null ? null : bankCd.trim();
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