package Unit_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class P15_FileHandling {
	public static void main(String[] args) throws IOException {
		FileHandling obj = new FileHandling();
		obj.takeInputFromFile();
		obj.saveOutputIntoAFile();
		obj.createALogFile();
	}
}

//Program can't read file directly we need drivers or buffer
class FileHandling{
	static int a = 10;
	void takeInputFromFile() throws IOException {
		String path = "\\Users\\dhari\\git\\Programs\\JavaPrograms\\src\\Unit_3\\output.txt";
		File file = new File(path);
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		
//		int c;
//		while((c = br.read()) != -1) {					// Reads 2 bytes from the file
//			System.out.println((char)c);
//		}
		
		
//		String st;
//		while((st = br.readLine()) != null) {			// Terminates after getting "\n"
//			System.out.println(st);
//		}
		
//		if(br.readLine() == null) {
//			System.out.println("Yes");
//		}
		
//		List that holds Strings of a file
		List<String> listOfStrings = new ArrayList<String>();
		
//		Read entire line as string
		String line = br.readLine();
		
		while(line != null) {
			listOfStrings.add(line);
			line = br.readLine();
		}
		
		for(String str : listOfStrings) {
			System.out.println(str);
		}
		System.out.println("\n");
		br.close();
	}
	
	
	void saveOutputIntoAFile() throws IOException {
		FileWriter myObj = null;
		
		try {
			myObj = new FileWriter("output.txt", false); // By default false (for append-write true) 
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		BufferedWriter f_writer = new BufferedWriter(myObj);
		
		String text = "Hey Buddy How are you";
		
		f_writer.write(text);
		f_writer.close();
		
	}
	void createALogFile() throws IOException {
		a++;
		
//		Find current time and Date 
		LocalTime ltime = java.time.LocalTime.now();
		LocalDate ldate = java.time.LocalDate.now();
		
		FileWriter myObj = null;
		
		try {
			myObj = new FileWriter("log.txt",true);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		BufferedWriter f_writer = new BufferedWriter(myObj);
		String text = "The Program executed at: " + ltime.toString() + " " + ldate.toString() + "\n";
		
		try {
			f_writer.write("Value of a: " + a + ", ");
			f_writer.write(text);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		f_writer.close();
	}
}
