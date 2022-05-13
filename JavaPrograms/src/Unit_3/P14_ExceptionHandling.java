package Unit_3;

// Error can't be handled in any of the case while exception can be handled.

import java.util.Scanner;
import java.util.InputMismatchException;

public class P14_ExceptionHandling {
	public static void main(String[] args) {
		
		exception obj = new exception();
		
//		obj.basicException();
		obj.handleException();
		obj.multipleCatch();
//		obj.inputMismatchException();
//		obj.stackOverFlow(10);				// Stack overflow is not an exception, it's a error
		obj.indexOutOfBoundException();
		obj.nullPointerException();
//		obj.useOfThrow(17);
		obj.useOfThrows_And_Finally();
	}
}

class exception{
	
	void basicException() {
		
//		Compiler can't catch this exception at compile time (Divide by zero(0) exception) 
		int b = 0;
		int a = 100/b;
		System.out.println(a);
	}
	
	void handleException() {
		try {
//			Sensitive code
			int b = 0;
			int a = 100/b;
			System.out.println(a);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage()+" exception handled");
		}
		System.out.println("Done");
	}
	
	void multipleCatch() {
		try {
//			Sensitive code
			int b = 0;
			int a = 100/b;
			System.out.println(a);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage()+" exception handled");
		}
		catch(Exception e) {
			System.out.println(e.getMessage()+" exception handled");
		}
	}
	
	void inputMismatchException() {
		try{
			Scanner in = new Scanner(System.in);
			System.out.println("Enter a number : ");
			int a = in.nextInt();
			System.out.println("Entered number : "+a);
			in.close();
		}catch(InputMismatchException e) {
			System.out.println("Input Mismatch Exception");
		}
		System.out.println("Done");
	}
	
	void stackOverFlow(int i) {
		try{
			while(i>0) {
				i++;
				stackOverFlow(i);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Done");
	}
	
	void indexOutOfBoundException() {
		try{
			int[] myNumbers = {1, 2, 3};
			System.out.println(myNumbers[10]);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Done");
	}
	
	void nullPointerException() {
		try{
			String s = null;
			System.out.println(s.length());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Done");
	}
	
	void useOfThrow(int age) throws Exception{
		if(age<18)
			throw new Exception();
		else 
			System.out.println("You are eligible");
	}
	
	void useOfThrows_And_Finally() {
		try {
			useOfThrow(17);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			System.out.println("Exception handled succesfully");
		}
		
	}
}