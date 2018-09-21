<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Главная страница</title>
</head>
<body>
<h1>Список всех контактов</h1>
<div id ="all">
    <c:set var="count" value="0" scope="application" />
    <c:forEach items="${kontakts}" var="k">
        <div>
            <p>${k.name} </p>
        </div>

        <div>
             <p>${k.email} </p>
        </div>

        <div>
            <p>${k.phone} </p>
        </div>
        <form action="/" method="post">
            <button name ="index" value="${count}">Удалить</button>
        </form>
        <hr>

        <c:set var="count" value="${count=count+1}" scope="application" />
    </c:forEach>
</div>

<a id="btn" href = "/form">Добавить контакт!</a>
<script>

</script>
</body>
</html>
