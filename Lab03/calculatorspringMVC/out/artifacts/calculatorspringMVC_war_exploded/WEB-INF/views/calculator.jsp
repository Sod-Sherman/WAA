<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Calculator Spring MVC</title>
</head>
<body>
<div>
    <form action="calculate" method="post">
        <input type="text" name="num1" size="2" value="${calculator.num1}"/>+
        <input type="text" name="num2" value="${calculator.num2}" size="2"/>=
        <input type="text" name="sum" value="${sum}" size="2" readonly/><br/>
        <input type="text" name="num3" value="${calculator.num3}" size="2"/>*
        <input type="text" name="num4" value="${calculator.num4}" size="2"/>=
        <input type="text" name="product" value="${product}" size="2" readonly/><br/>
        <input type="submit" value="Submit"/>

    </form>
    <p>
        ${errors}
    </p>
</div>
</body>
</html>