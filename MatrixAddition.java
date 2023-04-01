import java.util.*;
public class MatrixAddition {
	
	public void acceptData()
	{
		
		int arr1[ ] [ ] = {{1,2,3},{4,5,6},{7,8,9}};
		int arr2[ ] [ ] = {{3,2,1},{6,5,4},{9,8,7}};
		int arr3[][]=new int[3][3];
		//System.out.println("enter your element: ");
		//Scanner sc=new Scanner (System.in);
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr3[i][j]=arr1[i][j]+arr2[i][j];
			
		System.out.print(arr3[i][j]+ " ");
		
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args)
	{
		 MatrixAddition ma=new  MatrixAddition();
		 ma.acceptData();
	}

}
