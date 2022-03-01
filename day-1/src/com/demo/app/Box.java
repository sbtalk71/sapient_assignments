package com.demo.app;

public class Box {

	private int length;
	private int breadth;
	private int height;
	String color="no color";

	public Box(int length, int breadth, int height) {
		System.out.println(" 3 param constructor");
		this.length = length;
		this.breadth = breadth;
		this.height = height;

	}
	
	public Box(int length, int breadth, int height,String color) {
		this(length,breadth,height);
		System.out.println(" 4 param constructor");
		this.color=color;
		
		

	}

	public double getVolume() {
		return length * breadth * height;
	}
}
