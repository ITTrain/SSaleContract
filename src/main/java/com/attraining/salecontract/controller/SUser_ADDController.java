/**
 * @システム名: 契約管理システム
 * @ファイル名: SUser_ADDController.java
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

import com.attraining.salecontract.bean.UserInfo;
import com.attraining.salecontract.common.Message;
import com.attraining.salecontract.common.PropertiesFileLoader;
import com.attraining.salecontract.service.SUserService;

/**
 * <pre>
 * [機 能] ユーザ登録処理。
 * [説 明] ユーザ登録処理Controller
 * @author [作 成] 2018/10/01 東山(ITT)
 * </pre>
 */
@Controller
public class SUser_ADDController {

//    @Autowired
//    private SMstInfoService sMstInfoService;
    @Autowired
    private SUserService sUserService;


    /**
     * <pre>
     * [機 能]ユーザ登録初期化処理
     * [説 明]ユーザ登録初期化処理
     * @param
     * @return String 	遷移先
     * </pre>
     */
    @RequestMapping("UserAddInit")
    public ModelAndView  userAddInit(ModelAndView mv) {
        // ユーザーデータDTOインスタンスを初期化する
        UserInfo userInfo = new UserInfo();
        mv.addObject("userInfo", userInfo);
        //メッセージを初期化する
        // ユーザー登録画面へ遷移する
        mv.setViewName("User/UserAdd");
        return mv;
    }

    /**
     * <pre>
     * [機 能]ユーザ登録処理
     * [説 明]ユーザ登録処理
     * @param mv
     * @param userInfo
     *
     * @return String 	遷移先
     * </pre>
     */
    @RequestMapping("UserAdd")
    public ModelAndView userAdd(UserInfo userInfo, ModelAndView mv, HttpSession session) {
        // ユーザ検索処理
    	List<UserInfo> userInfoList = sUserService.getUserInfo(userInfo.getUserId(), "", "", "");
    	if(userInfoList != null && userInfoList.size() > 0) {
    		mv.addObject("message", new Message("E", PropertiesFileLoader.getProperty("errors.useradd_exist")));
    		mv.setViewName("User/UserAdd");
    		return mv;
    	}
    	UserInfo loginUserInfo = (UserInfo)session.getAttribute("loginUserInfo");
    	//削除フラグ"0"固定
    	userInfo.setDelFlg("0");
    	//作成者設定
    	userInfo.setCreateUser(loginUserInfo.getUserId());
    	//更新者設定
    	userInfo.setUpdateUser(loginUserInfo.getUserId());
    	//ユーザ登録実行
    	sUserService.addUserInfo(userInfo);
        // ユーザー検索画面へ遷移する
        mv.setViewName("User/UserSearch");
        return mv;
    }
    @InitBinder
    protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        CustomDateEditor editor = new CustomDateEditor(df, true);//true表示允许为空，false反之
        binder.registerCustomEditor(Date.class, editor);
    }
}
