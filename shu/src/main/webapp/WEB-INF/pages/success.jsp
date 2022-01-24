<%--
  Created by IntelliJ IDEA.
  User: z'ca
  Date: 2022/1/6
  Time: 19:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>首页</title>
    <!-- 字体图标 -->
    <link href="https://cdn.bootcdn.net/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <link rel="stylesheet" href="../css/hello_style.css">
</head>

<body>
<div class="navbar">
    <input type="checkbox" id="checkbox">
    <label for="checkbox">
        <i class="fa fa-bars" aria-hidden="true"></i>
    </label>
    <ul>
        <li>
            <img src="../images/sign.png" alt="" style="float: left;" class="image">
            <span class="fc">欢迎您! 管理员</span>
        </li>
        <li>
            <a href="javascript:void(0)">
                <i class="fa fa-home" aria-hidden="true"></i>
                <span>后台首页</span>
            </a>
        </li>
        <li>
            <a href="javascript:void(0)">
                <i class="fa fa-id-card-o" aria-hidden="true"></i>
                <span>学生信息</span>
            </a>
        </li>
        <li>
            <a href="javascript:void(0)">
                <i class="fa fa-id-card" aria-hidden="true"></i>
                <span>管理员信息</span>
            </a>
        </li>
        <li>
            <a href="javascript:void(0)">
                <i class="fa fa-id-card" aria-hidden="true"></i>
                <span>其他功能</span>
            </a>
        </li>
    </ul>
    <div class="info">
        <div class="gongao">
                <span>
                    这里是公告框
                </span>
        </div>
        <div class="zon">
                <span>
                    做一个总的数据统计，图形化
                </span>
        </div>
        <div class="else">
                <span>
                    杂七杂八的东西
                </span>
        </div>
    </div>

</div>
</body>
</html>
