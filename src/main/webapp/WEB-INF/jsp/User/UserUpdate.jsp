<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<html>
    <head>
        <title>ユーザー編集</title>
        <script type="text/javascript" src="${pageContext.request.contextPath}/static/JS/Common/Common.js" charset="UTF-8"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/static/JS/User/UserUpdate.js" charset="UTF-8"></script>
    </head>
    <body>
        <div style="width: 1158px; height: 150px">
            <!-- ヘッダー -->
            <jsp:include page="../Common/Header.jsp"/>
        </div>
        <form style="TEXT-ALIGN: center" id=userForm method=post name=userForm action=userupdate>
            <div style="width: 1158px; height: 30px">
                <div style="BACKGROUND-IMAGE: url(${pageContext.request.contextPath}/static/Image/006.jpg); TEXT-ALIGN: left; MARGIN-TOP: 20px; TEXT-INDENT: 20px; width: 65%; BACKGROUND-REPEAT: no-repeat; float: left; height: 28px">
                   <span id=ctl00_lbltitle class=title>ユーザー編集</span>
                </div>
            </div>
            <div style="TEXT-ALIGN: left; width: 1158px">
                <br>
                <br>
                <div style="TEXT-ALIGN: right">
                    <a href="javascript:void(0)" class="btn" onClick="eventSwitch('UserUpdate')">更新</a>
                    <a href="javascript:void(0)" class="btn" onClick="eventSwitch('PullBack')">戻る</a>
                </div>
                <div style="width: 100%" id=ctl00_mainContent_BaseInfo class=panelGrid>
                    <fieldset>
                        <legend>基本情報 </legend>
                        <table style="PADDING-LEFT: 10px; width: 100%" border=0 cellSpacing=0 cellPadding=0>
                            <tbody>
                                <tr>
                                    <td style="width: 170px"><span id=ctl00_mainContent_lblUserCode class=labelBld>ユーザーID</span><br>
                                        <input style="width: 120px" id=userId class=textBoxReadOnly name="userId" readOnly maxLength=10 value="${userInfo.userId}">
                                    </td>
                                    <td style="width: 170px"><span id=ctl00_mainContent_lblUserName class=labelBld>ユーザー名</span><br>
                                        <input style="width: 120px" id=userName class=inputText name="userName" maxLength=20 value="${userInfo.userName}">
                                    </td>
                                    <td style="width: 170px"><span id=ctl00_mainContent_lblPassword class=inputlbl>パスワード</span><br>
                                        <input style="width: 120px" id=password class=inputText name="password" maxLength=20 type=password value="${userInfo.password}">
                                    </td>
                                    <td style="width: 170px"><span id=ctl00_mainContent_lblRPassword class=inputlbl>パスワード確認</span><br>
                                        <input style="width: 120px" id=rPassword class=inputText name="rPassword" maxLength=20 type=password value="${userInfo.password}">
                                    </td>
                                </tr>
                                <tr>
                                    <td colSpan=2>
                                        <span id=ctl00_mainContent_lblPhone class=inputlbl>電話番号</span><br>
                                        <input style="width: 300px" id=telNumber class=inputText name="telNumber" maxLength=80 value="${userInfo.telNumber}">
                                    </td>
                                    <td colSpan=2>
                                        <span id=ctl00_mainContent_lblEmail class=inputlbl>メールアドレス</span><br>
                                        <input style="width: 300px" id=mailAddress class=inputText name="mailAddress" maxLength=50 value="${userInfo.mailAddress}">
                                    </td>
                                    <td style="width: 170px"><span id=ctl00_mainContent_lblAcessGrp class=inputlbl>権限</span><br>
                                        <select id="authorityCd" class=ddlBlack name="authorityCd">
                                            <option selected value=""></option>
                                            <c:forEach items="${mstAuthorityInfoList}" var="c" varStatus="st">
                                                <option value="${c.authorityCd}" <c:if test="${userInfo.authorityCd == c.authorityCd}"> selected</c:if>>
                                                    ${c.authorityName}
                                                </option>
                                            </c:forEach>
                                        </select>
                                    </td>
                                    <td>&nbsp;</td>
                                </tr>
                                <tr>
                                    <td colSpan=3>
                                        <span id=ctl00_mainContent_lblRemarks class=inputlbl>備考</span><br>
                                        <textarea style="width: 480px; height: 50px" id=memo class=inputText name="memo">${userInfo.memo}</textarea>
                                    </td>
                                    <td>
                                        <span style="width: 133px; DISPLAY: inline-block" class=chkBox>
                                        <c:choose>
                                                <c:when test="${sessionScope.loginUserInfo.authorityCd == '00000' && sessionScope.loginUserInfo.userId != userInfo.userId}">
                                                    <c:if test="${userInfo.delFlg == '0' }">
                                                           <input id=delFlg  type=checkbox value="${userInfo.delFlg}">
                                                     </c:if>
                                                     <c:if test="${userInfo.delFlg == '1' }">
                                                           <input id=delFlg  type=checkbox value="${userInfo.delFlg}" checked="checked">
                                                     </c:if>
                                                </c:when>
                                                <c:otherwise>
                                                    <c:if test="${userInfo.delFlg == '0' }">
                                                           <input id=delFlg  type=checkbox value="${userInfo.delFlg}" disabled="disabled">
                                                     </c:if>
                                                     <c:if test="${userInfo.delFlg == '1' }">
                                                           <input id=delFlg  type=checkbox value="${userInfo.delFlg}" checked="checked" disabled="disabled">
                                                     </c:if>
                                                </c:otherwise>
                                        </c:choose>


                                            <label for=ctl00_mainContent_chkAbandom>削除フラグ</label>
                                            <input id=delFlgHidden name=delFlg type=hidden />
                                        </span>
                                        <input id=ctl00_mainContent_HidPassWord name=ctl00$mainContent$HidPassWord value=4QrcOUm6Wau+VuBX8g+IPg== type=hidden value="${userInfo.delFlg}">
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
                                <td style="width: 170px">
                                    <span id=ctl00_mainContent_lblCreateBy class=inputlbl>作成者</span><br>
                                    <input style="width: 120px" id=createUser class=textBoxReadOnly name="createUser" readOnly value="${userInfo.createUser}">
                                </td>
                                <td style="width: 170px">
                                    <span id=ctl00_mainContent_lblCreateDate class=inputlbl>作成日</span>
                                    <br>
                                    <input style="width: 120px" id=createDate class=textBoxReadOnly name="createDate" readOnly value="${userInfo.createDate}">
                                </td>
                                <td style="width: 170px">
                                    <span id=ctl00_mainContent_lblUpdateBy class=inputlbl>更新者</span><br>
                                    <input style="width: 120px" id=updateUser class=textBoxReadOnly name="updateUser" readOnly value="${userInfo.updateUser}">
                                </td>
                                 <td style="width: 170px">
                                     <span  id=ctl00_mainContent_lblUpdateDate class=inputlbl>更新日</span><br>
                                    <input style="width: 120px" id=updateDate class=textBoxReadOnly name="updateDate" readOnly value="${userInfo.updateDate}">
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