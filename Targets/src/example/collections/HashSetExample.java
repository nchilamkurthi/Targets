package example.collections;

import java.util.HashSet;
public class HashSetExample { 
	  public static void main(String[] args) {
		     // Create a HashSet
		     HashSet<String> hset = new HashSet<String>();
		 
		     //add elements to HashSet
		     hset.add("Abhijeet");
		     hset.add("Ram");
		     hset.add("Kevin");
		     hset.add("Singh");
		     hset.add("Rick");
		     // Duplicate removed
		     hset.add("Ram"); 
		 
		     // Displaying HashSet elements
		     System.out.println("HashSet contains: ");
		     for(String temp : hset){
		        System.out.println(temp);
		     }
		  }
		}

	