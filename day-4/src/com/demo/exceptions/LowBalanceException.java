package com.demo.exceptions;

public class LowBalanceException extends Exception {

	public LowBalanceException() {

	}

	public LowBalanceException(String message) {
		super(message);
	}

}
