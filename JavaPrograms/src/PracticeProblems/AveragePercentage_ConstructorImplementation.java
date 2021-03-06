package PracticeProblems;

import java.util.Scanner;

public class AveragePercentage_ConstructorImplementation {
	public static void main(String[] args) {
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
		System.out.println("Average of all 6 students is "+(float)Student.sum/6);
		
		in.close();
//		Another method to find average without using static variable 
//		int sum = 0;
//		for(int i=0;i<6;i++) {
//			sum += obj[i].perc;
//		}
//		System.out.println("Average of all 6 students is "+(float)sum/6);
//		in.close();
	}
}

class Student{
	static int sum = 0;
	String name;
	byte age;
	char sec;
	int perc;
	Student(String n, byte a, char s,int p){
		name = n;
		age = a;
		sec = s;
		perc = p;
		sum = perc+sum;
	}
}