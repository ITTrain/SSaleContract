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
    function eventSwitch(eventId){
        var form = document.getElementById("userForm");
        if(eventId == 'UserSearch'){
            form.action = "UserSearch";
        }
        if(eventId == 'UserAdd'){
            form.action = "UserAddInit";
        }
        var delFlag = document.getElementById("delFlag");
        var delFlagHidden = document.getElementById("delFlagHidden")
        if(delFlag.checked == true){
            delFlagHidden.value = '';
        }else{
            delFlagHidden.value = '0';
        }
        form.submit();
    }