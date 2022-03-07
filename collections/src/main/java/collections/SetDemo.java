package collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> names=new HashSet<String>();
		//SortedSet<String> names=new TreeSet<String>();
		
		names.add("John");
		names.add("Peter");
		names.add("Rahul");
		names.add("Chetan");
		names.add("Kirti");
		names.add("Srinivas");
		names.add("Rahul");
		System.out.println(names);
		
		//serach for "Peter"
		
		//iterate over the set using Iterator
		
	}

}
