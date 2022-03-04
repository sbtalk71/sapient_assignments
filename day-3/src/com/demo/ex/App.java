package com.demo.ex;

public class App {

	final int num=10;
	String s="greet";
	
	public final void show() {
		System.out.println("this is show method");
	}
}


class App2 extends App{
	
	public void doIt() {
		//num=20;
	}
}


class Main{
	public static void main(String[] args) {
		App2 a= new App2();
		a.show();
	}
}