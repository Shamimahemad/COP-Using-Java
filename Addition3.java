import java.util.*;

public class Addition3 {
	
	public static void main(String[] args)
	{
		int n,sum=0;
		System.out.println("Enter the number");
		Scanner sc=new Scanner (System.in);
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("sum is="+sum);
		
	}

}
