<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <script src="jquery-2.2.4.min.js" type="text/javascript"></script>
</head>
<script>
    function loginSystem()
    {
//        $.post("http://localhost:8080/rest/doLogin",
//        {
//            "nameLogin":"admin@qq.com",
//            "pwdLogin":"admin",
//        },function(data){
//            console.log(data);
//        },"json");

        $.ajax({
            url:"http://localhost:8080/rest/doLogin",
            contentType: "application/json; charset=utf-8",
            dataType:"json", //返回的数据类型,text 或者 json数据，建议为json
            type:"post", //传参方式，get 或post
            data:JSON.stringify({
                "nameLogin":"admin@qq.com",
                "pwdLogin":"admin"}),
             //传过去的参数，格式为 变量名：变量值
            success: function(text) { //若Ajax处理成功后的回调函数，text是返回的页面信息
                alert("Ajax处理已成功：" + text);
            },
            error: function(msg){  //若Ajax处理失败后回调函数，msg是返回的错误信息
                alert( "Ajax跳转处理失败");
            }
        });
    }

    function queryById()
    {
        $.ajax({
            url:"http://localhost:8080/rest/project/msg/queryById",
            contentType: "application/json; charset=utf-8",
            dataType:"json", //返回的数据类型,text 或者 json数据，建议为json
            type:"post", //传参方式，get 或post
            data:JSON.stringify({

                "startPage":"1",
                "rows":"2"
            }),
            //传过去的参数，格式为 变量名：变量值
            success: function(text) { //若Ajax处理成功后的回调函数，text是返回的页面信息
                alert("Ajax处理已成功：" + text);
            },
            error: function(msg){  //若Ajax处理失败后回调函数，msg是返回的错误信息
                alert( "Ajax跳转处理失败");
            }
        });
    }

    function queryBy()
    {
        $.ajax({
            url:"http://localhost:8080/rest/project/msg/launchProject/queryBy",
            contentType: "application/json; charset=utf-8",
            dataType:"json", //返回的数据类型,text 或者 json数据，建议为json
            type:"post", //传参方式，get 或post
            data:JSON.stringify({
                "startPage":"1",
                "rows":"10"
            }),
            //传过去的参数，格式为 变量名：变量值
            success: function(text) { //若Ajax处理成功后的回调函数，text是返回的页面信息
                alert("Ajax处理已成功：" + text);
            },
            error: function(msg){  //若Ajax处理失败后回调函数，msg是返回的错误信息
                alert( "Ajax跳转处理失败");
            }
        });
    }

    function queryByIdFollow()
    {
        $.ajax({
            url:"http://localhost:8080/rest/project/msg/followProject/queryByIdFollow",
            contentType: "application/json; charset=utf-8",
            dataType:"json", //返回的数据类型,text 或者 json数据，建议为json
            type:"post", //传参方式，get 或post
            data:JSON.stringify({
                "startPage":"1",
                "rows":"10"
            }),
            //传过去的参数，格式为 变量名：变量值
            success: function(text) { //若Ajax处理成功后的回调函数，text是返回的页面信息
                alert("Ajax处理已成功：" + text);
            },
            error: function(msg){  //若Ajax处理失败后回调函数，msg是返回的错误信息
                alert( "Ajax跳转处理失败");
            }
        });
    }

</script>
<body>

<input type="button" value="测试token" id="testButton" onclick="loginSystem()">
<input  type="button" onclick="queryById()" value="支持">
<input  type="button" onclick="queryBy()" value="发起">
<input  type="button" onclick="queryByIdFollow()" value="关注">
</body>
</html>
