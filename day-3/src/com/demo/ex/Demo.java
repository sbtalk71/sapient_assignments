package com.demo.ex;

public class Demo {

	public void greet() {
		
	}
	@Override
	public String toString() {
		return "This is an Object of Demo class";
	}
}

class Main2{
	public static void main(String[] args) {
		Demo d = new Demo();
		
		System.out.println(d);
		
		System.out.println(d.getClass().getName());
		System.out.println(d.getClass().getMethods().length);
		System.out.println(d.getClass().getDeclaredMethods().length);
		
		
	}
}