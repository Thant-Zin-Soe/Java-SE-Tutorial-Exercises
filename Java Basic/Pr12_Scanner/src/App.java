import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name!");
		String name=	scan.nextLine();
		System.out.println("Enter your mark!");
		int mark=scan.nextInt();
		if(mark<0 || mark>100) {
			System.out.println("Invalid Mark! Please check your mark !");
			
		}
		if(mark<40&& mark>=0) {
			System.out.println(name+"\t Fail");
		}
		if(mark>=40&& mark<80) {
			System.out.println(name+"\t Pass");
		}
		if(mark>=80&& mark<=100) {
			System.out.println(name+"\t Credit");
		}
	}
}
