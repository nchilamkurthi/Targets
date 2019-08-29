package example;
public class CallByValue {
 int data=50;
 void change(int data){
 data=data+100;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
CallByValue cbv= new CallByValue();
System.out.println("Change before"+cbv.data);
cbv.change(500);
System.out.println("Change after"+cbv.data);
	}
	}
