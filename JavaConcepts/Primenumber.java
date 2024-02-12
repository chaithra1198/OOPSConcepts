package JavaConcepts; //between 1 to 100

import java.util.Scanner;

public class Primenumber 
{
	
	public static void main(String[]args)
	{
		
		boolean flag=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter input number");
		int num=sc.nextInt();
	
	    for(int i=2;i<=num/2;i++)
		{
		if(num%i==0)
		{
			flag=true;
			break;
		}
		}
		if(!flag)
		{
			System.out.println("given number is prime");
		}
		else
		{
			System.out.println("given number is not a prime");
		}
		
		}
	}
		
	
