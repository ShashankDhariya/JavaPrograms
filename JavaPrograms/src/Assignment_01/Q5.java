/*
 WAP in Java which would contain 8 objects of a Class Employee. Employee contains name, age, department, salary.
 Your program would be able to calculate the total salary to be paid in each department. Use constructors to create
 these 8 objects and Scanner to take inputs
 
 Restrictions:
	1- Minimum 8 objects [can be created manually with parameterized constructors with Scanner input]
	2- Departments are, A, B, C, D: minimum 4 departments [String Type]
	3- If the Salary exceeds more than 30,000, then the default salary would be 25000 of any of the employee
	4- Use array of objects, instead of using multiple 8 objects separately

 Use: 
	Employee arr[] = new Employee[8];
	And
	arr[i].department.equals("A")
 
 */

package Assignment_01;
import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		employee[] obj = new employee[8];
		for(int i=0;i<8;i++) {
			
			System.out.print("Enter Name : ");
			String name = in.next();
			
			System.out.print("Enter Age : ");
			int age = in.nextInt();
			
			System.out.print("Enter Department : ");
			String department = in.next();
			
			System.out.print("Enter Salary : ");
			int salary = in.nextInt();
			
			obj[i] = new employee(name,age,department,salary);
		}
		in.close();
		
		for(int i=0;i<8;i++) {
			System.out.println("Name 	   : "+obj[i].n);
			System.out.println("Age  	   : "+obj[i].a);
			System.out.println("Department : "+obj[i].d);
			System.out.println("Salary	   : "+obj[i].s);
			System.out.println();
		}
	}
}

class employee{
	String n;
	int a;
	String d;
	int s;
	employee(String name, int age, String department, int salary){
		n = name;
		a = age;
		d = department;
		if(salary > 30000)
			s = 25000;
		else
			s = salary;
	}
}
