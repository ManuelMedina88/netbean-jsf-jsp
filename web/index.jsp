<%-- 
    Document   : index
    Created on : 11-may-2019, 11:41:30
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
        <h1>Hello, Supply the data of the product</h1>
        
        <form action="register" method="POST" autocomplete="off">
            
            <table cellspacing="3" cellpadding="3" border="1">
                <tr>
                    <td align="right">Key:</td>
                    <td><input type="text" name="id"></td>
                </tr>
                <tr>
                    <td align="right">Name:</td>
                    <td><input type="text" name="name"></td>
                </tr>
                <tr>
                    <td align="right">Price:</td>
                    <td><input type="text" name="price"></td>
                </tr>
                <tr>
                    <td align="right">Quantity:</td>
                    <td><input type="text" name="quantity"></td>
                </tr> 
            </table>
          <input type="reset" value="Reset">
          <input type="submit" value="Reqister">
        </form>
        <form action="queryProduct.jsp" method="POST">
            <input type="submit" value="Querry">
        </form>
        <form action="showProducts" method="POST">
            <input type="submit" value="View Products">
        </form>
    </body>
</html>
