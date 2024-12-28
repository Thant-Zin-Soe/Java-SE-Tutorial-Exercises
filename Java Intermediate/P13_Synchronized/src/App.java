public class App {
	private int count;

	public static void main(String[] args) {
		App app = new App();
		app.startRunning();

	}
public void  startRunning() {
	
	Thread t1 = new Thread(new Runnable() {

		@Override
		public void run() {
			for (int i = 0; i < 1000; i++) {
				increment();
			}
		}
	});

	Thread t2 = new Thread(new Runnable() {

		@Override
		public void run() {
			for (int i = 0; i < 1000; i++) {
				increment();
			}
		}
	});
	t1.start();
	t2.start();
	try {
		t1.join();
		t2.join();
	} catch (InterruptedException e) {
		// TODO: handle exception
	}
	System.out.println("Count:"+count);
}
	
	
	
	public synchronized void increment() {
		count++;
	}
}


