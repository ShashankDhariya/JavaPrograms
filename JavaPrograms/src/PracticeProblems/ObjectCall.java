package PracticeProblems;

public class ObjectCall {
	public static void main(String[] args) {
		
		ABCD obj1 = new ABCD();
		ABCD obj2 = new ABCD();
		ABCD obj3 = new ABCD();
		ABCD obj4 = new ABCD();
		
		obj1.call();
		obj2.call();
		obj3.call();
		obj4.call();
		
		System.out.println("Number of object calls : "+ABCD.ctr);
	}
}

class ABCD{
	static int ctr = 0;
	void call() {
		ctr++;
	}
}
