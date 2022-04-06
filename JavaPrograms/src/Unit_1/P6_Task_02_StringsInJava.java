package Unit_1;

public class P6_Task_02_StringsInJava {
	public static void main(String[] args) {
		
		StringInJava obj = new StringInJava();
		obj.StringDefinition();
		obj.charAndString();
	}
}

class StringInJava{
	
	void StringDefinition() {
		
		String s = "Hello Buddy";
		String s1 = new String("Hey");
		System.out.println(s);
		
//		Get length of a String 
		System.out.println(s.length());

//		Loop through a string 
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
		
		String first = "Shashank";
		String second = "Dhariya";
		
//		Add two Strings
		String third = first + second;
		System.out.println(third);
		
//		Compare two strings
		boolean result1 = first.equals(second);
		System.out.println(result1);
		
/* 
 - Java Strings are immutable 
 - In Java, the JVM maintains a string pool to store all of its strings inside the memory.
 - The String pool helps in reusing the strings.
 	- if the string already exists, the new string is not created.
 	- Instead, the new reference, example points to the already existed string (Java)
 	- If the string doesn't exist, the new string (Java is created)  
 */
		
		String fourth = "Shashank";
		String fifth = new String("Dhariya");
	}
	
//	Character Arrays are mutable but Strings are not
	
	void charAndString() {
		char[] ch = {'H', 'e', 'l', 'l', 'o'};
		char[] ch2 = {'!', '!'};
		
		System.out.println(ch);
		
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		
		String s1 = new String(ch);
		System.out.println(s1);
		
		ch[0] = 'h';
		
/*
  Join two Java Strings - + can be used to append Strings together form a new String
  - but not possible in char array 
  */
		s1 = s1 + 'a';  // s1 is the new object with new memory
//		ch = ch + ch2;
		
//		String to char array
		String s2 = "Hello";
		char[] ch4 = s2.toCharArray();
		
//		char array to String
		char[] a2 = {'A', 'K', 'A'};
		String s3 = new String(a2);
	}
}
