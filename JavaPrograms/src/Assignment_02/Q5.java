package Assignment_02;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		
		int min = 100;
		int max = -100;
		int num = 10;
		Scanner in = new Scanner(System.in); 
		avgtemperature[] obj = new avgtemperature[num];
		
		for(int i=0;i<num;i++){
			System.out.print("Enter temperature recorded in Delhi, Mumbai, Kolkata, Chennai, Dehradun : ");
			int delhi = in.nextInt();
			int mumbai = in.nextInt();
			int kolkata = in.nextInt();
			int chennai = in.nextInt();
			int dehradun = in.nextInt();
			obj[i] = new avgtemperature(delhi,mumbai,kolkata,chennai,dehradun);
		}
		
		for(int a=0;a<5;a++) {
			int sum = 0;
			for(int i=0;i<num;i++) {
				sum += obj[i].arr[a];
			}
			System.out.println("Average of temperature of "+selectCity(a)+" is "+((float)sum/num));
		}
		in.close();
	}
	
	static String selectCity(int a){
		String str = new String();
		switch(a) {
			case 0 :str = "Delhi";
					return str; 
			case 1 :str = "Mumbai";
					return str; 
			case 2 :str = "Kolkata";
					return str; 
			case 3 :str = "Chennai";
					return str; 
			case 4 :str = "Dehradun";
					return str; 
		}
		return str;
	}
}

class avgtemperature{
	int[] arr = new int[5];
	
	static int city1;
	static int day1;
	
	static int city2;
	static int day2;
	
	static int max = -100;
	static int min = 100;
	
	avgtemperature(int d,int m,int k,int c,int deh){
		arr[0] = d;
		arr[1] = m;
		arr[2] = k;
		arr[3] = c;
		arr[4] = deh;
	}
}
