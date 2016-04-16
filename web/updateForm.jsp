<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Customers"%>
<% Customers customers = (Customers) request.getAttribute("customers"); %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update A Customer</title>
        <link rel=StyleSheet href="style.css" type="text/css">
    </head>
    <body>
        
        <div class="wrap">
            
        <%@ include file="includes2/Header.jsp" %>
        
        <%@ include file="includes2/Menu.jsp" %>
            
        <div class="main">
        
        <h1>Update A Customer</h1>
        
        <hr></hr>
        <form name="updateForm" action="updateCustomers" method="get">
            
            <label>ID:</label>
                <input type="number" name="CustID" value="<%= customers.getCustID() %>" size="38" readonly />
                <br>
            <label>First Name:</label>
                <input type="text" name="FirstName" value="<%= customers.getFirstName() %>" size="50" required />
                <br>
            <label>Last Name:</label>
                <input type="text" name="LastName" value="<%= customers.getLastName() %>" size="50" required />
                <br>
            <label>Address 1:</label>
                <input type="text" name="Addr1" value="<%= customers.getAddr1() %>" size="50" required />
                <br>
            <label>Address 2:</label>
                <input type="text" name="Addr2" value="<%= customers.getAddr2() %>" size="50" required />
                <br>
            <label>City:</label>
                <input type="text" name="City" value="<%= customers.getCity() %>" size="50" required />
                <br>
            <label>State:</label>
                <input type="text" name="State1" value="<%= customers.getState1() %>" size="2" required />
                <br>
            <label>Zip Code:</label>
                <input type="text" name="Zip" value="<%= customers.getZip() %>" size="5" required />
                <br>
            <label>Email Address:</label>
                <input type="text" name="EmailAddr" value="<%= customers.getEmailAddr() %>" size="50" required />
                <br>
            <input type="reset" value="Clear" id="clear">
            <input type="submit" value="Update" id="submit">
            
        </form>
                
        </div>
                
        <%@ include file="includes2/Footer.jsp" %>
        
        </div>
            
        
    </body>
</html>
