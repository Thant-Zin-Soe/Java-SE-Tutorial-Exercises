import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter your age!!");
		String ageString=scan.nextLine();
		
		System.out.println("Eter your name!!");
		int age= Integer.parseInt(ageString);

		String name=scan.nextLine();
		System.out.println("Hello, "+name);
		
		if(age>18){
			System.out.println("You are adult!!");
		}
		else{
			System.out.println("You are still young!!");
		}
	}
	
	
}
