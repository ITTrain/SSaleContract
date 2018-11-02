<!DOCTYPE html PUBLIC "-//W3C//DTD html 4.0 Transitional//EN">
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <title>ヘルプ画面</title>
    </head>
    <body onload=getTime(getTimeSub());>
        <!-- ヘッダー -->
        <div style="width: 1158px; height: 150px">
        <jsp:include page="../Common/Header.jsp"/>
        </div>
        <!-- ヘルプ画面 -->
        <form style="TEXT-ALIGN: center" id=aspnetForm method=post name=aspnetForm action=MainPage.sss>
            <div style="width: 1158px; height: 30px">
                <div style="BACKGROUND-IMAGE: url(${pageContext.request.contextPath}/static/Image/006.jpg); TEXT-ALIGN: left; MARGIN-TOP: 60px; TEXT-INDENT: 20px; width: 65%; BACKGROUND-REPEAT: no-repeat; float: left; height: 28px">
                    <span id=ctl00_lbltitle class=title>ヘルプ画面</span>
                </div>
            </div>
            <br>
            <br>
            <br>
            <br>
            <div style="TEXT-ALIGN: left; width: 1158px">
                <a href="${pageContext.request.contextPath}/static/Help/Manual.txt"  target="_blank">操作マニュアル1</a>
                <br>
                <a href="${pageContext.request.contextPath}/static/Help/Manual.pdf"  target="_blank">操作マニュアル2</a>
            </div>
        </form>
    <!-- フッター -->
    <jsp:include page="../Common/Footer.jsp"/>
    </body>
</html>