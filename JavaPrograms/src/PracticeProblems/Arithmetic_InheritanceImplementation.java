package PracticeProblems;
/* 
	Make a class named as unary(to perform unary operations) inherit a class binary 
    (to perform binary operations) by taking input from the user.
*/
import java.util.Scanner;

public class Arithmetic_InheritanceImplementation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter number to be operated for Unary operation : ");
		int a = in.nextInt();
		System.out.println("Before operation :  "+a);
		binary obj = new binary();
		obj.increment(a);
		obj.decrement(a);
		System.out.println();
		
		System.out.print("Enter number to be operated for Binary operation : ");
		int b = in.nextInt();
		int c = in.nextInt();
		obj.add(b, c);
		obj.sub(b, c);
		obj.multiply(b, c);
		obj.division(b, c);
		in.close();
	}
}

class unary{
	void increment(int a) {
		a++;
		System.out.println("After Increment value is "+a);
	}
	
	void decrement(int a) {
		a--;
		System.out.println("After decrement value is "+a);
	}
}

class binary extends unary{
	void add(int a,int b) {
		int sum = a+b;
		System.out.println(a+"+"+b+" = "+sum);
	}
	
	void sub(int a,int b) {
		int s = a-b;
		System.out.println(a+"-"+b+" = "+s);
	}
	
	void multiply(int a,int b) {
		int s = a*b;
		System.out.println(a+"X"+b+" = "+s);
	}
	
	void division(int a,int b) {
		int s = a/b;
		System.out.println(a+"/"+b+" = "+s);
	}
}