package Unit_1;

public class P5_Task_02_MethodsInJava {
	public static void main(String[] args) {
		ABCD1 obj = new ABCD1();
		obj.display();
		System.out.println(obj.a);
	}
}

class ABCD1{
	static int a = 10;
	/* 
	 Actual method definition
	 DataType methodName(DataType2 p1, DataType p2){
	 	methodBody;
	 	return value;  (if required)
	 */
	static void display() {
		int a = 10;
		int b = 10;
		System.out.println(b);
	}
	int display2() {
//		System.out.println(b);
//		As b was a local variable so we can't access it outside the method
		System.out.println(a);
	}
}