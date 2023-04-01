
public class Addition4 {
	
public void add(int...i) {

	int sum = 0;
	for(int s = 0 ; s < i.length ; s ++ ) {			
	
		sum += i[s];
	}	
System.out.println("Addition of " + i.length + "numbers " + sum);
		
	}
	
	public static void main(String[] args) {
		Addition4 a = new Addition4();
		a.add();
		a.add(1,2);
		a.add(1,2,3,4,5);
		a.add(1,2,3,4,5,6,9,5);
		
	}

}
