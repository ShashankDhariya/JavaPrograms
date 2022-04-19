package PracticeProblems;

import java.util.Scanner;

public class StringReverse_InterfaceImplementation {
	public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string : ");
        
        String str = in.nextLine();
        
        SolutionString obj = new SolutionString();
        obj.reverse(str);
        obj.palindrome(str);
        in.close();
    }
}

interface ProblemString{
    void reverse(String str);
    void palindrome(String str);
}
class SolutionString implements ProblemString{
    
    public void reverse(String str){
        System.out.print("Reverse of the String is : ");
        int n = str.length();
        for(int i=0;i<n;i++){
            System.out.print(str.charAt(n-i-1));
        }
        System.out.println();
    }
    
    public void palindrome(String str){
        
        int n = str.length();
        int ctr = 0;
        
        int j = n;
        int i=-1;
        
        while(++i<= --j){
            if(str.charAt(i) != str.charAt(j)) {
            	ctr++;
            	break;
            }
        }
        
        if(ctr == 0)
            System.out.println("Strings is palindrome");
        else 
            System.out.println("Strings is not palindrome");
    }
}
