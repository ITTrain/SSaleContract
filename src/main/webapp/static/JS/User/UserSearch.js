/* ****************************/
/* ユーザー検索用JavaScript                    */
/*    UserSearch.js                                */
/* ****************************/
function eventSwitch(eventId){
    var form = document.getElementById("userSearchFrom");
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
