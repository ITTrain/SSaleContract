<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>メイン画面</title>
</head>
<body onload=getTime(getTimeSub());>
    <!-- ヘッダー -->
    <div style="WIDTH: 1158px; HEIGHT: 150px">
    <jsp:include page="Header.jsp"/>
    </div>
    <!-- メイン画面 -->
    <FORM style="TEXT-ALIGN: center" id=aspnetForm method=post name=aspnetForm action=MainPage.sss>
        <DIV style="WIDTH: 1158px; HEIGHT: 30px">
            <DIV style="BACKGROUND-IMAGE: url(${pageContext.request.contextPath}/static/Image/006.jpg); TEXT-ALIGN: left; MARGIN-TOP: 60px; TEXT-INDENT: 20px; WIDTH: 65%; BACKGROUND-REPEAT: no-repeat; FLOAT: left; HEIGHT: 28px">
                <SPAN id=ctl00_lbltitle class=title>メイン画面</SPAN>
            </DIV>
        </DIV>
        <DIV style="TEXT-ALIGN: left; WIDTH: 1158px">
            <DIV style="WIDTH: 100%" id=ctl00_mainContent_MsgInfo class=panelGrid></DIV>
            <DIV style="TEXT-ALIGN: right; MARGIN-TOP: 8px; WIDTH: 100%; HEIGHT: 400px"></DIV>

            <INPUT id=ctl00_hidTime name=ctl00$hidTime value=2014/02/18 16:07:51 type=hidden>
        </DIV>
    </FORM>
<!-- フッター -->
<jsp:include page="Footer.jsp"/>
</body>
</html>