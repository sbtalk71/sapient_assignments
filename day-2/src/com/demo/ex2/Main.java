package com.demo.ex2;

public class Main {

	public static void main(String[] args) {
		FirstName fn = new FirstName();
		LastName ln = new LastName();
		FullName name=new FullName();
		
		System.out.println(name.getFullName(fn, ln));

	}

}
