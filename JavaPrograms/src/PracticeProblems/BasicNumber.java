package PracticeProblems;

/* Find whether a Input number is 
i)  Palindrome or not
ii) odd or even
using interface implementation
*/

import java.util.Scanner;
public class BasicNumber {
	public static void main(String[] args){
		System.out.print("Enter number to be checked : ");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
    
		Solution obj = new Solution();
    
		obj.pallindrome(a);
		obj.oddEven(a);
		in.close();
	}
}

interface problem{
	void pallindrome(int n);
	void oddEven(int n);
}

class Solution implements problem{

	public void pallindrome(int n){
		int r,revs = 0;
		int num = n;
		while(num>0){
			r = num % 10;
			revs = revs*10 + r;
			num /= 10;
		}
		System.out.println("Reverse of "+n+ " is "+revs);
		if(n == revs)
			System.out.println("So number is palindrome\n");
		else 
			System.out.println("So number is not palindrome\n");
}

public void oddEven(int n){
    if(n % 2 == 0)
        System.out.println("Number is Even");
    else 
        System.out.println("Number is Odd");
	}
}