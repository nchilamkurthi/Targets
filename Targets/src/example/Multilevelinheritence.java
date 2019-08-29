package example;
import java.util.Scanner;
class bankaccountopening {
	int NewAccountNumber;
	String ApplicantName;
	String ApplicantAddress;
	int ApplicantGSMNumber;	
}
class customerdetials extends bankaccountopening{
      int NewAccountNumber;
      String AccountName;
      String AccountAddress;
      int GSMNumber;
      void customerdetailsInput() {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("NewAccount Number");
      NewAccountNumber=sc.nextInt();
      
      System.out.println("Account Name");
      AccountName=sc.next();
      
      System.out.println("Account Address");
      AccountAddress=sc.next();
      
      System.out.println("GSMNumber");
      GSMNumber=sc.nextInt();
      
      System.out.println("New Account Number");
      NewAccountNumber=sc.nextInt();
     
      System.out.println("Applicant Name");
      ApplicantName=sc.next();
      
      System.out.println("Applicant Address"); 
      ApplicantAddress=sc.next();
      
      System.out.println("Applicant GSM Number");  
      ApplicantGSMNumber=sc.nextInt();
}
}
public class Multilevelinheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   customerdetials cd =new customerdetials ();
   cd.customerdetailsInput();
	}
}

