package inheritance.ex1;

public class Main {

	public static void main(String[] args) {
		
		B b = new B();
		C c = new C();
	
		
		A a;
		
		a=b;
		a.greet();
		
		a=c;
		a.greet();
		

	}

}
