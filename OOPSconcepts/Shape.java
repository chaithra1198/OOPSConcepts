package OOPSconcepts;

class Shape   //Runtime polymorphism ----method overriding---main/super class
{
	
	public void area()
	{
		System.out.print("Display area of the shape");
	}


}
class Triangle extends Shape      //subclass
{
	public void area(int h, int b)
	{
		System.out.print("1/2*b*h");
	

}
}

class Circle extends Shape      //subclass
{
	public void area(int r)
	{
		System.out.print("3.14*r*r");
	}


public static void main(String[]args)
{
	 Shape s1=new Shape();
	 s1.area();
	
			 
	
	
	
	
	}
}


