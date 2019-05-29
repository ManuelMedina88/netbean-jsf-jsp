<%-- 
    Document   : savedRegister
    Created on : 21-may-2019, 23:52:11
    Author     : Alfredo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <body>
        
        <%@page import="business.Product"%>
        <% 
            String id = request.getParameter("id");
            String name = request.getParameter("name");
            Double price = Double.parseDouble(request.getParameter("price"));
            int quantity = Integer.parseInt(request.getParameter("quantity"));
            
            Product product = new Product(id, name, price, quantity);
            
        %>
        <h1>Was registerd  Successful in the data base</h1>
        
        <table cellspacing="3" cellpadding="3" border="1">
            <tr>
                <td>Key:</td>
                <td><%= product.getKey()%></td>
            </tr>
            <tr>
                <td>Name:</td>
                <td><%= product.getName()%></td>
            </tr>
            <tr>
                <td>Price:</td>
                <td><%= product.getPrice()%></td>
            </tr>
            <tr>
                <td>Quantity:</td>
                <td><%= product.getQuantity()%></td>
            </tr>
        </table>
        <form action="index.jsp" method="GET" >
            <input type="submit" value="Return">
        </form>
    </body>
</html>
