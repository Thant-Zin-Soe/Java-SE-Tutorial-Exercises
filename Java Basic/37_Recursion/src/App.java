
public class App {
	public static void main(String[] args) {
		//sayHello(4);
		
		System.out.println(factorial(20));
	}
	
	public static void sayHello(int x){
		if(x==1){
			return;
		}
		System.out.println("Hello");
		x--;
		sayHello(x);
	}
	public static int factorial(int x){
		if(x<=1){
			return 1;
		}
		return x*factorial(x-1);
		
	}
}
