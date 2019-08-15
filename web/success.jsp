<%--
  Created by IntelliJ IDEA.
  User: xuanhung
  Date: 2019-08-13
  Time: 18:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="so" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    Action success
    Email: <so:property value="currentUser.email"/><br>
    Username: <so:property value="currentUser.username"/><br>
    Password: <so:property value="currentUser.password"/><br>
</body>
</html>
