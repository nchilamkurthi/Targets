package example;


import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;



public class LinkedList_Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		System.out.println("size is"+list.size());
		list.add("one");//String value/string object a[0]
		list.add(new Integer(10));//Integer object  a[2]
		list.add(new Float(45.6));//float
		list.add(new Boolean(true));//boolean
		list.add("two");//string
		list.add("three");//three
		list.add(10);
		list.add(1, "kumar");// a[1]
		System.out.println(list.contains("two"));
		System.out.println(list.get(4));
		System.out.println("values are"+list);
		list.remove(2);
		System.out.println("values are"+list);
		list.set(3,new Integer(100));
		list.add("three");
		list.add(null);
		System.out.println("values are"+list);
		System.out.println("second value is"+list.get(1));
		
		for(int i=0;i<list.size();++i)
		{
			System.out.println(list.get(i));
		}
		
		Collections.synchronizedList(list);
		
		ListIterator il = list.listIterator();
		System.out.println("Forwar direction");
		while(il.hasNext()){
			System.out.println(il.next());
			
		}
		System.out.println("Reverse direction");
		while(il.hasPrevious()){
			System.out.println(il.previous());
			il.remove();
		}
		
		Iterator i = list.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
			i.remove();
		}
	}

}


