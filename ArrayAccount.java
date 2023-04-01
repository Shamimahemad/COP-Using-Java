import java.util.*;
public class ArrayAccount {
	
	static int accId;
	int pin;
	float b;
	static String name;
	static int iRate=(int) 4.8f;
	Scanner sc=new Scanner (System.in);
	
	   public void CreateAccount()
	   {
		   System.out.println("enter your name ");
		   name=sc.next();
		   System.out.println("enter your pin number ");
		   pin=sc.nextInt();
		   System.out.println("enter your diposit ");
		   b=sc.nextFloat();
	   }
	   
	   public void DisplayInformation()
	   {
		   System.out.println("congratulation! your Account is Opened.. ");
		   System.out.println("your Accounr Information is given below.... ");
		   System.out.println("your name is "+name);
		   System.out.println("your pin number is "+pin);
		   System.out.println("your diposit balance is  "+b);
		   System.out.println("your interest rate is "+iRate);
	   }
	   public static ArrayAccount searchAccount(ArrayAccount a[] , int temp) {
	   		
	   		for(int i = 0 ; i <a.length ; i++)
	   		{
	   				if(a[i].accId == temp) {
	   			System.out.println(a[i].showData());
	   			return a[i];
	   				}	
	   		}
	   		return null;
	   	}

	   private static char[] showData() {
		// TODO Auto-generated method stub
		return null;
	}

	public static int searchAccount1
	   (ArrayAccount a[] , int temp) {
	   		
	   		for(int i = 0 ; i <a.length ; i++) {
	   				if(a[i].accId == temp) {
	   			System.out.println(a[i].showData());
	   			return i;
	   				}	
	   		}
	   		return -1;
	   	}


	   public static void updateAccountDetails
	   (ArrayAccount a[] , int t , String name ) {
	   	
	   	
	   	ArrayAccount temp = searchAccount(a, t);	
	   	if(temp != null) {
	   		temp.name = name;
	   	}	
	   	System.out.println(temp.showData());
	   	
	   }

	   

		public static void main(String[] args)
		{
			ArrayAccount ac=new ArrayAccount();
			ac.CreateAccount();
			ac.DisplayInformation();
			updateAccountDetails(null, accId, name);
			showData();
			searchAccount1(null,accId);
			
		}
		
		

	}


