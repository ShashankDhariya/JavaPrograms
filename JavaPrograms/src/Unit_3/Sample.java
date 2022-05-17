package Unit_3;

import java.util.InputMismatchException;

public class Sample {
	public static void main(String[] args) {
		try {
			int a = 100/0;
			System.out.println(a);
		}catch(InputMismatchException e) {
			System.out.println(e.getMessage()+" exception occured1");
		}catch(Exception e){
			System.out.println(e.getMessage()+" exception occured2");
		}
//		If there is an exception in try block but if don't have appropriate catch block then also finally will work     
		finally {
			System.out.println("Exception Handled");
		}
	}
}
