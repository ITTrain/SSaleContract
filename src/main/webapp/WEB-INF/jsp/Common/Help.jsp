<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>ヘルプ画面</title>
</head>
<body onload=getTime(getTimeSub());>
    <!-- ヘッダー -->
    <div style="WIDTH: 1158px; HEIGHT: 150px">
    <jsp:include page="Header.jsp"/>
    </div>
    <!-- ヘルプ画面 -->
    <FORM style="TEXT-ALIGN: center" id=aspnetForm method=post name=aspnetForm action=MainPage.sss>
        <DIV style="WIDTH: 1158px; HEIGHT: 30px">
            <DIV style="BACKGROUND-IMAGE: url(${pageContext.request.contextPath}/static/Image/006.jpg); TEXT-ALIGN: left; MARGIN-TOP: 60px; TEXT-INDENT: 20px; WIDTH: 65%; BACKGROUND-REPEAT: no-repeat; FLOAT: left; HEIGHT: 28px">
                <SPAN id=ctl00_lbltitle class=title>ヘルプ画面</SPAN>
            </DIV>
        </DIV>
        <br>
        <br>
        <br>
        <br>
        <DIV style="TEXT-ALIGN: left; WIDTH: 1158px">
            <a href="${pageContext.request.contextPath}/static/Help/Manual.txt"  target="_blank">操作マニュアル1</a>
            <br>
            <a href="${pageContext.request.contextPath}/static/Help/Manual.pdf"  target="_blank">操作マニュアル2</a>
        </DIV>
    </FORM>
<!-- フッター -->
<jsp:include page="Footer.jsp"/>
</body>
</html>