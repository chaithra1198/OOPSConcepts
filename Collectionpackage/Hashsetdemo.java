package Collectionpackage;

import java.util.HashSet;   // hash set not allows the duplicate values it prints unique values
import java.util.Iterator;

public class Hashsetdemo {

	public static void main(String[] args) {
		
		HashSet<Integer> set=new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(3);
		set.add(4);
		set.add(4);
        System.out.println(set);
        
        System.out.println("Size of the set is " + set.size());
        
        //search
        
        if(set.contains(10))
        {
        	System.out.println("10 is present");
        }
        else 
        {
        	System.out.println("10 is not present");
        }
        
        //remove
        
        set.remove(3);
        System.out.println(set);
        
        // add
        
        set.add(6);
        set.add(3);
        set.add(10);
        System.out.println(set);
        
        //interation
        
        Iterator<Integer> itr=set.iterator();// hasnext find the next elements is present
        while(itr.hasNext())
        {
        	System.out.println(itr.next() + ", ");
        }
        System.out.println();
        
        //is empty
        
        if(!set.isEmpty())
        {
        	 System.out.println("set is not empty");
        }
        		
        
        
	}
	
	
	

}
