<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="ss" uri="/struts-dojo-tags" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Basic Struts 2 Application - Welcome</title>
</head>
<body>
<h1>Welcome To Struts 2!</h1>
<s:property value="userModel.cellphone"/>&emsp;${userModel.birth}
<s:form action="regist.action" method="POST" >
    <s:textfield name="loginName" label="用户名"/>
    <s:password name="password" label="密码"/>
    <s:textfield name="idCard" label="证件"/>
    <s:textfield name="cellphone" label="联系方式"/>
    <s:textfield name="birth" label="生日" />
    <%--<ss:datetimepicker format="yyyy-MM-dd" name="birth" label="生日"/>--%>
   <%-- <ss:datetimepicker name="birth" id="birth" displayFormat="yyyy-MM-dd" language="UTF-8" label="生日" />--%>
    <s:submit value="注册"/>
</s:form>
</body>
</html>