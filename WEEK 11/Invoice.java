//STEP 1. Import required packages
import java.sql.*;
import java.util.*;
import java.util.Date;
import java.text.*;


public class Invoice{
 // JDBC driver name and database URL
static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
static final String DB_URL = "jdbc:mysql://localhost:3306/lab12?characterEncoding=latin1";

 //  Database credentials
 static final String USER = "root";
 static final String PASS = "virgo@2000";

 public static void main(String[] args) {
 Connection conn = null;
 Statement stmt = null;
 try{
    //STEP 2: Register JDBC driver
    Class.forName("com.mysql.jdbc.Driver");

    //STEP 3: Open a connection
    System.out.println("Connecting to a selected database...");
    conn = DriverManager.getConnection(DB_URL, USER, PASS);
    System.out.println("Connected database successfully...");

    //STEP 4: Execute a query
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Item-Name: ");
    String Name = sc.nextLine();
    System.out.println("Enter the quantity: ");
    int qty = sc.nextInt();
    System.out.println();
    stmt = conn.createStatement();

    String sql = "SELECT itemName, pricePerQuantity FROM list;";
    ResultSet rs = stmt.executeQuery(sql);

    while(rs.next()){
       if(rs.getString("itemName").equalsIgnoreCase(Name) ) {
          DateFormat df = new SimpleDateFormat("dd/MM/yy");
          Date dateobj = new Date();
          System.out.println("Date: " + df.format(dateobj));
          Random rand = new Random();
          int invoice = rand.nextInt(1000) + 1;
          System.out.println("Invoice No.: "+ invoice);
          System.out.println("Item-Name: " + rs.getString("itemName"));
          System.out.println("Item-Quantity: " + qty);
          int amount = rs.getInt("pricePerQuantity")*qty;
          System.out.println("Total Amount: " + amount);
          System.out.println();
          break;
       }
    }
    rs.close();

 }catch(SQLException se){
    //Handle errors for JDBC
    se.printStackTrace();
 }catch(Exception e){
    //Handle errors for Class.forName
    e.printStackTrace();
 }finally{
    //finally block used to close resources
    try{
       if(stmt!=null)
          conn.close();
    }catch(SQLException se){
    }// do nothing
    try{
       if(conn!=null)
          conn.close();
    }catch(SQLException se){
       se.printStackTrace();
    }//end finally try
 }//end try
 System.out.println("Goodbye!");
}//end main
}
