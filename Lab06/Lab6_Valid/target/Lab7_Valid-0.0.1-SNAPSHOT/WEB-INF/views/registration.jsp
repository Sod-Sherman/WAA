<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Registration</title>
    <style type="text/css">
        .error{
            color: red;
        }
    </style>
</head>
<body>
<form:form modelAttribute="student">
    <fieldset>
        <legend>Registration Form</legend>
        <p><form:errors path="*" cssClass="error"/></p>
        <label>First Name
            <form:input path="firstName"/><form:errors cssClass="error" path="firstName"/>
        </label><br/>
        <label>Last Name
            <form:input path="lastName"/><form:errors path="lastName" cssClass="error"/>
        </label><br/>
        <label>Email
            <form:input path="email"/><form:errors path="email" cssClass="error"/>
        </label><br/>
        <label>Gender
            <form:select path="gender">
                <form:option value="">Select gender</form:option>
                <form:options items="${genders}" />

            </form:select><form:errors path="gender" cssClass="error"/>
        </label><br/>
        <label>Birthday
            <form:input path="birthday"/><form:errors path="birthday" cssClass="error"/>
        </label><br/>
        <label>Phone (area code):
            <form:input path="phone.area"/><form:errors path="phone.area" cssClass="error"/>
        </label>
        <label>(prefix code):
            <form:input path="phone.prefix"/><form:errors path="phone.prefix" cssClass="error"/>
        </label>
        <label>(number):
            <form:input path="phone.number"/><form:errors path="phone.number" cssClass="error"/>
        </label><br/>

        <input type="submit" value="Register"/>

    </fieldset>

</form:form>


</body>
</html>