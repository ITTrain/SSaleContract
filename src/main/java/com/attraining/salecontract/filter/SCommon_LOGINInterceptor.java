/**
 * @author
 *
 */
package com.attraining.salecontract.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
/**
 * 用户登录拦截器
 * 所有非登录url请求将直接跳转至登录页面
 * @author
 *
 */
public class SCommon_LOGINInterceptor implements HandlerInterceptor {

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        String url = request.getRequestURI();
        // URLに非空かつ、非ログイン判断
        if (StringUtils.isNotBlank(url) && url.toLowerCase().indexOf("login") < 0) {
            // セッション中身にユーザー名判断
            if (null == request.getSession().getAttribute("userName")) {
                String localUrl = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
                        + request.getContextPath() + "/";
                response.sendRedirect(localUrl + "Login");
                return false;
            } else {
                return true;
            }
        }
        return true;

    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
    }

}