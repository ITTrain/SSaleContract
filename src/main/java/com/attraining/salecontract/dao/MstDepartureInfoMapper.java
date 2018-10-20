package com.attraining.salecontract.dao;

import com.attraining.salecontract.bean.MstDepartureInfo;
import com.attraining.salecontract.bean.MstDepartureInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MstDepartureInfoMapper {
    long countByExample(MstDepartureInfoExample example);

    int deleteByExample(MstDepartureInfoExample example);

    int deleteByPrimaryKey(String departureCd);

    int insert(MstDepartureInfo record);

    int insertSelective(MstDepartureInfo record);

    List<MstDepartureInfo> selectByExample(MstDepartureInfoExample example);

    MstDepartureInfo selectByPrimaryKey(String departureCd);

    int updateByExampleSelective(@Param("record") MstDepartureInfo record, @Param("example") MstDepartureInfoExample example);

    int updateByExample(@Param("record") MstDepartureInfo record, @Param("example") MstDepartureInfoExample example);

    int updateByPrimaryKeySelective(MstDepartureInfo record);

    int updateByPrimaryKey(MstDepartureInfo record);
}