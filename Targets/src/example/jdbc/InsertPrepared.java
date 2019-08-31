package example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertPrepared
{
//private static final int PhoneNumber = 0;

public static void main(String[] args) {
	Connection  con=null;
	PreparedStatement st=null;
	try {
	     Class.forName("com.mysql.jdbc.Driver");
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdetails", "root", "root");
		
		st=con.prepareStatement("INSERT INTO java VALUES (?,?,?,?,?)");
		Scanner sc = new Scanner(System.in);
		//int n= sc.nextInt();
		for(int i=1;i<=5; i--)
		{
		
		System.out.println("Please enter the details to insert in to table");
		System.out.println("Enter PersonID");
		int PersonID=sc.nextInt();
		System.out.println("Enter LastName");
		String LastName=sc.next();
		System.out.println("Enter FirstName");
		String FirstName=sc.next();
		System.out.println("Enter Address");
		String Address=sc.next();
		System.out.println("Enter City");
		String City = sc.next();
		st.setInt(1,PersonID);
		st.setString(2, LastName);
		st.setString(3,FirstName);
		st.setString(4, Address);
		st.setString(5, City);
		int res;
		res=st.executeUpdate();
		if(res<6) {
			System.out.println("Success");
			
	
		}
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

