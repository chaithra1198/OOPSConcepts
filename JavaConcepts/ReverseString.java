package JavaConcepts;

public class ReverseString {

	public static void main(String[] args) {
		String name="Automation intervew questions";
		
		/*for(int i=name.length()-1;i>=0;i--)
		{
			System.out.print(name.charAt(i));
		}*/
		for(int i=0;i<=name.length()-1;i++)
		{
			System.out.print(name.charAt(i));
		}
		
	}
}
