package OOPSconcepts;    //methis overloading

public class pen {
	
	String pencolor;
	int penheight;
	
	
	
	public void displaypendetails()
	{
		System.out.print("The color of the pen is: " + this.pencolor);
		
		
	}
	
		public static void main(String[] args)
		{
			
			
			pen p1=new pen();
			p1.pencolor="blue";
			
			
			pen p2=new pen();
			p2.pencolor="black";
			
			
			pen p3=new pen();
			p3.pencolor="brown";
			
			p1.displaypendetails();
			p2.displaypendetails();
			p3.displaypendetails();
 
			
			
		}

}
