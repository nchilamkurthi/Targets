package example;
class Produre{
	Produre(){//default constructor
		System.out.println("Produre class");
	}
	Produre(int a){
		System.out.println(a);
	}
	
}

class Hero extends Produre{
	Hero(){// default constructor
		System.out.println("Hero Class");
	}
	Hero(String name){// Parameterized constructor
	
		System.out.println("Hero Name"+name);
	}	
	
}

class Director extends Hero{
	Director(){
		super("NTR");//calling super class constructor
		
		System.out.println("Director class");
		
		
		
	}
	Director(String s){
		//super(10);
		System.out.println(s);
	}
}


public class SuperConstructor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      new Director();
      new Director("Hai");
      
      
	}

}
