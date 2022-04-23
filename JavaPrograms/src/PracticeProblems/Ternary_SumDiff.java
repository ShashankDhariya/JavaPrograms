package PracticeProblems;
/*  
Create two methods 1st will return sum of two numbers and 2nd will return subtraction of A, B. 
If A<B, then the ternary operator should return 0.
Use ternary operator to all these methods .If A>B, the ternary should call sum A, B. 
But if A<B, the ternary operator should call A, B.

*/
import java.util.Scanner;
public class Ternary_SumDiff {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int a = in.nextInt();
		System.out.print("Enter second number : ");
		int b = in.nextInt();
		in.close();
		boolean bool = (a>b)? true:false;
		if(bool == true){
			int sum = add(a, b);
			System.out.println("Sum is "+sum);
		}
		else{
			int diff = sub(a, b);
			System.out.println("Difference is "+diff);
		}	
	}

	public static int add(int a, int b){
		return a+b;    
	}

	public static int sub(int a, int b){
		boolean bool = (a<b)? true:false;
		if(bool == true)
			return 0;
		else
			return a-b;    
	}
}