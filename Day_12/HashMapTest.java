package Test;

//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Set;
//import java.util.Iterator;
//import java.util.Map;
import java.util.*;
import java.util.Map;
import java.util.Map.Entry;
public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Session 2
		
		//1
		HashMap<Integer, String> HM = new HashMap<Integer, String>();

		HM.put(1,"one");
		HM.put(2, "Two");
		HM.put(3, "Three");
		HM.put(4, "Four");
		//2
		Set KS = HM.keySet();
		
		Iterator i = KS.iterator();
		while(i.hasNext())
			System.out.println(HM.get(i.next()));
		
		//3
		Set<Entry<Integer, String>> l = HM.entrySet();
		System.out.println(l);
		Iterator ii = l.iterator();
		while(ii.hasNext())
			System.out.println(ii.next());
		
		//4
		
		LinkedHashMap<String, Integer> LH = new LinkedHashMap<String, Integer>();
		LH.put("a",12);
		LH.put("b", 14);
		LH.put("c", 15);
		
		Set n = LH.keySet();
		Iterator l1 = n.iterator();
		while(l1.hasNext())
			System.out.println(LH.get(l1.next()));
		
		
		
		
	}

}
