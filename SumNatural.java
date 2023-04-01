import java.util.*;
public class SumNatural {
	
	int n,sum=0;
	Scanner sc=new Scanner(System.in);
	public void acceptData()
	{
		System.out.println("enter number");
		n=sc.nextInt();
		
	}
	public void NaturalSum()
	{
		sum=(n*(n+1))/2;
		System.out.println("Natural number is= "+sum);
	}
	
		
	public static void main(String[] args)
	{
		SumNatural sm=new SumNatural();
		sm.acceptData();
		sm.NaturalSum();

	}

}
