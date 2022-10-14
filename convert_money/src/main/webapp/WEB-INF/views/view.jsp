<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/13/2022
  Time: 3:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Convert To Money</h1>
<form method="post">
    <input type="number" placeholder="Input usd to convert" name="usd">
    <input type="submit" value="Convert">
    <p>USD:${usd}</p>
    <p>VND:${vnd}</p>
</form>
</body>
</html>
