<%--
  Created by IntelliJ IDEA.
  User: z'ca
  Date: 2022/1/18
  Time: 20:45
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<%--<head>--%>
<%--    <meta charset="UTF-8">--%>
<%--    <meta http-equiv="X-UA-Compatible" content="IE=edge">--%>
<%--    <meta name="viewport" content="width=device-width, initial-scale=1.0">--%>
<%--    <title>注册页面</title>--%>
<%--    <link rel="stylesheet" href="../css/sign_style.css" >--%>
<%--    <link rel="stylesheet" href="../html/iconfont/iconfont.css" >--%>
<%--</head>--%>

<%--<body>--%>
<%--<form action="register" method="post">--%>
<%--    <div class="dowebok">--%>
<%--        <div class="logo"><img src="../images/sign.png" alt=""></div>--%>
<%--        <div class="choice">--%>
<%--            <select name="" id="">--%>
<%--                <option value="">----注册类型----</option>--%>
<%--                <option value="">学生</option>--%>
<%--                <option value="">管理员</option>--%>
<%--            </select>--%>
<%--        </div>--%>
<%--        <div class="form-item">--%>
<%--            <input name="name" type="text" autocomplete="off" placeholder="用户名">--%>
<%--            <i class="denglu iconfont icon-denglu-copy"></i>--%>
<%--        </div>--%>
<%--        <div class="form-item">--%>
<%--            <input name="num" type="number" autocomplete="off" placeholder="账号">--%>
<%--            <i class="denglu iconfont icon-denglu-copy"></i>--%>
<%--        </div>--%>
<%--        <div class="form-item">--%>
<%--            <input name="email" type="email" autocomplete="off" placeholder="邮箱">--%>
<%--            <i class="denglu iconfont icon-youxiang"></i>--%>
<%--        </div>--%>
<%--        <div class="form-item">--%>
<%--            <input name="phone" type="tel" autocomplete="off" placeholder="手机号">--%>
<%--            <i class="denglu iconfont icon-dianhua"></i>--%>
<%--        </div>--%>
<%--        <div class="form-item">--%>
<%--            <input name="pwd" type="password" autocomplete="off" placeholder="登录密码">--%>
<%--            <i class="mima iconfont icon-mima"></i>--%>
<%--        </div>--%>
<%--        <div class="form-item">--%>
<%--            <input name="pwd" type="password" autocomplete="off" placeholder="确认密码">--%>
<%--            <i class="mima iconfont icon-mima"></i>--%>
<%--        </div>--%>
<%--        <div class="form-item"><button type="submit">注 册</button></div>--%>

<%--    </div>--%>
<%--</form>--%>
<%--</body>--%>

<%--</html>--%>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>注册页面</title>
    <link rel="stylesheet" href="../css/sign_style.css">
    <link rel="stylesheet" href="../utils/iconfont/iconfont.css">
</head>

<body>
<form action="../account/register">
    <div class="dowebok">
        <div class="logo"><img src="../images/sign.png" alt=""></div>
        <div class="choice">
            <select name="type" id="">
                <option value="1">学生</option>
                <option value="2">老师</option>
                <option value="3">管理员</option>
            </select>
        </div>
        <div class="form-item">
            <input id="username" type="text" autocomplete="off" placeholder="用户名">
            <i class="denglu iconfont icon-denglu-copy"></i>
        </div>
        <div class="form-item">
            <input id="num" name="num" type="tel" autocomplete="off" placeholder="账号">
            <i class="denglu iconfont icon-dianhua"></i>
        </div>
        <div class="form-item">
            <input id="mail" type="email" autocomplete="off" placeholder="邮箱">
            <i class="denglu iconfont icon-youxiang"></i>
        </div>
        <div class="form-item">
            <input id="tel" type="tel" autocomplete="off" placeholder="手机号">
            <i class="denglu iconfont icon-dianhua"></i>
        </div>
        <div class="form-item">
            <input id="psd" name="pwd" type="password" autocomplete="off" placeholder="登录密码">
            <i class="mima iconfont icon-mima"></i>
        </div>
        <div class="form-item">
            <input id="ppsd" type="password" autocomplete="off" placeholder="确认密码">
            <i class="mima iconfont icon-mima"></i>
        </div>
        <div class="form-item"><button id="submit" >注 册</button></div>
    </div>
</form>
</body>

</html>