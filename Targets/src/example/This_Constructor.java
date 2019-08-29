package example;

public class This_Constructor {
	This_Constructor()
	{
		System.out.println("this1");
	}
	This_Constructor(int a){
		System.out.println(a);
	}
	This_Constructor(int b, int c)
	{
		this(10);
		System.out.println(b);
		
		
	}
	
	This_Constructor(int d, String s, float f){
		this(20, 30);
		System.out.println(s);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		This_Constructor t = new This_Constructor(50, "Dinesh", 1000.00f);

	}

}
