package Unit_1;

/*
Operator in Java is a symbol that is used to perform operations.
Types of Operators in Java :
  
	Unary Operations
	Arithmetic Operators
	Shift Operators
	Relational Operators 
	
	Bitwise Operators 
	Logical Operators 
	
	Ternary Operators 
	Assignment Operators
*/

public class P3_Task_02_OperatorsInJava {
	public static void main(String[] args) {
		OperatorsInJava obj = new OperatorsInJava();
		
		obj.UnaryOperator();
		obj.ArithmeticOperator();
		obj.ShftOperator();
		obj.RelationalOperator();
		obj.BitwiseAndLogicalOperator();
		obj.TernaryOperator();
		obj.AssignmentOperator();
	}
}
class OperatorsInJava{
	void UnaryOperator()
	{
		System.out.println("Inside UnaryOperator");
		int a = 10;
		
		System.out.println(a++);	//10
		System.out.println(a--); 	//11
		System.out.println(++a);	//11
		System.out.println(--a);	//10
	}
	
	void ArithmeticOperator()
	{
		System.out.println("Inside UnaryOperator");
		int a = 10;
		int b = 5;
		System.out.println(a+b);	//15
		System.out.println(a-b); 	//5
		System.out.println(a*b);	//50
		System.out.println(a/b);	//2
		System.out.println(a%b);	//0
		
//		Output of the following expression
		System.out.println(((10 * 10) / 5) + 3 - ((1 * 4) / 2));
		System.out.println();
	}
	
	void ShftOperator()
	{
		System.out.println("Inside ShifOperator");
		/*
		 01010101<<1  =>  10101010
		 01010101>>1  =>  00101010
		 
		 0,0,1,0,0,0   {8 >> 1}
		 0,0,0,1,0,0   {4 >> 1}
		 0,0,0,0,1,0   {2 >> 1}
		 0,0,0,0,0,1   {1}
		 
		 0,0,1,0,0,0   {8 << 1}
		 0,1,0,0,0,0   {16 << 1}
		 1,0,0,0,0,0   {32}
		 */
		
		System.out.println(10<<2);	// 10*2^2 = 40
		System.out.println(10<<3);	// 10*2^3 = 80
		System.out.println(20<<2);	// 20*2^2 = 80
		System.out.println(15<<4);	// 15*2^4 = 240
		
		System.out.println(10>>2);	// 10/2^3 = 2
		System.out.println(20>>2);	// 20/2^2 = 5
		System.out.println(20>>3);	// 20/2^3 = 2
		System.out.println();
	}
	
	void RelationalOperator()
	{
		System.out.println("Inside RelationalOperator");
		int a = 10;
		int b = 20;
		
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a < b);
		System.out.println(a > b);
		System.out.println(a <= b);
		System.out.println(a >= b);
		System.out.println();
	}
	
	
//	Second condition is also checked in Bitwise but not in Logical(if first condition is False) 
	void BitwiseAndLogicalOperator()
	{
		System.out.println("Inside RelationalOperator");
		int a = 10;
		int b = 5;
		int c = 20;
		
//		Logical && and Bitwise &
		System.out.println(a < b && a++ < c);   
		System.out.println(a);   // 10 because second condition is not checked
		
		System.out.println(a < b & a++ < c);   
		System.out.println(a);   // 11 because second condition is checked
		
//		Logical || and Bitwise |
		System.out.println(a > b || a < c);
		System.out.println(a > b | a < c);
		
		System.out.println(a > b || a++ < c);
		System.out.println(a);   // 10 because second condition is not checked 
		System.out.println(a > b | a++ < c);
		System.out.println(a);   // 11 because second condition is checked
		
		System.out.println("Bitwise inclusive OR:"+(12|12));  //1100 | 1100 = 1100
		System.out.println("Bitwise exclusive OR:"+(12^12));  //1100 ^ 1100 = 0000
		System.out.println();
	}
	
	void TernaryOperator()
	{
		System.out.println("Inside TernaryOperator");
		int a = 2;
		int b = 5;
		int min = (a < b) ? a:b;
		System.out.println(min);
		System.out.println();
	}
	
	void AssignmentOperator()
	{
		System.out.println("Inside AssignmentOperator");
		int a = 10;
		int b = 20;
		a+=4;	//a=a+4
		b-=4;	//b=b-4
		System.out.println(a);
		System.out.println(b);
		System.out.println();
	}
}