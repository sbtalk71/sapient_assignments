package com.demo.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class PersonApp {
	//Person defaultPerson=new Person(0, "NA", "NA");

	public Optional<Person> findPersonById(int id) {

		
		if (PersonDB.db.containsKey(id)) {

			return Optional.of(PersonDB.db.get(id));
		} else {
			return Optional.empty();
		}
		

	}

	public static void main(String[] args) {
		PersonApp app = new PersonApp();
		Optional<Person> op = app.findPersonById(113);
		if (op.isPresent())
			System.out.println(op.get().getDetails());
	}

}
