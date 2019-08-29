package example.collections;
import java.util.*;
class Hashsetdemo{
public static void main(String[] args){
HashSet<Integer> hs = new HashSet<Integer>();
hs.add(12);
hs.add(23);
hs.add(34);
hs.add(45);
hs.add(56);
hs.add(67);
hs.add(23);
hs.add(null);
hs.add(null);
System.out.println("set:" + hs);
Iterator it = hs.iterator();
while(it.hasNext()){
System.out.print(it.next()+"");
                                }
                     }
         }

	