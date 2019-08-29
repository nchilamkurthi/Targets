package example;

class Parent{
	int a=56;//instance variable
}

public class SuperVariableDemo extends Parent{
	int a=25;
	void display(){
		System.out.println("The value of is"+a);
		System.out.println("The value of Parent a is"+super.a);
	}
	
	public static void main(String...a){
		SuperVariableDemo  c = new SuperVariableDemo();
		c.display();
	}
}
