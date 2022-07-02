package Assignment_02;

public class Q9 {
	public static void main(String[] args) throws InterruptedException {
		onlinePayment obj = new onlinePayment();
		
		Thread one = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					obj.withdraw(15000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		Thread two = new Thread(new Runnable() {
			@Override
			public void run() {
				obj.deposit(10000);
			}
		});
		
		one.start();
		two.start();
	}
}

class onlinePayment extends Thread{
	int amt = 10000;
	public synchronized void withdraw(int amt) throws InterruptedException {
		if(this.amt < amt) {
			System.out.println("Insufficient Balance of Rs."+amt);
			wait();
			System.out.println("Rs.15,000 Withdrawn");
			this.amt -= amt;
			System.out.println("Current Amount : Rs."+this.amt+"\n");
		}
	}
	public synchronized void deposit(int amt) {
		System.out.println("Rs.10,000 Deposited");
		this.amt += amt;
		System.out.println("Current Amount : Rs."+this.amt+"\n");
		if(this.amt > 15000)
			notify();
	}
}