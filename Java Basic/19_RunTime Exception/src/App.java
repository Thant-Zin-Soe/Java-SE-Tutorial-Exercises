
public class App {
	public static void main(String[] args) {
		int x=5;
		try{
		int y=x/0;//Arithmetic Exception
		}
		catch(ArithmeticException e){
			System.out.println("Arrathematic Exception");
			System.out.println(e.getMessage());
		}
		int numbers []=new int[3];
		numbers [4]=32;
		System.out.println(numbers[2]);
		
		String name=null;
		//System.out.println(name.equals("TZS"));
	}
	
}
