import java.util.*;
public class Account2 {
	long  a,m,accId=64434;
	String name;
	float b;
	Scanner sc=new Scanner(System.in);
	public void acceptData()
	{
		System.out.println("enter your name");
		name=sc.next();
		System.out.println("enter your Adhar number");
		a=sc.nextInt();
		System.out.println("enter your mobile number");
		m=sc.nextInt();
		System.out.println("enter your city name");
		name=sc.next();
		System.out.println("enter your pincode");
		name=sc.next();
		System.out.println("enter your balance");
		b=sc.nextFloat();
		
	}
	public void showData()
	{
		System.out.println("congratulation!! your account is opened");
	
		
		System.out.println("your account number is= "+accId);
		System.out.println("your balance is= "+b);
	}
	
	public static void main(String[] args)
	{
		Account2 ac=new Account2();
		ac.acceptData();
		ac.showData();
	}


}
