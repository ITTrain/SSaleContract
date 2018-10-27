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
        }
        if(eventId == 'UserAdd'){
            form.action = "UserAddInit";
        }
        // ユーザー「編集」リンク押下
        if(eventId == 'UserUpdateInit'){
            var updateUserId = document.getElementById("updateUserId");
            updateUserId.value = userId;
            form.action = "UserUpdateInit";
        }
        if(eventId == 'UserDelete'){
            var updateUserId = document.getElementById("updateUserId");
            updateUserId.value = userId;
            form.action = "UserDelete";
        }
        if(eventId == 'UserDetail'){
            var updateUserId = document.getElementById("updateUserId");
            updateUserId.value = userId;
            form.action = "UserDetail";
        }

        form.submit();
    }