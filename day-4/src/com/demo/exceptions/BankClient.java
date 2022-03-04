package com.demo.exceptions;

public class BankClient {

	public static void main(String[] args) {
		Account account = new Account(2000);
		try {
			account.withdraw(200);
			account.withdraw(2000);
		} catch (LowBalanceException e) {
			System.out.println(e.getMessage());
		}

	}

}
