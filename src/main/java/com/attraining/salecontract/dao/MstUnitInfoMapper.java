package com.attraining.salecontract.dao;

import com.attraining.salecontract.bean.MstUnitInfo;
import com.attraining.salecontract.bean.MstUnitInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MstUnitInfoMapper {
    long countByExample(MstUnitInfoExample example);

    int deleteByExample(MstUnitInfoExample example);

    int deleteByPrimaryKey(String unitCd);

    int insert(MstUnitInfo record);

    int insertSelective(MstUnitInfo record);

    List<MstUnitInfo> selectByExample(MstUnitInfoExample example);

    MstUnitInfo selectByPrimaryKey(String unitCd);

    int updateByExampleSelective(@Param("record") MstUnitInfo record, @Param("example") MstUnitInfoExample example);

    int updateByExample(@Param("record") MstUnitInfo record, @Param("example") MstUnitInfoExample example);

    int updateByPrimaryKeySelective(MstUnitInfo record);

    int updateByPrimaryKey(MstUnitInfo record);
}