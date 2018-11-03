<!DOCTYPE html PUBLIC "-//W3C//DTD html 4.0 Transitional//EN">
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <title>ユーザー一覧</title>
        <script type="text/javascript" src="${pageContext.request.contextPath}/static/JS/User/UserList.js" charset="UTF-8"></script>
    </head>
    <body>
        <div style="width: 1158px; height: 150px">
            <!-- ヘッダー -->
            <jsp:include page="../Common/Header.jsp"/>
        </div>
        <form style="TEXT-ALIGN: center" id=userForm method=post name=userForm action="usersearch">
            <div style=" width: 1158px; height: 30px">
                <div style="BACKGROUND-IMAGE: url(${pageContext.request.contextPath}/static/Image/006.jpg); TEXT-ALIGN: left; MARGIN-TOP: 20px; TEXT-INDENT: 20px; width: 65%; BACKGROUND-REPEAT: no-repeat; float: left; height: 28px">
                    <span id=ctl00_lbltitle class=title>ユーザー一覧</span>
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
                                    <input id=ctl00_mainContent_txtUserCode class=inputText name="userId" maxLength=10 value="${userId}">
                                </td>
                                <td style="width: 170px"><span id=ctl00_mainContent_lblUserName class=inputlbl>ユーザー名</span><br>
                                    <input id=ctl00_mainContent_txtUserName class=inputText name="userName" maxLength=20 value="${userName}">
                                </td>
                                <td style="width: 170px">
                                    <span id=ctl00_mainContent_lblAcessGrp class=inputlbl>権限</span><br>
                                    <select id=ctl00_mainContent_ddlAcessGrp class=ddlBlack name="userRoot" id="userRoot">
                                        <option selected value=""></option>
                                        <c:forEach items="${sessionScope.mstAuthorityInfoList}" var="c" varStatus="st">
                                            <option value="${c.authorityCd}" <c:if test="${authorityCd == c.authorityCd}"> selected</c:if>>${c.authorityName}</option>
                                        </c:forEach>
                                    </select>
                                    <input type="hidden" value="" id="root"/>
                                </td>
                                <td><br>
                                <span style="width: 133px; DISPLAY: inline-block" class=chkBox>
                                    <c:if test="${delFlag == '0' || delFlag == null}">
                                          <input id=delFlag type=checkbox>
                                    </c:if>
                                    <c:if test="${delFlag == '' }">
                                          <input id=delFlag type=checkbox checked="checked">
                                    </c:if>
                                    <label for=ctl00_mainContent_chkVisible>削除フラグ含む</label>
                                    <input id=delFlagHidden name=delFlag type=hidden value="${delFlag}"/>
                                </span>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </div>
                <div style="TEXT-ALIGN: right; width: 100%" class=btnContent>
                    <a href="javascript:void(0)" class="btn" onClick="eventSwitch('UserSearch')">検索</a>
                    <c:if test="${sessionScope.loginUserInfo.userId == userInfo.userId || sessionScope.loginUserInfo.authorityCd == '00000'}">
                        <a href="javascript:void(0)" class="btn" onClick="eventSwitch('UserAdd')">追加</a>
                    </c:if>
                </div>
                <div style="height: 400px" class=gvContent>
                    <div>
                        <table style="width: 100%; BORDER-COLLAPSE: collapse" id=ctl00_mainContent_gvList border=1 rules=all cellSpacing=0 cellPadding=0>
                            <tbody>
                                <tr class=gvHeader>
                                    <th style="width: 8%" scope=col>操作</th>
                                    <th style="width: 8%" scope=col>
                                        <A href="javascript:__doPostBack('ctl00$mainContent$gvList','Sort$ユーザID')">ユーザID</A>
                                    </th>
                                    <th style="width: 8%" scope=col>
                                        <A href="javascript:__doPostBack('ctl00$mainContent$gvList','Sort$ユーザー名')">ユーザー名</A>
                                    </th>
                                    <th style="width: 8%" scope=col>
                                        <A href="javascript:__doPostBack('ctl00$mainContent$gvList','Sort$権限')">権限</A>
                                    </th>
                                    <th style="width: 8%" scope=col>
                                        <A href="javascript:__doPostBack('ctl00$mainContent$gvList','Sort$削除状態')">削除フラグ</A>
                                    </th>
                                    <th style="width: 14%" scope=col>
                                        <A href="javascript:__doPostBack('ctl00$mainContent$gvList','Sort$電話番号')">電話番号</A>
                                    </th>
                                    <th style="width: 14%" scope=col>
                                        <A href="javascript:__doPostBack('ctl00$mainContent$gvList','Sort$メールアドレス')">メールアドレス</A>
                                    </th>
                                    <th style="width: 8%" scope=col><A
                                        href="javascript:__doPostBack('ctl00$mainContent$gvList','Sort$作成者')">作成者</A></th>
                                    <th style="width: 8%" scope=col>
                                        <A href="javascript:__doPostBack('ctl00$mainContent$gvList','Sort$作成日')">作成日</A>
                                    </th>
                                    <th style="width: 8%" scope=col>
                                        <A href="javascript:__doPostBack('ctl00$mainContent$gvList','Sort$更新者')">更新者</A>
                                    </th>
                                    <th style="width: 8%" scope=col>
                                        <A href="javascript:__doPostBack('ctl00$mainContent$gvList','Sort$更新日')">更新日</A>
                                    </th>
                                </tr>
                                <c:forEach items="${userInfoList}" var="userInfo" varStatus="st">
                                   <tr class=gvRow>
                                        <td style="width: 8%" align=center>
                                            <c:choose>
                                                <c:when test="${sessionScope.loginUserInfo.authorityCd == '00000'}">
                                                    <a href="javascript:void(0)" id=ctl00_mainContent_gvList_ctl02_lnkEdit onClick="eventSwitch('UserUpdateInit', '${userInfo.userId}')">編集</a>
                                                    <a href="javascript:void(0)" id=ctl00_mainContent_gvList_ctl02_lnkDelete onClick="eventSwitch('UserDelete', '${userInfo.userId}')">削除</a>
                                                </c:when>
                                                <c:when test="${sessionScope.loginUserInfo.userId == userInfo.userId && sessionScope.loginUserInfo.authorityCd != '00000'}">
                                                    <a href="javascript:void(0)" id=ctl00_mainContent_gvList_ctl02_lnkEdit onClick="eventSwitch('UserUpdateInit', '${userInfo.userId}')">編集</a>
                                                </c:when>
                                                <c:otherwise>
                                                    <label>編集</label>
                                                    <label>削除</label>
                                                </c:otherwise>
                                            </c:choose>
                                        </td>
                                       <td style="width: 8%" align=center>
                                            <a href="javascript:void(0)" style="TEXT-DECORATION: underline" id=ctl00_mainContent_gvList_ctl02_lnkUserID onClick="eventSwitch('UserDetail', '${userInfo.userId}')">${userInfo.userId}</A>
                                       </td>
                                       <td style="width: 8%" align=left>${userInfo.userName}</td>
                                       <td style="width: 8%" align=left>${userInfo.authorityCd}</td>
                                       <td style="width: 8%" align=center>
                                           <span title=削除フラグ >
                                              <c:if test="${userInfo.delFlg == '0' }">
                                                    <input id=delFlag name=delFlag type=checkbox value="${userInfo.delFlg}" disabled="disabled">
                                              </c:if>
                                              <c:if test="${userInfo.delFlg == '1' }">
                                                    <input id=delFlag name=delFlag type=checkbox value="${userInfo.delFlg}" checked="checked" disabled="disabled">
                                              </c:if>
                                           </span>
                                      </td>
                                       <td style="width: 14%" align=left> ${userInfo.telNumber}</td>
                                       <td style="width: 14%" align=left> ${userInfo.mailAddress}</td>
                                       <td style="width: 8%" align=left> ${userInfo.createUser}</td>
                                       <td style="width: 8%" align=left> ${userInfo.createDate}</td>
                                       <td style="width: 8%" align=left> ${userInfo.updateUser}</td>
                                       <td align=left> ${userInfo.updateDate}</td>
                                   </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
                <!-- 画面遷移用ユーザーID -->
                <input id="updateUserId" name="updateUserId"  type=hidden />
            </div>
        </form>
        <!-- フッター -->
        <jsp:include page="../Common/Footer.jsp"/>
    </body>
</html>