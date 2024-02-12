package JavaConcepts;

import java.util.Scanner;

public class Printevenodd {

	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");

		a=sc.nextInt();
				if(a%2==0)
		{
			System.out.println("given number is even number: " + a);
		}
		else
		{
			System.out.println("given number is odd number: "+ a);
		}
		


	}

}
