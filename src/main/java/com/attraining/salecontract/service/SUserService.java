/**
 * @システム名: 契約管理システム
 * @ファイル名: SUserService.java
 * @更新日付: 2018/10/01
 * @Copyright: 2018
 */
package com.attraining.salecontract.service;

import java.util.List;

import com.attraining.salecontract.bean.UserInfo;

/**
 * <pre>
 * [機 能] ユーザーログイン。
 * [説 明] ユーザーログインService
 * @author [作 成] 2018/10/01 東山(ITT)
 * </pre>
 */
public interface SUserService {

    /**
     * <pre>
     * [機 能]ログインユーザ検索処理
     * [説 明]ログインユーザ情報によってユーザ検索します
     * @param userId ユーザーＩＤ
     * @param password パスワード
     * @return int ログインユーザ件数
     * </pre>
     */
    public List<UserInfo>  getUserInfoList(String userId,String password);

    /**
     * <pre>
     * [機 能]ユーザ情報検索処理
     * [説 明]ユーザ情報検索処理
     * @param
     * @return  List<UserInfo> ユーザ情報リスト
     * </pre>
     */
    List<UserInfo> getUserInfo(String userId, String userName, String authorityCd, String delFlag);

    /**
     * <pre>
     * [機 能]ユーザ情報検索処理
     * [説 明]ユーザーIDにより、ユーザ情報検索処理
     * @param
     * @return UserInfo ユーザ情報
     * </pre>
     */
    UserInfo getUserInfoByPrimaryKey(String userId);

    /**
     * <pre>
     * [機 能]ユーザ情報作成処理
     * [説 明]ユーザ情報作成処理
     * @param userInfo
     * @return
     * </pre>
     */
    void addUserInfo(UserInfo userInfo);

    /**
     * <pre>
     * [機 能]ユーザ情報更新処理
     * [説 明]ユーザ情報更新処理
     * @param userInfo
     * @return
     * </pre>
     */
    int updateUserInfo(UserInfo userInfo);
}
