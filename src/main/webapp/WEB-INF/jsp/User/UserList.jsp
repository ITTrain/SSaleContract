<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<HTML>
<HEAD>
    <TITLE>ユーザー一覧</TITLE>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/JS/User/UserList.js" charset="UTF-8"></script>
</HEAD>
<BODY>
<DIV style="WIDTH: 1158px; HEIGHT: 150px">
<!-- ヘッダー -->
<jsp:include page="../Common/Header.jsp"/>
</DIV>
<FORM style="TEXT-ALIGN: center" id=userForm method=post name=userForm action="usersearch">
<DIV style=" WIDTH: 1158px; HEIGHT: 30px">
    <DIV
       style="BACKGROUND-IMAGE: url(${pageContext.request.contextPath}/static/Image/006.jpg); TEXT-ALIGN: left; MARGIN-TOP: 20px; TEXT-INDENT: 20px; WIDTH: 65%; BACKGROUND-REPEAT: no-repeat; FLOAT: left; HEIGHT: 28px"><SPAN
       id=ctl00_lbltitle class=title>ユーザー一覧</SPAN></DIV>
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
            <INPUT id=ctl00_mainContent_txtUserCode class=inputText name="userId"
                maxLength=10 value="${userId}"></TD>
            <TD style="WIDTH: 170px"><SPAN id=ctl00_mainContent_lblUserName
                class=inputlbl>ユーザー名</SPAN><BR>
            <INPUT id=ctl00_mainContent_txtUserName class=inputText
                name="userName" maxLength=20 value="${userName}"></TD>
            <TD style="WIDTH: 170px"><SPAN id=ctl00_mainContent_lblAcessGrp
                class=inputlbl>権限</SPAN><BR>
            <SELECT id=ctl00_mainContent_ddlAcessGrp class=ddlBlack name="userRoot" id="userRoot">
                <OPTION selected value=""></OPTION>
                <c:forEach items="${sessionScope.mstAuthorityInfoList}" var="c" varStatus="st">
                    <option value="${c.authorityCd}">${c.authorityName}</option>
                </c:forEach>
            </SELECT>
            <input type="hidden" value="" id="root"/>
            </TD>
            <TD><BR>
            <SPAN style="WIDTH: 133px; DISPLAY: inline-block" class=chkBox>
                <c:if test="${delFlag == '0' }">
                      <INPUT id=delFlag type=checkbox>
                </c:if>
                <c:if test="${delFlag == '' }">
                      <INPUT id=delFlag type=checkbox checked="checked">
                </c:if>
                <LABEL for=ctl00_mainContent_chkVisible>削除フラグ含む</LABEL>
                <INPUT id=delFlagHidden name=delFlag type=hidden value="${delFlag}"/>
            </SPAN>
            </TD>
        </TR>
    </TBODY>
