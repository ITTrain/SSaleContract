<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<HTML>
<HEAD>
<TITLE>ユーザー詳細</TITLE>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/JS/User/UserDetail.js" charset="UTF-8"></script>
</HEAD>
<DIV style="WIDTH: 1158px; HEIGHT: 150px">
<!-- ヘッダー -->
<jsp:include page="../Common/Header.jsp"/>
</DIV>
<BODY>
<FORM style="TEXT-ALIGN: center" id=userForm method=post
    name=userForm action="userdetail?procflg=0&userId=232">
<DIV style="WIDTH: 1158px; HEIGHT: 30px">
<DIV
    style="BACKGROUND-IMAGE: url(${pageContext.request.contextPath}/static/Image/006.jpg); TEXT-ALIGN: left; MARGIN-TOP: 20px; TEXT-INDENT: 20px; WIDTH: 65%; BACKGROUND-REPEAT: no-repeat; FLOAT: left; HEIGHT: 28px"><SPAN
    id=ctl00_lbltitle class=title>ユーザー詳細</SPAN></DIV>
</DIV>
<DIV style="TEXT-ALIGN: left; WIDTH: 1158px">

<DIV style="TEXT-ALIGN: right; WIDTH: 100%" class=btnContent>
<a href="javascript:void(0)" class="btn" onClick="eventSwitch('UserUpdateInit')"><center>編集</center></a>
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
                class=textBoxReadOnly name="userId" readOnly
                maxLength=10 value="${userInfo.userId}"></TD>
            <TD style="WIDTH: 170px"><SPAN id=ctl00_mainContent_lblUserName
                class=labelBld>ユーザー名</SPAN><BR>
            <INPUT style="WIDTH: 120px" id="userName"
                class=textBoxReadOnly name="userName" readOnly
                maxLength=20 value="${userInfo.userName}"></TD>
            <TD style="WIDTH: 170px"><SPAN id=ctl00_mainContent_lblPassword
                class=inputlbl>パスワード</SPAN><BR>
            <INPUT style="WIDTH: 120px" id="password"
                class=textBoxReadOnly name="password" readOnly
                maxLength=20 type=password value="${userInfo.password}"></TD>
            <TD style="WIDTH: 170px"><SPAN id=ctl00_mainContent_lblRPassword
                class=inputlbl>パスワード確認</SPAN><BR>
            <INPUT style="WIDTH: 120px" id="rpassword"
                class=textBoxReadOnly name="rpassword"  readOnly
                maxLength=20 type=password value="${userInfo.password}"></TD>
        </TR>
        <TR>
            <TD colSpan=2><SPAN id=ctl00_mainContent_lblPhone class=inputlbl>電話番号</SPAN><BR>
            <INPUT style="WIDTH: 300px" id="telNumber"
                class=textBoxReadOnly name="telNumber"  readOnly
                maxLength=80 value="${userInfo.telNumber}"></TD>
            <TD colSpan=2><SPAN id=ctl00_mainContent_lblEmail class=inputlbl>メールアドレス</SPAN><BR>
            <INPUT style="WIDTH: 300px" id="mailAddress"
                class=textBoxReadOnly name="mailAddress" readOnly
                maxLength=50 value="${userInfo.mailAddress}"></TD>
            <TD style="WIDTH: 170px"><SPAN
                id=ctl00_mainContent_lblAcessGrpID class=labelBld>権限</SPAN><BR>
                <c:forEach items="${sessionScope.mstAuthorityInfoList}" var="c" varStatus="st">
                    <c:if test="${userInfo.authorityCd == c.authorityCd}">
                        <INPUT style="WIDTH: 120px" id="authorityCd" class=textBoxReadOnly name="authorityCd" readOnly value="${c.authorityName}">
                    </c:if>
                </c:forEach>
            </TD>
            <TD>&nbsp;</TD>
        </TR>
        <TR>
            <TD colSpan=3><SPAN id=ctl00_mainContent_lblRemarks
                class=inputlbl>備考</SPAN><BR>
            <TEXTAREA style="WIDTH: 480px; HEIGHT: 50px"
                id="memo" class=textBoxReadOnly readOnly
                name="memo">${userInfo.memo}</TEXTAREA></TD>
            <TD><SPAN style="WIDTH: 133px; DISPLAY: inline-block" class=chkBox disabled>
                <c:if test="${userInfo.delFlg == '0' }">
                       <INPUT id=delFlg  type=checkbox value="${userInfo.delFlg}" disabled="disabled">
                </c:if>
                <c:if test="${userInfo.delFlg == '1' }">
                       <INPUT id=delFlg  type=checkbox value="${userInfo.delFlg}" checked="checked">
                </c:if>
                <LABEL for=ctl00_mainContent_chkAbandom>削除フラグ</LABEL></SPAN>
                <INPUT id=ctl00_mainContent_HidPassWord name=ctl00$mainContent$HidPassWord  value=4QrcOUm6Wau+VuBX8g+IPg== type=hidden>
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
            <INPUT style="WIDTH: 120px" id="createUser"
                class=textBoxReadOnly name="createUser"  readOnly
                value="${userInfo.createUser}"></TD>
            <TD style="WIDTH: 170px"><SPAN
                id=ctl00_mainContent_lblCreateDate class=inputlbl>作成日</SPAN><BR>
            <INPUT style="WIDTH: 120px" id="createDate"
                class=textBoxReadOnly name="createDate" readOnly
                value="${userInfo.createDate}"></TD>
            <TD style="WIDTH: 170px"><SPAN id=ctl00_mainContent_lblUpdateBy
                class=inputlbl>更新者</SPAN><BR>
            <INPUT style="WIDTH: 120px" id="updateUser"
                class=textBoxReadOnly name="updateUser" readOnly
                value="${userInfo.updateUser}"></TD>
            <TD style="WIDTH: 170px"><SPAN
                id=ctl00_mainContent_lblUpdateDate class=inputlbl>更新日</SPAN><BR>
            <INPUT style="WIDTH: 120px" id="updateDate"
                class=textBoxReadOnly name="updateDate" readOnly
                value="${userInfo.updateDate}"></TD>
        </TR>
    </TBODY>
</TABLE>
</DIV>
</DIV>
<INPUT id=ctl00_hidTime name=ctl00$hidTime value=2014/02/17 16:25:38 type=hidden>
<INPUT id="updateUserId" name="updateUserId"  type=hidden />
</FORM>
<!-- フッター -->
<jsp:include page="../Common/Footer.jsp"/>
</BODY>
</HTML>
