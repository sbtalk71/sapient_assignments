package com.demo.ex;

public class Main {

	public static void main(String[] args) {
		B b1=new B();
		
		A a1= new A(b1);
		a1.call();
	}

}
