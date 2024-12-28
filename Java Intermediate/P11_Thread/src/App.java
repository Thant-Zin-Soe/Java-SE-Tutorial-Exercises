class Runner extends Thread {

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(500);
				System.out.println(i+"Hello");
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
	
}
public class App {
	public static void main(String[] args) {
		Runner run1=new Runner();
		Runner run2=new Runner();
		
		run1.start();
		
		run2.start();
		
	}
}
