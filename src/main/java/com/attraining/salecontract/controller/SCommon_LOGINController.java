/**
 * @システム名: 契約管理システム
 * @ファイル名: UserLoginController.java
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

import com.attraining.salecontract.bean.UserInfo;
import com.attraining.salecontract.common.Message;
import com.attraining.salecontract.common.PropertiesFileLoader;
import com.attraining.salecontract.service.SUserService;

/**
 * <pre>
 * [機 能] ユーザーログイン。
 * [説 明] ユーザーログインController
 * @author [作 成] 2018/10/01 東山(ITT)
 * </pre>
 */
@Controller
public class SCommon_LOGINController {

    @Autowired
    SUserService sUserService;

    /**
     * <pre>
     * [機 能]ユーザーログイン処理
     * [説 明]取得したユーザー情報によって画面遷移します
     * @param userId ユーザーＩＤ
     * @param password パスワード
     * @return String 	遷移先
     * </pre>
     */
    @RequestMapping("/Login")
    public ModelAndView  getUser(String userId, String password, ModelAndView mv, HttpSession session) {
        // ログイン画面初回表示時の処理
        // ユーザーＩＤかつ、パスワードnullの場合
        if (null == userId && null == password) {
            // セッション中身の情報を削除
            session.removeAttribute("userName");
            // ログイン画面へ遷移設定
            mv.setViewName("Common/Login");
            return mv;
        }

        // 入力画面と一致のユーザIDレコードを検索する
        List<UserInfo> userInfoList = sUserService.getUserInfoList(userId,password);
        // 返却件数=0の場合
        if (userInfoList.size() == 0) {
            // メッセージを設定
            mv.addObject("message", new Message("E", PropertiesFileLoader.getProperty("errors.login_noexist")));
            mv.addObject("userId", userId);
            mv.addObject("password", password);
            // 画面IDを設定
            mv.setViewName("Common/Login");
        // 返却件数>0場合、メニュー画面遷移前処理
        } else if (userInfoList.size() > 0) {
            // メッセージを設定
            mv.addObject("message", new Message("I", PropertiesFileLoader.getProperty("info.system.normal")));
            // ユーザー名をセッションインスタンスに設定
            session.setAttribute("loginUserInfo", userInfoList.get(0));
            //mv.setView(new RedirectView("MainMenu"));
            mv.setViewName("Common/MainMenu");
        } else {
            // 処理なし
        }

        return mv;
    }

    /**
     * <pre>
     * [機 能]メイン画面遷移処理
     * [説 明]メイン画面遷移します
     * @param userId ユーザーＩＤ
     * @return String 	遷移先
     * </pre>
     */
    @RequestMapping("/MainMenu")
    public ModelAndView  mainMenu(ModelAndView mv) {
            mv.setViewName("Common/MainMenu");
        return mv;
    }

    /**
     * <pre>
     * [機 能]ヘルプ画面遷移処理
     * [説 明]ヘルプ画面遷移します
     * @param mv
     * @return String 	遷移先
     * </pre>
     */
    @RequestMapping("/Help")
    public ModelAndView  help(ModelAndView mv) {
            mv.setViewName("Help/Help");
        return mv;
    }
}
