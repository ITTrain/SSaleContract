<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <title>ユーザー検索</title>
        <script type="text/javascript" src="${pageContext.request.contextPath}/static/JS/User/UserSearch.js" charset="UTF-8"></script>
    </head>
    <body>
        <!-- ヘッダー -->
        <div style="width: 1158px; height: 150px">
            <jsp:include page="../Common/Header.jsp"/>
        </div>
        <form style="TEXT-ALIGN: center" id="userSearchFrom" method=post action="usersearch">
            <div style="width: 1158px; height: 30px">
                <div style="BACKGROUND-IMAGE: url(${pageContext.request.contextPath}/static/Image/006.jpg);  TEXT-ALIGN: left; MARGIN-TOP: 20px; TEXT-INDENT: 20px; width: 65%; BACKGROUND-REPEAT: no-repeat; float: left; height: 28px">
                    <span id=ctl00_lbltitle class=title>ユーザー検索</span>
                </div>
            </div>
            <br>
            <br>
            <div style="TEXT-ALIGN: left; width: 1158px">
                <div class=tbTitile>
                    <span id=ctl00_mainContent_SearchText class=inputlbl>検索条件</span>
                </div>
                <div class=tbContent>
                    <table style="width: 100%" cellSpacing=0 cellPadding=0>
                        <tbody>
                            <tr>
                                <td style="width: 170px">
                                    <span id=ctl00_mainContent_lblUserCode class=inputlbl>ユーザーID</span><br>
                                    <input id=ctl00_mainContent_txtUserCode class=inputText name="userId" maxLength=10>
                                </td>
                                <td style="width: 170px">
                                    <span id=ctl00_mainContent_lblUserName class=inputlbl>ユーザー名</span><br>
                                    <input id=ctl00_mainContent_txtUserName class=inputText name="userName" maxLength=30>
                                </td>
                                <td style="width: 170px"><span id=ctl00_mainContent_lblAcessGrp class=inputlbl>権限</span><br>
                                    <select id="ctl00_mainContent_ddlAcessGrp" class=ddlBlack name="userRoot">
                                        <option selected value=""></option>
                                        <c:forEach items="${mstAuthorityInfoList}" var="c" varStatus="st">
                                            <option value="${c.authorityCd}" <c:if test="${userInfo.authorityCd == c.authorityCd}"> selected</c:if>>${c.authorityName}</option>
                                        </c:forEach>
                                    </select>
                                </td>
                                <td><br>
                                    <span style="width: 133px; DISPLAY: inline-block" class=chkBox>
                                        <input id=delFlag  type=checkbox >
                                        <label for=ctl00_mainContent_chkVisible>削除フラグ含む</label>
                                        <input id=delFlagHidden name=delFlag type=hidden />
                                    </span>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </div>
                <div style="TEXT-ALIGN: right; width: 100%" class=btnContent>
                    <a href="javascript:void(0)" class="btn" onClick="eventSwitch('UserSearch')">検索</a>
                    <c:if test="${sessionScope.loginUserInfo.authorityCd == '00000'}">
                        <a href="javascript:void(0)" class="btn" onClick="eventSwitch('UserAdd')">追加</a>
                    </c:if>
                </div>
            </div>
        </form>
        <!-- フッター -->
        <jsp:include page="../Common/Footer.jsp"/>
    </body>
</html>