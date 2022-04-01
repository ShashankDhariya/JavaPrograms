package Unit_1;
/*
 Control Statements and Conditional Statements:
 Java provides three types of control flow statements
 -Decision Making Statements
 	-if statements
 	-switch statements
 
 -Loop Statements
 	-do while loop
 	-while loop 
 	-for loop
 	-for each loop
 	
 -Jump Statements
 	-break statement
 	-continue statement
 */
public class P4_Task_01_ControlAndConditionalStatementsInJava {
	public static void main(String[] args) {
		Statements obj = new Statements();
		obj.DecisionMakingStatements();
		obj.LoopStatements();
		obj.JumpStatements();
	}
}
	class Statements{
		void DecisionMakingStatements() {
			int x = 10;
			int y = 12;
			if(x + y < 10) {
				System.out.println("x + y is less than 10");
			}
			else {
				System.out.println("x + y is more than 10");
			}
			
			int num = 2;
			switch(num) {
			case 0:System.out.println("Number is 0");
			 		break;
			case 1:System.out.println("Number is 1");
					break;
			default:System.out.println(num);
			}
		}
		
		void LoopStatements() {
		/*
		 for(initialization, condition, increment/decrement) { Block of Statements }
		 for(data_type var : array_name/collection_name) { Block of statements } 
		 */
			
//			for loop
			int sum = 0;
			for(int j = 1;j<=10;j++) {
				sum += j;
			}
			System.out.println("The sum of first 10 natural numbers is "+sum);
			
//			for each
			String[] names = {"Java", "C", "C++", "Python", "JavaScript"};
			System.out.println("Printing the content of the array names :\n");
			for(String name : names) {
				System.out.println(name);
			}
			
//			while loop
			int i = 0;
			System.out.println("Printing the list of first 10 even numbers :\n");
			while(i <= 10) {
				System.out.println(i);
				i += 2;
			}
		
//			do while do
			i = 0;
			System.out.println("Printing the list of first 10 even numbers :\n");
			do {
				System.out.println(i);
				i += 2;
			}while(i<=10);
		}
		void JumpStatements() {
			
//			break
			for(int i=0;i <= 10;i++) {
				if(i == 6) {
					break;
				}
				System.out.println(i);
			}
		
//			continue
			for(int i=0;i <= 10;i++) {
				if(i == 6) {
					continue;
				}
				System.out.println(i);
			}
		}
	}

