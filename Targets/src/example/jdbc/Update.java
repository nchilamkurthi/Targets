package example.jdbc;



	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.Scanner;

	public class Update
	{
		public static void main(String args[])
		{
			Connection con=null;
			Statement st=null;
			Scanner sc=null;
			try
			{
		
				sc=new Scanner(System.in);
				
				int sid=0;
				String saddress=null;
				if (sc!=null)
				{
					System.out.println("Enter existing student ID");
					sid=sc.nextInt();
					System.out.println("Enter new  address:");
					saddress=sc.next();
	    		}

				Class.forName("oracle.jdbc.driver.OracleDriver");//1
				con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","sudheer","kumar");//2
			
				if(con!=null)
					st=con.createStatement();//3

				// frame example qry with direct values
				//String qry="update student set sname='maharaja',sadd='vizag' where sno=101";

				String qry="update student set saddress='"+saddress+"' where sid="+sid;//4
				
				System.out.println(qry);
				//send and execute the qry in db s/w
				int res=0;
				if(st!=null)
					  res=st.executeUpdate(qry);

				// process results
				if (res==0)
				{
					System.out.println("record not found");
				}
				else
				{
					System.out.println(res+"no.of records are updated");
				}
			}//try
			catch(ClassNotFoundException cnf)//handles known exeption
			{
				cnf.printStackTrace();
			}
			catch(SQLException se) //handles known exception
			{
				se.printStackTrace();
			}
			catch(Exception e) //handles unknown exceptions
			{
				e.printStackTrace();
			}
			finally
			{
				//close jdbc objs
				try
				{
					if(st!=null)
						st.close();
				}
				catch(SQLException se)
				{
					se.printStackTrace();
				}

				try
				{
					if(con!=null)
						con.close();
				}
				catch(SQLException se)
				{
					se.printStackTrace();
				}
			}//finally
		}//main
	}//class
