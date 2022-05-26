package Unit_3;

/* MultiThreading PreRequisite
 
i)  MutiProcessing - 
	a) Sequential MutiProcessing - One after other process
	b) Parallel MutiProcessing - At same time(Depends upon number of processors)
	c) Concurrent MutiProcessing - Context switching(CPU is responsible)
	
ii) MultiTasking -
 	a) Sequential MultiTasking - One after other task
 	b) Parallel MultiTasking - At same time
 	c) Concurrent MultiTasking - Context switching(JVM is responsible(execution) )
   
 */
import java.util.Scanner;
public class P16_MultiThreading {
	public static void main(String[] args) {
		
//		c1 obj1 = new c1();
//		c2 obj2 = new c2();
//		obj1.show1();
//		obj2.show2();
		
		Thread t1 = new Thread(new T1(), "T1");		//String T1 is the name by which JVM addresses the Thread
		Thread t2 = new Thread(new T2(), "T2");
		Thread t3 = new Thread(new T3(), "T3");
		
		t1.start();		// .start internally calls run() method 
		t2.start();
		t3.start();
	}
}

class T1 extends Thread{
//	We're overriding run method
	public void run() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number : ");
		int a = in.nextInt();
		System.out.println("Entered number : "+a);
		in.close();
	}
}

class T2 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Hello World");
		}
		System.out.println();
	}
}

class T3 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Hello Buddy");
		}
		System.out.println();
	}
}

class c1{
	void show1() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number : ");
		int a = in.nextInt();
		System.out.println("Entered number : "+a);
		in.close();
	}
}

class c2{
	void show2() {
		for(int i=0;i<5;i++) {
			System.out.println("Hello Buddy");
		}
	}
}