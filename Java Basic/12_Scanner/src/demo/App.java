package demo;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter yoour mark!!");
		int Mark =scan.nextInt();
		if(Mark<40){
			System.out.println("Fail");
		}
		else if(Mark>=40 && Mark<80){
			System.out.println("Pass");
		}
		else if(Mark>=80 && Mark<=100){
			System.out.println("Cerdit");
		}
	}
}
