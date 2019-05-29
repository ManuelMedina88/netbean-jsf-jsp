<%-- 
    Document   : resultQuery
    Created on : 22-may-2019, 20:53:42
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
        <%@page import="business.*" %>
        <%
            Product product = (Product)request.getAttribute("attrProdu");
        %>
        <h1>Result of the query</h1>
        
        <table cellpadding="3" cellspacing="3" border="1">
            
            <tr>
                <td align="right">Key:</td>
                <td><%=product.getKey()%></td>
            </tr>
            <tr>
                <td align="right">Name:</td>
                <td><%=product.getName()%></td>
            </tr>
            <tr>
                <td align="right">Price:</td>
                <td><%= product.getPrice()%></td>
            </tr>
            <tr>
                <td align="right">Quantity:</td>
                <td><%= product.getQuantity()%></td>
            </tr>
        </table>
        <form action="queryProduct.jsp" method="POST">
            <input type="submit" value="Return">
        </form>
    </body>
</html>
