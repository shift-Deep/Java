package Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class HashSetTest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1 
		
		HashSet H = new HashSet();
		H.add(12);
		H.add(12);
		H.add('a');
		H.add("abcd");
		for(int i = 1;i<=10;i++)
			H.add(i);
		
		//2
		LinkedHashSet ll = new LinkedHashSet();
		ll.add(13);
		for(int i = 1;i<=10;i++)
			ll.add(i);
		H.remove(12);
		
		System.out.println(H);
		System.out.println(ll);
		
		//3
		
		
		Iterator i = H.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		//4
		
		Iterator j = ll.iterator();
		while(j.hasNext())
			System.out.println(j.next());
		
		
		//5
		HashSet<Integer> l1 = new HashSet<Integer>();
		
		l1.add(12);
		l1.add(14);
		HashSet<Integer> Ih = new HashSet<Integer>();
		Ih.addAll(l1);
		System.out.println(Ih);
		Ih.remove(12);
		System.out.println(Ih);
	}

}
