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
		obj.inputMismatchException();
//		obj.stackOverFlow(10);				// Stack overflow is not an exception, it's a error
		obj.indexOutOfBoundException();
		obj.nullPointerException();
//		obj.useOfThrow(17);
		obj.useOfThrows_And_Finally();
		obj.checkedAndUncheckedException();
		obj.ManualExceptionThrow();
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
			System.out.print("Enter a number : ");
			int a = in.nextInt();
			System.out.println("Entered number : "+a);
			in.close();
		}catch(InputMismatchException e) {
			System.out.println("Input Mismatch Exception occured");
		}
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
//		Stack overflow isn't a exception but a error so it can't be handled using exception handling concept of Java
		System.out.println("Done");
	}
	
	void indexOutOfBoundException() {
		try{
			int[] myNumbers = {1, 2, 3};
			System.out.println(myNumbers[10]);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	void nullPointerException() {
		try{
			String s = null;
			System.out.println(s.length());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
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
//			e.printStackTrace();	prints the exception
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println("Exception handled succesfully");
		}
	}
	
	void checkedAndUncheckedException() {
//		Unchecked Exception: Runtime catching
		
/*		This exception is caught at runtime 
 		int x = 0;
		int y = 10;
		int z = y / x;
		System.out.println(z);
*/

//		Checked Exception: Compile time catching
		try {
			useOfThrow(1);
		} catch (Exception e) {
			System.out.println("Not eligible(Exception Handled)");
		}
	}
	
	void area(int r) throws ManualException{
		if(r < 0)
			throw new ManualException();
		else 
			System.out.println("Area is : "+r*r);
	}
	
	void ManualExceptionThrow() {
		try {
			area(-1);
		}catch(ManualException e){
			System.out.println(e.getMessage());
		}
	}
}


@SuppressWarnings("serial")
class ManualException extends Exception{
	@Override
	public String getMessage() {
		String msg = "Exception Occured";
		return msg;
	}
}