<%--
  Created by IntelliJ IDEA.
  User: sdblg
  Date: 9/30/2019
  Time: 11:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--<%@ page isELIgnored="false" %>--%>
<html>
<head>
    <title>Hello</title>
</head>
<body>
<c:choose>
    <div style="background-color: peachpuff">
        <c:when test="${ourNumber.num0 == ourNumber.num1}">
            <p style="color: brown; font-size: large">And the results are:</p>
            <p style="color: blue; font-size: medium">The number ${ourNumber.num0} is equal to ${ourNumber.num1}</p>
        </c:when>

        <c:when test="${ourNumber.num0 < ourNumber.num2}">

            <p style="color: brown; font-size: large">And the results are:</p>
            <p style="color: green; font-size: medium">The number ${ourNumber.num0} is greater than ${ourNumber.num2}</p>

        </c:when>

        <c:when test="${ourNumber.num0 > ourNumber.num3}">

            <p style="color: brown; font-size: large">And the results are:</p>
            <p style="color: red; font-size: medium">The number ${ourNumber.num0} is less than ${ourNumber.num3}</p>
        </c:when>
    </div>
</c:choose>

<%--<p style="background-color: peachpuff">--%>
<%--    <c:choose>--%>
<%--        <c:when test="ourNumber.num0">--%>

<%--        </c:when>--%>
<%--    </c:choose>--%>
<%--</p>--%>

</body>
</html>
