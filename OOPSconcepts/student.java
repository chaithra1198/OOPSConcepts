package OOPSconcepts;

public class student {
	
	String name;
	int age;

	student(String name,int age)//parameterized constructor--passing the arguments
	{
		
		this.name=name;
		this.age=age;
		
		System.out.print("The name of the student is "+ name);
		System.out.print("The age of the student is "+ age);
	}
	
	public static void main(String[] args)
	{
		
		student s1=new student("chaithra",25);
		
		
	}
	

}
