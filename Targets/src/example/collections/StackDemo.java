package example.collections;

import java.util.Stack;

public class StackDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack s = new Stack();
		s.push(10);
		s.push("kumar");
		s.push(new Integer(35));
		s.push("three");
		System.out.println("Stack"+s);
		s.pop();
		System.out.println("Stack"+s);
		System.out.println(s.peek());
		for(Object obj:s){
			System.out.println(obj);
		}

	}

}
