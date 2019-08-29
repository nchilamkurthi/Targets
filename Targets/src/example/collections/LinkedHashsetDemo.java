package example.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashsetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
		hs.add(12);
		hs.add(23);
		hs.add(34);
		hs.add(10);
		hs.add(56);
		hs.add(67);
		hs.add(23);
		hs.add(null);
		hs.add(null);
		System.out.println("set:" + hs);
		Iterator it = hs.iterator();
		while(it.hasNext()){
		System.out.print(it.next());
		                                }
	}

}
