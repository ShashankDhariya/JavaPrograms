/*
 Given an interface in1 which includes a method display which takes an integer as input .
	interface In1
	{
 		void display(int p);
	}
 Task is to write a class testClass which implements interface In1 and has a method named display which takes an integer 
 as an input p and the display method should be able to tell if the number is prime or not?
 The main method should not be in testClass, create a separate class for that
 
 */

package Assignment_01;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args){
		
		System.out.println("ShashankDhariya_G_20011953\n");
		
        System.out.print("Enter number to be checked : ");
        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt();
        primeNumber obj = new primeNumber();
        obj.prime(a);
        
        in.close();
    }
}

interface primeNum{
    void prime(int n);
}

class primeNumber implements primeNum{
    
    public void prime(int n){
    	
        int ctr = 0;
        for(int i=1;i<=n/2;i++){
            if(n % i == 0) {
                ctr++;
            }
        }
        
        if(ctr == 1)
            System.out.println(n+" is a prime number");
        else
            System.out.println(n+" is not a prime number");
    }
}