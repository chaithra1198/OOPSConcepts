package JavaConcepts;

public class Printlargestnumber {

	public static void main(String[] args) {
		/*int a=5;
		int b=236;
		int c=4000;
		
		
		if(a>b && a>c)
			
		System.out.println(a);
	
		else if(b>c)
		{
			System.out.println(b);
		}
		
		else
		{
			System.out.println(c);
		}*/
		
		int arr[]= {10,60,40,67,35,25,6000000};
		int largestnumber=40;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>largestnumber)
			{
				largestnumber=arr[i];
			}
		}
		System.out.println(largestnumber);
	}
	}


