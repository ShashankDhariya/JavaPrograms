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
		System.out.println("Average of all 6 students is "+(float)Student.avg/6);
		in.close();
	}
}

class Student{
	static int avg = 0;
	String name;
	byte age;
	char sec;
	int perc;
	Student(String n, byte a, char s,int p){
		name = n;
		age = a;
		sec = s;
		perc = p;
		avg = perc+avg;
	}
}