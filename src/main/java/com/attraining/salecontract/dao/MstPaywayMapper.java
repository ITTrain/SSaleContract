package com.attraining.salecontract.dao;

import com.attraining.salecontract.bean.MstPayway;
import com.attraining.salecontract.bean.MstPaywayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MstPaywayMapper {
    long countByExample(MstPaywayExample example);

    int deleteByExample(MstPaywayExample example);

    int deleteByPrimaryKey(String paywayCd);

    int insert(MstPayway record);

    int insertSelective(MstPayway record);

    List<MstPayway> selectByExample(MstPaywayExample example);

    MstPayway selectByPrimaryKey(String paywayCd);

    int updateByExampleSelective(@Param("record") MstPayway record, @Param("example") MstPaywayExample example);

    int updateByExample(@Param("record") MstPayway record, @Param("example") MstPaywayExample example);

    int updateByPrimaryKeySelective(MstPayway record);

    int updateByPrimaryKey(MstPayway record);
}