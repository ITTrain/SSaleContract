/* ****************************/
/*ユーザー更新画面用JavaScript         */
/*    UserUpdate.js                          */
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
        if(eventId == 'UserUpdate'){
            document.getElementById("createDate").value = "";
            document.getElementById("updateDate").value = "";
            var delFlg = document.getElementById("delFlg");
            var delFlgHidden = document.getElementById("delFlgHidden")
            if(delFlg.checked == true){
                delFlgHidden.value = '1';
            }else{
                delFlgHidden.value = '0';
            }
            form.action = "UserUpdate";
        }
        form.submit();
    }