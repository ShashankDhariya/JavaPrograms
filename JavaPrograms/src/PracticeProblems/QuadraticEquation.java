package PracticeProblems;

// 	Solve the Quadratic Equation by taking input from the user.

import java.util.Scanner;

public class QuadraticEquation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Format of Equation : ax^2 + bx + c");
		System.out.print("Enter values of a : ");
		int a = in.nextInt();
		System.out.print("Enter values of b : ");
		int b = in.nextInt();
		System.out.print("Enter values of c : ");
		int c = in.nextInt();
		
		System.out.println("Entered Equation is : "+a+"x^2+"+b+"x+"+c);
		
		quadEqn obj = new quadEqn();
		double d = obj.discre(a, b, c);
		System.out.println("\nThe value of Discrement is : "+d);
		obj.solution(a,b);
		in.close();
	}
}

class quadEqn{
	double d;
	double discre(int a, int b, int c) {
		d = b*b-(4*a*c);
		return d;
	}
	
	float x;
	float y;
	void solution(int a, int b) {
		d = (Math.sqrt(d));

		if(d == 0) {
			
			x = (float)-b/(2*a);
			System.out.println("Equation has same roots");
			System.out.println("The values of zero is "+x);
		}
		
		else if(d > 0) {
		
			x = (float)(-b + d)/(2*a);
			y = (float)(-b - d)/(2*a);
			System.out.println("Equation has Different roots");
			System.out.println("The values of zero is "+x+" & "+y);
		}
		
		else {
			System.out.println("Equation has imaginary roots");
		}
	}
}