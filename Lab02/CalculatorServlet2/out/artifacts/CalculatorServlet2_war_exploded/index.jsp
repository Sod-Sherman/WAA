<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Calculate</title>
</head>
<body>
<form action="calculate" method="post">
    <input type="text" name="num1" size="2" value="${ourNumber.num1}"/>+
    <input type="text" name="num2" value="${ourNumber.num2}" size="2"/>=
    <input type="text" name="sum" value="${ourNumber.sum}" size="2" readonly/><br/>
    <input type="text" name="num3" value="${ourNumber.num3}" size="2"/>*
    <input type="text" name="num4" value="${ourNumber.num4}" size="2"/>=
    <input type="text" name="product" value="${ourNumber.product}" size="2" readonly/><br/>
    <input type="submit" value="Submit"/>

</form>
<p>
    ${errors}
</p>
</body>
</html>