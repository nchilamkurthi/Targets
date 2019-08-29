package example.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class PreparedSelect {
	 void selectstudent(){
		 Connection con = null;
		 PreparedStatement ps = null;
		 int rs = 0;
		 try{
			 Class.forName("com.mysql.jdbc.Driver");//1
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dinesh", "root", "root");
			 ps = con.prepareStatement("select staddress from student where stid =?");
			 String name = null;
			ps.setString(1, name);
	    	  
	    	  ResultSet rs1 = ps.executeQuery();
	    	  while(rs1.next())
	    	  {
	    		  System.out.println(rs1.getString("sname")+"\t"+rs1.getString("address")+"\t");
	    	  }    	  
	      }
		 catch(Exception e){
	    	  e.printStackTrace();
	      }
		}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	
   PreparedSelect ps = new PreparedSelect();
   ps.selectstudent();
}
}