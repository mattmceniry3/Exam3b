
package model;


public class Customers {
  
    private int CustID;
    private String FirstName;
    private String LastName;
    private String Addr1;
    private String Addr2;
    private String City;
    private String State1;
    private String Zip;
    private String EmailAddr;

    public Customers() {
        this.CustID = 0;
        this.FirstName = "";
        this.LastName = "";
        this.Addr1 = "";
        this.Addr2 = "";
        this.City = "";
        this.Zip = "";
        this.State1 = "";
        this.EmailAddr = "";
    }
    
    public Customers(int CustID, String FirstName, String LastName, String Addr1, String Addr2, String City, String State1, String Zip, String EmailAddr) {
        this.CustID = CustID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Addr1 = Addr1;
        this.Addr2 = Addr2;
        this.City = City;
        this.State1 = State1;
        this.Zip = Zip;
        this.EmailAddr = EmailAddr;
    }

    public int getCustID() {
        return CustID;
    }

    public void setCustID(int custID) {
        this.CustID = custID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        this.LastName = lastName;
    }

    public String getAddr1() {
        return Addr1;
    }

    public void setAddr1(String addr1) {
        this.Addr1 = addr1;
    }

    public String getAddr2() {
        return Addr2;
    }

    public void setAddr2(String addr2) {
        this.Addr2 = addr2;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        this.City = city;
    }

    public String getState1() {
        return State1;
    }

    public void setState1(String state1) {
        this.State1 = state1;
    }

    public String getZip() {
        return Zip;
    }

    public void setZip(String zip) {
        this.Zip = zip;
    }

    public String getEmailAddr() {
        return EmailAddr;
    }

    public void setEmailAddr(String emailAddr) {
        this.EmailAddr = emailAddr;
    }

    @Override
    public String toString() {
        return "Customers{" + "CustID=" + CustID + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Addr1=" + Addr1 + ", Addr2=" + Addr2 + ", City=" + City + ", State1=" + State1 + ", Zip=" + Zip + ", EmailAddr=" + EmailAddr + '}';
    }
    
    
    
}
