<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add A New Customer</title>
        <link rel=StyleSheet href="style.css" type="text/css">
    </head>
    
    <body>
        <h1>Add A New Customer</h1>
        <hr></hr>
        <form name="addForm" action="addCustomers" method="post">
        
            <label>First Name:</label>
                <input type="text" name="FirstName" value="" size="50" required />
                <br>
            <label>Last Name:</label>
                <input type="text" name="LastName" value="" size="50" required />
                <br>
            <label>Address 1</label>
                <input type="text" name="Addr1" value="" size="50" required />
                <br>
            <label>Address 2</label>
                <input type="text" name="Addr2" value="" size="50" required />
                <br>
            <label>City</label>
                <input type="text" name="City" value="" size="50" required />
                <br>
            <label>State</label>
                <input type="text" name="State1" value="" size="2" required />
                <br>    
            <label>Zip Code</label>
                <input type="text" name="Zip" value="" size="5" required />
                <br>    
            <label>Email Address</label>
                <input type="text" name="EmailAddr" value="" size="50" required />
                <br>
                
            <input type="reset" value="Clear" name="clear">
            <input type="submit" value="Submit" name="submit">
            
            
        </form>
        
    </body>
</html>
