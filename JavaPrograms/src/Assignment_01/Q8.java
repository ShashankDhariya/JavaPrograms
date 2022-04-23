/*
 WAP in java, to delete index=3, element from the given array mentioned below. 
 int[] arr = {1,2,3,4,5,6,7,8,9}
 Note: Non relevance places would be filled with zeros
 
 */


package Assignment_01;

public class Q8 {
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		System.out.print("Elements before Operation : ");
		print(arr);
		
		solution(arr);
		
		System.out.print("Elements after Operation  : ");
		print(arr);
	}
	
	public static void solution(int[] arr) {
		
		int n = arr.length;
		
		for(int i=3;i<n-1;i++) {
			arr[i] = arr[i+1];
		}
		arr[n-1] = 0;
	}
	
	public static void print(int[] arr) {
		
		int n = arr.length;
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
