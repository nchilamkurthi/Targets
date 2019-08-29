package example;

public class StaticDemo 
{
static int a=100;
static int d=200;
int b=30;
public void  Ax(int c)
{
	System.out.println("staticdemo"+c);
}
void sample()
{
System.out.println("static variable"+a);
System.out.println("instance"+b);

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=100;
			StaticDemo sd= new StaticDemo();
			System.out.println("staticdemo sd (Static Variable)"+StaticDemo.a);
			StaticDemo Sd=new StaticDemo();
			System.out.println("staticdemo sd (Static Variable)"+StaticDemo.d);
			StaticDemo sd1=new StaticDemo ();
			sd1.b=5000;
			System.out.println("staticdemo sdone (non Static Variable)"+sd1.b);
			StaticDemo sd2=new StaticDemo ();
			sd1.b=600000;
			System.out.println("staticdemo sdtwo (non Static variable)"+sd1.b);
			sd. Ax(300);
			sd.sample ();
			
			
			
			
			
					
			
			
		

	}

}
