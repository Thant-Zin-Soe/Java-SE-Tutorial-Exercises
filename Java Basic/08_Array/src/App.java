
public class App {
	public static void main(String[] args) {
		int [] num= new int[4];
		num[0]=11;
		num[1]=12;
		num[2]=14;
		num[3]=15;
		System.out.println(num[3]);
		    

		String [] names={"MG MG","Aung AUNG","Su Su"};
		for(int i=0;i<names.length;i++){
			System.out.println(i);
		}

		System.out.println("lenght"+names.length);

		for(String val:names){
			System.out.println(val);
		}
	}

}
