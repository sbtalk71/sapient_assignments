package exceptions.propagation;

public class Main {

	public static void main(String[] args) {

		A a = new A();
		try {
			a.f1();
			;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}

		System.out.println("No Exceptions..");
	}

}
