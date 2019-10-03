<%--
  Created by IntelliJ IDEA.
  User: sdblg
  Date: 9/30/2019
  Time: 8:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title></title>
</head>
<body>
<h2>${status}</h2>
<%--<c:if test="${ask == true}">--%>
    <h3>Welcome ${user.name}!</h3>

    <form action="advice" method="post">
        <select name="category">
            <option value="">--Choose Roast--</option>
            <c:forEach var="category" items="${categories}">
            <option value="${category.id}">${category.name}</option>
            </c:forEach>

        </select>
        <br/>
        <input type="submit" value="Submit"/>
    </form>
<%--</c:if>--%>

<c:if test="${coffees != null}">
    Advice for ${coffee.category.name}:
    <ul>
    <c:forEach var="item" items="${coffees}">
            <li>
                ${item.name}
            </li>

    </c:forEach>
    </ul>
</c:if>

</body>
</html>
