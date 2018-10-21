/**
 * @システム名: 契約管理システム
 * @ファイル名: SUser_UpdateController.java
 * @更新日付: 2018/10/01
 * @Copyright: 2018.
 */
package com.attraining.salecontract.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.attraining.salecontract.bean.UserInfo;
import com.attraining.salecontract.service.SMstInfoService;
import com.attraining.salecontract.service.SUserService;

/**
 * <pre>
 * [機 能] ユーザ情報更新処理。
 * [説 明] ユーザ情報更新処理Controller
 * @author [作 成] 2018/10/01 東山(ITT)
 * </pre>
 */
@Controller
public class SUser_UpdateController {

    @Autowired
    private SMstInfoService sMstInfoService;
    @Autowired
    private SUserService sUserService;

    /**
     * <pre>
     * [機 能]ユーザ情報更新処理
     * [説 明]ユーザ情報更新処理
     * @param mv
     * @param userId
     * @param userName
     * @param userRoot
     * @param delFlag
     * @return String 	遷移先
     * </pre>
     */
    @RequestMapping("UserUpdateInit")
    public ModelAndView  userUpdate(ModelAndView mv, String updateUserId) {
        // 更新ユーザー情報取得
        UserInfo userInfo = sUserService.getUserInfoByPrimaryKey(updateUserId);
        // ユーザー検索画面IDを設定
        mv.addObject("userInfo",userInfo);
        mv.setViewName("User/UserUpdate");
        return mv;
    }

}
