package example.collections;

import java.util.TreeSet;
public class TreeSet_Demo {

  public static void main(String[] args) {
     
     TreeSet<String> tset = new TreeSet<String>();
 
     //add elements to TreeSet
     tset.add("Dinesh");
     tset.add("Thota");
     tset.add("Naga");
     tset.add("Priyanka");
     tset.add("Vijayawada");
     // Duplicate removed
     tset.add("Thota"); 
  
     // Displaying TreeSet elements
     System.out.println("TreeSet contains: ");
     for(String temp : tset){
        System.out.println(temp);
     }
  }
}