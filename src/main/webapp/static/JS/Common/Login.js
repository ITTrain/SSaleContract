/* ****************************/
/* ヘッダー用JavaScript                    */
/*    Login.js                                   */
/* ****************************/
 function submit(){
    document.getElementById("lblErrorMessage").innerHTML = "";
    document.login_form.submit();
}
 function reset(){
     document.getElementById("lblErrorMessage").innerHTML = "";
     document.getElementById("txtUserId").value = "";
     document.getElementById("txtPassword").value = "";
}
 // 入力情報変更時の処理
 function  inputChage(){
     document.getElementById("lblErrorMessage").innerHTML = "";
}