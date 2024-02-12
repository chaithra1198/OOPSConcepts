package OOPSconcepts;

public class Employee {
	
   String empname;
   int empage;
   
   
   public void displayempdetails()
   {
	   
	   System.out.print("The name of the employee is "+ empname);
	   System.out.print("The age of the employe is "+ empage);
   }
   
   public static void main(String[] args)
   {
	   
	   Employee e1=new Employee();
	   e1.empname="chaithra";
	   e1.empage=25;
	   e1.displayempdetails();
   }

}
