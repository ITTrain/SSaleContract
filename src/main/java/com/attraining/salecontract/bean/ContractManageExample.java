package com.attraining.salecontract.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ContractManageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContractManageExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andContractNoIsNull() {
            addCriterion("contract_no is null");
            return (Criteria) this;
        }

        public Criteria andContractNoIsNotNull() {
            addCriterion("contract_no is not null");
            return (Criteria) this;
        }

        public Criteria andContractNoEqualTo(String value) {
            addCriterion("contract_no =", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotEqualTo(String value) {
            addCriterion("contract_no <>", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoGreaterThan(String value) {
            addCriterion("contract_no >", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoGreaterThanOrEqualTo(String value) {
            addCriterion("contract_no >=", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoLessThan(String value) {
            addCriterion("contract_no <", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoLessThanOrEqualTo(String value) {
            addCriterion("contract_no <=", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoLike(String value) {
            addCriterion("contract_no like", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotLike(String value) {
            addCriterion("contract_no not like", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoIn(List<String> values) {
            addCriterion("contract_no in", values, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotIn(List<String> values) {
            addCriterion("contract_no not in", values, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoBetween(String value1, String value2) {
            addCriterion("contract_no between", value1, value2, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotBetween(String value1, String value2) {
            addCriterion("contract_no not between", value1, value2, "contractNo");
            return (Criteria) this;
        }

        public Criteria andCurrencyCdIsNull() {
            addCriterion("currency_cd is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyCdIsNotNull() {
            addCriterion("currency_cd is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyCdEqualTo(String value) {
            addCriterion("currency_cd =", value, "currencyCd");
            return (Criteria) this;
        }

        public Criteria andCurrencyCdNotEqualTo(String value) {
            addCriterion("currency_cd <>", value, "currencyCd");
            return (Criteria) this;
        }

        public Criteria andCurrencyCdGreaterThan(String value) {
            addCriterion("currency_cd >", value, "currencyCd");
            return (Criteria) this;
        }

        public Criteria andCurrencyCdGreaterThanOrEqualTo(String value) {
            addCriterion("currency_cd >=", value, "currencyCd");
            return (Criteria) this;
        }

        public Criteria andCurrencyCdLessThan(String value) {
            addCriterion("currency_cd <", value, "currencyCd");
            return (Criteria) this;
        }

        public Criteria andCurrencyCdLessThanOrEqualTo(String value) {
            addCriterion("currency_cd <=", value, "currencyCd");
            return (Criteria) this;
        }

        public Criteria andCurrencyCdLike(String value) {
            addCriterion("currency_cd like", value, "currencyCd");
            return (Criteria) this;
        }

        public Criteria andCurrencyCdNotLike(String value) {
            addCriterion("currency_cd not like", value, "currencyCd");
            return (Criteria) this;
        }

        public Criteria andCurrencyCdIn(List<String> values) {
            addCriterion("currency_cd in", values, "currencyCd");
            return (Criteria) this;
        }

        public Criteria andCurrencyCdNotIn(List<String> values) {
            addCriterion("currency_cd not in", values, "currencyCd");
            return (Criteria) this;
        }

        public Criteria andCurrencyCdBetween(String value1, String value2) {
            addCriterion("currency_cd between", value1, value2, "currencyCd");
            return (Criteria) this;
        }

        public Criteria andCurrencyCdNotBetween(String value1, String value2) {
            addCriterion("currency_cd not between", value1, value2, "currencyCd");
            return (Criteria) this;
        }

        public Criteria andUnitCdIsNull() {
            addCriterion("unit_cd is null");
            return (Criteria) this;
        }

        public Criteria andUnitCdIsNotNull() {
            addCriterion("unit_cd is not null");
            return (Criteria) this;
        }

        public Criteria andUnitCdEqualTo(String value) {
            addCriterion("unit_cd =", value, "unitCd");
            return (Criteria) this;
        }

        public Criteria andUnitCdNotEqualTo(String value) {
            addCriterion("unit_cd <>", value, "unitCd");
            return (Criteria) this;
        }

        public Criteria andUnitCdGreaterThan(String value) {
            addCriterion("unit_cd >", value, "unitCd");
            return (Criteria) this;
        }

        public Criteria andUnitCdGreaterThanOrEqualTo(String value) {
            addCriterion("unit_cd >=", value, "unitCd");
            return (Criteria) this;
        }

        public Criteria andUnitCdLessThan(String value) {
            addCriterion("unit_cd <", value, "unitCd");
            return (Criteria) this;
        }

        public Criteria andUnitCdLessThanOrEqualTo(String value) {
            addCriterion("unit_cd <=", value, "unitCd");
            return (Criteria) this;
        }

        public Criteria andUnitCdLike(String value) {
            addCriterion("unit_cd like", value, "unitCd");
            return (Criteria) this;
        }

        public Criteria andUnitCdNotLike(String value) {
            addCriterion("unit_cd not like", value, "unitCd");
            return (Criteria) this;
        }

        public Criteria andUnitCdIn(List<String> values) {
            addCriterion("unit_cd in", values, "unitCd");
            return (Criteria) this;
        }

        public Criteria andUnitCdNotIn(List<String> values) {
            addCriterion("unit_cd not in", values, "unitCd");
            return (Criteria) this;
        }

        public Criteria andUnitCdBetween(String value1, String value2) {
            addCriterion("unit_cd between", value1, value2, "unitCd");
            return (Criteria) this;
        }

        public Criteria andUnitCdNotBetween(String value1, String value2) {
            addCriterion("unit_cd not between", value1, value2, "unitCd");
            return (Criteria) this;
        }

        public Criteria andStatusCdIsNull() {
            addCriterion("status_cd is null");
            return (Criteria) this;
        }

        public Criteria andStatusCdIsNotNull() {
            addCriterion("status_cd is not null");
            return (Criteria) this;
        }

        public Criteria andStatusCdEqualTo(String value) {
            addCriterion("status_cd =", value, "statusCd");
            return (Criteria) this;
        }

        public Criteria andStatusCdNotEqualTo(String value) {
            addCriterion("status_cd <>", value, "statusCd");
            return (Criteria) this;
        }

        public Criteria andStatusCdGreaterThan(String value) {
            addCriterion("status_cd >", value, "statusCd");
            return (Criteria) this;
        }

        public Criteria andStatusCdGreaterThanOrEqualTo(String value) {
            addCriterion("status_cd >=", value, "statusCd");
            return (Criteria) this;
        }

        public Criteria andStatusCdLessThan(String value) {
            addCriterion("status_cd <", value, "statusCd");
            return (Criteria) this;
        }

        public Criteria andStatusCdLessThanOrEqualTo(String value) {
            addCriterion("status_cd <=", value, "statusCd");
            return (Criteria) this;
        }

        public Criteria andStatusCdLike(String value) {
            addCriterion("status_cd like", value, "statusCd");
            return (Criteria) this;
        }

        public Criteria andStatusCdNotLike(String value) {
            addCriterion("status_cd not like", value, "statusCd");
            return (Criteria) this;
        }

        public Criteria andStatusCdIn(List<String> values) {
            addCriterion("status_cd in", values, "statusCd");
            return (Criteria) this;
        }

        public Criteria andStatusCdNotIn(List<String> values) {
            addCriterion("status_cd not in", values, "statusCd");
            return (Criteria) this;
        }

        public Criteria andStatusCdBetween(String value1, String value2) {
            addCriterion("status_cd between", value1, value2, "statusCd");
            return (Criteria) this;
        }

        public Criteria andStatusCdNotBetween(String value1, String value2) {
            addCriterion("status_cd not between", value1, value2, "statusCd");
            return (Criteria) this;
        }

        public Criteria andSaleManIsNull() {
            addCriterion("sale_man is null");
            return (Criteria) this;
        }

        public Criteria andSaleManIsNotNull() {
            addCriterion("sale_man is not null");
            return (Criteria) this;
        }

        public Criteria andSaleManEqualTo(String value) {
            addCriterion("sale_man =", value, "saleMan");
            return (Criteria) this;
        }

        public Criteria andSaleManNotEqualTo(String value) {
            addCriterion("sale_man <>", value, "saleMan");
            return (Criteria) this;
        }

        public Criteria andSaleManGreaterThan(String value) {
            addCriterion("sale_man >", value, "saleMan");
            return (Criteria) this;
        }

        public Criteria andSaleManGreaterThanOrEqualTo(String value) {
            addCriterion("sale_man >=", value, "saleMan");
            return (Criteria) this;
        }

        public Criteria andSaleManLessThan(String value) {
            addCriterion("sale_man <", value, "saleMan");
            return (Criteria) this;
        }

        public Criteria andSaleManLessThanOrEqualTo(String value) {
            addCriterion("sale_man <=", value, "saleMan");
            return (Criteria) this;
        }

        public Criteria andSaleManLike(String value) {
            addCriterion("sale_man like", value, "saleMan");
            return (Criteria) this;
        }

        public Criteria andSaleManNotLike(String value) {
            addCriterion("sale_man not like", value, "saleMan");
            return (Criteria) this;
        }

        public Criteria andSaleManIn(List<String> values) {
            addCriterion("sale_man in", values, "saleMan");
            return (Criteria) this;
        }

        public Criteria andSaleManNotIn(List<String> values) {
            addCriterion("sale_man not in", values, "saleMan");
            return (Criteria) this;
        }

        public Criteria andSaleManBetween(String value1, String value2) {
            addCriterion("sale_man between", value1, value2, "saleMan");
            return (Criteria) this;
        }

        public Criteria andSaleManNotBetween(String value1, String value2) {
            addCriterion("sale_man not between", value1, value2, "saleMan");
            return (Criteria) this;
        }

        public Criteria andSaleDateIsNull() {
            addCriterion("sale_date is null");
            return (Criteria) this;
        }

        public Criteria andSaleDateIsNotNull() {
            addCriterion("sale_date is not null");
            return (Criteria) this;
        }

        public Criteria andSaleDateEqualTo(Date value) {
            addCriterionForJDBCDate("sale_date =", value, "saleDate");
            return (Criteria) this;
        }

        public Criteria andSaleDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("sale_date <>", value, "saleDate");
            return (Criteria) this;
        }

        public Criteria andSaleDateGreaterThan(Date value) {
            addCriterionForJDBCDate("sale_date >", value, "saleDate");
            return (Criteria) this;
        }

        public Criteria andSaleDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sale_date >=", value, "saleDate");
            return (Criteria) this;
        }

        public Criteria andSaleDateLessThan(Date value) {
            addCriterionForJDBCDate("sale_date <", value, "saleDate");
            return (Criteria) this;
        }

        public Criteria andSaleDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sale_date <=", value, "saleDate");
            return (Criteria) this;
        }

        public Criteria andSaleDateIn(List<Date> values) {
            addCriterionForJDBCDate("sale_date in", values, "saleDate");
            return (Criteria) this;
        }

        public Criteria andSaleDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("sale_date not in", values, "saleDate");
            return (Criteria) this;
        }

        public Criteria andSaleDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sale_date between", value1, value2, "saleDate");
            return (Criteria) this;
        }

        public Criteria andSaleDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sale_date not between", value1, value2, "saleDate");
            return (Criteria) this;
        }

        public Criteria andCustemerNameIsNull() {
            addCriterion("custemer_name is null");
            return (Criteria) this;
        }

        public Criteria andCustemerNameIsNotNull() {
            addCriterion("custemer_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustemerNameEqualTo(String value) {
            addCriterion("custemer_name =", value, "custemerName");
            return (Criteria) this;
        }

        public Criteria andCustemerNameNotEqualTo(String value) {
            addCriterion("custemer_name <>", value, "custemerName");
            return (Criteria) this;
        }

        public Criteria andCustemerNameGreaterThan(String value) {
            addCriterion("custemer_name >", value, "custemerName");
            return (Criteria) this;
        }

        public Criteria andCustemerNameGreaterThanOrEqualTo(String value) {
            addCriterion("custemer_name >=", value, "custemerName");
            return (Criteria) this;
        }

        public Criteria andCustemerNameLessThan(String value) {
            addCriterion("custemer_name <", value, "custemerName");
            return (Criteria) this;
        }

        public Criteria andCustemerNameLessThanOrEqualTo(String value) {
            addCriterion("custemer_name <=", value, "custemerName");
            return (Criteria) this;
        }

        public Criteria andCustemerNameLike(String value) {
            addCriterion("custemer_name like", value, "custemerName");
            return (Criteria) this;
        }

        public Criteria andCustemerNameNotLike(String value) {
            addCriterion("custemer_name not like", value, "custemerName");
            return (Criteria) this;
        }

        public Criteria andCustemerNameIn(List<String> values) {
            addCriterion("custemer_name in", values, "custemerName");
            return (Criteria) this;
        }

        public Criteria andCustemerNameNotIn(List<String> values) {
            addCriterion("custemer_name not in", values, "custemerName");
            return (Criteria) this;
        }

        public Criteria andCustemerNameBetween(String value1, String value2) {
            addCriterion("custemer_name between", value1, value2, "custemerName");
            return (Criteria) this;
        }

        public Criteria andCustemerNameNotBetween(String value1, String value2) {
            addCriterion("custemer_name not between", value1, value2, "custemerName");
            return (Criteria) this;
        }

        public Criteria andShippingmarkIsNull() {
            addCriterion("shippingmark is null");
            return (Criteria) this;
        }

        public Criteria andShippingmarkIsNotNull() {
            addCriterion("shippingmark is not null");
            return (Criteria) this;
        }

        public Criteria andShippingmarkEqualTo(String value) {
            addCriterion("shippingmark =", value, "shippingmark");
            return (Criteria) this;
        }

        public Criteria andShippingmarkNotEqualTo(String value) {
            addCriterion("shippingmark <>", value, "shippingmark");
            return (Criteria) this;
        }

        public Criteria andShippingmarkGreaterThan(String value) {
            addCriterion("shippingmark >", value, "shippingmark");
            return (Criteria) this;
        }

        public Criteria andShippingmarkGreaterThanOrEqualTo(String value) {
            addCriterion("shippingmark >=", value, "shippingmark");
            return (Criteria) this;
        }

        public Criteria andShippingmarkLessThan(String value) {
            addCriterion("shippingmark <", value, "shippingmark");
            return (Criteria) this;
        }

        public Criteria andShippingmarkLessThanOrEqualTo(String value) {
            addCriterion("shippingmark <=", value, "shippingmark");
            return (Criteria) this;
        }

        public Criteria andShippingmarkLike(String value) {
            addCriterion("shippingmark like", value, "shippingmark");
            return (Criteria) this;
        }

        public Criteria andShippingmarkNotLike(String value) {
            addCriterion("shippingmark not like", value, "shippingmark");
            return (Criteria) this;
        }

        public Criteria andShippingmarkIn(List<String> values) {
            addCriterion("shippingmark in", values, "shippingmark");
            return (Criteria) this;
        }

        public Criteria andShippingmarkNotIn(List<String> values) {
            addCriterion("shippingmark not in", values, "shippingmark");
            return (Criteria) this;
        }

        public Criteria andShippingmarkBetween(String value1, String value2) {
            addCriterion("shippingmark between", value1, value2, "shippingmark");
            return (Criteria) this;
        }

        public Criteria andShippingmarkNotBetween(String value1, String value2) {
            addCriterion("shippingmark not between", value1, value2, "shippingmark");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateIsNull() {
            addCriterion("delivery_date is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateIsNotNull() {
            addCriterion("delivery_date is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateEqualTo(String value) {
            addCriterion("delivery_date =", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateNotEqualTo(String value) {
            addCriterion("delivery_date <>", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateGreaterThan(String value) {
            addCriterion("delivery_date >", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_date >=", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateLessThan(String value) {
            addCriterion("delivery_date <", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateLessThanOrEqualTo(String value) {
            addCriterion("delivery_date <=", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateLike(String value) {
            addCriterion("delivery_date like", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateNotLike(String value) {
            addCriterion("delivery_date not like", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateIn(List<String> values) {
            addCriterion("delivery_date in", values, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateNotIn(List<String> values) {
            addCriterion("delivery_date not in", values, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateBetween(String value1, String value2) {
            addCriterion("delivery_date between", value1, value2, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateNotBetween(String value1, String value2) {
            addCriterion("delivery_date not between", value1, value2, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDepartureCdIsNull() {
            addCriterion("departure_cd is null");
            return (Criteria) this;
        }

        public Criteria andDepartureCdIsNotNull() {
            addCriterion("departure_cd is not null");
            return (Criteria) this;
        }

        public Criteria andDepartureCdEqualTo(String value) {
            addCriterion("departure_cd =", value, "departureCd");
            return (Criteria) this;
        }

        public Criteria andDepartureCdNotEqualTo(String value) {
            addCriterion("departure_cd <>", value, "departureCd");
            return (Criteria) this;
        }

        public Criteria andDepartureCdGreaterThan(String value) {
            addCriterion("departure_cd >", value, "departureCd");
            return (Criteria) this;
        }

        public Criteria andDepartureCdGreaterThanOrEqualTo(String value) {
            addCriterion("departure_cd >=", value, "departureCd");
            return (Criteria) this;
        }

        public Criteria andDepartureCdLessThan(String value) {
            addCriterion("departure_cd <", value, "departureCd");
            return (Criteria) this;
        }

        public Criteria andDepartureCdLessThanOrEqualTo(String value) {
            addCriterion("departure_cd <=", value, "departureCd");
            return (Criteria) this;
        }

        public Criteria andDepartureCdLike(String value) {
            addCriterion("departure_cd like", value, "departureCd");
            return (Criteria) this;
        }

        public Criteria andDepartureCdNotLike(String value) {
            addCriterion("departure_cd not like", value, "departureCd");
            return (Criteria) this;
        }

        public Criteria andDepartureCdIn(List<String> values) {
            addCriterion("departure_cd in", values, "departureCd");
            return (Criteria) this;
        }

        public Criteria andDepartureCdNotIn(List<String> values) {
            addCriterion("departure_cd not in", values, "departureCd");
            return (Criteria) this;
        }

        public Criteria andDepartureCdBetween(String value1, String value2) {
            addCriterion("departure_cd between", value1, value2, "departureCd");
            return (Criteria) this;
        }

        public Criteria andDepartureCdNotBetween(String value1, String value2) {
            addCriterion("departure_cd not between", value1, value2, "departureCd");
            return (Criteria) this;
        }

        public Criteria andArrivalCdIsNull() {
            addCriterion("arrival_cd is null");
            return (Criteria) this;
        }

        public Criteria andArrivalCdIsNotNull() {
            addCriterion("arrival_cd is not null");
            return (Criteria) this;
        }

        public Criteria andArrivalCdEqualTo(String value) {
            addCriterion("arrival_cd =", value, "arrivalCd");
            return (Criteria) this;
        }

        public Criteria andArrivalCdNotEqualTo(String value) {
            addCriterion("arrival_cd <>", value, "arrivalCd");
            return (Criteria) this;
        }

        public Criteria andArrivalCdGreaterThan(String value) {
            addCriterion("arrival_cd >", value, "arrivalCd");
            return (Criteria) this;
        }

        public Criteria andArrivalCdGreaterThanOrEqualTo(String value) {
            addCriterion("arrival_cd >=", value, "arrivalCd");
            return (Criteria) this;
        }

        public Criteria andArrivalCdLessThan(String value) {
            addCriterion("arrival_cd <", value, "arrivalCd");
            return (Criteria) this;
        }

        public Criteria andArrivalCdLessThanOrEqualTo(String value) {
            addCriterion("arrival_cd <=", value, "arrivalCd");
            return (Criteria) this;
        }

        public Criteria andArrivalCdLike(String value) {
            addCriterion("arrival_cd like", value, "arrivalCd");
            return (Criteria) this;
        }

        public Criteria andArrivalCdNotLike(String value) {
            addCriterion("arrival_cd not like", value, "arrivalCd");
            return (Criteria) this;
        }

        public Criteria andArrivalCdIn(List<String> values) {
            addCriterion("arrival_cd in", values, "arrivalCd");
            return (Criteria) this;
        }

        public Criteria andArrivalCdNotIn(List<String> values) {
            addCriterion("arrival_cd not in", values, "arrivalCd");
            return (Criteria) this;
        }

        public Criteria andArrivalCdBetween(String value1, String value2) {
            addCriterion("arrival_cd between", value1, value2, "arrivalCd");
            return (Criteria) this;
        }

        public Criteria andArrivalCdNotBetween(String value1, String value2) {
            addCriterion("arrival_cd not between", value1, value2, "arrivalCd");
            return (Criteria) this;
        }

        public Criteria andTradeLanguagelCdIsNull() {
            addCriterion("trade_languagel_cd is null");
            return (Criteria) this;
        }

        public Criteria andTradeLanguagelCdIsNotNull() {
            addCriterion("trade_languagel_cd is not null");
            return (Criteria) this;
        }

        public Criteria andTradeLanguagelCdEqualTo(String value) {
            addCriterion("trade_languagel_cd =", value, "tradeLanguagelCd");
            return (Criteria) this;
        }

        public Criteria andTradeLanguagelCdNotEqualTo(String value) {
            addCriterion("trade_languagel_cd <>", value, "tradeLanguagelCd");
            return (Criteria) this;
        }

        public Criteria andTradeLanguagelCdGreaterThan(String value) {
            addCriterion("trade_languagel_cd >", value, "tradeLanguagelCd");
            return (Criteria) this;
        }

        public Criteria andTradeLanguagelCdGreaterThanOrEqualTo(String value) {
            addCriterion("trade_languagel_cd >=", value, "tradeLanguagelCd");
            return (Criteria) this;
        }

        public Criteria andTradeLanguagelCdLessThan(String value) {
            addCriterion("trade_languagel_cd <", value, "tradeLanguagelCd");
            return (Criteria) this;
        }

        public Criteria andTradeLanguagelCdLessThanOrEqualTo(String value) {
            addCriterion("trade_languagel_cd <=", value, "tradeLanguagelCd");
            return (Criteria) this;
        }

        public Criteria andTradeLanguagelCdLike(String value) {
            addCriterion("trade_languagel_cd like", value, "tradeLanguagelCd");
            return (Criteria) this;
        }

        public Criteria andTradeLanguagelCdNotLike(String value) {
            addCriterion("trade_languagel_cd not like", value, "tradeLanguagelCd");
            return (Criteria) this;
        }

        public Criteria andTradeLanguagelCdIn(List<String> values) {
            addCriterion("trade_languagel_cd in", values, "tradeLanguagelCd");
            return (Criteria) this;
        }

        public Criteria andTradeLanguagelCdNotIn(List<String> values) {
            addCriterion("trade_languagel_cd not in", values, "tradeLanguagelCd");
            return (Criteria) this;
        }

        public Criteria andTradeLanguagelCdBetween(String value1, String value2) {
            addCriterion("trade_languagel_cd between", value1, value2, "tradeLanguagelCd");
            return (Criteria) this;
        }

        public Criteria andTradeLanguagelCdNotBetween(String value1, String value2) {
            addCriterion("trade_languagel_cd not between", value1, value2, "tradeLanguagelCd");
            return (Criteria) this;
        }

        public Criteria andPaymentlCdIsNull() {
            addCriterion("paymentl_cd is null");
            return (Criteria) this;
        }

        public Criteria andPaymentlCdIsNotNull() {
            addCriterion("paymentl_cd is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentlCdEqualTo(String value) {
            addCriterion("paymentl_cd =", value, "paymentlCd");
            return (Criteria) this;
        }

        public Criteria andPaymentlCdNotEqualTo(String value) {
            addCriterion("paymentl_cd <>", value, "paymentlCd");
            return (Criteria) this;
        }

        public Criteria andPaymentlCdGreaterThan(String value) {
            addCriterion("paymentl_cd >", value, "paymentlCd");
            return (Criteria) this;
        }

        public Criteria andPaymentlCdGreaterThanOrEqualTo(String value) {
            addCriterion("paymentl_cd >=", value, "paymentlCd");
            return (Criteria) this;
        }

        public Criteria andPaymentlCdLessThan(String value) {
            addCriterion("paymentl_cd <", value, "paymentlCd");
            return (Criteria) this;
        }

        public Criteria andPaymentlCdLessThanOrEqualTo(String value) {
            addCriterion("paymentl_cd <=", value, "paymentlCd");
            return (Criteria) this;
        }

        public Criteria andPaymentlCdLike(String value) {
            addCriterion("paymentl_cd like", value, "paymentlCd");
            return (Criteria) this;
        }

        public Criteria andPaymentlCdNotLike(String value) {
            addCriterion("paymentl_cd not like", value, "paymentlCd");
            return (Criteria) this;
        }

        public Criteria andPaymentlCdIn(List<String> values) {
            addCriterion("paymentl_cd in", values, "paymentlCd");
            return (Criteria) this;
        }

        public Criteria andPaymentlCdNotIn(List<String> values) {
            addCriterion("paymentl_cd not in", values, "paymentlCd");
            return (Criteria) this;
        }

        public Criteria andPaymentlCdBetween(String value1, String value2) {
            addCriterion("paymentl_cd between", value1, value2, "paymentlCd");
            return (Criteria) this;
        }

        public Criteria andPaymentlCdNotBetween(String value1, String value2) {
            addCriterion("paymentl_cd not between", value1, value2, "paymentlCd");
            return (Criteria) this;
        }

        public Criteria andCreditNoIsNull() {
            addCriterion("credit_no is null");
            return (Criteria) this;
        }

        public Criteria andCreditNoIsNotNull() {
            addCriterion("credit_no is not null");
            return (Criteria) this;
        }

        public Criteria andCreditNoEqualTo(String value) {
            addCriterion("credit_no =", value, "creditNo");
            return (Criteria) this;
        }

        public Criteria andCreditNoNotEqualTo(String value) {
            addCriterion("credit_no <>", value, "creditNo");
            return (Criteria) this;
        }

        public Criteria andCreditNoGreaterThan(String value) {
            addCriterion("credit_no >", value, "creditNo");
            return (Criteria) this;
        }

        public Criteria andCreditNoGreaterThanOrEqualTo(String value) {
            addCriterion("credit_no >=", value, "creditNo");
            return (Criteria) this;
        }

        public Criteria andCreditNoLessThan(String value) {
            addCriterion("credit_no <", value, "creditNo");
            return (Criteria) this;
        }

        public Criteria andCreditNoLessThanOrEqualTo(String value) {
            addCriterion("credit_no <=", value, "creditNo");
            return (Criteria) this;
        }

        public Criteria andCreditNoLike(String value) {
            addCriterion("credit_no like", value, "creditNo");
            return (Criteria) this;
        }

        public Criteria andCreditNoNotLike(String value) {
            addCriterion("credit_no not like", value, "creditNo");
            return (Criteria) this;
        }

        public Criteria andCreditNoIn(List<String> values) {
            addCriterion("credit_no in", values, "creditNo");
            return (Criteria) this;
        }

        public Criteria andCreditNoNotIn(List<String> values) {
            addCriterion("credit_no not in", values, "creditNo");
            return (Criteria) this;
        }

        public Criteria andCreditNoBetween(String value1, String value2) {
            addCriterion("credit_no between", value1, value2, "creditNo");
            return (Criteria) this;
        }

        public Criteria andCreditNoNotBetween(String value1, String value2) {
            addCriterion("credit_no not between", value1, value2, "creditNo");
            return (Criteria) this;
        }

        public Criteria andAmountsIsNull() {
            addCriterion("amounts is null");
            return (Criteria) this;
        }

        public Criteria andAmountsIsNotNull() {
            addCriterion("amounts is not null");
            return (Criteria) this;
        }

        public Criteria andAmountsEqualTo(BigDecimal value) {
            addCriterion("amounts =", value, "amounts");
            return (Criteria) this;
        }

        public Criteria andAmountsNotEqualTo(BigDecimal value) {
            addCriterion("amounts <>", value, "amounts");
            return (Criteria) this;
        }

        public Criteria andAmountsGreaterThan(BigDecimal value) {
            addCriterion("amounts >", value, "amounts");
            return (Criteria) this;
        }

        public Criteria andAmountsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amounts >=", value, "amounts");
            return (Criteria) this;
        }

        public Criteria andAmountsLessThan(BigDecimal value) {
            addCriterion("amounts <", value, "amounts");
            return (Criteria) this;
        }

        public Criteria andAmountsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amounts <=", value, "amounts");
            return (Criteria) this;
        }

        public Criteria andAmountsIn(List<BigDecimal> values) {
            addCriterion("amounts in", values, "amounts");
            return (Criteria) this;
        }

        public Criteria andAmountsNotIn(List<BigDecimal> values) {
            addCriterion("amounts not in", values, "amounts");
            return (Criteria) this;
        }

        public Criteria andAmountsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amounts between", value1, value2, "amounts");
            return (Criteria) this;
        }

        public Criteria andAmountsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amounts not between", value1, value2, "amounts");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("memo not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andBankCdIsNull() {
            addCriterion("bank_cd is null");
            return (Criteria) this;
        }

        public Criteria andBankCdIsNotNull() {
            addCriterion("bank_cd is not null");
            return (Criteria) this;
        }

        public Criteria andBankCdEqualTo(String value) {
            addCriterion("bank_cd =", value, "bankCd");
            return (Criteria) this;
        }

        public Criteria andBankCdNotEqualTo(String value) {
            addCriterion("bank_cd <>", value, "bankCd");
            return (Criteria) this;
        }

        public Criteria andBankCdGreaterThan(String value) {
            addCriterion("bank_cd >", value, "bankCd");
            return (Criteria) this;
        }

        public Criteria andBankCdGreaterThanOrEqualTo(String value) {
            addCriterion("bank_cd >=", value, "bankCd");
            return (Criteria) this;
        }

        public Criteria andBankCdLessThan(String value) {
            addCriterion("bank_cd <", value, "bankCd");
            return (Criteria) this;
        }

        public Criteria andBankCdLessThanOrEqualTo(String value) {
            addCriterion("bank_cd <=", value, "bankCd");
            return (Criteria) this;
        }

        public Criteria andBankCdLike(String value) {
            addCriterion("bank_cd like", value, "bankCd");
            return (Criteria) this;
        }

        public Criteria andBankCdNotLike(String value) {
            addCriterion("bank_cd not like", value, "bankCd");
            return (Criteria) this;
        }

        public Criteria andBankCdIn(List<String> values) {
            addCriterion("bank_cd in", values, "bankCd");
            return (Criteria) this;
        }

        public Criteria andBankCdNotIn(List<String> values) {
            addCriterion("bank_cd not in", values, "bankCd");
            return (Criteria) this;
        }

        public Criteria andBankCdBetween(String value1, String value2) {
            addCriterion("bank_cd between", value1, value2, "bankCd");
            return (Criteria) this;
        }

        public Criteria andBankCdNotBetween(String value1, String value2) {
            addCriterion("bank_cd not between", value1, value2, "bankCd");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterionForJDBCDate("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterionForJDBCDate("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterionForJDBCDate("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("update_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("update_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("update_user >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("update_user like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("update_user not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("update_user not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterionForJDBCDate("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterionForJDBCDate("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterionForJDBCDate("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}