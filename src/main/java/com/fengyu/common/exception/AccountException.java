package com.fengyu.common.exception;

/**
 *
 */
public class AccountException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public AccountException() {
		super();
	}

	public AccountException(String message) {
		super(message);
	}

	public AccountException(Throwable cause) {
		super(cause);
	}

	public AccountException(String message, Throwable cause) {
		super(message, cause);
	}
}
