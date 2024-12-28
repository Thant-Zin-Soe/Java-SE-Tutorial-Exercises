class Temp{
	public<T> void showValue(T value){
		System.out.println(value);
	}
}


public class App {
	public static void main(String[] args) {
		Temp tmp=new Temp();
		tmp.<String>showValue("SU SU");
	}
	
	
}
