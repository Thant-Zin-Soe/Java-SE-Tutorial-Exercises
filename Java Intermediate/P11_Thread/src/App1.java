class Running extends Thread{

	@Override
	public void run() {
		
		for(int i=0;i<1000;i++){
			try {
				Thread.sleep(2);
				System.out.println(i+" Hello");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}
public class App1 {
	public static void main(String[] args) {
		Thread t1=new Thread(new Running());
		t1.start();
		
		Thread t2=new Thread(new Running());
		t2.start();
	}
	
}
