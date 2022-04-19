package PracticeProblems;

import java.util.Scanner;

public class AveragePercentage_ConstructorImplementation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		for(int i=1;i<=6;i++) {
			System.out.println("Enter details of "+i+"st Student");
			System.out.print("Enter Name : ");
			String name = in.next();
			System.out.print("Enter Age : ");
			byte age = in.nextByte();
			System.out.print("Enter Percentage: ");
			int perc = in.nextInt();
			Student obj = new Student(name,age,"A",perc);
		}
		System.out.println("Average of all 6 students is "+(float)Student.avg/6);
		in.close();
	}
}

class Student{
	static int avg = 0;
	Student(String name, byte age, String sec,int perc){
		avg = perc+avg;
	}
}