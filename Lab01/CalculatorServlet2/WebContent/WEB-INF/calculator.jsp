<%--
  Created by IntelliJ IDEA.
  User: sdblg
  Date: 9/30/2019
  Time: 2:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>

<form action="calc2" method="post">
    <input type="text" name="add1" size="2" value="${ourNumberForAdding.num1}"/>
    +
    <input type="text" name="add2" value="${ourNumberForAdding.num2}" size="2"/>
    =
    <input type="text" name="sum" value="${ourNumberForAdding.sum}" size="2" readonly/>
    <br/>

    <input type="text" name="mult1" value="${ourNumberForMultiply.num1}" size="2"/>
    *
    <input type="text" name="mult2" value="${ourNumberForMultiply.num2}" size="2"/>
    =
    <input type="text" name="product" value="${ourNumberForMultiply.product}" size="2" readonly/>
    <br/>
    <input type="submit" value="Submit"/>

</form>

</body>
</html>
