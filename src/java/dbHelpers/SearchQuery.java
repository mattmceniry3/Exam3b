package dbHelpers;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Customers;

public class SearchQuery {
    
    private Connection conn;
    private ResultSet results;
    
    public SearchQuery(){
        
        Properties props = new Properties(); //MWC
    InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    String driver = props.getProperty("driver.name");
    String url = props.getProperty("server.name");
    String username = props.getProperty("user.name");
    String passwd = props.getProperty("user.password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public void doSearch(String Name){
        
        try {
            String query = "SELECT * FROM customers WHERE (UPPER (FirstName) LIKE ? ORDER BY CustID ASC) or (SELECT * FROM customers WHERE UPPER (LastName) LIKE ? ORDER BY CustID ASC)";
            
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, "%" + Name.toUpperCase() + "%");
            this.results = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String getHTMLtable(){
        
        String table = "";
        
        table += "<table border=1>";
        
        table += "<th>";
        table += "Customer ID";
        table += "</th>";
        
        table += "<th>";
        table += "First Name";
        table += "</th>";
        
        table += "<th>";
        table += "Last Name";
        table += "</th>";
        
        table += "<th>";
        table += "Address 1";
        table += "</th>";
        
        table += "<th>";
        table += "Address 2";
        table += "</th>";
        
        table += "<th>";
        table += "City";
        table += "</th>";
        
        table += "<th>";
        table += "State";
        table += "</th>";
        
        table += "<th>";
        table += "Zip Code";
        table += "</th>";
        
        table += "<th>";
        table += "Email Address";
        table += "</th>";
        
        table += "<th>";
        table += "Update & Delete";
        table += "</th>";
        
        try {
            while(this.results.next()){
                
                Customers customers = new Customers();
                customers.setCustID(this.results.getInt("CustID"));
                customers.setFirstName(this.results.getString("FirstName"));
                customers.setLastName(this.results.getString("LastName"));
                customers.setAddr1(this.results.getString("Addr1"));
                customers.setAddr2(this.results.getString("Addr2"));
                customers.setCity(this.results.getString("City"));
                customers.setState1(this.results.getString("State1"));
                customers.setZip(this.results.getString("Zip"));
                customers.setEmailAddr(this.results.getString("EmailAddr"));
                
                table += "<tr>";
                table += "<td>";
                table += customers.getCustID();
                table += "</td>";
                
                table += "<td>";
                table += customers.getFirstName();
                table += "</td>";
                
                table += "<td>";
                table += customers.getLastName();
                table += "</td>";
                
                table += "<td>";
                table += customers.getAddr1();
                table += "</td>";
                
                table += "<td>";
                table += customers.getAddr2();
                table += "</td>";
                
                table += "<td>";
                table += customers.getCity();
                table += "</td>";
                
                table += "<td>";
                table += customers.getState1();
                table += "</td>";
                
                table += "<td>";
                table += customers.getZip();
                table += "</td>";
                
                table += "<td>";
                table += customers.getEmailAddr();
                table += "</td>";
                
                table += "<td>";
                table += "<a href=update?CustID=" + customers.getCustID() + "> Update </a>" + "<a href=delete?CustID=" + customers.getCustID() + "> Delete </a>";
                table += "</td>";
                
                table += "</tr>";  
            }
        } catch (SQLException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        table += "</table>";
        
                return table;
    }
    
}