<%-- 
    Document   : listProducts
    Created on : 23-may-2019, 15:46:15
    Author     : Alfredo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List products</title>
    </head>
    <body>
        <%@ page import="java.util.ArrayList, business.*"%>
        <%
            ArrayList<Product> products = null;
            products = (ArrayList<Product>)request.getAttribute("products");
        %>
        <h1>List of products!</h1>
        
        <table cellspacing="3" cellpadding="3" border="1">
            <thead>
                <tr>
                    <td>Key</td>
                    <td>Name</td>
                    <td>Price</td>
                    <td>Quantity</td>
                </tr>
            </thead>
            <tbody>
                <%for(Product product: products){%>
                   
                <tr>
                    <td><%=product.getKey()%></td>
                    <td><%=product.getName()%></td>
                    <td><%=product.getPrice()%></td>
                    <td><%=product.getQuantity()%></td>
                </tr>
                
                <%}%>
            </tbody>
            
        </table>
        
        
    </body>
</html>
