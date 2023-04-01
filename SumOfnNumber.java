import java.util.*;
public class SumOfnNumber {
 int n,sum=0,sum1=0;
 Scanner sc=new Scanner(System.in);
 public void ForLoop()
 {
	 System.out.println("enter number:");
	 n=sc.nextInt();
	 for(int i=1;i<=n;i++)
	 {
		 sum=sum+i;
	 }
	 System.out.println("sum of n number is using for loop :" +sum);
 }
 public void WhileLoop()
 {
	 System.out.println("enter number:");
	 n=sc.nextInt();
	 int i=1;
	 while(i<=n)
	 {
		 sum1=sum1+i;
		 i++;
	 }
	 System.out.println("sum of n number is using while loop :" +sum1);
 }
 public static void main(String[] args)
 {
	 SumOfnNumber son=new SumOfnNumber();
	 son.ForLoop();
	 son.WhileLoop();
 }
}
