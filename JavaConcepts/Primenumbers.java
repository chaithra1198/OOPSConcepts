package JavaConcepts;

public class Primenumbers {
	int i;
	int j;
	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++)
		{
			for(int j=1; j<=i;j++ )
			{
				int count=0;
				if(i%j==0)
				{
					count++;
				}
				if(count==2)
				{
				System.out.println(j);
				}	
			}
		}
		
	}

}
