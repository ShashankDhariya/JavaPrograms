package Assignment_02;

public class Q8 {
	public static void main(String[] args) throws InterruptedException {
		MT obj = new MT();
		
		Thread one = new Thread(new Runnable(){
			@Override
			public void run() {
				for(int i=0;i<100;i++)
					obj.increment();
			}
		});
		
		Thread two = new Thread(new Runnable(){
			@Override
			public void run() {
				for(int i=0;i<100;i++)
					obj.decrement();
			}
		});
		
		one.start();
		two.start();
		
		one.join();
		two.join();
		
		System.out.println("Final value of t1 : "+obj.t1);
	}
}

class MT extends Thread{
	int t1 = 0;
	public synchronized void increment() {
		t1 += 10;
	}
	
	public synchronized void decrement() {
		t1 -= 10;
	}
}
