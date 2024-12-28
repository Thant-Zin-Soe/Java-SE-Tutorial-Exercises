import java.util.Scanner;

class processor extends Thread {
	private volatile boolean flag = true;

	@Override
	public void run() {
		while (flag) {
			System.out.println("Hello");
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

	public void stopRunning() {
		flag = false;
	}
}

public class App {
	public static void main(String[] args) {
		processor ps=new processor();
		ps.start();
		Scanner scan=new Scanner(System.in);
		scan.nextLine();
		ps.stopRunning();
	}

}
