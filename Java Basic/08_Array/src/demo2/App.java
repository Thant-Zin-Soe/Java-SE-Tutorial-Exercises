package demo2;

public class App {
	public static void main(String[] args) {
		int number[][]={{2,34,5},{4,12},{9,8,7,6}};
		
		//System.out.println(number[1][1]);
		
		for(int i=0;i<number.length;i++){
			for(int x=0;x  <number[i].length;x++){
				System.out.println(number[i][x]+"  ");
			}
		}
	}
	 
}
