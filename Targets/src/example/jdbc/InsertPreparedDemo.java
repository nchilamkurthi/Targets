package example.jdbc;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

	public class InsertPreparedDemo
	{
	private static final int PhoneNumber =0;

	public static void main(String[] args) {
	        Connection  con=null;
	        PreparedStatement st=null;
	        try {
	             Class.forName("com.mysql.jdbc.Driver");
	             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdetails", "root", "root");


	                st=con.prepareStatement("INSERT INTO bank values (?,?,?,?,?,?,?,?,?)");
	                Scanner sc = new Scanner(System.in);
	                

	               /* for(int i=1;i<2;++i)
	                	
	                {
	                	System.out.println("Enter SL.NO");
		                int n= sc.nextInt();
	                /*System.out.println("Enter  "+i +"Account number ");*/
	                
	                System.out.println("Enter SL.NO");
	                int n= sc.nextInt();

	                System.out.println("Enter Accountnumber");
	                int AccountNumber=sc.nextInt();
	                
	                System.out.println("Enter Account name");
	                String Accountname=sc.next();
	                
	                System.out.println("Enter First Name");
	                String Firstname=sc.next();
	                
	                System .out.println("Enter Last Name");
	                String Lastname=sc.next();
	                
	                System.out.println("Enter Address");
	                String Address=sc.next();
	                
	                System.out.println("Enter Phone Number");
	                int Phonenumber=sc.nextInt();
	                
	                System.out.println("Enter Email Id");
	                String Emailid=sc.next();
	                
	                System.out.println("Enter Date (MM-dd-yyyy)");
	   			 String date=sc.next();
	   			 
	   			 
	   			 SimpleDateFormat sdf1=new SimpleDateFormat("MM-dd-yyyy");
	   			  java.util.Date udob=sdf1.parse(date);

	   			  java.sql.Date sqdob=new java.sql.Date(udob.getTime());
	                
	               
	                st.setInt(1,n);
	                st.setInt(2, AccountNumber);
	                st.setString(3,Accountname);
	                st.setString(4,Firstname);
	                st.setString(5,Lastname);
	                st.setString(6,Address);
	                st.setInt(7,Phonenumber);
	                st.setString(8,Emailid);
	                st.setDate(9,sqdob);
	                
	                
	                int res;
	                res=st.executeUpdate();
	                if(res==1)
	                        System.out.println("Success");
	                else
	                        System.out.println("Failure");


	                //}//for
	        } //try
	        catch(SQLException se) {
	                se.printStackTrace();
	        }// catch
	        catch(Exception ie) {
	                ie.printStackTrace();
	        }// catch


	}//main()
	} //class

