package com.attraining.salecontract.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.attraining.salecontract.bean.UserInfo;
import com.attraining.salecontract.bean.UserInfoExample;

public interface UserInfoMapper {
    long countByExample(UserInfoExample example);

    int deleteByExample(UserInfoExample example);

    int deleteByPrimaryKey(String userId);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    List<UserInfo>  getUserList(@Param("userId")String userId, @Param("password")String password);

    List<UserInfo> selectUserInfo(@Param("userId") String userId,@Param("userName") String userName,@Param("userRoot") String userRoot,@Param("delFlag") String delFlag);

    List<UserInfo> selectByExample(UserInfoExample example);

    UserInfo selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    int updateByExample(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}