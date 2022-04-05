package Unit_1;

/*
 * The Wrapper Class in java provides the mechanism to convert primitive into object
 * Because we want to use pre defined methods of those objects 
 * - boolean data types -> Boolean obj -> obj.toString();
 */
public class P4_Task_02_WrappingClassesInJava {
	public static void main(String[] args) {
		
		//Converting int to Integer
		int a = 20;
		String s = "" + a + "";
		
		Integer i = Integer.valueOf(a);  // Converting int into Integer explicitly
		Integer j = a; // autoboxing, now compiler will write Integer.valueOf(a)internally
		
		System.out.println(a +" " + i + " " + j);
		System.out.println(i.toString());
		
		// a.toString can't be done as a is int not a object
		
		//Autoboxing: Converting primitive into objects 
		byte b =10;
		Byte byteobj = b;
		System.out.println(byteobj);
		
		//Unbxing : Converting objects into primitives
		byte bytevalue = byteobj;
		System.out.println(bytevalue);	
	}
}
