// Find whether a input number is prime or not using interface implementation

package PracticeProblems;

import java.util.Scanner;
public class Prime_InterfaceImplementation {
	
    public static void main(String[] args){
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