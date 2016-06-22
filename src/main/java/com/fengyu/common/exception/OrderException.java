package com.fengyu.common.exception;

/**
 *
 */
public class OrderException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public OrderException() {
		super();
	}

	public OrderException(String message) {
		super(message);
	}

	public OrderException(Throwable cause) {
		super(cause);
	}

	public OrderException(String message, Throwable cause) {
		super(message, cause);
	}
}
