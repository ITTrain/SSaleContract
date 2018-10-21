<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<HTML>
<HEAD>
<TITLE>ユーザー登録</TITLE>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/JS/User/UserAdd.js" charset="UTF-8"></script>
</HEAD>
<BODY>
<!-- ヘッダー -->
<DIV style="WIDTH: 1158px; HEIGHT: 150px">
<jsp:include page="../Common/Header.jsp"/>
</DIV>
<FORM style="TEXT-ALIGN: center" id=userForm method=post
    name=userForm action="useradd">
<DIV style="WIDTH: 1158px; HEIGHT: 30px">
<DIV
    style="BACKGROUND-IMAGE: url(${pageContext.request.contextPath}/static/Image/006.jpg); TEXT-ALIGN: left; MARGIN-TOP: 20px; TEXT-INDENT: 20px; WIDTH: 65%; BACKGROUND-REPEAT: no-repeat; FLOAT: left; HEIGHT: 28px"><SPAN
    id=ctl00_lbltitle class=title>ユーザー登録</SPAN></DIV>
</DIV>
<DIV style="TEXT-ALIGN: left; WIDTH: 1158px">

<DIV style="TEXT-ALIGN: right; WIDTH: 100%" class=btnContent>
<a href="javascript:void(0)" class="btn" onClick="eventSwitch('UserAdd')"><center>登録</center></a>
<a href="javascript:void(0)" class="btn" onClick="eventSwitch('PullBack')"><center>戻る</center></a>
</DIV>
<DIV style="WIDTH: 100%" id=ctl00_mainContent_BaseInfo class=panelGrid>
<FIELDSET><LEGEND>基本情報 </LEGEND>
<TABLE style="PADDING-LEFT: 10px; WIDTH: 100%" border=0 cellSpacing=0
    cellPadding=0>
    <TBODY>
        <TR>
            <TD style="WIDTH: 170px"><SPAN id=ctl00_mainContent_lblUserCode
                class=labelBld>ユーザーID</SPAN><BR>
            <INPUT style="WIDTH: 120px" id="userId"
                class=inputText name="userId" maxLength=10
                onkeyup="value=value.replace(/[\W]/g,'')" value="${userInfo.userId}"></TD>
            <TD style="WIDTH: 170px"><SPAN id=ctl00_mainContent_lblUserName
                class=labelBld>ユーザー名</SPAN><BR>
            <INPUT style="WIDTH: 120px" id="userName"
                class=inputText name="userName" maxLength=20 value="${userInfo.userName}"></TD>
            <TD style="WIDTH: 170px"><SPAN id=ctl00_mainContent_lblPassword
                class=inputlbl>パスワード</SPAN><BR>
            <INPUT style="WIDTH: 120px" id="password"
                class=inputText name="password" maxLength=20 type=password>
            </TD>
            <TD style="WIDTH: 170px"><SPAN id=ctl00_mainContent_lblRPassword
                class=inputlbl>パスワード確認</SPAN><BR>
            <INPUT style="WIDTH: 120px" id="rPassword"
                class=inputText name="rPassword" maxLength=20 type=password>
            </TD>
        </TR>
        <TR>
            <TD colSpan=2><SPAN id=ctl00_mainContent_lblPhone class=inputlbl>電話番号</SPAN><BR>
            <INPUT style="WIDTH: 300px" id="telNumber"
                class=inputText name="telNumber" maxLength=15
                onkeyup="value=value.replace(/[^\d]/g,'')"  value="${userInfo.telNumber}"></TD>
            <TD colSpan=2><SPAN id=ctl00_mainContent_lblEmail class=inputlbl>メールアドレス</SPAN><BR>
            <INPUT style="WIDTH: 300px" id="mailAddress"
                class=inputText name="mailAddress" maxLength=50 value="${userInfo.mailAddress}"></TD>
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
                id="memo" class=inputText name="memo" >${userInfo.memo}</TEXTAREA>
            </TD>
            <TD><SPAN style="WIDTH: 133px; DISPLAY: inline-block"
                class=chkBox disabled><INPUT id=ctl00_mainContent_chkAbandom
                disabled name=ctl00$mainContent$chkAbandom type=checkbox><LABEL
                for=ctl00_mainContent_chkAbandom>削除フラグ</LABEL></SPAN> <INPUT
                id="delFlg" name="delFlg" type=hidden value="${userInfo.delFlg}">
            </TD>
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
                value=""></TD>
            <TD style="WIDTH: 170px"><SPAN
                id=ctl00_mainContent_lblCreateDate class=inputlbl>作成日</SPAN><BR>
            <INPUT style="WIDTH: 120px" id=ctl00_mainContent_txtCreateDate
                class=textBoxReadOnly name="createDate" readOnly
                value=""></TD>
            <TD style="WIDTH: 170px"><SPAN id=ctl00_mainContent_lblUpdateBy
                class=inputlbl>更新者</SPAN><BR>
            <INPUT style="WIDTH: 120px" id=ctl00_mainContent_txtUpdateBy
                class=textBoxReadOnly name="updateUser" readOnly
                value=""></TD>
            <TD style="WIDTH: 170px"><SPAN
                id=ctl00_mainContent_lblUpdateDate class=inputlbl>更新日</SPAN><BR>
            <INPUT style="WIDTH: 120px" id=ctl00_mainContent_txtUpdateDate
                class=textBoxReadOnly name="updateDate" readOnly
                value=""></TD>
        </TR>
    </TBODY>
</TABLE>
</DIV>
</DIV>

<INPUT id=ctl00_hidTime name=ctl00$hidTime
    value=2014/02/17 16:35:20 type=hidden>
<input type="hidden" id="loginUserName" name="loginUserName" value="${sessionScope.userName}">
</FORM>
<!-- フッター -->
<jsp:include page="../Common/Footer.jsp"/>

</BODY>
</HTML>
