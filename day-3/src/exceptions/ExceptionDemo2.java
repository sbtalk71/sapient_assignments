package exceptions;

public class ExceptionDemo2 {

	public static void main(String[] args) {

		try {
			// open file
			int a = 10;
			int b = 10;
			double d = a / b;
			int x = Integer.parseInt("john");

			System.out.println("No Exception ...");
		} catch (ArithmeticException|NumberFormatException e) {
			System.out.println(e);
		} finally {
			// close, clean
			System.out.println("Finaly executes..");
		}
		System.out.println("Normal execution flow resumed...");

	}

}
