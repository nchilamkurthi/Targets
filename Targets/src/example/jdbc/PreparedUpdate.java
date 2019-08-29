package example.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class PreparedUpdate {
    
	 void updatestudentdetails(){
		 Connection con = null;
		 PreparedStatement ps = null;
		 int r = 0;
		 try{
			 Class.forName("com.mysql.jdbc.Driver");//1
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdetails", "root", "root");
			 ps = con.prepareStatement("update bank set Date=? where Sno=?");
			 Scanner sc = new Scanner(System.in);
			 System.out.println("Enter Date (MM-dd-yyyy)");
			 String date=sc.next();
			 System.out.println("Enter SNO");
			 int sno = sc.nextInt();
			 
			 SimpleDateFormat sdf1=new SimpleDateFormat("MM-dd-yyyy");
			  java.util.Date udob=sdf1.parse(date);

			  java.sql.Date sqdob=new java.sql.Date(udob.getTime());
			 //int stid = 0;
			//System.out.println("Enter student phone number");
			 //int phone = sc.nextInt();
			  ps.setDate(1,sqdob);
			  ps.setInt(2,sno);
			 
			
			 r = ps.executeUpdate();
			 if(r==0){
				 System.out.println("Record not found");
			 }else{
				 System.out.println(r+"no of records updated");
			 }
		 }catch(Exception e){
			 e.printStackTrace();
		 }
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       PreparedUpdate pu = new PreparedUpdate();
       pu.updatestudentdetails();
	}

}
