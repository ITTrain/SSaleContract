/**
 * @システム名: 契約管理システム
 * @ファイル名: SUser_DetailController.java
 * @更新日付: 2018/10/01
 * @Copyright: 2018.
 */
package com.attraining.salecontract.controller;

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
 * [機 能] ユーザ情報更新処理。
 * [説 明] ユーザ情報更新処理Controller
 * @author [作 成] 2018/10/01 東山(ITT)
 * </pre>
 */
@Controller
public class SUser_DETAILController {

    @Autowired
    private SUserService sUserService;

    /**
     * <pre>
     * [機 能]ユーザー詳細画面表示処理
     * [説 明]ユーザー詳細画面表示処理
     * @param mv
     * @param updateUserId

     * @return String 	遷移先
     * </pre>
     */
    @RequestMapping("UserDetail")
    public ModelAndView  userUpdateInit(ModelAndView mv, String updateUserId) {
        // 更新ユーザー情報取得
        UserInfo userInfo = sUserService.getUserInfoByPrimaryKey(updateUserId);
        //メッセージを初期化する
        mv.addObject("message", new Message("I", PropertiesFileLoader.getProperty("info.userdetail_init")));
        // ユーザー検索画面IDを設定
        mv.addObject("userInfo",userInfo);
        mv.setViewName("User/UserDetail");
        return mv;
    }
}
