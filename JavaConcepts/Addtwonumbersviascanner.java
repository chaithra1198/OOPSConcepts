package JavaConcepts;

import java.util.Scanner;

public class Addtwonumbersviascanner {

	public static void main(String[] args) 
	{
		Scanner sca=new Scanner(System.in);
		int a=sca.nextInt();
		int b=sca.nextInt();
		
		
		int sum=a+b;
		System.out.println("sum of two numbers is "+sum);

	}

}
