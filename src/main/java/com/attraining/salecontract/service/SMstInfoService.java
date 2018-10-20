/**
 * @システム名: 契約管理システム
 * @ファイル名: SMstInfoService.java
 * @更新日付: 2018/10/01
 * @Copyright: 2018
 */
package com.attraining.salecontract.service;

import java.util.List;

import com.attraining.salecontract.bean.MstAuthorityInfo;

/**
 * <pre>
 * [機 能] MST情報処理。
 * [説 明] MST情報処理Service
 * @author [作 成] 2018/10/01 東山(ITT)
 * </pre>
 */
public interface SMstInfoService {

    /**
     * <pre>
     * [機 能]権限情報の取得処理
     * [説 明]権限情報の取得処理
     * @param
     * @return List<MstAuthorityInfo> 権限情報リスト
     * </pre>
     */
    List<MstAuthorityInfo> getMstAuthorityInfo(String authorityCd);

}