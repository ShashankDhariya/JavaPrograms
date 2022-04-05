package Unit_1;
import java.util.Scanner;

/*
 * When user takes input from the console
 
 nextLine()		Reads user input (to read Strings)
 next()			Read next token from the input entered by the user 
 nextBoolean()	Reads a boolean value from the user
 nextByte()		Reads a byte value from the user
 nextDouble()	Reads a double value from the user
 nextFloat()	Reads a float value from the user
 nextInt()		Reads a int value from the user
 nextLine()		Reads a String value from the user
 nextLong()		Reads a long value from the user
 nextShort()	Reads a short value from the user
 
 */
public class P4_Task_03_ScannerClassInJava {
	public static void main(String[] args) {
		Scanner obj1 = new Scanner(System.in);  //Creates a Scanner object
		
		//Read the First-Token(_ space bar)
		String name = obj1.next();
		System.out.println("Name : "+name);
		
		String name1 = obj1.nextLine();
		System.out.println("Name : "+name1);
		
		boolean b = obj1.nextBoolean();
		System.out.println(b);
		
		obj1.close();
	}
}
