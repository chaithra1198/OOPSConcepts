package JavaConcepts;

import java.util.Scanner;

public class Fahrenheittocelsius {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input temparture in forenheit: ");
		double farenheit=sc.nextDouble();
		double celsius= ((5*farenheit-32.0)/9.0);
		System.out.println(farenheit + " degree fahrenheit is equalto " + celsius + "in celsius");
		

		
	}

}
