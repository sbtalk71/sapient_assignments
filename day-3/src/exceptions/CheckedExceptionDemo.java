package exceptions;

import java.io.IOException;

public class CheckedExceptionDemo {

	public void readInput() {
		try {
			int data = System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

	}

}
