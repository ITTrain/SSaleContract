/**
 * @システム名: 契約管理システム
 * @ファイル名: SUser_SEARCHController.java
 * @更新日付: 2018/10/01
 * @Copyright: 2018.
 */
package com.attraining.salecontract.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.attraining.salecontract.bean.MstAuthorityInfo;
import com.attraining.salecontract.bean.UserInfo;
import com.attraining.salecontract.common.Message;
import com.attraining.salecontract.common.PropertiesFileLoader;
import com.attraining.salecontract.service.SMstInfoService;
import com.attraining.salecontract.service.SUserService;

/**
 * <pre>
 * [機 能] ユーザー検索。
 * [説 明] ユーザー検索Controller
 * @author [作 成] 2018/10/01 東山(ITT)
 * </pre>
 */
@Controller
public class SUser_SEARCHController {

    @Autowired
    private SMstInfoService sMstInfoService;
    @Autowired
    private SUserService sUserService;

    /**
     * <pre>
     * [機 能]ユーザー検索画面初期化処理
     * [説 明]ユーザー検索画面初期化処理
     * @param
     * @return String 	遷移先
     * </pre>
     */
    @RequestMapping("UserSearchInit")
    public ModelAndView  userSearchInit(ModelAndView mv, HttpSession session) {
        // マスタ情報を取得
        List<MstAuthorityInfo> mstAuthorityInfoList = sMstInfoService.getMstAuthorityInfo(null);
        // 権限情報を設定
        mv.addObject("mstAuthorityInfoList", mstAuthorityInfoList);
        session.setAttribute("mstAuthorityInfoList", mstAuthorityInfoList);
        // ユーザー検索画面IDを設定
        mv.setViewName("User/UserSearch");
        return mv;
    }

    /**
     * <pre>
     * [機 能]ユーザ情報検索処理
     * [説 明]ユーザ情報検索処理
     * @param mv
     * @param userId
     * @param userName
     * @param userRoot
     * @param delFlag
     * @return String 	遷移先
     * </pre>
     */
    @RequestMapping("UserSearch")
    public ModelAndView  userSearch(ModelAndView mv, String userId, String userName, String userRoot, String delFlag) {
        // ユーザー情報の取得
        List<UserInfo> userInfoList = sUserService.getUserInfo(userId, userName, userRoot, delFlag);

        if(userInfoList.size()==0) {
            mv.addObject("message", new Message("I", PropertiesFileLoader.getProperty("errors.salecontractupdate.nodata" )));
        }
        //
        mv.addObject("userId", userId);
        mv.addObject("userName", userName);
        mv.addObject("authorityCd", userRoot);
        mv.addObject("delFlag", delFlag);
        mv.addObject("userInfoList", userInfoList);
        // ユーザー検索画面IDを設定
        mv.setViewName("User/UserList");
        return mv;
    }

}
