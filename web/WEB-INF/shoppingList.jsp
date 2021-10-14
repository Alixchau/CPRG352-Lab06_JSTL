<%-- 
    Document   : shoppingList
    Created on : 13-Oct-2021, 4:45:38 PM
    Author     : Alix
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopping List</title>
    </head>
    <body>
        <h1>Shopping List</h1>
        <p>Hello, ${userName}</p>
        <p><a href="ShoppingList?action=logout">Logout</a></p>
        
        <form method="POST" action="">
            <h2>Add Item</h2>
            <input type="text" name="cart_item">
            <input type="hidden" name="action" value="add">
            <input type="submit" value="Add Item">
        </form>
        
        <form method="POST" action="">
            <ul>
                <c:forEach var="item" items="${cartItems}">
                    <li><input type="radio" name="cart_item" value="${item}"></li>
                </c:forEach>
            </ul>
            <input type="submit" value="Delete">  
            <input type="hidden" name="action" value="delete">
        </form>
    </body>
</html>
