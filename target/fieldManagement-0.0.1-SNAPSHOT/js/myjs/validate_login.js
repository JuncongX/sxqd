/*
* @Author: chenzexiao
* @Date:   2017-10-26 14:21:31
* @Last Modified by:   chenzexiao
* @Last Modified time: 2017-10-26 14:55:51
*/
function validate_account(account,alerttxt)
{
  if (account==null||account=="")
    {
     alert(alerttxt);
     return false;
    }
  else {return true}

}
function validate_psw(psw,alerttxt)
{
  if (psw==null||psw=="")
    {
     alert(alerttxt);
     return false;
    }
  else {return true}
}
function validate_form()
{
  var account=$("#account").val(); //alert(account);
  var password=$("#password").val(); //alert(password);
  if (validate_account(account,"请填写您的账号!")==false)
    {$("#account").focus();return false}
  else if(validate_psw(password,"请填写您的密码!")==false)
  	{$("#password").focus();return false}
  else
    { 
      // $.getJSON("./js/json/validate1.json", function(data) {
      //               if (data.code == "200") {
      //                    location.href="index.html"
      //               }
      //               else if(data.code == "500"){
      //                    alert('帐号或密码错误');
      //               }
      //               else{
      //                    alert("服务器异常");
      //               }
      //           })
    var info = new Object();  //alert(info);
    info.userName = $("#account").val();  //alert(info.username);
    info.password = $("#password").val();  //alert(info.password);  
     $.ajax({
       type: 'post',
       url: '/fieldManagement/admin/login',
       data: JSON.stringify(info),
       async: true,
       contentType: "application/json",
       dateType: "json",
       success: function(data){
        if (data.code == "200"){
           location.href='./index.html';
        }
        else if(data.code == "500"){
        alert('帐号或密码错误');
        }
     },
       error: function(){
        alert('服务端异常');
        }
    })

      return true;
  } 
}