package com.demo.ex2;

public class FullName {

	// get firstName and lastName from FirstName and LastName Objects and return
	// fullName

	public String getFullName(FirstName fn, LastName ln) {

		return fn.getFirstName() + " " + ln.getLastName();
	}
}
