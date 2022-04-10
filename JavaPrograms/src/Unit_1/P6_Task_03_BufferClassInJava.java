package Unit_1;
/* 
 3 ways :
 - StringBuffer()
 - StringBuffer(String str)
 - StringBuffer(int capacity)
 
 - StringBuffer is mutable unlike String
 
 */
public class P6_Task_03_BufferClassInJava {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Hello");
		sb.append("Java");
//		System.out.println(sb.charAt[0]);
		
//		StringBuffer class append() method, now original string is changed
		System.out.println(sb);
		
//		StringBuffer insert() Method
		StringBuffer sb2 = new StringBuffer("Hello");
		sb2.insert(1,"Java");  // Now original string is changed 
		System.out.println(sb2);  //Print HJAvaello

//		StringBuffer replace() Method
		StringBuffer sb3 = new StringBuffer("Hello");
		sb3.replace(1,3,"Java");   
		System.out.println(sb3);  //Print HJAvalo
		
//		StringBuffer delete() Method
		StringBuffer sb4 = new StringBuffer("Hello");
		sb4.delete(1,3);   
		System.out.println(sb4);  //Print Hlo

	}
}
