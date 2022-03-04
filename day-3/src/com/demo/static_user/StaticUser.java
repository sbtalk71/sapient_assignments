package com.demo.static_user;

import static com.demo.static_import.MyDemoClass.greet;
import static com.demo.static_import.MyDemoClass.show;
import static com.demo.static_import.MyDemoClass.version;
import static java.lang.Math.sqrt;

public class StaticUser {

	public static void main(String[] args) {
		show();
		greet();

		System.out.println(sqrt(625));
		System.out.println(version);
		
		
		
	}

}
