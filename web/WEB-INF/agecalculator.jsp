<%-- 
    Document   : agecalculator
    Created on : Sep 21, 2020, 11:06:07 AM
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
        <h1>Age Calculator</h1>
        <form action="age" method="post">
           <table>
               <tr><td><p>Enter your age:</p></td><td><input type="text" name="age" value=""></td></tr>
        </table>
            
            <br>
            <input type="submit" value="Age next birthday">
            <br>
            <p>${message}</p>
            <a href="http://localhost:8084/Week2Lab_Calculators/arithmetic">Arithmetic Calculator</a>
        </form>
        
    </body>
</html>
