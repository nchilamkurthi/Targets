package example;
public class EncapsulationDemo {
	private int a;
	private String b;
	public void setA(int a){
		this.a=a;	
		}
	public int getA() {
		return a  ;		
	}
	public void setB(String b) {
           this.b=b;
	}
	public String getB() {
	     return b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationDemo ed=new EncapsulationDemo();
		ed.setA(500);
		int a=ed.getA();
		System.out.println(a);
		ed.setB("DineshThota");
		String b=ed.getB();
		System.out.println(b);
				
	}

}
