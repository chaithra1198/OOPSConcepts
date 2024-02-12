package OOPSconcepts;

class Students   // method overloading ------compile time polymorphism
{
	public void displaydetails(String name)
	{
		System.out.print("Display student name "+ name);
	}
	public void diaplaydetails(int age)
	{
		System.out.print(", student age "+ age);
	}
	
	public void displaydetails(int marks)
	{
		System.out.print(" and student marks is  "+ marks);
	}
	
	public static void main(String[] args)
	{
		
		Students s1=new Students();
		s1.displaydetails("chaithra");
		s1.diaplaydetails(25);
		s1.displaydetails(98);
		
	}
}


