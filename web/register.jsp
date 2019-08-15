<%--
  Created by IntelliJ IDEA.
  User: xuanhung
  Date: 2019-08-13
  Time: 18:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
    <style>
        .errorMessage {
            color:red;
        }
    </style>
</head>
<body>
<h1>Register</h1>
<s:if test="hasErrors()">
    <s:fielderror fieldName="currentUser.username"/>
</s:if>
<s:form action="store">
    <s:textfield name="currentUser.username" label="Username "/>
    <s:textfield name="currentUser.password" label="Password"/>
    <s:textfield name="currentUser.email" label="Email"/>
    <s:submit value="Submit"/>
</s:form>
</body>
</html>
