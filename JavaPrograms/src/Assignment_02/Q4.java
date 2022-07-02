package Assignment_02;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		
		int min = 100;
		int max = -100;
		int num = 10;
		Scanner in = new Scanner(System.in); 
		temperature[] obj = new temperature[num];
		
		for(int i=0;i<num;i++){
			System.out.print("Enter temperature recorded in Delhi, Mumbai, Kolkata, Chennai, Dehradun : ");
			int delhi = in.nextInt();
			int mumbai = in.nextInt();
			int kolkata = in.nextInt();
			int chennai = in.nextInt();
			int dehradun = in.nextInt();
			obj[i] = new temperature(delhi,mumbai,kolkata,chennai,dehradun);
		}
		
		for(int i=0;i<num;i++){
			obj[i].tempMax(i);
			obj[i].tempMin(i);
		}
		
		in.close();

		String citymax = obj[0].selectCity(temperature.city1);
		String citymin = obj[0].selectCity(temperature.city2);
		
		System.out.println("Maximum temperature recorded : " +temperature.max+" on "+(temperature.day1+1)+" day in "+citymax);
		System.out.println();
		System.out.println("Minimum temperature recorded : " +temperature.min+" on "+(temperature.day2+1)+" day in "+citymin);
	}
}

class temperature{
	int[] arr = new int[5];
	
	static int city1;
	static int day1;
	
	static int city2;
	static int day2;
	
	static int max = -100;
	static int min = 100;
	
	temperature(int d,int m,int k,int c,int deh){
		arr[0] = d;
		arr[1] = m;
		arr[2] = k;
		arr[3] = c;
		arr[4] = deh;
	}
	void tempMax(int a) {
		
		for(int i=0;i<5;i++) {
			if(arr[i] >= max) {
				max = arr[i];
				day1 = a;
				city1 = i;
			}
		}
	}
	void tempMin(int a) {
		for(int i=0;i<5;i++) {
			if(arr[i] <= min) {
				min = arr[i];
				day2 = a;
				city2 = i;
			}
		}
	}
	String selectCity(int a){
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
