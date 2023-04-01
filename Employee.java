import java.util.*;
public class Employee {
	int empId, age,contact=7619908;
	String name="shamim";
	double sallary=534.43;
	
	Scanner sc= new Scanner(System.in);

	public void acceptData()
	{
		
     System.out.println("Enter empId:");
	 empId =sc.nextInt(); 
		
		
	}
	public void showDetails()
	{
		 System.out.println("employee name ="+name);
		 System.out.println("age="+22);
		 System.out.println("emploee contact="+contact);
	     System.out.println("employee sallary is="+sallary);
		
			
	}
	public static void main(String[] args)
	{
		Employee e=new Employee();
		e.acceptData();
		e.showDetails();
	}
}
