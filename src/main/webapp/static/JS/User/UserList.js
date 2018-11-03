/* ****************************/
/*ユーザー一覧画面用JavaScript                    */
/*    UserList.js                               */
/* ****************************/
    function __doPostBack(eventTarget, eventArgument) {
        if (!theForm.onsubmit || (theForm.onsubmit() != false)) {
            theForm.__EVENTTARGET.value = eventTarget;
            theForm.__EVENTARGUMENT.value = eventArgument;
            theForm.submit();
        }
    }
    function eventSwitch(eventId,userId){
        var form = document.getElementById("userForm");
        if(eventId == 'UserSearch'){
            form.action = "UserSearch";
            var delFlag = document.getElementById("delFlag");
            var delFlagHidden = document.getElementById("delFlagHidden")
            if(delFlag.checked == true){
                delFlagHidden.value = '';
            }else{
                delFlagHidden.value = '0';
            }
            form.submit();
        }
        if(eventId == 'UserAdd'){
            form.action = "UserAddInit";
            form.submit();
        }
        // ユーザー「編集」リンク押下
        if(eventId == 'UserUpdateInit'){
            var updateUserId = document.getElementById("updateUserId");
            updateUserId.value = userId;
            form.action = "UserUpdateInit";
            form.submit();
        }
        if(eventId == 'UserDelete'){
            if (deleteConfirmd()){
                var updateUserId = document.getElementById("updateUserId");
                updateUserId.value = userId;
                form.action = "UserDelete";
                form.submit();
            }
        }
        if(eventId == 'UserDetail'){
            var updateUserId = document.getElementById("updateUserId");
            updateUserId.value = userId;
            form.action = "UserDetail";
            form.submit();
        }
    }
    // 削除の確認ダイアログ
    function deleteConfirmd() {
            var msg = "このユーザーを削除でよろしいですか？";
            if (confirm(msg)==true){
                return true;
            }else{
                return false;
            }
    }