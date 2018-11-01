<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>ユーザー詳細</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/JS/User/UserDetail.js" charset="UTF-8"></script>
</head>
<div style="width: 1158px; height: 150px">
<!-- ヘッダー -->
<jsp:include page="../Common/Header.jsp"/>
</div>
<body>
<form style="TEXT-ALIGN: center" id=userForm method=post name=userForm action="userdetail?procflg=0&userId=232">
<div style="width: 1158px; height: 30px">
<div
    style="BACKGROUND-IMAGE: url(${pageContext.request.contextPath}/static/Image/006.jpg); TEXT-ALIGN: left; MARGIN-TOP: 20px; TEXT-INDENT: 20px; WIDTH: 65%; BACKGROUND-REPEAT: no-repeat; FLOAT: left; HEIGHT: 28px"><SPAN
    id=ctl00_lbltitle class=title>ユーザー詳細</span></div>
</div>
<DIV style="TEXT-ALIGN: left; WIDTH: 1158px">

<div style="TEXT-ALIGN: right; WIDTH: 100%" class=btnContent>
    <c:if test="${sessionScope.loginUserInfo.userId == userInfo.userId || sessionScope.loginUserInfo.authorityCd == '00000'}">
        <a href="javascript:void(0)" class="btn" onClick="eventSwitch('UserUpdateInit')">編集</a>
    </c:if>
<a href="javascript:void(0)" class="btn" onClick="eventSwitch('PullBack')">戻る</a>
</div>
<div style="width: 100%" id=ctl00_mainContent_BaseInfo class=panelGrid>
<FIELDSET><LEGEND>基本情報 </LEGEND>
<table style="PADDING-LEFT: 10px; WIDTH: 100%" border=0 cellSpacing=0 cellPadding=0>
    <tbody>
        <tr>
            <td style="width: 170px"><span id=ctl00_mainContent_lblUserCode
                class=labelBld>ユーザーID</span><br>
            <input style="width: 120px" id="userId"
                class=textBoxReadOnly name="userId" readOnly
                maxLength=10 value="${userInfo.userId}"></td>
            <td style="width: 170px"><span id=ctl00_mainContent_lblUserName
                class=labelBld>ユーザー名</span><br>
            <input style="width: 120px" id="userName"
                class=textBoxReadOnly name="userName" readOnly
                maxLength=20 value="${userInfo.userName}"></td>
            <td style="width: 170px"><span id=ctl00_mainContent_lblPassword
                class=inputlbl>パスワード</span><br>
            <input style="width: 120px" id="password"
                class=textBoxReadOnly name="password" readOnly
                maxLength=20 type=password value="${userInfo.password}"></td>
            <td style="width: 170px"><span id=ctl00_mainContent_lblRPassword
                class=inputlbl>パスワード確認</span><br>
            <input style="width: 120px" id="rpassword"
                class=textBoxReadOnly name="rpassword"  readOnly
                maxLength=20 type=password value="${userInfo.password}"></td>
        </tr>
        <tr>
            <td colSpan=2><span id=ctl00_mainContent_lblPhone class=inputlbl>電話番号</span><br>
            <input style="width: 300px" id="telNumber"
                class=textBoxReadOnly name="telNumber"  readOnly
                maxLength=80 value="${userInfo.telNumber}"></td>
            <td colSpan=2><span id=ctl00_mainContent_lblEmail class=inputlbl>メールアドレス</span><br>
            <input style="width: 300px" id="mailAddress"
                class=textBoxReadOnly name="mailAddress" readOnly
                maxLength=50 value="${userInfo.mailAddress}"></td>
            <td style="width: 170px"><span
                id=ctl00_mainContent_lblAcessGrpID class=labelBld>権限</span><br>
                <c:forEach items="${sessionScope.mstAuthorityInfoList}" var="c" varStatus="st">
                    <c:if test="${userInfo.authorityCd == c.authorityCd}">
                        <input style="width: 120px" id="authorityCd" class=textBoxReadOnly name="authorityCd" readOnly value="${c.authorityName}">
                    </c:if>
                </c:forEach>
            </td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td colSpan=3><span id=ctl00_mainContent_lblRemarks
                class=inputlbl>備考</span><br>
            <TEXTAREA style="width: 480px; height: 50px"
                id="memo" class=textBoxReadOnly readOnly
                name="memo">${userInfo.memo}</TEXTAREA></td>
            <td><span style="width: 133px; DISPLAY: inlinetextbackgroundtext-alignimagealignblock" class=chkBox disabled>
                <c:if test="${userInfo.delFlg == '0' }">
                       <input id=delFlg  type=checkbox value="${userInfo.delFlg}" disabled="disabled">
                </c:if>
                <c:if test="${userInfo.delFlg == '1' }">
                       <input id=delFlg  type=checkbox value="${userInfo.delFlg}" checked="checked">
                </c:if>
                <label for=ctl00_mainContent_chkAbandom>削除フラグ</label></span>
                <input id=ctl00_mainContent_HidPassWord name=ctl00$mainContent$HidPassWord  value=4QrcOUm6Wau+VuBX8g+IPg== type=hidden>
            </td>
            <td></td>
        </tr>
    </tbody>
</table>
</FIELDSET>
</div>
<br>
<div style="width: 100%" id=ctl00_mainContent_Panel1 class=panelInfo>
<table style="WIDTH: 100%; MARGIN-BOTTOM: 5px; MARGIN-LEFT: 5px; MARGIN-RIGHT: -5px" border=0 cellSpacing=0 cellPadding=0>
    <tbody>
        <tr>
            <td style="width: 170px"><span id=ctl00_mainContent_lblCreateBy
                class=inputlbl>作成者</span><br>
            <input style="width: 120px" id="createUser"
                class=textBoxReadOnly name="createUser"  readOnly
                value="${userInfo.createUser}"></td>
            <td style="width: 170px"><span
                id=ctl00_mainContent_lblCreateDate class=inputlbl>作成日</span><br>
            <input style="width: 120px" id="createDate"
                class=textBoxReadOnly name="createDate" readOnly
                value="${userInfo.createDate}"></td>
            <td style="width: 170px"><span id=ctl00_mainContent_lblUpdateBy
                class=inputlbl>更新者</span><br>
            <input style="width: 120px" id="updateUser"
                class=textBoxReadOnly name="updateUser" readOnly
                value="${userInfo.updateUser}"></td>
            <td style="width: 170px"><span
                id=ctl00_mainContent_lblUpdateDate class=inputlbl>更新日</span><br>
            <input style="width: 120px" id="updateDate"
                class=textBoxReadOnly name="updateDate" readOnly
                value="${userInfo.updateDate}"></td>
        </tr>
    </tbody>
</table>
</div>
</div>
<input id=ctl00_hidTime name=ctl00$hidTime value=2014/02/17 16:25:38 type=hidden>
<input id="updateUserId" name="updateUserId"  type=hidden />
</form>
<!-- フッター -->
<jsp:include page="../Common/Footer.jsp"/>
</body>
</html>
