<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/14/2022
  Time: 11:09 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form method="post" action="/tinh">
    <table class="table table-striped table-inverse table-responsive">
        <thead class="thead-inverse">
        <tr>
            <th colspan="2">a</th>
            <th colspan="2">b</th>

        </tr>
        <tr>
            <th colspan="2"><input value="${a}" name="a" type="number"></th>
            <th colspan="2"><input value="${b}" name="b" type="number"></th>

        </tr>
        </thead>
        <tbody>

        <tr>
            <td><input type="submit" value="cong" name="tinh"></td>
            <td><input type="submit" value="tru" name="tinh"></td>
            <td><input type="submit" value="nhan" name="tinh"></td>
            <td><input type="submit" value="chia" name="tinh"></td>
        </tr>
        <tr>

            <td colspan="4"><input type="text" value="${ketqua}" ></td>
        </tr>

        </tbody>
    </table>
</form>


</body>
</html>
