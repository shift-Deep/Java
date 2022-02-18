package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		try {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a/b);
			sc.close();
			throw new Ex();
			
		}
		
		catch(Ex e) {
			System.out.println();
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(InputMismatchException e) {
			System.out.println(e);
		}
		System.out.println("hello");
		
		

	}

}

class Ex extends Exception{
	public Ex() {
		System.out.println("Handled");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Handled";
	}
}
