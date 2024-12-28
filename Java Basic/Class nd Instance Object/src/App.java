
public class App
{
	public static void main (String[]args)
	{
		Machine mac1=new Machine();
		Machine mac2=new Machine();
		mac1.id=10;
		mac2.id=20;
		
		mac1.start();
		mac2.start();
	}
}
