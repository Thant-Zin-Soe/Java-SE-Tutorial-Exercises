import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=scan.nextLine();
		
		System.out.println("Enter your mark");
		int mark=scan.nextInt();
		if(mark<40) {
			System.out.println(name+" Fail the exam");
		}
		else if(mark>=40 && mark<80) {
			System.out.println(name+" Pass the exam");
		}
		else if(mark>=80 &&mark<=100) {
			System.out.println(name+" got Credit");
		}
	}
}
