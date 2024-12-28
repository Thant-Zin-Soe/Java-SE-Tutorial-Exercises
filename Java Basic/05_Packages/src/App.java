import java.util.Scanner;

import demo.Person;

public class App {
	
	//no need to imporrt -> java.lang
	//same packages
	public static void main(String []args){
		Person person1=new Person();
		Machine mac =new Machine();//same package
		Integer number =new Integer("21");// no need to import because Integer exisst in java.lang
		Scanner sc=new Scanner(System.in);//no need to import 
	}

}
