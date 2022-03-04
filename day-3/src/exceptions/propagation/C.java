package exceptions.propagation;

public class C {
	public void f3() {
		D d = new D();
		try {
		d.f4();
		}catch (ArithmeticException e) {
			System.out.println("Now re throwing from C");
			throw e;
		}
	}
}
