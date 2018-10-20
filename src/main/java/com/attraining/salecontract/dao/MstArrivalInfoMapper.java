package com.attraining.salecontract.dao;

import com.attraining.salecontract.bean.MstArrivalInfo;
import com.attraining.salecontract.bean.MstArrivalInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MstArrivalInfoMapper {
    long countByExample(MstArrivalInfoExample example);

    int deleteByExample(MstArrivalInfoExample example);

    int deleteByPrimaryKey(String arrivalCd);

    int insert(MstArrivalInfo record);

    int insertSelective(MstArrivalInfo record);

    List<MstArrivalInfo> selectByExample(MstArrivalInfoExample example);

    MstArrivalInfo selectByPrimaryKey(String arrivalCd);

    int updateByExampleSelective(@Param("record") MstArrivalInfo record, @Param("example") MstArrivalInfoExample example);

    int updateByExample(@Param("record") MstArrivalInfo record, @Param("example") MstArrivalInfoExample example);

    int updateByPrimaryKeySelective(MstArrivalInfo record);

    int updateByPrimaryKey(MstArrivalInfo record);
}