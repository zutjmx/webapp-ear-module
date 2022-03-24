<%@page contentType = "text/html" pageEncoding="UTF-8" %>
<%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Lista de Usuarios</title>
</head>
<body>
    <h3>Lista de Usuarios</h3>
    <ul>
        <c:forEach items="${usuarios}" var = "u">
            <li>${u.username}</li>
        </c:forEach>
    </ul>
</body>
</html>