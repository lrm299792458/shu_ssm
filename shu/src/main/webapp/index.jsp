<%--
  Created by IntelliJ IDEA.
  User: z'ca
  Date: 2022/1/6
  Time: 14:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>登录页面</title>

    <link rel="stylesheet" href="css/log_style.css">
    <link rel="stylesheet" type="text/css" href="utils/iconfont/iconfont.css" />
</head>

<body>
<form action="account/login">
    <div class="dowebok">
        <div class="logo"><img src="images/sign.png" alt=""></div>
        <div class="form-item">
            <input  name="num" type="text" autocomplete="off" placeholder="账号">
            <i class="denglu iconfont icon-denglu-copy"></i>
        </div>
        <div class="form-item">
            <input id="pwd" name="pwd" type="password" autocomplete="off" placeholder="登录密码">
            <i class="mima iconfont icon-mima"></i>
        </div>
        <div class="form-item"><button id="submit">登 录</button></div>

        <div class="type"><input type="radio" name="ty" checked>学生 &nbsp;&nbsp;&nbsp;&nbsp; <input type="radio" name="ty"> 管理员 </div>

        <div class="reg-bar">
            <a class="reg" href="account/resign">立即注册</a>
            <a class="forget" href="javascript:">忘记密码</a>
        </div>
    </div>
</form>
</body>
</html>
