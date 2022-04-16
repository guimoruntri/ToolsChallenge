package com.tools.java.challenge.exception;

public class IllegalFormatException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public IllegalFormatException(String msg) {
		super(msg);
	}
		
	public IllegalFormatException(String msg, Throwable cause) {
		super(msg,cause);
	}

}
