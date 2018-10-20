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
        form.action = "UserAdd";
        if(!userInfoCheck()){
            return;
        }
    }
    if(eventId == 'PullBack'){
        window.history.back(-1);
    }
//    var delFlag = document.getElementById("delFlag");
//    var delFlagHidden = document.getElementById("delFlagHidden")
//    if(delFlag.checked == true){
//        delFlagHidden.value = '';
//    }else{
//        delFlagHidden.value = '0';
//    }
    form.submit();
}
//ユーザ登録
function userInfoCheck(){
    if(!inputNullCheck()){
        return false;
    }
    if(!passwordSameCheck()){
        return false;
    }
    if(isNaN(document.getElementById("telNumber").value)){
        document.getElementById("errorMessage").innerHTML = "電話番号が数字ではない";
        return false;
    }
    if(!mailChk(document.getElementById("mailAddress").value)){
        document.getElementById("errorMessage").innerHTML = "メール形式不正";
        return false;
    }
//    var form = document.getElementById("userForm");
//    form.submit();
}

//必須入力チェック
function inputNullCheck(){
    if(document.getElementById("userId").value==""){
        document.getElementById("errorMessage").innerHTML = "ユーザーID入力されていない";
        return false;
    }
    if(document.getElementById("userName").value==""){
        document.getElementById("errorMessage").innerHTML = "ユーザー名入力されていない";
        return false;
    }
    if(document.getElementById("password").value==""){
        document.getElementById("errorMessage").innerHTML = "パスワード入力されていない";
        return false;
    }
    if(document.getElementById("rPassword").value==""){
        document.getElementById("errorMessage").innerHTML = "パスワード確認入力されていない";
        return false;
    }
    if(document.getElementById("authorityCd").value==""){
        document.getElementById("errorMessage").innerHTML = "権限選択されていない";
        return false;
    }
    return true;
}

//パスワード確認不一致チェック
function passwordSameCheck(){
    var password = document.getElementById("password").value;
    var rpassword = document.getElementById("rPassword").value;
    if(password != rpassword){
        document.getElementById("errorMessage").innerHTML = "パスワード不一致";
        return false;
    }
    return true;
}

//メールチェック
function mailChk(value){
    if(!value.match("^(([0-9a-zA-Z]+)|([0-9a-zA-Z]+[_.0-9a-zA-Z-]*[0-9a-zA-Z]+))@([a-zA-Z0-9-]+[.])+[a-zA-Z]+$")){
        return false;
    }
    return true;
}