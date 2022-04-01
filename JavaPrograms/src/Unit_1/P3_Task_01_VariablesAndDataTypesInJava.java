package Unit_1;
/*
Variables in Java is a data container that saves the data values during the Java program execution 

Types of Variables
1.Local Variables 
2.Instance Variables 
3.Static Variables

*/

public class P3_Task_01_VariablesAndDataTypesInJava {
	
	static int q = 11;
	int p = 10;
	
	public static void main(String[] args) {
//		Valid Declarations 
		int a,b,c;
		float pi;
		double d;
		char e;
		
//		Valid Initialization
		pi = 3.14f;
		d = 20.22;
		e = 'v';
		
		a = 10;
		b = 10;
		c = 10;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(pi);
		System.out.println(d);
		System.out.println(e);
		
		int myNum = 5;
		float myFloatNum = 5.99f;
		char myChar = 'D';
		boolean bool = true;
		String myText = "Hello";
		
		System.out.println(myNum);
		System.out.println(myFloatNum);
		System.out.println(myChar);
		System.out.println(bool);
		System.out.println(myText);
		
//		Java variable Conversion and Type Casting
		
		double f;
		int i = 10;
		f = i;
		
		double g = 10;
		int j;
		j = (int)g;     // Type Casting
		
		System.out.println(f);
		System.out.println(i);
		System.out.println(g);
		System.out.println(j);
		byte k = 10;   // 1 byte
		boolean l = true;   // 1 Bit
		long m = 10L;
		float n = 1.2f;
		double o = 1.2;
		
		System.out.println(k);
		System.out.println(l);
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		
		System.out.println(ABC1.j);
		
		ABC1 obj1 = new ABC1();
		System.out.println(obj1.i++);
		System.out.println(obj1.i);
		
		ABC1 obj2 = new ABC1();
		System.out.println(obj2.j++);
		System.out.println(obj2.j);
		
		ABC1.typeConversionAndTypeCasting();
	}
	
	int r = 10;
	void display() {
		int a = 5;
		System.out.println("This is Display Method");	
	}
}
class ABC1{
	static int j = 10;
	int i = 10;
	
	static void display() {
		int a = 5;
		System.out.println("This is Display Method!");
		System.out.println(a);
	}
	static void typeConversionAndTypeCasting() {
		
		double f;     //64 slots 
		int i = 10;   //32 slots
		f = i;   	  //Type Conversion
		System.out.println(f);
		
		double g = 10;  //64
		int j; 			//32
		j = (int)g;
		
//		32 Bits = 64 Bits 
		System.out.println(i);
		System.out.println(j);
	}
}