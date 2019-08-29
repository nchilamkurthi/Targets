package example;
public class ThisVariable_demo {
	int a;
	public void methodA(int a) {
		this.a = a;
		System.out.println(a);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisVariable_demo obj = new ThisVariable_demo();
		obj.methodA(20);
		

	}

}
