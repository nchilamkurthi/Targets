/* Finally is a keyword used for the exception handling
 * There can be a try block without a catch block but a finally block
 * Finally keyword is used to close the application connection objects
 * Application connection objects can be data base connections or something else 
 */
package example;

public class FinallyException_Demo {
	public void Demo() {
		try {
			int a = 100;
			int b = 0;
			int c = 1000;
			int d = c/b;
			System.out.println(d);
			
		}
		finally {
			for(int i = 0; i<100; i++) {
				System.out.println(i);
				
			}
			
			
			
}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinallyException_Demo fed = new FinallyException_Demo();
		fed.Demo();
		

	}

}
