import java.util.*;
public class NeonNum {
	int num,n,t,u;
 int	sum;
	Scanner sc=new Scanner(System.in);
	public void getData()
	{
		System.out.println("enter number ");
		num=sc.nextInt();
	}
	public void checkNeon()
	{
		n=num*num;
		t=n%10;
		u=n/10;
		sum=t+u;
		if(sum==num)
		{
			System.out.println("number is neon ");
		}else
		{
			System.out.println("number is not neon ");
		}
		
	}
public static void main(String[] args)
{
	NeonNum nm =new NeonNum();
	nm.getData();
	nm.checkNeon();
	
}
}
