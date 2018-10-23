/**
 * @システム名: 契約管理システム
 * @ファイル名: SUser_UpdateController.java
 * @更新日付: 2018/10/01
 * @Copyright: 2018.
 */
package com.attraining.salecontract.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.attraining.salecontract.bean.UserInfo;
import com.attraining.salecontract.common.Message;
import com.attraining.salecontract.common.PropertiesFileLoader;
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
     * @param updateUserId

     * @return String 	遷移先
     * </pre>
     */
    @RequestMapping("UserUpdateInit")
    public ModelAndView  userUpdateInit(ModelAndView mv, String updateUserId) {
        // 更新ユーザー情報取得
        UserInfo userInfo = sUserService.getUserInfoByPrimaryKey(updateUserId);
        // ユーザー検索画面IDを設定
        mv.addObject("userInfo",userInfo);
        mv.setViewName("User/UserUpdate");
        return mv;
    }

    /**
     * <pre>
     * [機 能]ユーザ更新処理
     * [説 明]ユーザ更新処理
     * @param mv
     * @param userInfo
     *
     * @return String 	遷移先
     * </pre>
     */
    @RequestMapping("UserUpdate")
    public ModelAndView userUpdate(UserInfo userInfo, ModelAndView mv, HttpSession session, RedirectAttributes attr) {
        // ユーザ検索処理
        List<UserInfo> userInfoList = sUserService.getUserInfo(userInfo.getUserId(), "", "", "");
        // 更新ユーザ存在チェック
        if(userInfoList.size() == 0) {
            mv.addObject("message", new Message("E", PropertiesFileLoader.getProperty("errors.userupdate_notexist")));
            mv.setViewName("User/UserAdd");
            return mv;
        }
        // ログインユーザ情報取得
        UserInfo loginUserInfo = (UserInfo)session.getAttribute("loginUserInfo");
        //更新者設定
        userInfo.setUpdateUser(loginUserInfo.getUserId());
        //ユーザ情報更新実行
        int result =  sUserService.updateUserInfo(userInfo);
        if (result > 0) {
            //Controller間パラメータ引き渡し
            attr.addFlashAttribute("param", "1");
            // ユーザー検索画面へ遷移する
            mv = new ModelAndView("redirect:UserSearch");
            //mv.addObject("message", new Message("I", PropertiesFileLoader.getProperty("info.userupdate_success")));
        }else {
            mv.addObject("message", new Message("E", PropertiesFileLoader.getProperty("errors.userupdate_update")));
            mv.setViewName("User/UserAdd");
        }

        return mv;
    }
    @InitBinder
    protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        CustomDateEditor editor = new CustomDateEditor(df, true);//true表示允许为空，false反之
        binder.registerCustomEditor(Date.class, editor);
    }
}
