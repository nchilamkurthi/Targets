package example;

public class CallByValueReference {
	int data=100;
	void change (CallByValueReference cbvr){
	cbvr.data=cbvr.data+100;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
CallByValueReference cbvr=new CallByValueReference();
System.out.println("Before change"+cbvr.data);
cbvr.change(cbvr);
System.out.println("After change"+cbvr.data);
	}

}
