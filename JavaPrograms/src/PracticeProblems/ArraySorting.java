package PracticeProblems;

// Sort a array of integer type of data by taking input from the user.

import java.util.Scanner;
public class ArraySorting {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of elements : ");
		int num = in.nextInt();
		int arr[] = new int[num];
		
		System.out.print("Enter elements :");
		for(int i=0;i<num;i++) {
			arr[i] = in.nextInt();
		}
		
		Sort obj = new Sort();
		obj.sorting(arr);
		
		System.out.print("Elements are : ");
		for(int i=0;i<num;i++) {
			System.out.print(arr[i]+" ");
		}
		in.close();
	}
}

class Sort{
	void sorting(int[] arr) {
		int n = arr.length;
		int temp;
		int j;
		for(int i=1;i<n;i++) {
			temp = arr[i];
			j = i-1;
			while(j>=0 && temp < arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
	}
}
