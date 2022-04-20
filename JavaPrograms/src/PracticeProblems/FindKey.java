package PracticeProblems;

// Find whether the input key is present in the input array of integers.

import java.util.Scanner;
public class FindKey {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of elements : ");
		int num = in.nextInt();
		
		int[] arr = new int[num];
		System.out.print("Enter elements : ");
		for(int i=0;i<num;i++) {
			arr[i] = in.nextInt();
		}
		System.out.println();
		
		System.out.print("Enter key to be searched : ");
		int key = in.nextInt();
		
		SolutionSrch obj = new SolutionSrch();
		obj.srch(arr,key);
		
		System.out.println();
		in.close();
	}
}

interface ProblemSrch{
	void srch(int arr[],int key);
}

class SolutionSrch implements ProblemSrch {

	public void srch(int arr[],int key) {
		int ctr = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == key) {
				System.out.println(key+" found at "+i+"th index");
				ctr++;
				break;
			}
		}
		if(ctr == 0)
			System.out.println(key+" not found");
		
	}
}
