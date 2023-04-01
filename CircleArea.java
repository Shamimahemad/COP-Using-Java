import java.util.*;
public class CircleArea {
	
	float r;
	float A;
	final float pi=3.14f;
	Scanner sc=new Scanner (System.in);
	
	public void acceptData()
	{
		System.out.println("enter radius: ");
		r=sc.nextFloat();
	}
	 public void showData()
	 {
		 A=pi*r*r;
		 System.out.println("area of circle is ="+A);
	 }
	 public static void main(String[] args)
	 {
		 CircleArea ca=new CircleArea();
		 ca.acceptData();
		 ca.showData();
	 }

}
