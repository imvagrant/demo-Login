<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="org.apache.ibatis.session.SqlSessionFactory" %>
<%@ page import="com.song.utils.SqlSessionFactoryUtils" %>
<%@ page import="org.apache.ibatis.session.SqlSession" %>
<%@ page import="com.song.mapper.UserMapper" %>
<%@ page import="com.song.pojo.User" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 2022/6/6
  Time: 20:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>欢迎登陆</title>
</head>
<body>
<h1>${user.username},欢迎您！</h1>
    <br>
    <table border="1">
        <tr align="center">
            <td>序号</td>
            <td>用户名</td>
            <td>密码</td>
        </tr>
        <c:forEach items="${users}" var="users" varStatus="status">
            <tr align="center">
                <td>${users.id}</td>
                <td>${users.username}</td>
                <td>${users.password}</td>
            </tr>
        </c:forEach>


    </table>
</body>
</html>
