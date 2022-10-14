
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form method="post" action="/save">

    <input type="checkbox" value="lettuce" name="condiment"> lettuce
    <input type="checkbox" value="tomato" name="condiment"> tomato
    <input type="checkbox" value="mustard" name="condiment"> mustard
    <input type="checkbox" value="sprouts" name="condiment"> sprouts

    <input type="submit" value="Save">

    <h1>
        <c:forEach items="${condiment}" var="data">
            <input type="text" value="${data}">
        </c:forEach>
    </h1>

</form>


</body>
</html>
