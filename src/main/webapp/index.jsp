<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <script src="jquery-2.2.4.min.js" type="text/javascript"></script>
</head>
<script>
    function loginSystem()
    {
        $.ajax({
            url:"http://localhost:8080/rest/user/doLogin",
            contentType: "application/json; charset=utf-8",
            dataType:"json", //返回的数据类型,text 或者 json数据，建议为json
            type:"post", //传参方式，get 或post
            data:JSON.stringify({
                "nameLogin":"admin@qq.com",
                "pwdLogin":"admin"}),
            //传过去的参数，格式为 变量名：变量值
            success: function(text) { //若Ajax处理成功后的回调函数，text是返回的页面信息
                alert("Ajax处理已成功：" + text);
                var jsonText=JSON.stringify(text)
                document.write(jsonText);
            },
            error: function(msg){  //若Ajax处理失败后回调函数，msg是返回的错误信息
                alert( "Ajax跳转处理失败");
            }
        });
    }
    //修改用户信息
    function updateUserInfo()
    {
        $.ajax({
            url:"http://localhost:8080/rest/user/update",
            contentType: "application/json; charset=utf-8",
            dataType:"json", //返回的数据类型,text 或者 json数据，建议为json
            type:"post", //传参方式，get 或post
            data:JSON.stringify({
                "userId":"2",
                "realName":"nidaye",
                "nickName":"3",
                "idCardNo":"4",
                "headImg":"3"
            }),
            //传过去的参数，格式为 变量名：变量值
            success: function(text) { //若Ajax处理成功后的回调函数，text是返回的页面信息
                alert("Ajax处理已成功：" + text);
                var jsonText=JSON.stringify(text)
                document.write(jsonText);
            },
            error: function(msg){  //若Ajax处理失败后回调函数，msg是返回的错误信息
                alert( "Ajax跳转处理失败");
            }
        });
    }
    //修改收货地址
    function updatePostAddress()
    {
        $.ajax({
            url:"http://localhost:8080/rest/user/postAddress/update",
            contentType: "application/json; charset=utf-8",
            dataType:"json", //返回的数据类型,text 或者 json数据，建议为json
            type:"post", //传参方式，get 或post
            data:JSON.stringify({
                "userId":"2",
                "postCode":"4444",
                "postUser":"zs123",
                "mobile":"13127158259",
                "provinceId":"3",
                "countyId":"3",
                "addressDetail":"艾欧尼亚"
            }),
            //传过去的参数，格式为 变量名：变量值
            success: function(text) { //若Ajax处理成功后的回调函数，text是返回的页面信息
                alert("Ajax处理已成功：" + text);
                var jsonText=JSON.stringify(text)
                document.write(jsonText);
            },
            error: function(msg){  //若Ajax处理失败后回调函数，msg是返回的错误信息
                alert( "Ajax跳转处理失败");
            }
        });
    }
    //添加收货地址
    function insertPostAddress()
    {
        $.ajax({
            url:"http://localhost:8080/rest/user/postAddress/insert",
            contentType: "application/json; charset=utf-8",
            dataType:"json", //返回的数据类型,text 或者 json数据，建议为json
            type:"post", //传参方式，get 或post
            data:JSON.stringify({
                "userId":"2",
                "postCode":"3",
                "postUser":"zs123",
                "mobile":"13127158259",
                "provinceId":"3",
                "countyId":"3",
                "addressDetail":"德玛西亚"
            }),
            //传过去的参数，格式为 变量名：变量值
            success: function(text) { //若Ajax处理成功后的回调函数，text是返回的页面信息
                alert("Ajax处理已成功：" + text);
                var jsonText=JSON.stringify(text)
                document.write(jsonText);
            },
            error: function(msg){  //若Ajax处理失败后回调函数，msg是返回的错误信息
                alert( "Ajax跳转处理失败");
            }
        });
    }
    //分页查询
    function pageList()
    {
        $.ajax({
            url:"http://localhost:8080/rest/user/postAddress/pageList",
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
                var jsonText=JSON.stringify(text)
                document.write(jsonText);
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
<input type="button" value="修改用户信息"id="updateUserInfo" onclick="updateUserInfo()">
<input type="button" value="添加收货地址"id="insertPostAddress"onclick="insertPostAddress()">
<input type="button" value="修改收货地址"id="updatePostAddress" onclick="updatePostAddress()">
<input type="button" value="分页查询收货地址" onclick="pageList()">
</body>
</html>
