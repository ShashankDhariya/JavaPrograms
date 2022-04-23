/*
  Create a multilevel inheritance hierarchy from ClassOne, ClassTwo, ClassThree classes.
  ClassOne contains one, single parameterized constructor ClassTwo contains only a default constructor ClassThree 
  contains one, single parameterized constructor and a default constructor.
  Create an object of top child class and make sure the constructor execution will take place according to respective 
  Multilevel inheritance hierarchy.
  
	ClassThree obj = new ClassThree(1);
	ClassThree obj = new ClassThree()
 
 */

package Assignment_01;

public class Q4 {
	public static void main(String[] args) {
		
		System.out.println("ShashankDhariya_G_20011953\n");
		
		ClassThree obj = new ClassThree(1);
		System.out.println();
		ClassThree obj1 = new ClassThree();
	}
}

class ClassOne{
	
	ClassOne(int a){
    	System.out.println("Class One => Paramterized Constructor");
	}
}

class ClassTwo extends ClassOne{
	
	ClassTwo(){
		super(1);
		System.out.println("Class Two => Default Constructor");
	}
}

class ClassThree extends ClassTwo{
	
	ClassThree(){
		System.out.println("Class Three => Default Constructor");
	}

	ClassThree(int a){
		System.out.println("Class Three => Paramterized Constructor");
	}
}
