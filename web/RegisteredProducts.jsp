<%-- 
    Document   : RegisteredProducs.jsp
    Created on : 11-may-2019, 18:55:59
    Author     : Alfredo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Products</title>
    </head>
    <body>
        <%@ page import="business.Product, java.util.ArrayList" %>
        <h1>The products that are registered are: </h1>
        <%
            ArrayList<Product> products = null;
            
            products = (ArrayList<Product>) request.getAttribute("Products");
            String count = (String) request.getAttribute("Counter");
            int registerCount = Integer.parseInt(count);
        %>
        
        <table cellspacing="3" cellpadding="3" border="1">
            <thead>
                <tr>
                    <th align="center">Key Product</th>
                    <th align="center">Name</th>
                    <th align="center">Price</th>
                    <th align="center">Quantity</th>
                </tr>
             </thead>
              <tbody>
                <%
                    for(Product product: products){
                %>
                
                <tr valign="top">
                   <td><%= product.getKey()%></td> 
                   <td><%= product.getName()%></td> 
                   <td><%= product.getPrice()%></td> 
                   <td><%= product.getQuantity()%></td> 
                </tr> 
                <%}%>
            </tbody>
            <% products.clear();%>
        </table>
        
        <p> Number of registers : <%= registerCount%></p>
        <br>
        <form action="index.jsp" method="POST">
            <input type="submit" value="Return">
        </form>
    </body>
</html>
