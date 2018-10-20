package com.attraining.salecontract.dao;

import com.attraining.salecontract.bean.ContractManage;
import com.attraining.salecontract.bean.ContractManageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContractManageMapper {
    long countByExample(ContractManageExample example);

    int deleteByExample(ContractManageExample example);

    int deleteByPrimaryKey(String contractNo);

    int insert(ContractManage record);

    int insertSelective(ContractManage record);

    List<ContractManage> selectByExample(ContractManageExample example);

    ContractManage selectByPrimaryKey(String contractNo);

    int updateByExampleSelective(@Param("record") ContractManage record, @Param("example") ContractManageExample example);

    int updateByExample(@Param("record") ContractManage record, @Param("example") ContractManageExample example);

    int updateByPrimaryKeySelective(ContractManage record);

    int updateByPrimaryKey(ContractManage record);
}