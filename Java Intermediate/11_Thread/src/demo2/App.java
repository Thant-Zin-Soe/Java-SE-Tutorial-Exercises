package demo2;

class Runner implements Runnable{

	@Override
	public void run() {
		
		for(int i=0;i<10;i++){
			try {
				Thread.sleep(100);
				System.out.println(i+" Hello");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}
public class App {
	public static void main(String[] args) {
		//Runner run=new Runner();
		Thread t1=new Thread(new Runner());
		t1.start();
//		try {
//			t1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		Thread t2=new Thread(new Runner());
		t2.start();
	}
}
