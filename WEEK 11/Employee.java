import java.sql.*;
import java.util.*;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
public class Employee {
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
		    System.out.println("Enter ID and password to search for: ");
		    @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
		    int id = sc.nextInt();
		    sc.nextLine();
		    String pass = sc.next();
		    System.out.println(pass) ;
		   
		    stmt = conn.createStatement();
		    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		    LocalDateTime now = LocalDateTime.now();  
		    String sql = "SELECT * FROM employee;";
		    ResultSet rs = stmt.executeQuery(sql);
		   
		    while(rs.next())
		    {
		       if((rs.getString("password").equalsIgnoreCase(pass)) && (rs.getInt("id") == id) ) 
		       {
		          
		    	   System.out.println("Date: " + dtf.format(now));
		    	   System.out.println("Name: " + rs.getString("name"));
		           
		          System.out.println("Designation: " + rs.getString("designation"));
		          System.out.println("Salary: " + rs.getLong("salary"));
		          System.out.println();
		       }
		    }
		    rs.close();
		    conn.close() ;
		    

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




    
