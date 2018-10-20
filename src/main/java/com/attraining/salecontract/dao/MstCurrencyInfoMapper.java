package com.attraining.salecontract.dao;

import com.attraining.salecontract.bean.MstCurrencyInfo;
import com.attraining.salecontract.bean.MstCurrencyInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MstCurrencyInfoMapper {
    long countByExample(MstCurrencyInfoExample example);

    int deleteByExample(MstCurrencyInfoExample example);

    int deleteByPrimaryKey(String currencyCd);

    int insert(MstCurrencyInfo record);

    int insertSelective(MstCurrencyInfo record);

    List<MstCurrencyInfo> selectByExample(MstCurrencyInfoExample example);

    MstCurrencyInfo selectByPrimaryKey(String currencyCd);

    int updateByExampleSelective(@Param("record") MstCurrencyInfo record, @Param("example") MstCurrencyInfoExample example);

    int updateByExample(@Param("record") MstCurrencyInfo record, @Param("example") MstCurrencyInfoExample example);

    int updateByPrimaryKeySelective(MstCurrencyInfo record);

    int updateByPrimaryKey(MstCurrencyInfo record);
}