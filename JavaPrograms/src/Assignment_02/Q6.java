package Assignment_02;

public class Q6 {
	public static void main(String[] args) {
		String str = "Today is a sunny day";
		int num = str.length();
		int i = 1;
		while(i<num)
		{
			while(str.charAt(i) != ' '  && i<num-1) {
				i++;
			}
			int a = i-1;
			
			if(i == num-1)
				System.out.print(str.charAt(num-1));
			
			while(str.charAt(a) != ' ' && a>0) {
				System.out.print(str.charAt(a));
				a--;
			}
			
			if(a == 0)
				System.out.print(str.charAt(0));
			System.out.print(" ");
			
			i++;
		}
	}
}
