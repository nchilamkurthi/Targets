package example.jdbc;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Deletestatement {
	
	void deletestudentdetails(){
		 Connection con = null;
		 PreparedStatement ps = null;
		 int r = 0;
		 try{
			 Class.forName("com.mysql.jdbc.Driver");//1
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdetails", "root", "root");
			 String sql = "DELETE FROM bank WHERE Account Name =?";
			  ps = con.prepareStatement(sql);
			 Scanner sc = new Scanner(System.in);
			 System.out.println("Enter Account Name");
			 String stid = sc.next();
			 ps.setString(1, stid);
			 r = ps.executeUpdate();
			 if(r==0){
				 System.out.println("Record not found");
			 }else{
				 System.out.println(r+"no of records deleted");
			 }
		 }catch(Exception e){
			 e.printStackTrace();
		 }
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deletestatement ds = new Deletestatement();
		ds.deletestudentdetails();
	}
	
	//This is a push example

}
