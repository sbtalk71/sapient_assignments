package exceptions.propagation;

public class A {

	public void f1() {
		B b = new B();
		try {
			b.f2();
			}catch (ArithmeticException e) {
				System.out.println("Now re throwing from A");
				throw e;
			}
	}
}
