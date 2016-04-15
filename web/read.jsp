<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer Details Database</title>
        <link rel=StyleSheet href="style.css" type="text/css">
    </head>
    
    <% String table = (String) request.getAttribute("table"); %>
    
    <body>
        <h1>Customer Details Database</h1>
        <%= table %>
        
        <br><br>
        
        <a href ="add">Add New Customer</a>
        
    </body>
</html>
