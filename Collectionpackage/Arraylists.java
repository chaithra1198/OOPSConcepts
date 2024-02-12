package Collectionpackage;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylists {
	
	public static void main(String[] args)
	{
		
		// define arrays syntax
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		ArrayList<String> str=new ArrayList<String>();
		
		str.add("chaithra");
		System.out.println(str);
		
	    System.out.println(list);
		
	    //to fetch the elements
	
	   int element=list.get(0);
	
	   System.out.println(element);
	   
	   // add value in between
	    list.add(2,100);
	   System.out.println(list);
	   
	   //set/replace the values
	   
	   list.set(0, 60);
	   System.out.println(list);
	   
	   //remove/delete values
	   
	   list.remove(2);
	   System.out.println(list);
	   
	   //get size
	   
	  int size= list.size();
	   System.out.println("The length of the arraye is " + size);
	   
	   //loops
	   
	   for(int i=0;i<list.size();i++)
	   {
		   System.out.print(list.get(i) + " ");
	   }
	   
	   //sorting the values
	   
	   list.add(0);
	   Collections.sort(list);
	   System.out.println(list);
	   
	   
	   
	   
	
	}
	


	
}
