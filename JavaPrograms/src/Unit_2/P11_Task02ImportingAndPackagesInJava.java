package Unit_2;
// Inside this package we can create many classes 


/*
 - A java package is a group of similar type if classes,interfaces and sub-packages
 -Package in java can be categorized into two forms 
  - built-in package {lang, awt, javax, swing, net, io, util, sql}
  - user defined package
  
  - Package also helps to avoid class name collision 
  - Package also helps us to maintain access protection in Java
  - Packages are named in reverse order of domain names 
  	- unit1.javaproject.com -> "com.javaproject.unit1"
  	
  	import java.util.vector;  // import the Vector class from the util package
  	import java.util.*;       // import all the classes from util package
  	
  	Static Import: 
  	- Static import is a feature introduced in Java programming language
  	- that allows members (fields and methods) defined in a class as public static  
  	   , is used in Java code without specifying the class in which the field is defined 
 
 */
import static java.lang.System.*;
import static java.lang.Math.*;

public class P11_Task02ImportingAndPackagesInJava {
	public static void main(String[] args)
	{
		out.println("Welcome to package");
		
		out.println(sqrt(4));
		System.out.println(pow(2,2));
		System.out.println(Math.pow(2,2));   // Same as line 34
		System.out.println(abs(6.3));
		
//		SampleClass1 obj = new SampleClass1();
//		System.out.println(obj.a);
	}
}
