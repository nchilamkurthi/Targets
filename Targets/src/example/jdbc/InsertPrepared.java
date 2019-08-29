package example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertPrepared
{
private static final int PhoneNumber = 0;

public static void main(String[] args) {
	Connection  con=null;
	PreparedStatement st=null;
	try {
	     Class.forName("com.mysql.jdbc.Driver");
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdetails", \"root\", \"root");
		
		st=con.prepareStatement("INSERT INTO Bank VALUES (?,?,?,?,?,?,?,?)");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Number");
		int n= sc.nextInt();

		for(int i=1;i<=n;++i)
		{
		System.out.println("Enter  "+i +"Bank ");
		
		System.out.println("Enter Account Name");
		String Name=sc.next();
		System.out.println("Enter First Name");
		String FirstName=sc.next();
		System.out.println("Enter Last Name");
		String LastName=sc.next();
		System.out.println("Enter Account Number");
		int AccountNumber = sc.nextInt();
		/*System.out.println("Enter Student age");
		int age = sc.nextInt();*/
		System.out.println("Enter Address ");
		String Address=sc.next();
		System.out.println("Enter Phone Number");
		int phone = sc.nextInt();
		System.out.println("Enter mail id");
		String MailId = sc.next();
		System.out.println("Enter  sno");
		int sno = sc.nextInt();
		st.setString(1,Name);
		st.setString(2, FirstName);
		//st.setInt(3, age);
		st.setString(3,LastName);
		st.setInt(4, AccountNumber);
		st.setString(5,Address);
		st.setInt(6,phone);
		st.setString(7,MailId);
		st.setInt(8,sno);
		int res;
		res=st.executeUpdate();
		if(res==1)
			System.out.println("Success");
		else
			System.out.println("Failure");

		
		}//for
	} //try
	catch(SQLException se) {
		se.printStackTrace();
	}// catch
	catch(Exception ie) {
		ie.printStackTrace();
	}// catch


}//main()
} //class

