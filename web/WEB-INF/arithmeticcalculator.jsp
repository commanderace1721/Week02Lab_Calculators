<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 22, 2020, 9:09:58 AM
    Author     : 826847
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method="post">
            <table>
            <tr><td>First: </td><td><input type="text" name="first_number" value="${first_number}"</td></tr>
            <tr><td>Second: </td><td><input type="text" name="second_number" value="${second_number}"</td></tr>
        </table>
        <input type="submit" value="+" name="sign"><input type="submit" value="-" name="sign"><input type="submit" value="*" name="sign"><input type="submit" value="%" name="sign">
        </form>
        <p>Result: ${message}</p>
        <a href="age">Age Calculator</a>
        
        
    </body>
</html>
