/*
  WAP to count the total number of calls for a member function: display(), from more than one objects and 
  how many times the object is created of a class name Employee.
  Note: Call display() function from more than 3 objects
  
 */
package Assignment_01;

public class Q7 {
	public static void main(String[] args) {
		
		System.out.println("ShashankDhariya_G_20011953\n");
		
		Employe obj1 = new Employe();
		Employe obj2 = new Employe();
		Employe obj3 = new Employe();
		Employe obj4 = new Employe();
		Employe obj5 = new Employe();
		
		obj1.display();
		obj2.display();
		obj3.display();
		obj4.display();
		obj5.display();
		
		System.out.println("Total number of calls of member function is "+Employe.calls);
		System.out.println("Number of objects created is "+Employe.calls);
	}
}

class Employe{
	
	static int calls = 0;
	void display() {
		calls++;
	}
}
