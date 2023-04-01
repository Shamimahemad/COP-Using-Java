import java.util.*;
public class MatrixMul {
	
	
	public void acceptData()
	{
		int arr1[] []= {{2,3},{4,7}};
		int arr2[] []= {{8,9},{6,5}};
		int arr3[] []= new int [2][2];
		

		for(int i = 0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{ 
				arr3[i][j]=0;
			
				arr3[i][j]=arr1[i][j]*arr2[j][i]+arr1[i][j]*arr2[j][i];
				
				
				
				System.out.print((arr3[i][j]) + " ");
				
			  }
			System.out.println();
			}
		
		
		
	}
	public static void main(String[] args)
	{
		MatrixMul mm= new MatrixMul();
		mm.acceptData();
	
	}

}
