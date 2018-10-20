package com.attraining.salecontract.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.attraining.salecontract.bean.MstAuthorityInfo;
import com.attraining.salecontract.bean.MstAuthorityInfoExample;

public interface MstAuthorityInfoMapper {
    long countByExample(MstAuthorityInfoExample example);

    int deleteByExample(MstAuthorityInfoExample example);

    int deleteByPrimaryKey(String authorityCd);

    int insert(MstAuthorityInfo record);

    int insertSelective(MstAuthorityInfo record);

    List<MstAuthorityInfo> selectByExample(MstAuthorityInfoExample example);

    List<MstAuthorityInfo> selectMstAuthorityInfo(@Param("authorityCd") String authorityCd);

    MstAuthorityInfo selectByPrimaryKey(String authorityCd);

    int updateByExampleSelective(@Param("record") MstAuthorityInfo record, @Param("example") MstAuthorityInfoExample example);

    int updateByExample(@Param("record") MstAuthorityInfo record, @Param("example") MstAuthorityInfoExample example);

    int updateByPrimaryKeySelective(MstAuthorityInfo record);

    int updateByPrimaryKey(MstAuthorityInfo record);
}