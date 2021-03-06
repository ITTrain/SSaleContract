/**
 * @システム名: 契約管理システム
 * @ファイル名: SUser_DeleteController.java
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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.attraining.salecontract.bean.UserInfo;
import com.attraining.salecontract.common.Message;
import com.attraining.salecontract.common.PropertiesFileLoader;
import com.attraining.salecontract.service.SUserService;

/**
 * <pre>
 * [機 能] ユーザ情報物理削除処理。
 * [説 明] ユーザ情報物理削除処理Controller
 * @author [作 成] 2018/10/01 東山(ITT)
 * </pre>
 */
@Controller
public class SUser_DeleteController {

    @Autowired
    private SUserService sUserService;

    /**
     * <pre>
     * [機 能]ユーザ情報物理削除処理
     * [説 明]ユーザ情報物理削除処理
     * @param mv
     * @param userInfo
     *
     * @return String 	遷移先
     * </pre>
     */
    @RequestMapping("UserDelete")
    public ModelAndView userUpdate(ModelAndView mv, String updateUserId, HttpSession session, RedirectAttributes attr) {
        // ユーザ検索処理
        List<UserInfo> userInfoList = sUserService.getUserInfo(updateUserId, "", "", "");
        // 更新ユーザ存在チェック
        if(userInfoList.size() == 0) {
            mv.addObject("message", new Message("E", PropertiesFileLoader.getProperty("errors.userupdate_notexist")));
            mv.setViewName("User/UserList");
            return mv;
        }

        //ユーザ情報削除実行
        int result =  sUserService.deleteUserInfo(updateUserId);
        if (result > 0) {
            //Controller間パラメータ引き渡し
            attr.addFlashAttribute("param", "1");
            // ユーザー検索画面へ遷移する
            mv = new ModelAndView("redirect:UserSearch");
            session.setAttribute("result", "info.userdelete_success");
        }else {
            mv.addObject("message", new Message("E", PropertiesFileLoader.getProperty("errors.userdelete_update")));
            mv.setViewName("User/UserList");
        }

        return mv;
    }
}
