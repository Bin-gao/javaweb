<%--
  Created by IntelliJ IDEA.
  User: lbgao
  Date: 2022/2/27
  Time: 15:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%--这里提交的路径，需要找到项目的路径--%>
<%--${pageContext.request.contextPath} 代表当前项目 --%>
<body>
    <form action="${pageContext.request.contextPath}/login" method="get">
        用户名：<input type="text" name="username"><br>
        密码：<input type="password" name="password"> <br>
        <input type="submit">
    </form>
</body>
</html>
