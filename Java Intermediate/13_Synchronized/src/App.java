
public class App {
	private int count;

	public static void main(String[] args) {
		App app = new App();
		app.startRunning();

	}

	public  void startRunning() {// if u write static u do not need to create a app oblrct lineNo. 6
		// BUT if u write static in method (startRunning) u just nedd to write App.method (class.method).

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					increament();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					increament();
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
	
	public synchronized void  increament() {
		count++;
	}
	
}
