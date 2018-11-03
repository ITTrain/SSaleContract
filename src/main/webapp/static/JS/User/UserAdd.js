/* ****************************/
/*ユーザ登録画面用JavaScript                    */
/*    UserAdd.js                              */
/* ****************************/
function openHelpDoc() {
    window.open('Help/List.htm', 'newwindow', 'width=800,height=700,scrollbars=yes,resizable=yes,location=yes');
    return false;
}
function show(id){
    document.getElementById(id).style.display='block';
}
function hide(id){
    document.getElementById(id).style.display='none';
}
function eventSwitch(eventId){
    var form = document.getElementById("userForm");
    if(eventId == 'UserAdd'){
        // 画面項目の入力チェック
        if(!userInfoCheck()){
            return;
        }
        form.action = "UserAdd";
        form.submit();
    }
    if(eventId == 'PullBack'){
        window.history.back(-1);
    }

}