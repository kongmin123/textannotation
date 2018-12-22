/**
 * Created by lenovo on 2018/12/4.
 */

$(function(){
    $("#sav-submit").click(function() {


        var uusername = $("#username").val();
        var upassword = $("#password").val();
        console.log(uusername);
        var user = {
            username: uusername,
            password: upassword
        };
        console.log(user);
        $.ajax({
            url: "/user/login",
            type: "post",
            traditional: true,
            contentType: "application/x-www-form-urlencoded; charset=UTF-8",
            dataType: "text",
            data: user,
            success: function (data) {
                console.log(data);
                if(data=="Ok"){
                    location.href = "/index.html";
                }else{
                    alert("mimacuowu");
                }
            },
            error: function (XMLHttpRequest, textStatus, errorThrown) {
                console.log(XMLHttpRequest.status);
                console.log(XMLHttpRequest.readyState);
                console.log(textStatus);

            },
        });
    });

});
