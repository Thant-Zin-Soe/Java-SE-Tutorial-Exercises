
public class App {
	public static void main(String[] args) {
		Machine mac1 = new Machine();
		mac1.start();

		Machine mac2 = new Machine() {
			public void start() {
				System.out.println("I am machine from annonymous class.");
			}
		};
		mac2.start();

		SHowInfo info = new SHowInfo() {

			public void show() {
				// TODO Auto-generated method stub
				System.out.println("I am showInfo from annonymous .");
			}

		};
		info.show();
	}
}
