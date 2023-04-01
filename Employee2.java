import java.util.*;
public class Employee2 {
	Scanner sc=new Scanner(System.in);
	int a, b,c;
	String name;
	//double sallary=534.43;
	
	Employee2()
	{
		
	}
	Employee2(int a, int b,  int c, String name)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		this.name=name;
	}
	
	
    public void acceptData()
	{
		
     System.out.println("Enter empId:");
	 a =sc.nextInt(); 
	 
	}
	public void showDetails()
	{
		 System.out.println("employee name ="+name);
		System.out.println("age="+b);
		 System.out.println("emploee contact="+c);
	     System.out.println("employee Id is="+a);
		
			
	}
	
	public static void main(String[] args)
	{
		
		Employee2 e=new Employee2(458,22,254625,"shami");
		e.acceptData();
		e.showDetails();
	}

}
