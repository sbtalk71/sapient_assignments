package com.demo.app;

public class OverloadDemo {

	public int add(int a, int b) {
		System.out.println("add(int,int) called....");
		return a + b;
	}

	public float add(int a, float b) {
		System.out.println("add(int,float) called....");
		return a + b;
	}

	public void add(float a, float b) {
		System.out.println("add(float,float) called....");

	}

	public double add(double a, double b) {
		System.out.println("add(double,double) called....");
		return a + b;
	}

	public static void main(String[] args) {

		OverloadDemo od = new OverloadDemo();
		od.add(2, 3);
		od.add(4, 5.0f);
		od.add(2.0, 7);
		od.add(3.6, 8.9);
	}

}
