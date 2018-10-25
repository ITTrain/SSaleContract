/* ****************************/
/*ユーザー詳細画面用JavaScript         */
/*    UserDetail.js                            */
/* ****************************/
function eventSwitch(eventId){
    var form = document.getElementById("userForm");
    if(eventId == 'UserUpdateInit'){
        var userId = document.getElementById("userId").value;
        updateUserId.value = userId;
        form.action = "UserUpdateInit";
        form.submit();
    }
    if(eventId == 'PullBack'){
        window.history.back(-1);
    }
}