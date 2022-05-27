package Unit_3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class P15_CountNumberOfWords {
	public static void main(String[] args) throws IOException {
		CW obj = new CW();
		
		
		int ctr = obj.count(); 
		System.out.println("Number of words : "+((CW.ctr)+1));
	}
}

class CW{
	static int ctr = 0;
	int count() throws IOException{
		File file = null;
		try{
			file = new File("C:\\Users\\dhari\\git\\Programs\\JavaPrograms\\src\\Unit_3\\input.txt");
		}catch(Exception e) {
			e.printStackTrace();
		}
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		int c;
		while((c = (br.read())) != -1) {
			if(c == 32)
				ctr++;
		}
		return ctr;
	}
}