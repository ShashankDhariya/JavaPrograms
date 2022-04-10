package Unit_1;

/* Tasks given below:
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array); 
		obj.removeElementInArray(array);//(Optional)
 */
import java.util.Scanner;
public class P9_Array {
	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 4, 6, 2, 3 };

		QuestionsOnArray obj = new QuestionsOnArray();
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array);
		obj.removeElementInArray(array); // (Optional)

	}

}

class QuestionsOnArray {

	void sortAnArray(int[] arr) {
		int n = arr.length;
		
		int[] arr1 = new int[n];
		for(int i=0;i<n;i++) {
			arr1[i] = arr[i]; 
		}
		
		System.out.print("Before Sorting : ");
		for(int i=0;i<n;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println("");
		
		int temp;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<(n-1)-i;j++) {
				if(arr1[j] > arr1[j+1]) {
					temp = arr1[j+1];
					arr1[j+1] = arr1[j];
					arr1[j] = temp;
				}
			}
		}
		System.out.print("After Sorting : ");
		for(int i=0;i<n;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println("\n");
	}

	void findTheDuplicateElements(int[] arr) {
		int n = arr.length;
		int[] arr1 = new int[n];
		for(int i=0;i<n;i++) {
			arr1[i] = arr[i]; 
		}
		
		for(int i=0;i<n;i++) {
			int ctr = 0;
			for(int j=i+1;j<n;j++) {
				if(arr1[i] == arr[j] && j != -1) {
					ctr++;
					arr1[j] = -1;
				}
			}
			if(ctr>0) {
				System.out.println("Duplicates of "+arr1[i]+" is "+ctr);
			}
		}
		System.out.println();
	}

	void findSecondLargestAndSecondSmallestElement(int[] arr) {
		int l = arr[0], sl = arr[1];
		int s = arr[0], ss = arr[1];
		int n = arr.length;
		
		for(int i=1;i<n;i++) {
			if(arr[i] > l) {
				sl = l;
				l = arr[i];
			}
			else {
				ss = s;
				s = arr[i];
			}
		}
		
		
		System.out.print("Second largest number is "+sl+"\nSecond smallest number is "+ss);
		System.out.println("\n");
	}

	void leftRotationInAnArray(int[] arr) {
		int res = arr[0];
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			arr[i] = arr[i+1];
		}
		arr[n-1] = res;
		System.out.print("After left rotation : ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	void removeElementInArray(int[] arr) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("\nEnter number to be deleted : ");
		int a = in.nextInt();
		int i=0;
		int ctr = 0;
		int n = arr.length;
		while(arr[i++] != a) {
			ctr++;
		}
		for(i=ctr;i<n-1;i++) {
			arr[i] = arr[i+1];
		}
		
		for(i=0;i<arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
