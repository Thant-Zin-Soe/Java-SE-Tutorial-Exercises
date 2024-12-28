
public class App {
	public static void main(String[] args) {
		byte bVal=123;	
		int x=bVal;
		System.out.println(x);
		bVal= (byte)x;
		System.out.println(bVal);//-128....0....127
		
		double y=234.321;
		int z=(int)y;
		System.out.println(z);
	}
	
}
