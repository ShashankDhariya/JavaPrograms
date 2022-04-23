// WAP to count the total number of calls for a member function from more than one objects. [Let’s say, from 3 such Objects].

package Assignment_01;

public class Q2 {
	public static void main(String[] args) {
		
		System.out.println("ShashankDhariya_G_20011953\n");
		
		ABCD obj1 = new ABCD();
		ABCD obj2 = new ABCD();
		ABCD obj3 = new ABCD();
		
		obj1.call();
		obj2.call();
		obj3.call();
		
		System.out.println("Number of object calls : "+ABCD.ctr);
	}
}

class ABCD{
	static int ctr = 0;
	void call() {
		ctr++;
	}
}
