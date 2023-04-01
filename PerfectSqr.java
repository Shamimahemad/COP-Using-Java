import java.util.*;
public class PerfectSqr {
	
	
		 static boolean isPerfectSquare(int n)
		    {
		        for (int i = 1; i * i <= n; i++) {
		 
		            // If (i * i = n)
		            if ((n % i == 0) && (n / i == i)) {
		                return true;
		            }
		        }
		        return false;
		    }
		 
		    public static void main(String[] args)
		    {
		 
		        int n ;
		        System.out.print("Enter the number:");
				Scanner sc=new Scanner(System.in);
				n=sc.nextInt();
		 
		        if (n == 0 || isPerfectSquare(n))
		            System.out.println("Number is PerfectSqr");
		        else
		            System.out.println("Number is Not PerfectSqr");
		        }
}