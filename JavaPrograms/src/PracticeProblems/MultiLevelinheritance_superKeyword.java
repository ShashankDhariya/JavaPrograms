package PracticeProblems;

/* 	
	Make three class One, Two, Three and inherit Three from Two, Two from One.
	One class has one single parameterized constructor,
	Two has single default constructor,
	Three has both default and parameterized constructor.
	Create object top child class and maintain flow of constructor calls. 
*/

import java.util.Scanner;
public class MultiLevelinheritance_superKeyword {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number : ");
		int a = in.nextInt();
		Three obj = new Three(a);
		in.close();
	}
}

class One{
	One(int a){
    	System.out.println("Class One => Paramterized Constructor");
	}
}

class Two extends One{
	Two(){
		super(11);
		System.out.println("Class Two => Default Constructor");
	}
}

class Three extends Two{
	Three(){
		System.out.println("Class Three => Default Constructor");
	}

	Three(int a){
		System.out.println("Class Three => Paramterized Constructor");
	}
}