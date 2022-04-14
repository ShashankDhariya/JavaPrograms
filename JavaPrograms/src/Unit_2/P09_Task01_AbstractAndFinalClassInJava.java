package Unit_2;

/*
Abstract Class:
 - An abstract class in must be declared with an abstract keyword.
 
 - Abstraction is a process of hiding the implementation details 	
   and showing only the functionality(function declarations) to the user.
 - Can't make object of abstract class directly, but through derived class (can't be 

- Examples of abstract method 
- Abstract class may contain abstract and non-abstract methods 
- (0-100%) abstract methods can be there

 - In case of Interface: 100% abstract methods should be there
 
 Final Class:
 - The main purpose of using a class being declared as final is to prevent the class from being sub-classed.
  - If a class, is marked as Final then no class can be inherit any feature from the Final class.
 - We can't extend a final class, If we try it'll give a compile time error. 

*/

abstract class Bike {
	int a;
	 Bike(){
		 System.out.println("Inside Bike Constructor : "+a+"\n");
	 }
	 
//	 abstract void run();	// abstract method (0-100%)
	 
	 void display() {
		 System.out.println("This is Display method");
	 }
}

class Honda extends Bike {
	
}

public class P09_Task01_AbstractAndFinalClassInJava {
	public static void main() {
		Bike obj = new Honda();
//		obj.run();
		obj.display();
		
//		Can't be initiated 
//		Bike obj2 = new Bike();
		
	}
}

// FINAL CLASS 
final class Super{
	
	public int data = 10;
	
	void display() {
		System.out.println(data);
	}
}

/*
 public class Sub extends Super {
 
	 void diaplay2() {
		 display();
	 }
 }
*/