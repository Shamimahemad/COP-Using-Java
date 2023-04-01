import java.util.*;
public class Account4 {
	int accId, m;
	float b;
	String name;
        static float iRate=4.5f;
	Account4()
	{
		
	}
	Account4(int empId, String name,float b)
	{
		this.accId=empId;
		this.name=name;
		this.b=b;
	}
	public void showData()
	{
		System.out.println("Account ID: "+accId);
		System.out.println("Account Holder name= "+name);
		System.out.println("Your balance= "+b);
		//System.out.println(empId);
	}
	public static void main(String[] args)
	{
		
		Account4 a=new Account4(454,"tyui",456);
		a.showData();
                System.out.prtintln("iRate is:"+Account4.iRate);
	}

}
