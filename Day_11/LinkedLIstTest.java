package myPack;
import java.util.*;
import java.util.LinkedList;
public class LinkedLIstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2
		
		LinkedList L = new LinkedList();
		L.add(new Integer(12));
		L.add(new String("Hello"));
		L.add(new Float(12.2));
		L.add(new Character('a'));
		
		System.out.println(L);
		
		//3 
		
		System.out.println(L.isEmpty());
		System.out.println(L.size());
		System.out.println(L.contains(12));
		System.out.println(L.getFirst());
		
		//4
		//using for loop
		
		for(int i = 0;i<L.size();i++) {
			System.out.println(L.get(i));
		}
		
		//using foreach
		System.out.println();
		System.out.println();
		System.out.println();
	
		for(Object o:L) {
			System.out.println(o);
		}
		
		//5
		
		ArrayList<Integer> i = new ArrayList<Integer>();
		i.add(21);
		i.add(23);
		i.add(66);
		i.add(191);
		
		for(Object k : i) {
			
			
			
			if((Integer)k%2==0) {
				System.out.println(k);
			}
		}
		System.out.println();
		System.out.println();
	
		ListIterator li = i.listIterator();
		
		while(li.hasNext()) {
			System.out.println(li.next());
		}
	}

}
