package example;
import java.util.Scanner;
class bankaccountopenings {
	int NewAccountNumber;
	String ApplicantName;
	String ApplicantAddress;
	int ApplicantGSMNumber;	
}
class customer extends bankaccountopenings{
      int NewAccountNumber;
      String AccountName;
      String AccountAddress;
      int GSMNumber;
      
      void customerdetailsInput() {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter NewAccount Number");
      NewAccountNumber=sc.nextInt();
      System.out.println("Applicant Name");
      ApplicantName=sc.next();
      System.out.println("Applicant Address");  
      ApplicantAddress=sc.next();
      System.out.println("Applicant GSMNumber");
      ApplicantGSMNumber=sc.nextInt();
      System.out.println("New Account Number");
      NewAccountNumber=sc.nextInt();
      System.out.println("Account name");
      AccountName=sc.next();
      System.out.println("Account address");
      AccountAddress = sc.next();
      System.out.println("GSMNumber");
      GSMNumber = sc.nextInt();
       
}
}
public class Multilevelheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   customer cd =new customer ();
   cd.customerdetailsInput();
	}
}



