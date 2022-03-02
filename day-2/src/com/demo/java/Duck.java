package com.demo.java;

public class Duck {

	static int duckCount=0;
	
	public Duck() {
		duckCount++;
	}
	
	static {
		System.out.println("Static block executed..");
	}
	
	
	public static void f1() {
		System.out.println("This is static method...");
		//getDuckName();
	}
	
	public void getDuckName() {
		
	}
}
