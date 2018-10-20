package com.attraining.salecontract.dao;

import com.attraining.salecontract.bean.MstBankInfo;
import com.attraining.salecontract.bean.MstBankInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MstBankInfoMapper {
    long countByExample(MstBankInfoExample example);

    int deleteByExample(MstBankInfoExample example);

    int deleteByPrimaryKey(String bankCd);

    int insert(MstBankInfo record);

    int insertSelective(MstBankInfo record);

    List<MstBankInfo> selectByExample(MstBankInfoExample example);

    MstBankInfo selectByPrimaryKey(String bankCd);

    int updateByExampleSelective(@Param("record") MstBankInfo record, @Param("example") MstBankInfoExample example);

    int updateByExample(@Param("record") MstBankInfo record, @Param("example") MstBankInfoExample example);

    int updateByPrimaryKeySelective(MstBankInfo record);

    int updateByPrimaryKey(MstBankInfo record);
}