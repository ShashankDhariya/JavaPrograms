package Unit_3;

/* 
   InterThread Communication:
   - Threads uses wait, notify() and notifyAll() methods from Object Clas
   - command + Shift + T -> Find object class and see its methods
   - command + O -> all methods
 */

public class P16_MultiThreading_WaitAndNotify {
	public static void main(String[] args) {

		SharedResource c = new SharedResource();
		
		new Thread() {
			public void run() {
				c.withdraw(15000);
			}
		}.start();
		
//		new Thread() {
//			public void run() {
//				c.withdraw(15000);
//			}
//		}.start();
		
		new Thread() {
			public void run() {
				c.deposit(10000);
				//c.deposit(30000);
			}
		}.start();
	}

}

class SharedResource {
	int amount = 10000;

	synchronized void withdraw(int amount) {
		System.out.println("Going to withdraw...");

		if (this.amount < amount) {
			System.out.println("Less balance => Waiting for deposit...");
			try {
				wait();		// Starts at this line
			} catch (Exception e) {
			}
		}
		this.amount -= amount;
		System.out.println("Withdraw completed...");
	}

	synchronized void deposit(int amount) {
		System.out.println("Going to deposit...");
		this.amount += amount;
		System.out.println("Deposit completed... ");
//		notify();			//Resumes any of the wait function 
		notifyAll();		//Resumes all of the wait functions
	}
}