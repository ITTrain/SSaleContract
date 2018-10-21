<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<HTML>
<HEAD>
    <TITLE>ユーザー編集</TITLE>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/JS/User/UserList.js" charset="UTF-8"></script>
    </HEAD>
<BODY>
<FORM style="TEXT-ALIGN: center" id=userForm method=post
    name=userForm action=userupdate>
<DIV style="WIDTH: 1158px; HEIGHT: 150px">
<!-- ヘッダー -->
<jsp:include page="../Common/Header.jsp"/>
</DIV>
<DIV style="WIDTH: 1158px; HEIGHT: 30px">
<DIV
    style="BACKGROUND-IMAGE: url(${pageContext.request.contextPath}/static/Image/006.jpg); TEXT-ALIGN: left; MARGIN-TOP: 20px; TEXT-INDENT: 20px; WIDTH: 65%; BACKGROUND-REPEAT: no-repeat; FLOAT: left; HEIGHT: 28px"><SPAN
    id=ctl00_lbltitle class=title>ユーザー編集</SPAN></DIV>
</DIV>
<DIV style="TEXT-ALIGN: left; WIDTH: 1158px">
<BR>
<BR>
<DIV style="TEXT-ALIGN: right">
<a href="javascript:void(0)" class="btn" onClick="eventSwitch('UserUpdate')"><center>更新</center></a>
</DIV>
<DIV style="WIDTH: 100%" id=ctl00_mainContent_BaseInfo class=panelGrid>
<FIELDSET><LEGEND>基本情報 </LEGEND>

<TABLE style="PADDING-LEFT: 10px; WIDTH: 100%" border=0 cellSpacing=0
    cellPadding=0>
    <TBODY>
        <TR>
            <TD style="WIDTH: 170px"><SPAN id=ctl00_mainContent_lblUserCode
                class=labelBld>ユーザーID</SPAN><BR>
            <INPUT style="WIDTH: 120px" id=ctl00_mainContent_txtUserCode
                class=textBoxReadOnly name="userId" readOnly
                maxLength=10 value="${userInfo.userId}"></TD>
            <TD style="WIDTH: 170px"><SPAN id=ctl00_mainContent_lblUserName
                class=labelBld>ユーザー名</SPAN><BR>
            <INPUT style="WIDTH: 120px" id=ctl00_mainContent_txtUserName
                class=inputText name="userName" maxLength=20
                value="${userInfo.userName}"></TD>
            <TD style="WIDTH: 170px"><SPAN id=ctl00_mainContent_lblPassword
                class=inputlbl>パスワード</SPAN><BR>
            <INPUT style="WIDTH: 120px" id=password
                class=inputText name="userPassword" maxLength=20
                type=password value="${userInfo.password}"></TD>
            <TD style="WIDTH: 170px"><SPAN id=ctl00_mainContent_lblRPassword
                class=inputlbl>パスワード確認</SPAN><BR>
            <INPUT style="WIDTH: 120px" id=rpassword
                class=inputText name="userPasswordMore" maxLength=20
                type=password value="${userInfo.password}"></TD>
        </TR>
        <TR>
            <TD colSpan=2><SPAN id=ctl00_mainContent_lblPhone class=inputlbl>電話番号</SPAN><BR>
            <INPUT style="WIDTH: 300px" id=ctl00_mainContent_txtPhone
                class=inputText name="userPhone" maxLength=80
                value="${userInfo.telNumber}"></TD>
            <TD colSpan=2><SPAN id=ctl00_mainContent_lblEmail class=inputlbl>メールアドレス</SPAN><BR>
            <INPUT style="WIDTH: 300px" id=ctl00_mainContent_txtEmail
                class=inputText name="userMail" maxLength=50
                value="${userInfo.mailAddress}"></TD>
            <TD style="WIDTH: 170px"><SPAN id=ctl00_mainContent_lblAcessGrp
                class=inputlbl>権限</SPAN><BR>
            <select id="authorityCd" class=ddlBlack name="authorityCd">
                <option selected value=""></option>
                <c:forEach items="${mstAuthorityInfoList}" var="c" varStatus="st">
                    <option value="${c.authorityCd}" <c:if test="${userInfo.authorityCd == c.authorityCd}"> selected</c:if>>${c.authorityName}</option>
                </c:forEach>
            </select>
            </TD>
            <TD>&nbsp;</TD>
        </TR>
        <TR>
            <TD colSpan=3><SPAN id=ctl00_mainContent_lblRemarks
                class=inputlbl>備考</SPAN><BR>
            <TEXTAREA style="WIDTH: 480px; HEIGHT: 50px"
                id=ctl00_mainContent_txtRemarks class=inputText
                name="comment">${userInfo.memo}</TEXTAREA></TD>
            <TD><SPAN style="WIDTH: 133px; DISPLAY: inline-block"
                class=chkBox><INPUT id=ctl00_mainContent_chkAbandom
                name="deleteFlg" type=checkbox><LABEL
                for=ctl00_mainContent_chkAbandom>削除フラグ</LABEL></SPAN> <INPUT
                id=ctl00_mainContent_HidPassWord name=ctl00$mainContent$HidPassWord
                value=4QrcOUm6Wau+VuBX8g+IPg== type=hidden value="${userInfo.delFlg}"></TD>
            <TD></TD>
        </TR>
    </TBODY>
</TABLE>
</FIELDSET>
</DIV>
<BR>
<DIV style="WIDTH: 100%" id=ctl00_mainContent_Panel1 class=panelInfo>

<TABLE
    style="WIDTH: 100%; MARGIN-BOTTOM: 5px; MARGIN-LEFT: 5px; MARGIN-RIGHT: -5px"
    border=0 cellSpacing=0 cellPadding=0>
    <TBODY>
        <TR>
            <TD style="WIDTH: 170px"><SPAN id=ctl00_mainContent_lblCreateBy
                class=inputlbl>作成者</SPAN><BR>
            <INPUT style="WIDTH: 120px" id=ctl00_mainContent_txtCreateBy
                class=textBoxReadOnly name="createUser" readOnly
                value="${userInfo.createUser}"></TD>
            <TD style="WIDTH: 170px"><SPAN
                id=ctl00_mainContent_lblCreateDate class=inputlbl>作成日</SPAN><BR>
            <INPUT style="WIDTH: 120px" id=ctl00_mainContent_txtCreateDate
                class=textBoxReadOnly name="createDate" readOnly
                value="${userInfo.createDate}"></TD>
            <TD style="WIDTH: 170px"><SPAN id=ctl00_mainContent_lblUpdateBy
                class=inputlbl>更新者</SPAN><BR>
            <INPUT style="WIDTH: 120px" id=ctl00_mainContent_txtUpdateBy
                class=textBoxReadOnly name="updateUser" readOnly
                value="${userInfo.updateUser}"></TD>
            <TD style="WIDTH: 170px"><SPAN
                id=ctl00_mainContent_lblUpdateDate class=inputlbl>更新日</SPAN><BR>
            <INPUT style="WIDTH: 120px" id=ctl00_mainContent_txtUpdateDate
                class=textBoxReadOnly name="updateDate" readOnly
                value="${userInfo.updateDate}"></TD>
        </TR>
    </TBODY>
</TABLE>
</DIV>

<INPUT id=ctl00_hidTime name=ctl00$hidTime
    value=2014/02/17 16:32:23 type=hidden>
</DIV>
</FORM>
<!-- フッター -->
<jsp:include page="../Common/Footer.jsp"/>
</BODY>
</HTML>