/*
 	WAP which would contain 6 objects, of a class Student. Student [Name, Age, section, percentage]. They all belong to 
 	Section-A. Your program would be able to find the average percentage of students in this section. Use constructors 
 	to create these 6 objects and input from Scanner class. 
 
 */

package Assignment_01;
import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		
		System.out.println("ShashankDhariya_G_20011953\n");
		
		Scanner in = new Scanner(System.in);
		Student[] obj = new Student[6];
		
		for(int i=0;i<6;i++) {
			System.out.println("Enter details of "+(i+1)+"st Student");
			
			System.out.print("Enter Name : ");
			String name = in.next();
			
			System.out.print("Enter Age : ");
			byte age = in.nextByte();
			
			System.out.print("Enter Percentage: ");
			int perc = in.nextInt();
			
			obj[i] = new Student(name,age,'A',perc);
		}
		in.close();
		
		int sum = 0;
		for(int i=0;i<6;i++) {
			sum += obj[i].perc;
		}
		System.out.println("Average of all 6 students is "+(float)sum/6);
		in.close();
	}
}

class Student{
	String name;
	byte age;
	char sec;
	int perc;
	Student(String n, byte a, char s,int p){
		name = n;
		age = a;
		sec = s;
		perc = p;
	}
}
