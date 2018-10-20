<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <HEAD>
        <TITLE>ログイン</TITLE>
        <jsp:include page="/WEB-INF/jsp/Common/Meta.jsp"/>
        <script type="text/javascript" src="${pageContext.request.contextPath}/static/JS/Common/Login.js" charset="UTF-8"></script>
    </HEAD>
    <BODY class=IndexPage>
        <DIV style="BACKGROUND-IMAGE: url(${pageContext.request.contextPath}/static/Image/login.jpg); POSITION: relative; WIDTH: 100%; BACKGROUND-REPEAT: no-repeat; HEIGHT: 750px; OVERFLOW: auto">
            <DIV style="POSITION: relative; MARGIN-TOP: 80px; WIDTH: 400px; FLOAT: left; MARGIN-LEFT: 20px">
                <DIV style="WIDTH: 325px; HEIGHT: 40px" id=SystemMessage class=panelGrid>
                  <FIELDSET>
                      <LEGEND>システム情報 </LEGEND>
                          <SPAN style="COLOR: red" id=lblErrorMessage class=MsgStyle>${message.message}</SPAN>
                      </FIELDSET>
                </DIV>
             </DIV>
            <form name = "login_form" action="Login" method="post">
              <DIV style="POSITION: relative; MARGIN: 326px 0px 0px 440px; WIDTH: 380px; HEIGHT: 180px">
                  <DIV style="WIDTH: 100%; HEIGHT: 50px">
                    <DIV style="POSITION: absolute; MARGIN-TOP: 32px; WIDTH: 120px; FLOAT: left; left: 9px; top: 4px;">
                        <SPAN style="DISPLAY: inline-block; HEIGHT: 17px" id=lblUserId class=login-lbl>ユーザーID</SPAN> </DIV>
                    <DIV style="MARGIN-TOP: 30px; WIDTH: 250px; FLOAT: right">
                      <INPUT style="BORDER-BOTTOM: #e4e4e4 1px solid; BORDER-LEFT: #e4e4e4 1px solid;
                      BACKGROUND-COLOR: #f7f7f7; WIDTH: 179px; BORDER-TOP: #e4e4e4 1px solid; BORDER-RIGHT: #e4e4e4 1px solid" id=txtUserId name=userId onChange="inputChage()" value="${userId}">
                    </DIV>
                  </DIV>
               <DIV style="WIDTH: 100%; HEIGHT: 50px">
                    <DIV style="POSITION: absolute; MARGIN-TOP: 20px; WIDTH: 120px; FLOAT: left; left: 10px; top: 54px;">
                    <SPAN style="DISPLAY: inline-block; HEIGHT: 20px" id=lblPassword class=login-lbl>パスワード</SPAN> </DIV>
                        <DIV style="MARGIN-TOP: 15px; WIDTH: 250px; FLOAT: right">
                          <INPUT style="BORDER-BOTTOM: #e4e4e4 1px solid; BORDER-LEFT: #e4e4e4 1px solid;
                          BACKGROUND-COLOR: #f7f7f7; WIDTH: 179px; BORDER-TOP: #e4e4e4 1px solid;
                          BORDER-RIGHT: #e4e4e4 1px solid" id=txtPassword name=password type=password onChange="inputChage()"  value="${password}">
                        </DIV>
                    </DIV>
                    <DIV style="WIDTH: 100%; HEIGHT: 50px">
                        <DIV style="POSITION: absolute; MARGIN-TOP: 15px; WIDTH: 160px; FLOAT: left">
                            <A href="javascript:void(0);" id="idsubmit" onclick="submit()">
                            <img src="${pageContext.request.contextPath}/static/Image/login-dl.gif" style="BORDER-RIGHT-WIDTH: 0px; FLOAT: right;
                            BORDER-TOP-WIDTH: 0px; BORDER-BOTTOM-WIDTH: 0px; BORDER-LEFT-WIDTH: 0px" /> </A>
                        </DIV>
                        <DIV style="MARGIN-TOP: 15px; WIDTH: 160px; FLOAT: right">
                          <A href="#" id="idreset" onclick="reset()"><img style="BORDER-RIGHT-WIDTH: 0px;
                          BORDER-TOP-WIDTH: 0px; BORDER-BOTTOM-WIDTH: 0px; BORDER-LEFT-WIDTH: 0px" id=btnCancel name=btnCancel src="${pageContext.request.contextPath}/static/Image/login-qx.gif"/></A>
                        </DIV>

                    </DIV>
                </DIV>
            </form>
        </DIV>
    </BODY>
</html>