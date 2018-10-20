/**
 * @システム名: 契約管理システム
 * @ファイル名: SUserServiceImpl.java
 * @更新日付: 2018/10/01
 * @Copyright: 2018
 */
package com.attraining.salecontract.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.attraining.salecontract.bean.UserInfo;
import com.attraining.salecontract.dao.UserInfoMapper;
import com.attraining.salecontract.service.SUserService;

/**
 * <pre>
 * [機 能] ユーザーログイン。
 * [説 明] ユーザーログインSUserServiceImpl
 * @author [作 成] 2018/10/01 東山(ITTraining)
 * </pre>
 */
@Service("SUserService")
public class SUserServiceImpl  implements SUserService{

    @Autowired
    UserInfoMapper userInfoMapper;

    /**
     * <pre>
     * [機 能]ログインユーザ検索処理
     * [説 明]ログインユーザ情報によってユーザ検索します
     * @param userId ユーザーＩＤ
     * @param password パスワード
     * @return int ログインユーザ件数
     * </pre>
     */
public List<UserInfo>  getUserInfoList(String userId, String password) {

    List<UserInfo> userInfoList = userInfoMapper.getUserList(userId, password);
        return userInfoList;
    }
/**
 * <pre>
 * [機 能]ユーザ情報検索処理
 * [説 明]ユーザ情報検索処理
 * @param
 * @return  List<UserInfo> ユーザ情報リスト
 * </pre>
 */
@Transactional(readOnly=true)
public List<UserInfo> getUserInfo(String userId, String userName, String authorityCd, String delFlag){
    List<UserInfo> userInfoList = userInfoMapper.selectUserInfo(userId, userName, authorityCd, delFlag);
    return userInfoList;
}
}
