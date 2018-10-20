/* ****************************/
/* ヘッダー用JavaScript                    */
/*    Header.js                                 */
/* ****************************/
var timeClient = new Date();
function getTimeSub() {
    var strTimeServer;
    var timeServer;
    timeServer = new Date();
    var timeSub = Math.round((timeServer.getTime() - timeClient.getTime()) / 1000);
    return timeSub;
}
function getTime(n) {
    var clientTime = new Date();
    clientTime.setTime(clientTime.getTime() + n * 1000);
    var nowTime = clientTime.toLocaleDateString() + " " + clientTime.toLocaleTimeString();
    if (document.getElementById('ctl00_lblTime') != null) {
        document.getElementById('ctl00_lblTime').innerText = nowTime;
    }
    setTimeout("getTime(getTimeSub())", 1000);
}
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
function menuSwitch(menu){
    var form = document.getElementById("headForm");
    if(menu == 'UserSearch'){
        form.action = "UserSearchInit";
    }
    if(menu == 'UserAdd'){
        form.action = "UserAddInit";
    }
    form.submit();
}
function headLinkSwitch(headLink){
    var form = document.getElementById("headForm");
    if(headLink == 'Help'){
        form.action = "Help";
    }
    if(headLink == 'Common/MainMenu'){
        form.action = "MainMenu";
    }
    if(headLink == 'Login'){
        form.action = "Login";
    }

    form.submit();
}
