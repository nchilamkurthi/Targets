package example;
public class EncapsulationDemoname {
	private int ssn;
	private String name;
	private  int age;
	public int getssn(){
	  return ssn;
	}
	public String getname() {
		return name;	
	}
	public int getage() {
		return age;
	}
	public void setssn(int newvalue ) {
		ssn= newvalue;
	}
	public void setname(String newvalue) {
		name=newvalue;
	}
	public void setage(int newvalue) {
		age=newvalue;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
EncapsulationDemoname edn= new EncapsulationDemoname();
edn.setname ("DineshThota");
edn.setage (33);
edn.setssn (12345678);
System.out.println("NAME" +edn.getname());
System.out.println("AGE" +edn.getage());
System.out.println("SSN" +edn.getssn());



	}

}
