package l.Scanner;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your name please!");
		String name = scan.nextLine();
		System.out.println("Hello:" + name);

		System.out.println("Enter your age please!");
		int age = scan.nextInt();
		System.out.println("Your age is:" + age);
		if (age < 18) {
			System.out.println("You are still young!");
		} else {
			System.out.println("You are adult!");
		}
	}
}				
