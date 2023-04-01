import java.util.*;
public class StringFormat {
	int n1,n2,n3;
	String farmate;
	Scanner sc=new Scanner(System.in);
	
	public void acceptData()
	{
		System.out.println("enter number n1");
		n1=sc.nextInt();
		System.out.println("enter number n2");
		n2=sc.nextInt();
		System.out.println("enter number n3");
		n3=sc.nextInt();
	}
	public void showData()
	{
	
		System.out.println(String.format("%04d",n1));
		System.out.println(String.format("%04d",n2));
		System.out.println(String.format("%04d",n3));
	}
	
	public static void main(String[] args)
	{
		StringFormat sf=new StringFormat ();
		sf.acceptData();
		sf.showData();
	}

}
