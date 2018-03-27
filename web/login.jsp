<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/27 0027
  Time: 上午 11:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
       <form action="/Login" method="post">
           用户名:<input type="text" name="user"/>
           密码:<input type="password" name="password"/>
            <input type="submit" value="登录"/>
       </form>
</body>
</html>
