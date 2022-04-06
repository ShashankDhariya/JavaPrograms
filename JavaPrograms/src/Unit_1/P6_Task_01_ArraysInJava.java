package Unit_1;
/*
- Generally, Array is a collection of similar type of elements which has contiguous memory location
- Java array is an object which contains elements of similar data type
- We can store only a fixed set of elements in a Java array 
- Size limit issue:
 	- We can store only a fixed amount of elements in the array
 	- It doesn't grow its size at runtime
 	- To solve this problem, collection framework is used in Java which grows automatically
 	
- There are two types of array
	- Single Dimensional array
	- Multidimensional array
- Declare an Array in Java
	- DataType arraRefVar[];
	OR
	- DataType[] arraRefVar;
	OR
	- DataType []arraRefVar;

- Instantiation of Array in Java
	  - arrayRefVar = new arrayRefVar[size]; 
 */
public class P6_Task_01_ArraysInJava {
	public static void main(String[] args) {
		//Declaration 
		int array1[];
		
		int[] array2;
		int []array3;
		
//		Can't do it as we have not provided it any space/memory yet
//		array1[0] = 0;
		
//		Initialization, during initialization we have to provide the size of the array
		array1 = new int[6];   // {1,2,3,4}
		
//		Assigning the values to the Java array
		for(int i=0;i<array1.length;i++)   // Length is the property of the array
			array1[i] = i;
		int array4[] = {1,2,3,4};	//Declaration,Instantiation and Initialization
		
//		passing array to method 
		arrayAsParameter(array4);
		
//		Passing anonymous array in the method
		arrayAsParameter(new int[] {33,4,3,5 });
		
//		Returning Array from the Method
		int[] array5 = arrayAsReturnType();
		System.out.println(array5.toString());
		
//		ArrayIndexOutBoundsException
		int arr[] = {50, 60, 70, 80};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
//		Multidimensional Array in Java
		int[][] arr6 = new int[3][3];
		
		for(int i=0,j=0;i<3 && j<3;i++,j++) {
			System.out.println(arr6[i][j]);
		}
		
		int counter = 0;
		for(int i=0,j=0;i<3 && j<3;i++,j++) {
			counter++;
			arr6[i][j] = counter;
		}
		
		for(int i=0,j=0;i<3 && j<3;i++,j++) {
			System.out.println(arr6[i][j]);
		}
	}
	static void arrayAsParameter(int arr[]) {  //Declare empty array as parameter 
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
//	Returning Array from the method 
	static int[] arrayAsReturnType() {
		int array4[] = {33,3,4,5};		
		return array4;
	}
}
