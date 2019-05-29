<%-- 
    Document   : showRegister
    Created on : 11-may-2019, 14:09:00
    Author     : Alfredo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@page import="business.*"%>
        <% Product product = (Product) request.getAttribute("attribProduct");%>
        <h1>Show registered data</h1>
        <p>The following data have been saved:</p>
        
        <table cellspacing="3" cellpadding="3" border="1">
            <tr>
                <td align="right">Key:</td>
                <td align="left"><%= product.getKey()%></td>
            </tr>
            <tr>
                <td align="right">Name:</td>
                <td align="left"><%= product.getName()%></td>
            </tr>
            <tr>
                <td align="right">Price:</td>
                <td align="left"><%= product.getPrice()%></td>
            </tr>
            <tr>
                <td align="right">Quantity:</td>
                <td align="left"><%= product.getQuantity()%></td>
            </tr>
            
        </table>
            <form action="index.jsp">
                <input type="submit" value="Return">
            </form>
        
    </body>
</html>
