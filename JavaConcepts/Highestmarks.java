package JavaConcepts;

public class Highestmarks {

	public static void main(String[] args) {
		int marks[]= {97,67,89,65,46,45,100};
		int highest=97;
		for(int i=0;i<=marks.length-1;i++)
		{
			if(marks[i]>highest)
			{
				highest=marks[i];
				System.out.println(highest);
			}
		}
		

	}

}
