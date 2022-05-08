/*
	WAP in java, which would demonstrate access protection over a class and a variable of that class.
 	Note: class can be public and default while variable can be default, private, protected, and public.
 	(If required then do create more than 2 packages).
 
 */
package Assignment_01;

public class Q9 {
	public static void main(String[] args) {
		
		System.out.println("ShashankDhariya_G_20011953\n");
		
		Name1 obj1 = new Name1();
		System.out.println("Accessed public variable of other class(Same Package) : "+obj1.a);		// Accessed public variable of other class 
		System.out.println("Accessed protected variable of other class(Same Package) : "+obj1.b);		// Accessed protected variable of other class
//		Refer Q9_Extented class
		
//		System.out.println(obj.c);
		System.out.println("Can't access private vaiable");
		
	}
}


