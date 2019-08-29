package example.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
import java.text.*;
public class PreparedSelectReadDate  {
	 void selectAddress ()throws Exception
	 {
		 Scanner sc = new Scanner(System.in);
			System.out.println("Enter Account number");
			int Sno = sc.nextInt();
		 
			 Class.forName("com.mysql.jdbc.Driver");//1
			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdetails", "root", "root");
			 PreparedStatement ps = con.prepareStatement("select*from bank where Sno =?");
			
			 ps.setInt(1,Sno);

	    	  
	    	  ResultSet rs = ps.executeQuery();
	    	  while(rs.next())
	    	  {
	    		 int sno =rs.getInt(1);   
	             int AccountNumber =rs.getInt(2); 
	             String AccountName =rs.getString(3); 
	             String FirstName =rs.getString(4);
	             String LastName=rs.getString(5);
	             String Address=rs.getString(6);
	             int PhoneNumber=rs.getInt(7);
	             String EmailId=rs.getString(8);
	             java.sql.Date sqdob=rs.getDate(9); 
	             java.util.Date udob=(java.util.Date)sqdob;
	             SimpleDateFormat sdf1=new SimpleDateFormat("MMM-yy-dd");
	 			String sdob=sdf1.format(udob);
	    	  
	    		  System.out.println(Sno+"\t"+AccountNumber+"\t"+AccountName+"\t"+FirstName+"\t"+LastName+"\t"+Address+"\t"+PhoneNumber+"\t"+EmailId+"\t"+sdob);
	    		  } 
	
	 }
public static void main(String[] args)throws Exception  {
	// TODO Auto-generated method stub
	
   PreparedSelectReadDate ps = new PreparedSelectReadDate();
   ps.selectAddress();
}
}

