<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 动感张哥
  Date: 2019/4/8
  Time: 9:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<c:forEach items="${requestScope.list}" var="b">
    编号:${b.id}</br>
    书名:${b.name}</br>
    作者:${b.author}</br>
</c:forEach>
</body>
</html>

