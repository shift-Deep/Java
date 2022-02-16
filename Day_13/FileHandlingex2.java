package FileHandling;

import java.io.*;
import java.util.Scanner;

public class FileHandlingex2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f1 = new File("test1.txt");
		f1.createNewFile();
		
		FileWriter f = new FileWriter("test1.txt");
		f.write("HI my 12");
		f.write(12);
		f.close();
		BufferedWriter b = new BufferedWriter(f);
		b.write(122);
		

	FileWriter f12 = new FileWriter("test1.txt");
	
	PrintWriter p = new PrintWriter(f12);
	
	
	p.print("i Am p");
	p.print(123);
	p.close();
	
	
	
//	File f1 = new File("test1");
		System.out.println(f1.mkdir());
		FileReader t = new FileReader(f1);
		while(t.read() != -1) {
			char c = (char) t.read();
			System.out.println(c);
		}
	t.close();
//		BufferedReader t = new BufferedReader(f1);

		Scanner sc = new Scanner(f1);
		while(sc.hasNext())
			System.out.println(sc.next());
		
		
		
	
		sc.close();
	
	
	}

}
