<%--
  Created by IntelliJ IDEA.
  User: z'ca
  Date: 2022/1/6
  Time: 14:30
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>查询所有信息成功</h3>
    <c:forEach items="${list}" var="account">
        ${account.num}
    </c:forEach>
</body>
</html>
