<%--
  Created by IntelliJ IDEA.
  User: xuanhung
  Date: 2019-08-15
  Time: 18:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
    <style>
        .errorMessage{
            color:red;
        }
    </style>
</head>
<body>
    <h1>Hello World</h1>
    <s:form action="say-hello">
        <s:textfield key="username" name="user.username"/>
        <s:submit value="Save"/>
    </s:form>
    <ul>
        <s:iterator value="listUser">
            <li><s:property value="username"/></li>
        </s:iterator>
    </ul>
</body>
</html>
