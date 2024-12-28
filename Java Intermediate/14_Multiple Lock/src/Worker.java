import java.util.ArrayList;

import java.util.List;

public class Worker {
	List<Integer> list1 = new ArrayList<>();
	List<Integer> list2 = new ArrayList<>();

	Object obj1 = new Object();
	Object obj2 = new Object();

	public void main() {
		long start=System.currentTimeMillis();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				process();
			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				process();
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
		long end=System.currentTimeMillis();
		System.out.println("Time Taken:"+(end-start));
	}

	public void process() {
		for (int i = 0; i < 1000; i++) {
			addList1();
			addList2();
		}

	}

	public void addList1() {
		synchronized (obj1) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			list1.add(23);
		}
	}

	public void addList2() {

		synchronized (obj2) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			list2.add(23);
			
		}
	}

}
