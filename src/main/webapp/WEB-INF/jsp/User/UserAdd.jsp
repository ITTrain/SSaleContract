<!DOCTYPE html PUBLIC "-//W3C//DTD html 4.0 Transitional//EN">
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <title>ユーザー登録</title>
        <script type="text/javascript" src="${pageContext.request.contextPath}/static/JS/Common/Common.js" charset="UTF-8"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/static/JS/User/UserAdd.js" charset="UTF-8"></script>
    </head>
    <body>
        <!-- ヘッダー -->
        <div style="width: 1158px; height: 150px">
            <jsp:include page="../Common/Header.jsp"/>
        </div>
        <form style="TEXT-ALIGN: center" id=userForm method=post id=userForm method=post name=userForm action="useradd">
            <div style="width: 1158px; height: 30px">
                <div
                    style="BACKGROUND-IMAGE: url(${pageContext.request.contextPath}/static/Image/006.jpg); TEXT-ALIGN: left; MARGIN-TOP: 20px; TEXT-INDENT: 20px; width: 65%; BACKGROUND-REPEAT: no-repeat; float: left; height: 28px">
                    <span id=ctl00_lbltitle class=title>ユーザー登録</span>
                </div>
            </div>
            <div style="TEXT-ALIGN: left; width: 1158px">
                <div style="TEXT-ALIGN: right; width: 100%" class=btnContent>
                    <a href="javascript:void(0)" class="btn" onClick="eventSwitch('UserAdd')">登録</a>
                    <a href="javascript:void(0)" class="btn" onClick="eventSwitch('PullBack')">戻る</a>
                </div>
                <div style="width: 100%" id=ctl00_mainContent_BaseInfo class=panelGrid>
                    <fieldset>
                        <legend>基本情報 </legend>
                        <table style="PADDING-LEFT:: 10px; width: 100%" border=0 cellSpacing=0 cellPadding=0>
                            <tbody>
                                <tr>
                                    <td style="width: 170px"><span id=ctl00_mainContent_lblUserCode class=labelBld>ユーザーID</span><br>
                                       <input style="width: 120px" id="userId" class=inputText name="userId" maxLength=10 onkeyup="value=value.replace(/[\W]/g,'')" value="${userInfo.userId}">
                                   </td>
                                    <td style="width: 170px"><span id=ctl00_mainContent_lblUserName class=labelBld>ユーザー名</span><br>
                                        <input style="width: 120px" id="userName" class=inputText name="userName" maxLength=20 value="${userInfo.userName}">
                                   </td>
                                    <td style="width: 170px"><span id=ctl00_mainContent_lblPassword class=inputlbl>パスワード</span><br>
                                        <input style="width: 120px" id="password" class=inputText name="password" maxLength=20 type=password>
                                    </td>
                                    <td style="width: 170px"><span id=ctl00_mainContent_lblRPassword class=inputlbl>パスワード確認</span><br>
                                        <input style="width: 120px" id="rPassword" class=inputText name="rPassword" maxLength=20 type=password>
                                    </td>
                                </tr>
                                <tr>
                                    <td colSpan=2><span id=ctl00_mainContent_lblPhone class=inputlbl>電話番号</span><br>
                                        <input style="width: 300px" id="telNumber" class=inputText name="telNumber" maxLength=15 onkeyup="value=value.replace(/[^\d]/g,'')"  value="${userInfo.telNumber}">
                                    </td>
                                    <td colSpan=2><span id=ctl00_mainContent_lblEmail class=inputlbl>メールアドレス</span><br>
                                        <input style="width: 300px" id="mailAddress" class=inputText name="mailAddress" maxLength=50 value="${userInfo.mailAddress}">
                                   </td>
                                    <td style="width: 170px"><span id=ctl00_mainContent_lblAcessGrp class=inputlbl>権限</span><br>
                                        <select id="authorityCd" class=ddlBlack name="authorityCd">
                                            <option selected value=""></option>
                                            <c:forEach items="${mstAuthorityInfoList}" var="c" varStatus="st">
                                                <option value="${c.authorityCd}" <c:if test="${userInfo.authorityCd == c.authorityCd}"> selected</c:if>>${c.authorityName}</option>
                                            </c:forEach>
                                        </select>
                                    </td>
                                    <td>&nbsp;</td>
                                </tr>
                                <tr>
                                    <td colSpan=3><span id=ctl00_mainContent_lblRemarks class=inputlbl>備考</span><br>
                                        <textarea style="width: 480px; height: 50px" id="memo" class=inputText name="memo" >${userInfo.memo}</textarea>
                                    </td>
                                    <td>
                                        <span style="width: 133px; DISPLAY: inline-block" class=chkBox>
                                            <input id=ctl00_mainContent_chkAbandom disabled name=ctl00$mainContent$chkAbandom type=checkbox disabled="disabled">
                                            <label for=ctl00_mainContent_chkAbandom>削除フラグ</label>
                                        </span>
                                        <input  id="delFlg" name="delFlg" type=hidden value="${userInfo.delFlg}">
                                    </td>
                                    <td></td>
                                </tr>
                            </tbody>
                        </table>
                    </fieldset>
                </div>
                <br>
                <div style="width: 100%" id=ctl00_mainContent_Panel1 class=panelInfo>
                    <table style="width: 100%; MARGIN-BOTTOM: 5px; MARGIN-LEFT: 5px; MARGIN-RIGHT: -5px" border=0 cellSpacing=0 cellPadding=0>
                        <tbody>
                            <tr>
                                <td style="width: 170px"><span id=ctl00_mainContent_lblCreateBy class=inputlbl>作成者</span><br>
                                    <input style="width: 120px" id=ctl00_mainContent_txtCreateBy class=textBoxReadOnly name="createUser" readOnly value="">
                               </td>
                                <td style="width: 170px">
                                    <span id=ctl00_mainContent_lblCreateDate class=inputlbl>作成日</span><br>
                                    <input style="width: 120px" id=ctl00_mainContent_txtCreateDate class=textBoxReadOnly name="createDate" readOnly value="">
                                </td>
                                <td style="width: 170px">
                                    <span id=ctl00_mainContent_lblUpdateBy class=inputlbl>更新者</span><br>
                                    <input style="width: 120px" id=ctl00_mainContent_txtUpdateBy class=textBoxReadOnly name="updateUser" readOnly value="">
                               </td>
                                <td style="width: 170px">
                                    <span id=ctl00_mainContent_lblUpdateDate class=inputlbl>更新日</span><br>
                                    <input style="width: 120px" id=ctl00_mainContent_txtUpdateDate class=textBoxReadOnly name="updateDate" readOnly value="">
                               </td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </form>
        <!-- フッター -->
        <jsp:include page="../Common/Footer.jsp"/>
    </body>
</html>
