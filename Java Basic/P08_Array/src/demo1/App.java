package demo1;

public class App {
	public static void main(String[] args) {
		int [] num=new int[4];
		num[0]=0;
		num[1]=1;
		num[2]=2;
		num[3]=3;
		for(Integer val:num)
		System.out.println(val);
		
		String [] names= {"Aung Aung","Mg Mg","Zaw Zaw"};
		
		for(String val:names) {
			System.out.println(val);
		}
	}
}
