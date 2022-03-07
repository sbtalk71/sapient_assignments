package collections.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class PersonApp {

	public PersonApp() {
	}

	public String findPerson(int personId) {

		if (PersonDB.db.containsKey(personId)) {
			return PersonDB.db.get(personId).getDetails();
		} else {
			return "No Person found";
		}
	}

	public List<String> listPersonByCity(String cityName) {

		List<String> persons = new ArrayList<String>();
		
		Set<Integer> keys = PersonDB.db.keySet();
		
		for (Integer key : keys) {
			Person p = PersonDB.db.get(key);
			if (p.getCity().equals(cityName))
				persons.add(p.getDetails());
		}

		return persons;
	}

	public static void main(String[] args) {
		String city = "Bangalore";

		PersonApp app = new PersonApp();

		System.out.println(app.findPerson(103));

		for (String p : app.listPersonByCity(city)) {
			System.out.println(p);
		}
	}

}
