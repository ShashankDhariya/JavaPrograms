/*
  As given there are two sample methods: First one returns the sum of two numbers a and b and second one returns the 
  subtraction of a and b. if a-b is negative then return value would be 0. Use ternary operator to call these two methods. 
  If a>b then ternary should call sum(a,b) but if a<b then ternary operator should call sub(a,b). Eventually print the 
  result of the ternary operation on variable a and b.
  Note: Ternary operator can call a method even for true and false value
 */

package Assignment_01;

import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
		
		System.out.println("ShashankDhariya_G_20011953\n"); 
		
		Scanner in = new Scanner(System.in);
		sample obj = new sample();
		System.out.print("Enter first number : ");
		int a = in.nextInt();
		System.out.print("Enter second number : ");
		int b = in.nextInt();
		in.close();
		
		boolean bool = (a > b)? true:false;
		
		if(bool == true) {
			int s = obj.sum(a,b);
			System.out.println("Result is "+s);
		}
		else{
			int d = obj.sub(a,b);
			System.out.println("Result is "+d);
		}
	}
}

class sample{
	int sum(int a, int b){
		return a+b;
	}
	int sub(int a, int b){
		if(a-b < 0)
			return 0;
		else
			return a-b;
	}
}
