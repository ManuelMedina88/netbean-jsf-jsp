<%-- 
    Document   : queryProduct
    Created on : 22-may-2019, 20:10:34
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
        <h1>Query a product</h1>
        <h2>To find a resultset insert:</h2>
        <form action="querry" method="POST">
            <table cellpadding="3" cellspacing="3" border="1">
                <tr>
                    <td align="right">Key:</td>
                    <td><input type="text" name="id"></td>
                </tr>
                <tr>
                    <td align="right">Name:</td>
                    <td><input type="text" name="name"></td>
                </tr>
            </table>
            <input type="reset" value="Reset">
            <input type="submit" value="Query">
        </form>
        
        <form action="index.jsp" method="POST">
            <input type="submit" value="Return">
        </form>
        
    </body>
</html>
