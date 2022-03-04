package com.demo.ex;

class A{
	
	}


class B extends A{
	
}

class C{
		
}

public class InstanceOfDemo {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		
		A ref=new B();
		
		System.out.println(a instanceof A);
		System.out.println(ref instanceof A);
		//System.out.println(c instanceof B);
		System.out.println(ref instanceof B);
		
		String name="john";
		Integer x=20;
		
		System.out.println(name instanceof String);
		System.out.println(x instanceof Object);

	}

}



