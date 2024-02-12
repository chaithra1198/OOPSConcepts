package JavaConcepts;

import java.util.Scanner;

public class Swaptwonumbers {

	public static void main(String[] args) {
		//logic 1 using third variable
		int x=10; int y=30;
		System.out.println("before swapping " + x + y);
		int t=x;x=y;y=t;
		System.out.println("after swapping "+ x  + y);
		//logic2 using + and 
		
		int a=10;int b=30;
		System.out.println("before swapping x and y values are.."+x+" "+ y);
		a=a+b; //10+30=40
		b=a-b;// 40-30=10
		a=a-b;//40-10=30
		System.out.println("after swapping x and y values are .. "+x+" "+ y);
		//logic 3 using scanner class
		int l,m,n;
		Scanner sc=new Scanner(System.in);
		l=sc.nextInt();
		 m=sc.nextInt();
		 System.out.println();
		
		
		
	}

		
		
		
	}