</TABLE>
</DIV>
<DIV style="TEXT-ALIGN: right; WIDTH: 100%" class=btnContent>
<a href="javascript:void(0)" class="btn" onClick="eventSwitch('UserSearch')"><center>検索</center></a>
<a href="javascript:void(0)" class="btn" onClick="eventSwitch('UserAdd')"><center>追加</center></a>
</DIV>
<DIV style="HEIGHT: 400px" class=gvContent>
<DIV>
<TABLE style="WIDTH: 100%; BORDER-COLLAPSE: collapse"
    id=ctl00_mainContent_gvList border=1 rules=all cellSpacing=0
    cellPadding=0>
    <TBODY>
        <TR class=gvHeader>
            <TH style="WIDTH: 8%" scope=col>操作</TH>
            <TH style="WIDTH: 8%" scope=col><A
                href="javascript:__doPostBack('ctl00$mainContent$gvList','Sort$ユーザID')">ユーザID</A></TH>
            <TH style="WIDTH: 8%" scope=col><A
                href="javascript:__doPostBack('ctl00$mainContent$gvList','Sort$ユーザー名')">ユーザー名</A></TH>
            <TH style="WIDTH: 8%" scope=col><A
                href="javascript:__doPostBack('ctl00$mainContent$gvList','Sort$権限')">権限</A></TH>
            <TH style="WIDTH: 8%" scope=col><A
                href="javascript:__doPostBack('ctl00$mainContent$gvList','Sort$削除状態')">削除フラグ</A></TH>
            <TH style="WIDTH: 14%" scope=col><A
                href="javascript:__doPostBack('ctl00$mainContent$gvList','Sort$電話番号')">電話番号</A></TH>
            <TH style="WIDTH: 14%" scope=col><A
                href="javascript:__doPostBack('ctl00$mainContent$gvList','Sort$メールアドレス')">メールアドレス</A></TH>
            <TH style="WIDTH: 8%" scope=col><A
                href="javascript:__doPostBack('ctl00$mainContent$gvList','Sort$作成者')">作成者</A></TH>
            <TH style="WIDTH: 8%" scope=col><A
                href="javascript:__doPostBack('ctl00$mainContent$gvList','Sort$作成日')">作成日</A></TH>
            <TH style="WIDTH: 8%" scope=col><A
                href="javascript:__doPostBack('ctl00$mainContent$gvList','Sort$更新者')">更新者</A></TH>
            <TH style="WIDTH: 8%" scope=col><A
                href="javascript:__doPostBack('ctl00$mainContent$gvList','Sort$更新日')">更新日</A></TH>
        </TR>
        <c:forEach items="${userInfoList}" var="userInfo" varStatus="st">
           <TR class=gvRow
               onclick="if(window.oldtr!=null){window.oldtr.runtimeStyle.cssText='';}this.runtimeStyle.cssText='background-color:#CCCCFF';window.oldtr=this;">
               <TD style="WIDTH: 8%" align=center><A
                   id=ctl00_mainContent_gvList_ctl02_lnkEdit href="UserUpdate.htm">編集</A>
               </TD>
               <TD style="WIDTH: 8%" align=center><A
                   style="TEXT-DECORATION: underline"
                   id=ctl00_mainContent_gvList_ctl02_lnkUserID
                   href="UserDetail.htm">${userInfo.userId}</A>
               </TD>
               <TD style="WIDTH: 8%" align=left>${userInfo.userName}</TD>
               <TD style="WIDTH: 8%" align=left>${userInfo.authorityCd}</TD>
               <TD style="WIDTH: 8%" align=center>
                   <SPAN title=削除フラグ >
                      <c:if test="${userInfo.delFlg == '0' }">
                            <INPUT id=delFlag name=delFlag type=checkbox value="${userInfo.delFlg}" disabled="disabled">
                      </c:if>
                      <c:if test="${userInfo.delFlg == '1' }">
                            <INPUT id=delFlag name=delFlag type=checkbox value="${userInfo.delFlg}" checked="checked" disabled="disabled">
                      </c:if>
                   </SPAN>
              </TD>
               <TD style="WIDTH: 14%" align=left> ${userInfo.telNumber}</TD>
               <TD style="WIDTH: 14%" align=left> ${userInfo.mailAddress}</TD>
               <TD style="WIDTH: 8%" align=left> ${userInfo.createUser}</TD>
               <TD style="WIDTH: 8%" align=left> ${userInfo.createDate}</TD>
               <TD style="WIDTH: 8%" align=left> ${userInfo.updateUser}</TD>
               <TD align=left> ${userInfo.updateDate}</TD>
           </TR>
        </c:forEach>
    </TBODY>
</TABLE>
</DIV>
</DIV>
<INPUT id=ctl00_hidTime name=ctl00$hidTime value=2014/02/17 15:48:11 type=hidden />
</DIV>
</FORM>
<!-- フッター -->
<jsp:include page="../Common/Footer.jsp"/>
</BODY>
</HTML>