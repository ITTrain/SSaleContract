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
        session.setAttribute("mstAuthorityInfoList", mstAuthorityInfoList);
        // ユーザー検索画面初期化完了メッセージをを設定
        mv.addObject("message", new Message("I", PropertiesFileLoader.getProperty("info.system.usersearch.init")));
        // セッションの前処理結果を削除
        session.removeAttribute("result");
        // ユーザー検索画面初期化画面へ遷移
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
    public ModelAndView  userSearch(ModelAndView mv, HttpSession session, String userId, String userName, String userRoot, String delFlag) {
        // ユーザ検索処理
        // 画面入力項目を取得して、検索条件として、ユーザー情報を検索する
        List<UserInfo> userInfoList = sUserService.getUserInfo(userId, userName, userRoot, delFlag);
        // 検索結果が存在しない場合
        if(userInfoList.size()==0) {
            // システム情報を設定する
            String[] param = {"ユーザー情報"};
            mv.addObject("message", new Message("E", PropertiesFileLoader.getProperty("errors.salecontractupdate.nodata", param)));
        // 検索結果が存在してる場合
        }else {
            // システム情報を設定する
            mv.addObject("message", new Message("I", PropertiesFileLoader.getProperty("info.usersearch_success")));
            // ユーザー情報を設定する
            mv.addObject("userInfoList", userInfoList);
        }
        // 画面検索条件情報を保持する
        mv.addObject("userId", userId);// ユーザーID
        mv.addObject("userName", userName);// ユーザー名
        mv.addObject("authorityCd", userRoot);// 権限
        mv.addObject("delFlag", delFlag);// 削除フラグ

        // 他画面から遷移した場合、システム情報を再設定する
        // 追加処理成功した場合
        if("info.useradd_success".equals(session.getAttribute("result"))) {
            mv.addObject("message", new Message("I", PropertiesFileLoader.getProperty("info.useradd_success")));
        }
        // 更新処理成功した場合
        if("info.userupdate_success".equals(session.getAttribute("result"))) {
            mv.addObject("message", new Message("I", PropertiesFileLoader.getProperty("info.userupdate_success")));
        }
        // 削除処理成功した場合
        if("info.userdelete_success".equals(session.getAttribute("result"))) {
            mv.addObject("message", new Message("I", PropertiesFileLoader.getProperty("info.userdelete_success")));
        }
        // 削除処理失敗した場合
        if("errors.userdelete_update".equals(session.getAttribute("result"))) {
            String[] param = {session.getAttribute("param").toString()};
            mv.addObject("message", new Message("E", PropertiesFileLoader.getProperty("errors.userdelete_update", param)));
        }
        // 他画面の処理結果をクリアする
        session.removeAttribute("result");

        // ユーザー検索画面IDを設定
        mv.setViewName("User/UserList");
        return mv;
    }

}
