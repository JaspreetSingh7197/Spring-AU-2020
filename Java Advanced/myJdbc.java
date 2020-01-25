package jdbc;
import java.util.*;
import java.sql.*;
public class myJdbc {
	public static void main(String args[])
        {
	     try
             {  
		Class.forName("com.mysql.jdbc.Driver");
                String url="jdbc:mysql://localhost:3306/empdb";
                String user="root";
                String password="gentleman";  
		Connection con=DriverManager.getConnection(url,user,password);  
		String str="{CALL my_proc()}";
		CallableStatement stmt=con.prepareCall(str);  
		ResultSet res=stmt.executeQuery();  
		while(res.next()) 
                {
                    System.out.println(res.getInt("emp_id") + " "+ res.getString("emp_name")+" " +res.getString("salary")+" "+ res.getInt("dep_id")+ " " + res.getString("dep_name"));
		} 
		con.close();
              }    
              catch(Exception e)
              { 
                  System.out.println(e.toString());}  
	      }
        }
 }
