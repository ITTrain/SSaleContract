package com.attraining.salecontract.dao;

import com.attraining.salecontract.bean.MstTreadelanInfo;
import com.attraining.salecontract.bean.MstTreadelanInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MstTreadelanInfoMapper {
    long countByExample(MstTreadelanInfoExample example);

    int deleteByExample(MstTreadelanInfoExample example);

    int deleteByPrimaryKey(String treadelanCd);

    int insert(MstTreadelanInfo record);

    int insertSelective(MstTreadelanInfo record);

    List<MstTreadelanInfo> selectByExample(MstTreadelanInfoExample example);

    MstTreadelanInfo selectByPrimaryKey(String treadelanCd);

    int updateByExampleSelective(@Param("record") MstTreadelanInfo record, @Param("example") MstTreadelanInfoExample example);

    int updateByExample(@Param("record") MstTreadelanInfo record, @Param("example") MstTreadelanInfoExample example);

    int updateByPrimaryKeySelective(MstTreadelanInfo record);

    int updateByPrimaryKey(MstTreadelanInfo record);
}