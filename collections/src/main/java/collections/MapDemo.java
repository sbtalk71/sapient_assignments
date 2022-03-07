package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		//HashMap<Integer, String> names = new HashMap<Integer, String>();
		Hashtable<Integer, String> names=new Hashtable<Integer, String>();
		names.put(100, "John");
		names.put(101, "Peter");
		names.put(102, "Ramesh");
		names.put(103, "Kiran");
		names.put(104, "Raju");
		
		System.out.println(names);
		
		System.out.println(names.get(102));
		
		System.out.println(names.containsKey(103));
		
		Set<Integer> keys=names.keySet();
		
		for(Integer key:keys) {
			System.out.println(key+"------>"+names.get(key));
		}

	}
}
