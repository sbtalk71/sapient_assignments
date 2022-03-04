package exceptions.propagation;

public class D {
	public void f4() {
		try {
			int a = 10;
			int b = 0;
			double d = a / b;
		} catch (ArithmeticException e) {
			System.out.println("Now re throwing from D");
			throw e;
		}

	}
}
