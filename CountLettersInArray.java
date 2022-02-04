package java_ATCS;
import java.util.Scanner;

public class CountLettersInArray {

	public static char[] CreateArray(int n) {
		
		Scanner s = new Scanner(System.in);
		char [] ch = new char[n];
		System.out.println("enter"+n+"characters");
		for(int i =0;i<n;i++) {
			
			ch[i] = s.next().charAt(0);
			
		}
		s.close();
		return ch;
				
		
	}
	
	public static void displayArray(char[] a) {
		int j = 0;
		System.out.println("Printing Array");
		for(int i = 0;i<a.length;i++) {
			if(j==19) {
				System.out.println();
				j=0;
			}
			System.out.print(a[i]+" ");
			j++;
		}
		
	}
	
	public static void CountLetters(char c[]) {
		int count = 0;
		
		for(int i=0;i<c.length;i++) {
			count = 1;
			for(int j = i+1;j<c.length;j++) {
				if(c[i] == c[j] && c[i] !=' ') {
					count++;
					c[j] = ' ';
				}
				
			}
			if(c[i] != ' ')
			System.out.println(c[i] +" "+ count);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter length of array");
		int n = s1.nextInt();
		char ch1[] = new char[n];
		ch1 = CreateArray(n);
		displayArray(ch1);
		
		System.out.println("\nCount of letters");
		CountLetters(ch1);
		s1.close();
	}

}
