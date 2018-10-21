<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <jsp:include page="/WEB-INF/jsp/Common/Meta.jsp"/>
        <script type="text/javascript" src="${pageContext.request.contextPath}/static/JS/Common/Header.js" charset="UTF-8"></script>
    </head>
    <body onload=getTime(getTimeSub());>
        <form id="headForm" name="headForm" method="post" action="">
        <div style="TEXT-ALIGN: center">
            <div style="BACKGROUND-IMAGE: url(${pageContext.request.contextPath}/static/Image/bj.jpg); WIDTH: 1250px; BACKGROUND-REPEAT: repeat-x">
                <div style="BACKGROUND-IMAGE: url(${pageContext.request.contextPath}/static/Image/top.jpg); TEXT-ALIGN: left; MARGIN: auto; WIDTH: 92%; BACKGROUND-REPEAT: no-repeat; HEIGHT: 82px">
                    <div class=UserNotice>
                        <div style="WIDTH: 50%; FLOAT: left">
                            <span id=ctl00_lblUserID>ユーザー名：</span><span id=ctl00_lblUserName>
                                ${sessionScope.loginUserInfo.userName}
                           </span> &nbsp; <span id=ctl00_lblTime></span>
                        </div>
                        <div style="WIDTH: 50%; FLOAT: left">
                            <A href="javascript:void(0);" id=ctl00_lnkHelp class=LogHelp onClick="headLinkSwitch('Help');">ヘルプ</A>
                            <A href="javascript:void(0);" id=ctl00_lnkReturn class=LogReturn onClick="headLinkSwitch('Common/MainMenu');">メイン画面</A>
                            <A href="javascript:void(0);" id=ctl00_lnkExit class=LogExsit onClick="headLinkSwitch('Login');">ログアウト</A>
                        </div>
                    </div>
                </div>
            </div>
            <div id="ddst" class="ddst">
                <ul id="nav" style="BACKGROUND-IMAGE: url(${pageContext.request.contextPath}/static/Image/001.jpg); PADDING-LEFT: 3%; WIDTH: 1250px; BACKGROUND-REPEAT: repeat-x">
                    <li onMouseOver="show('nav_1');" onMouseOut="hide('nav_1')" ><a href="#">販売契約</a>
                        <ul id="nav_1">
                            <li><a href="Sale/SaleContractSearch.htm">販売契約検索</a></li>
                        </ul>
                    </li>
                    <li onMouseOver="show('nav_2');" onMouseOut="hide('nav_2')" ><a href="#">基本情報</a>
                        <ul id="nav_2">
                            <li><a href="javascript:void(0);" onClick="menuSwitch('UserSearch');">ユーザー検索</a></li>
                        </ul>
                    </li>
                    <li onMouseOver="show('nav_3');" onMouseOut="hide('nav_3')" ><a href="#">マスタ情報</a>
                        <ul id="nav_3">
                            <li><a href="Master/BankAdd.htm">銀行</a></li>
                            <li><a href="Master/StatusAdd.htm">ステータス</a></li>
                            <li><a href="Master/PaymentAdd.htm">支払方法</a></li>
                            <li><a href="Master/UnitAdd.htm">単位</a></li>
                            <li><a href="Master/PortAdd.htm">地点</a></li>
                            <li><a href="Master/CurrencyAdd.htm">通貨種別</a></li>
                            <li><a href="Master/TradeLanAdd.htm">貿易用語</a></li>
                            <li><a href="Master/RootAdd.htm">権限</a></li>
                        </ul>
                    </li>
                    <li class="yy"></li>
                </ul>
            </div>
            <div style="TEXT-ALIGN: left; MARGIN-TOP: 0px; WIDTH: 30%; FLOAT: right; HEIGHT: 20px">
                <div style="WIDTH: 325px; HEIGHT: 40px" id=ctl00_panelMsg class=panelGrid>
                   <FIELDSET>
                       <LEGEND>システム情報 </LEGEND>&nbsp;
                       <span
                          style="COLOR: red" id=errorMessage class=MsgStyle>${message.message}
                       </span>
                   </FIELDSET>
                </div>
            </div>
        </div>
        </form>
    </body>
</html>