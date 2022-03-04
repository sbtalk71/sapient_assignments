package exceptions;

import java.util.Scanner;

public class ThrowDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			int age = sc.nextInt();
			try {
				if (age < 21) {
					//throw new RuntimeException("" + age);
					throw new AgeNotAllowedException(age+"");
				} else {
					System.out.println("You are allowed..");
				}
			} catch (AgeNotAllowedException e) {
				System.out.println(e);
				System.out.println("You are not allowed for your under age " + e.getMessage());
			}
		}

	}

}
