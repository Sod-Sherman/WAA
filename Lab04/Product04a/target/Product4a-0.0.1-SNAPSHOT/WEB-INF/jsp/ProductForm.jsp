<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE HTML>
<html lang="mn">
<head>
    <meta charset="UTF-8">
    <title>Add Product Form</title>
    <style type="text/css">@import url(css/main.css);</style>
</head>
<body>

<div id="global">
    <form:form action="product" modelAttribute="product">
        <fieldset>
            <legend><spring:message code="addProduct"/></legend>
            <p>
                <label for="category"><spring:message code="category"/></label>
                <form:select id="category" path="category.id" items="${categories}" itemLabel="name" itemValue="id" />
            </p>

            <p>
                <label for="name"><spring:message code="productName"/></label>
                <form:input type="text" id="name" path="name" tabindex="1"/>
            </p>
            <p>
                <label for="description"><spring:message code="description"/>: </label>
                <form:input path="description" type="text" id="description" tabindex="2"/>
            </p>
            <p>
                <label for="price"><spring:message code="price"/>: </label>
                <form:input path="price" type="text" id="price" name="price" tabindex="3"/>
            </p>
            <p id="buttons">
                <input id="reset" type="reset" tabindex="4"/>
                <input id="submit" type="submit" tabindex="5"
                       value="Add Product"/>
            </p>
        </fieldset>
    </form:form>
</div>
</body>
</html>
