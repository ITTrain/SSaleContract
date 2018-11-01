<!DOCTYPE html PUBLIC "-//W3C//DTD html 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<html>
    <head>
        <title>ログイン</title>
        <jsp:include page="/WEB-INF/jsp/Common/Meta.jsp"/>
        <script type="text/javascript" src="${pageContext.request.contextPath}/static/JS/Common/Login.js" charset="UTF-8"></script>
    </head>
    <body class=IndexPage>
        <div style="background-image: url(${pageContext.request.contextPath}/static/Image/login.jpg); position: relative; width: 100%; BACKGROUND-REPEAT: no-repeat; height: 750px; overflow: auto">
            <div style="position: relative; margin-top: 80px; width: 400px; float: left; margin-left: 20px">
                <div style="width: 325px; height: 40px" id=SystemMessage class=panelGrid>
                  <fieldset>
                      <legend>システム情報 </legend>
                          <span style="COLOR: red" id=lblErrorMessage class=MsgStyle>${fn:replace(message.message, "[E]", "")}</span>
                      </fieldset>
                </div>
             </div>
            <form name = "login_form" action="Login" method="post">
              <div style="position: relative; margin: 326px 0px 0px 440px; width: 380px; height: 180px">
                  <div style="width: 100%; height: 50px">
                    <div style="position: absolute; margin-TOP: 32px; width: 120px; FLOAT: left; left: 9px; top: 4px;">
                        <span style="DISPLAY: inline-block; height: 17px" id=lblUserId class=login-lbl>ユーザーID</span> </div>
                    <div style="margin-TOP: 30px; width: 250px; float: right">
                      <INPUT style="border-bottom: #e4e4e4 1px solid; border-left: #e4e4e4 1px solid;
                      background-color: #f7f7f7; width: 179px; border-top: #e4e4e4 1px solid; border-right: #e4e4e4 1px solid" id=txtUserId name=userId onChange="inputChage()" value="${userId}">
                    </div>
                  </div>
               <div style="width: 100%; height: 50px">
                    <div style="position: absolute; margin-top: 20px; width: 120px; float: left; left: 10px; top: 54px;">
                    <span style="display: inline-block; height: 20px" id=lblPassword class=login-lbl>パスワード</span> </div>
                        <div style="margin-top: 15px; width: 250px; float: right">
                          <input style="border-bottom: #e4e4e4 1px solid; border-left: #e4e4e4 1px solid;
                          background-color: #f7f7f7; width: 179px; border-top: #e4e4e4 1px solid;
                          border-right: #e4e4e4 1px solid" id=txtPassword name=password type=password onChange="inputChage()"  value="${password}">
                        </div>
                    </div>
                    <div style="width: 100%; height: 50px">
                        <div style="position: absolute; margin-top: 15px; width: 160px; float: left">
                            <a href="javascript:void(0);" id="idsubmit" onclick="submit()">
                            <img src="${pageContext.request.contextPath}/static/Image/login-dl.gif" style="border-right-width: 0px; float: right;
                            border-top-width: 0px; border-bottom-width: 0px; border-left-width: 0px" /> </a>
                        </div>
                        <div style="margin-top: 15px; width: 160px; float: right">
                          <a href="#" id="idreset" onclick="reset()"><img style="BORDER-RIGHT-width: 0px;
                          border-top-width: 0px; border-bottom-width: 0px; border-left-width: 0px" id=btnCancel name=btnCancel src="${pageContext.request.contextPath}/static/Image/login-qx.gif"/></a>
                        </div>

                    </div>
                </div>
            </form>
        </div>
    </body>
</html>