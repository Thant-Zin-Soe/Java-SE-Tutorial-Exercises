package h._Array;

public class App1 {
	
	public static void main(String[] args) {
		int [][]numbers={{11,12},{13,14,15},{16,17,18}};
		int i=0,j=0;
		for(i=0;i<numbers.length;i++){
			for(j=0;j<numbers[i].length;j++){
				System.out.println("The number from index "+i+" is:"+numbers[i][j]);
			}
		}
	}

}
