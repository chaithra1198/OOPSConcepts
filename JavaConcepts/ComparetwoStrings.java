package JavaConcepts;

import java.util.Scanner;

public class ComparetwoStrings {

	public static void main(String[] args) 
	{
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter first String");
		String first=sc.next();
		System.out.println("Enter second string");
		String second=sc.next();
		compare(first,second);
	    }
	
		private static void compare(String s1, String s2)
		{
			if(s1.compareTo(s2)==0)
			{
				System.out.println("Given string is equal");
			}
			else
			{
				System.out.println("Given string is not equal");
			}*/
			
		Scanner sc=new Scanner(System.in);
		String firststring=sc.next();
		System.out.println("Enter first program");
		String secondstring=sc.next();
		if(firststring.compareTo(secondstring)==0)
		{
			System.out.println("Given strings are equal");
		}else
		{
			System.out.println("Given strings are not equal");
		}
				
		}
		
		


}



