package Assignment_02;

public class Q1 {
	public static void main(String[] args) throws InterruptedException {
		solution obj = new solution();
		
		Thread ThreadOne = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<100;i++) {
					obj.increment();
				}
			}
		});
		
		Thread ThreadTwo = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<100;i++) {
					obj.increment();
				}
			}
		});
		
		Thread ThreadThree = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<100;i++) {
					obj.increment();
				}
			}
		});
		
		Thread ThreadFour = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<100;i++) {
					obj.increment();
				}
			}
		});
		
		Thread ThreadFive = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<100;i++) {
					obj.increment();
				}
			}
		});
		
		ThreadOne.start();
		ThreadTwo.start();
		ThreadThree.start();
		ThreadFour.start();
		ThreadFive.start();
		
		ThreadOne.join();
		ThreadTwo.join();
		ThreadThree.join();
		ThreadFour.join();
		ThreadFive.join();
		
		System.out.println(obj.t1);
	}
}

class solution extends Thread{
	static String t1 = new String();
	public synchronized void increment() {
		t1 += 5;
	}
}
