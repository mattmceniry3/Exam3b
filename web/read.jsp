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
        
        <div class="wrap">
            
        <%@ include file ="includes2/Header.jsp" %>
        
        <%@ include file ="includes2/Menu.jsp" %>
                
        <div class="main">
        
        <h1>Customer Details Database</h1>
        <%= table %>
        
        <br><br>
        
        </div>
        
        <%@ include file="includes2/Footer.jsp" %>
        
        </div>
        
    </body>
</html>
