/**
 * @システム名: 契約管理システム
 * @ファイル名: SMstInfoServiceImpl.java
 * @更新日付: 2018/10/01
 * @Copyright: 2018
 */
package com.attraining.salecontract.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.attraining.salecontract.bean.MstAuthorityInfo;
import com.attraining.salecontract.dao.MstAuthorityInfoMapper;
import com.attraining.salecontract.service.SMstInfoService;

/**
 * <pre>
 * [機 能] MST情報処理。
 * [説 明] MST情報処理Service
 * @author [作 成] 2018/10/01 東山(ITT)
 * </pre>
 */
@Service("MstInfoService")
public class SMstInfoServiceImpl implements SMstInfoService{

    @Autowired
    private MstAuthorityInfoMapper mstAuthorityInfoMapper;

    /**
     * <pre>
     * [機 能]権限情報の取得処理
     * [説 明]権限情報の取得処理
     * @param
     * @return List<MstAuthorityInfo> 権限情報リスト
     * </pre>
     */
    @Transactional(readOnly=true)
    public List<MstAuthorityInfo> getMstAuthorityInfo(String authorityCd) {
        return mstAuthorityInfoMapper.selectMstAuthorityInfo(authorityCd);

    }

}