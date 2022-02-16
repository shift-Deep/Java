package FileHandling;

import java.io.*;
import java.util.Scanner;

public class FileHandlingEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		File f1 = new File("test1.txt");
//		f1.createNewFile();
		
		FileWriter f = new FileWriter("test1.txt");
//		f.write("HI my 12");
		
		
	BufferedWriter B = new BufferedWriter(f);
	B.write("Hi ss");	
	B.write(123);
		
		
	B.close();
	
	File f1 = new File("test1.txt");
		
//		FileReader t = new FileReader(f);
//		while(t.read() != -1) {
//			char c = (char) t.read();
//			System.out.println(c);
//		}
		Scanner sc = new Scanner(f1);
		while(sc.hasNext())
			System.out.println(sc.next());
		
		
		
		sc.close();
	}

}
