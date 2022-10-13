<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<table class="table table-striped table-inverse table-responsive">
    <thead class="thead-inverse">
    <tr>
        <th>Tiếng Anh</th>
        <th>Tiếng Việt</th>

    </tr>
    </thead>

    <tbody>
    <tr>
        <form action="/tra" method="post">

            <td><input type="text" placeholder="Tiếng việt" name="vie" value="${vie}"> </td>
            <td><input type="text" placeholder="Tiếng Anh " name="eng" value="${eng}"> </td>
            <td><input type="submit" > </td>

        </form>

    </tr>

    </tbody>
</table>
</body>
</html>
