package JavaConcepts;

import java.util.Scanner;

public class Inputfromscanner {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter string");
		String name=sc.nextLine();
		System.out.println("entered string is " + name);
		
	}

}
