package demo3;

public class App {
	public static void main(String[] args) {
		Runnable run=new Runnable() {
			
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
		};
		Thread t1=new Thread(run);
		t1.start();
		Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<10;i++){
					try {
						Thread.sleep(100);
						System.out.println(i+" Hi");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				
			}
		});
		t2.start();
		
	}
}
