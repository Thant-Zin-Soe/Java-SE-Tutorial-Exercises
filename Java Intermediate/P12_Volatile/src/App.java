import java.util.Scanner;

class process extends Thread{
	private volatile boolean flag=true;

	@Override
	public void run() {
		int i=1;
		while(flag) {
			try {
				
				System.out.println(i+" Hello!!!");
				Thread.sleep(500);
				i++;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
	public void stopRunning() {
		flag=false;
	}
	
}
public class App {
	public static void main(String[] args) {
		process ps=new process();
		ps.start();
		Scanner scan=new Scanner(System.in);
		scan.nextLine();
		ps.stopRunning();
		
		ps.stopRunning();

	}
}
