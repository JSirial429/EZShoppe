<%-- 
    Document   : logIn
    Created on : Feb 15, 2020, 6:40:38 PM
    Author     : jslun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Log In EZ Shoppe</title>
    </head>
    <body>
        <form action=".jsp" method="post">
            
            <h1>Log In</h1>
            <br>
            
            <div>
                <table align="center">
                        <tr>
                            <td><label for="fName">First Name:</label></td>
                            <td><input type="text" id="fName" name="fName"></td>
                        </tr>
                        <tr>
                            <td><label for="lName">Last Name:</label></td>
                            <td><input type="text" id="lName" name="fName"></td>
                        </tr>
                        <tr>
                            <td><label for="addr">Address:</label></td>
                            <td><input type="text" id="addr" name="fName"></td>
                        </tr>
                        <tr>
                            <td><label for="email">Email:</label></td>
                            <td><input type="text" id="email" name="fName"></td>
                        </tr>
                        <tr>
                            <td><label for="password">Password:</label></td>
                            <td><input type="text" id="password" name="password"></td>
                        </tr>
                        <tr><td><input type="submit" value="submit"></td></tr>
                </table>
            </div>
            
        </form>
    </body>
</html>
