<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <title>メイン画面</title>
    </head>
    <body onload=getTime(getTimeSub());>
        <!-- ヘッダー -->
        <div style="width: 1158px; height: 150px">
            <jsp:include page="Header.jsp"/>
        </div>
        <!-- メイン画面 -->
        <form style="text-align: center" id=aspnetForm method=post name=aspnetForm action=MainPage.sss>
            <div style="width: 1158px; height: 30px">
                <div style="BACKGROUND-IMAGE: url(${pageContext.request.contextPath}/static/Image/006.jpg); text-align: left; MARGIN-TOP: 60px; TEXT-INDENT: 20px; width: 65%; BACKGROUND-REPEAT: no-repeat; float: left; height: 28px">
                    <span id=ctl00_lbltitle class=title>メイン画面</span>
                </div>
            </div>
            <div style="text-align: left; width: 1158px">
                <div style="width: 100%" id=ctl00_mainContent_MsgInfo class=panelGrid></div>
                <div style="text-align: right; MARGIN-TOP: 8px; width: 100%; height: 400px"></div>
            </div>
        </form>
        <!-- フッター -->
        <jsp:include page="Footer.jsp"/>
    </body>
</html>