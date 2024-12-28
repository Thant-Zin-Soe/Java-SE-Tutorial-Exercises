package demo1;
class Runner extends Thread{
	@Override
	public void run(){
		for(int i=0;i<10;i++){
			try {
				Thread.sleep(500);
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
		Runner ran1=new Runner();
		ran1.start();
		Runner ran2=new Runner();
		ran2.start();
		System.out.println("Finished");
	}
}
