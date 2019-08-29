package example;

public class Exceptions_Demo {
	public void methodA() {
		try {
		int a = 1000;
		int b = 10;
		int c = a/b;
		System.out.println(c);
		
	}
		catch(Exception e) {
		e.printStackTrace();
		}
		
	
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Exceptions_Demo e1 = new Exceptions_Demo();
		e1.methodA();
		System.out.println("This is an example on how to handle the exception");
	}

}
