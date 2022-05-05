/*
 As given there are two sample methods: First one returns the sum of two numbers a and b and second one returns the 
 subtraction of a and b. if a-b is negative then return value would be 0. Use ternary operator to call these two methods.
 If a>b then ternary should call sum(a,b) but if a<b then ternary operator should call sub(a,b). Eventually print the 
 result of the ternary operation on variable a and b.
 
 */

package Assignment_01;

import java.util.Scanner;

public class Q11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int a = in.nextInt();
		
		System.out.print("Enter second number : ");
		int b = in.nextInt();
		
		in.close();
		
		boolean bool = (a>b)? (true):(false);
		if(bool == true) {
			System.out.println("Sum is "+sum(a,b));
		}
		
		else {
			System.out.println("Difference is "+sub(a,b));
		}
	}
	static int sum(int a, int b) {
		return a+b;
	}
	
	static int sub(int a, int b) {
		boolean bool = (a-b < 0)? true:false;
		if(bool == true) {
			return 0;
		}
		else{
			return a-b;
		}
	}
}
