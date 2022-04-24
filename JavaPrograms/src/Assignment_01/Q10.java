/*
 WAP in Java Program To Survey Four Different Car Models For Four Different Cities:
 
 				Maruti K-10		Zen-Astelo		Wagon		Maruti SX4
 	Delhi												
 	Mumbai
 	Chennai 
 	Kolkata
 Your job is to find out the total number of cars sold of each model in all the cities. 
 Use Array of objects or multiple objects of class name City.
 
 */

package Assignment_01;

import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Car[] obj = new Car[4];
		for(int i=0;i<4;i++) {
			
			switch(i) {
				case 0:System.out.println("\nEnter details for Delhi : ");
						break;
				case 1:System.out.println("\nEnter details for Mumbai : ");
					break;
				case 2:System.out.println("\nEnter details for Chennai : ");
					break;
				case 3:System.out.println("\nEnter details for Kolkata : ");
					break;
			}
			
			obj[i] = new Car();
			System.out.print("Enter number of Maruti K-10 : ");
			int k = in.nextInt();
			
			System.out.print("Enter number of Zen Astelo : ");
			int a = in.nextInt();
			
			System.out.print("Enter number of Wagon : ");
			int w = in.nextInt();
			
			System.out.print("Enter number of Maruti SX4 : ");
			int s = in.nextInt();
			obj[i].count(k,a,w,s);
		}
		in.close();
		
		System.out.println();
		System.out.println("Total number of Maruti K-10 sold : "+Car.k);
		System.out.println("Total number of Zen Astelo sold  : "+Car.a);
		System.out.println("Total number of Wagon sold       : "+Car.w);
		System.out.println("Total number of Maruti SX4 sold  : "+Car.s);
	}
}

class Car{
	static int k;
	static int a;
	static int w;
	static int s;
	void count(int k10,int astelo,int wagon,int sx4) {
		k += k10;
		a += astelo;
		w += wagon;
		s += sx4;
	}
}
