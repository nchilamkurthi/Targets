package example.collections;

	import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;
	public class Vector_Demo{
	public static void main(String[] args){
	//creation of vector
	Vector<Integer> v = new Vector<Integer>();//Generic vector 
	//adding elements to vector
	v.add (new Integer(11));
	v.add(new Integer(22));
	v.add(new Integer(33));
	v.add(44);//auto boxing
	v.add(1,99);
	v.add(100);
	//displaying the elements
	System.out.println("List:"+v);
	//deleting the elements
	v.remove(new Integer(22));// remove based on object/data
	v.remove(1);// remove based on index
	//displaying the elements using general for loop
	System.out.print("List using for loop:");
	for(int i=0;i<v.size();i++){
	System.out.print(v.get(i)+ "");
	}//displaying the elements using for each loop
	System.out.print("\n List using for each loop:");
	for(int i:v) {//enchaned for loop
	System.out.print(i+"");
	}
	ListIterator lit = v.listIterator();
	//displaying the elements in forward direction
	System.out.print("\n forward direction:");
	while(lit.hasNext()){
	System.out.print(lit.next()+ "");
	}//displaying the element in backward direction
	System.out.print("\n backward direction:");
	while(lit.hasPrevious()){
	System.out.println(lit.previous()+"");
	              }//end of while
	Enumeration<Integer> e = v.elements();
	while(e.hasMoreElements()){
		System.out.println("forward"+e.nextElement());
	}
	       }//end of while
	}//end of class
