package Unit_2;

public class P13_Assignment_Unit_2 {
	public static void main(String[] args) {
		 
		Assignment_Questions_Unit_2 obj  = new Assignment_Questions_Unit_2;
		obj.abstractClasscall();
		obj.overloadingAndOverriding();
		obj.accessProtectionInJava();
		obj.interfaceImplementation();
	}
}

class Assignment_Questions_Unit_2{
	
	void abstractClasscall() {
		Sample3 obj = new Sample3();
		obj.run();
	}
	
	void overloadingAndOverriding() {
		Sample3 obj = new Sample3();
		obj.run();
		obj.run(1);
		obj.run(1,2);
		obj.display();
 	}
	
	void accesProtectionInJava() {
		Sample3 obj = new Sample3();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		
		obj.showData();
		obj.display();
	}
	
	void interfaceImplementation() {
		Sample3 obj = new Sample3();
		obj.display1();
		obj.display2();
	}
}

abstract class Sample2{
	
	int a = 10;   //default protection 
	public int b = 20; // can be accessed outside Unit_2 Package but within same project 
	protected int c = 30; // can only be accessed within Unit_2 Package
	private int d = 40;   // within Parentclass only, not even in its sub class 
	
	void showData() {
		System.out.println("Inside Sample2 Parent class");
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
		System.out.println("c = "+ c);
		System.out.println("d = "+ d);
	}
	
	public void display() {
		System.out.println("This is a display method inside abstract class Sample2");
	}
	abstract public void run();
	
}

class Sample3 extends Sample2 implements A3, B3{
	
	public void display() {
		System.out.println("Inside ChildClass");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
//		System.out.println("d = " + d);    //Private member can't be accessed
	}
	
	public void display1() {
		System.out.println("This is a display1 method in child class sample3 from Interface");
	}
	
	public void display2() {
		System.out.println("This is a display2 method in child class sample3 from Interface");
	}
	
	public void run() {
		System.out.println("This is a run method from abstract class sample2");
	}
	
	public void run(int x) {
		System.out.println("This is a run method overloaded from abstract class sample3");
	}
	
	public void run(int x, int y) {
		System.out.println("This is a run method overloaded from abstract class sample3");
	}
}

interface A3{
	public void display1();
}

interface B3{
	public void display2();
}