package c._InsstanceAndLocalVariable;

public class Machine {
	String name = "Thant Zin Soe";
	int age = 17;

	public  void greet() {
		String name="Sein Ja";//local variable
		int age = 19;// local variable
		System.out.println("My name is "+name+"!");//"this" keyword is use for  using the Instance variable
		System.out.println("I am "+age+" years old!");//but if u do not want to use the instance u need to have the local variable
	}
	public void print(){
		System.out.println("My name is "+name+"!");//if there is no local variable in the method will use the Instance variable
		System.out.println("I am "+age+" years old!");

	}
	
}
