package example.collections;

import java.util.*;
public class TreeSetdemo{
public static void main(String[] args){
TreeSet<Integer> ts = new TreeSet<Integer>();
ts.add(12);
ts.add(23);
ts.add(34);
ts.add(45);
ts.add(10);
ts.add(56);
ts.add(67);
System.out.println("set:"+ts);
Iterator it = ts.iterator();
while(it.hasNext()){
System.out.println(it.next()+"");
}
System.out.println(ts.headSet(45));
System.out.println(ts.subSet(10, 56));
System.out.println(ts.tailSet(45));

Iterator<Integer> i = ts.descendingIterator();
while(i.hasNext()){
	System.out.println(i.next());
}
}
}