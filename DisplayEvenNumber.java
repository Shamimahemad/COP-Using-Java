
public class DisplayEvenNumber {
	int i;

	public void ForLoop()
	{
		for(i=2;i<=11;i=i+2)
		{
			System.out.println(" "+i);
		}
		
	}
	public void WhileLoop()
	{
		
		i=2;
		while(i<=10)
		{
			System.out.println(" "+i);
			i=i+2;
		}
		
	}
	public static void main(String[] args)
	{
		DisplayEvenNumber dev=new DisplayEvenNumber();
		System.out.println("even number using FOR LOOP");
		dev.ForLoop();
		System.out.println("even number using WHILE LOOP");
		dev.WhileLoop();
	}
}
