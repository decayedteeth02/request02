<%--
  Created by IntelliJ IDEA.
  User: HYZ
  Date: 2021/12/2
  Time: 11:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h2>简单参数演示</h2>
<form action="${pageContext.request.contextPath}/params01" method="post">
<input name="username" type="text"> <p></p>
<input type="submit" value="提交">
</form>

<h2>复杂参数演示</h2>
<form action="${pageContext.request.contextPath}/params02" method="post">
    id<input name="id" type="text"> <p></p>
    名字:<input name="name" type="text"> <p></p>
    <input type="submit" value="提交">
</form>


</body>
</html>
