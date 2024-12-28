package Demo1;

public class App {
	public static void main(String[] args) {
		int [] num=new int[4];
		num[0]=0;
		num[1]=1;
		num[2]=2;
		num[3]=3;
		
		for(Integer numbers:num) {
			System.out.println(numbers);
		}
		System.out.println("+++++++++++++++++++++++");

		String []name={"AungAung", "Mg Mg","Su Su"};
		for(String names:name) {
			System.out.println(names);
		}
		System.out.println("+++++++++++++++++++++++");
		String []fruit=new String[3];
		fruit[0]="Apple";
		fruit[1]="Banana";
		fruit[2]="Orange";
		for(String fruits:fruit) {
			System.out.println(fruits);
		}
	}
}
