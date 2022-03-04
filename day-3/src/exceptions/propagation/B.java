package exceptions.propagation;

public class B {
	public void f2() {
		C c = new C();
		try {
			c.f3();
		} catch (ArithmeticException e) {
			System.out.println("Now re throwing from B");
			throw e;
		}
	}
}
