<%-- 
    Document   : register
    Created on : 13-Oct-2021, 4:45:26 PM
    Author     : Alix
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <body>
        <h1>Shopping List</h1>
        <form method="POST" action="ShoppingList">
            <input type="text" name="user_name">
            <input type="hidden" name="action" value="register">
            <input type="submit" value="Register">
        </form>
    </body>
</html>
