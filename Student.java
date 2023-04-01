
import java.util.*;
public class Student {
	
	  int i,j,k;
	  float P;
	  
	  String name;
	  public void acceptData()
	  {
		  System.out.println("Enter The Marks");
		  Scanner sc= new Scanner(System.in);
		  i= sc.nextInt();
		   j= sc.nextInt();
		    k= sc.nextInt();
		    
			 }
	  public void name() {
		  
		  System.out.println("Enter the name:");
		  Scanner sc= new Scanner(System.in);
		  name=sc.next();
	  }
	  
	   public void Percentage()
	   {
		   
		   P=(float)((i+j+k)/3.0);
		   System.out.println("Percentage="+P);
		   
		   
	   }
	    public void grade() {
	    	
	    	if(P>90) {
	    		
	    		System.out.println("Grade A");
	    		
	    		
	    	}else if(P<90 && P>80) {
	    		
	    		System.out.println("Grade B");
	    	}else {
	    		System.out.println("Grade C");
	    	}
	    	
	    	
	    	
	    }



    public static  void main(String[] agrs) {
    	
    	Student s=new Student();
        s.name();
    	s.acceptData();
    	s.Percentage();
    	s.grade();
    
    	
    } 
}