package collections.ex;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import collections.app.Person;

public class PersonDB {

	public static void main(String[] args) {
		
		Map<Integer, Person> personDB=personDB=new HashMap<Integer, Person>();
		personDB.put(100,new Person(100, "Pradeep","Kumta"));
		personDB.put(101,new Person(101, "Rahul","Karwar"));
		personDB.put(102,new Person(102, "Sandesh","Ankola"));
		personDB.put(103,new Person(103, "Balaji","Karwar"));
		personDB.put(104,new Person(104, "Darshan","Bhatkal"));
		personDB.put(105,new Person(105, "Gouri","Sirsi"));
		personDB.put(106,new Person(106, "Sharath","Siddapura"));
		personDB.put(107,new Person(107, "Karthik","Haliyal"));
		personDB.put(108,new Person(108, "Abhi","Joida"));
		personDB.put(109,new Person(109, "Yogesh","Murdeshwar"));
		
		String city="Karwar";
		Set<Integer> s=personDB.keySet();
		for(int Key:s)
		{
			if(city.equals(personDB.get(Key).getCity()))
			{
				System.out.println(personDB.get(Key).getName());
			}
				
		}
		
		int id=102;
		Set<Integer> s1=personDB.keySet();
		for(int Key:s1)
		{
			if(id==personDB.get(Key).getId()) {
				System.out.println("data found");
			}
}
	}
}
