package Unit_1;

/* Problem Statement:

P8_String: 

(Create separate logic in separate function)

F1 - Check the entered string is palindrome or not? 
  		String s = "75457"
  		Output: Yes it is a palindrome or No it is not a palindrome.

F2 - Make a reverse of a string using?
F3 - String Compare: Check if the strings are equal or not?

 * */

public class P8_String {

	public static void main(String[] args) {

		QuestionsOnString obj = new QuestionsOnString();

		String s1 = new String("75457");
		String s2 = new String("7545a");

		obj.palindromeOrNot(s1);
		obj.reverseOfAString(s1);
		obj.stringEqualOrNot(s1, s2);

	}

}

class QuestionsOnString {

	void palindromeOrNot(String s) {
		String newStr = new String(s);
		boolean b = s.equals(newStr);
		if(b = true)
			System.out.println("String is Palindrome");
		else 
			System.out.println("String is not Palindrome");
	}

	void reverseOfAString(String s) { 
		int j = s.length() - 1;
		System.out.print("Reverse of the string : ");
		for(int i=0;i<=j;i++) {
			System.out.print(s.charAt(j-i));
		}
		System.out.println();
	}
	
	void stringEqualOrNot(String s1,String s2) {
		boolean b = s1.equals(s2);
		if(b == true) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings are not equal");
		}
		
	}
}