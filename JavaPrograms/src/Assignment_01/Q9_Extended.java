package Assignment_01;

public class Q9_Extended {
	public static void main(String[] args) {
		
		display3();
		Name2 obj = new Name2();
		
		obj.display1();
		obj.display2();
		
		
		obj.displayo();
		
		System.out.println("Accessed public variable in main method : "+obj.a);	// Accessible outside the class(Public variable)
		System.out.println("Accessed protected variable in main method : "+obj.b);	// Accessible outside the class(Protected variable)
//		System.out.println(obj.c);	// Not accessible outside the class(Private variable)
		System.out.println("Can't access private variable in main method");
		
	}
	private static void display3() {
		System.out.println("Hello Buddy(from Private method of the main class)");
	}
}

class Name1{
	public int a = 10;
	protected int b = 20;
	private int c = 30;
	
	public void display1() {
		System.out.println("Hello Buddy(from public method of Base class)");
	}
	
	protected void display2() {
		System.out.println("Hello Buddy(from protected method of Base class)");
		System.out.println("Private integer : "+c+"\n");      // Accessible within the class 
	}
}

class Name2 extends Name1{
	public void displayo() {
		System.out.println("Hello Buddy(from Extended class)");
		System.out.println("Protected integer : "+b+"\n");
	}
}

