<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<HTML>
<HEAD>
<TITLE>ユーザー検索</TITLE>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/JS/User/UserSearch.js" charset="UTF-8"></script>
</HEAD>
<body>
<!-- ヘッダー -->
<DIV style="WIDTH: 1158px; HEIGHT: 150px">
<jsp:include page="../Common/Header.jsp"/>
</DIV>
<FORM style="TEXT-ALIGN: center" id="userSearchFrom" method=post action="usersearch">
<DIV style="WIDTH: 1158px; HEIGHT: 30px">
    <DIV style="BACKGROUND-IMAGE: url(${pageContext.request.contextPath}/static/Image/006.jpg);  TEXT-ALIGN: left; MARGIN-TOP: 20px; TEXT-INDENT: 20px; WIDTH: 65%; BACKGROUND-REPEAT: no-repeat; FLOAT: left; HEIGHT: 28px"><SPAN
        id=ctl00_lbltitle class=title>ユーザー検索</SPAN>
    </DIV>
</DIV>
<br>
<br>
<DIV style="TEXT-ALIGN: left; WIDTH: 1158px">
<DIV class=tbTitile><SPAN id=ctl00_mainContent_SearchText
    class=inputlbl>検索条件</SPAN>
</DIV>
<DIV class=tbContent>
    <TABLE style="WIDTH: 100%" cellSpacing=0 cellPadding=0>
        <TBODY>
            <TR>
                <TD style="WIDTH: 170px"><SPAN id=ctl00_mainContent_lblUserCode
                    class=inputlbl>ユーザーID</SPAN><BR>
                <INPUT id=ctl00_mainContent_txtUserCode class=inputText
                    name="userId" maxLength=10></TD>
                <TD style="WIDTH: 170px"><SPAN id=ctl00_mainContent_lblUserName
                    class=inputlbl>ユーザー名</SPAN><BR>
                <INPUT id=ctl00_mainContent_txtUserName class=inputText
                    name="userName" maxLength=20></TD>
                <TD style="WIDTH: 170px"><SPAN id=ctl00_mainContent_lblAcessGrp
                    class=inputlbl>権限</SPAN><BR>
                <select id="ctl00_mainContent_ddlAcessGrp" class=ddlBlack name="userRoot">
                    <option selected value=""></option>
                    <c:forEach items="${mstAuthorityInfoList}" var="c" varStatus="st">
                        <option value="${c.authorityCd}">${c.authorityName}</option>
                    </c:forEach>
                </select>
                </TD>
                <TD><BR>
                    <SPAN style="WIDTH: 133px; DISPLAY: inline-block" class=chkBox>
                        <INPUT id=delFlag  type=checkbox >
                        <LABEL for=ctl00_mainContent_chkVisible>削除フラグ含む</LABEL>
                        <INPUT id=delFlagHidden name=delFlag type=hidden />
                    </SPAN>
                </TD>
            </TR>
        </TBODY>
    </TABLE>
</DIV>
<DIV style="TEXT-ALIGN: right; WIDTH: 100%" class=btnContent>
<a href="javascript:void(0)" class="btn" onClick="eventSwitch('UserSearch')"><center>検索</center></a>
<a href="javascript:void(0)" class="btn" onClick="eventSwitch('UserAdd')"><center>追加</center>
</a></DIV>
<INPUT id=ctl00_hidTime name=ctl00$hidTime value=2014/02/17 15:08:36 type=hidden />
</DIV>
</FORM>
<!-- フッター -->
<jsp:include page="../Common/Footer.jsp"/>
</BODY>
</HTML>