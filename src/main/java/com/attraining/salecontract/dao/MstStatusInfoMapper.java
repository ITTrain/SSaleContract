package com.attraining.salecontract.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.attraining.salecontract.bean.MstStatusInfo;
import com.attraining.salecontract.bean.MstStatusInfoExample;

public interface MstStatusInfoMapper {
    long countByExample(MstStatusInfoExample example);

    int deleteByExample(MstStatusInfoExample example);

    int deleteByPrimaryKey(String statusCd);

    int insert(MstStatusInfo record);

    int insertSelective(MstStatusInfo record);

    List<MstStatusInfo> selectByExample(MstStatusInfoExample example);

    MstStatusInfo selectByPrimaryKey(String statusCd);

    int updateByExampleSelective(@Param("record") MstStatusInfo record, @Param("example") MstStatusInfoExample example);

    int updateByExample(@Param("record") MstStatusInfo record, @Param("example") MstStatusInfoExample example);

    int updateByPrimaryKeySelective(MstStatusInfo record);

    int updateByPrimaryKey(MstStatusInfo record);
}