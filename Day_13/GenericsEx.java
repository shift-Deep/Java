package FileHandling;

import java.util.*;
public class GenericsEx {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i =0;i<10;i++) {
			arr.add(i);
		}
		System.out.println("ArrayList"+arr);
		
		LinkedList<Integer> ll = new LinkedList<>();
		for(int i = 0;i < 10; i++) {
			ll.add(i);
		}
		System.out.println("LinkedList"+ll);
		
	}
	
}
