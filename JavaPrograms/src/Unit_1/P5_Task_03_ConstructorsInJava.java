package Unit_1;
/* 
 - It is called when an instance of the class is created 
 - At the time of calling the constructor, memory for the object is allocated in the memory
 - It is a special type of method which is used to initialize the object
 - Every time an object is created using the new() keyword, at least one constructor is called
 - Two types of Constructors in Java
 	- Parameterized Constructor 
 	- Default Constructor
 */
public class P5_Task_03_ConstructorsInJava {
	public static void main(String[] args) {
		ABCD2 obj = new ABCD2();
		ABCD2 obj1 = new ABCD2(1);
		
		System.out.println(obj.a);
		System.out.println(obj1.a);
	}
}

class ABCD2{
	
	int a;
	/*
	 ClassName(Constructor Parameters){
	 	All the class and Instance variables can be initialized here!
	 }
	  */
	ABCD2(){
		a = 10;
	}
	
	ABCD2(int a){
		this.a = a;
	}
	
	void display() {
		int b = 10;
		System.out.println(a);
		System.out.println(b);
	}
	
	int display2() {
		System.out.println(a);
		//As a was a local variable so we can't access it outside the method 
//		System.out.println(b);
		return a;
	}
}