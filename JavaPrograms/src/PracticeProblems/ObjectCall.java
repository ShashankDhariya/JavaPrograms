package PracticeProblems;

import java.util.Scanner;
public class ObjectCall {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		ABCD obj = new ABCD();
		int a = in.nextInt();
		for(int i=0;i<a;i++) {
			obj.call();
		}
		System.out.println("Number of object calls : "+ABCD.ctr);
	}
}

class ABCD{
	static int ctr = 0;
	void call() {
		ctr++;
	}
}
