package com.tools.java.challenge.exception;

public class MethodArgumentNotValidException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public MethodArgumentNotValidException(String msg) {
		super(msg);
	}
	public MethodArgumentNotValidException(FieldMessage msg) {
		super();
	}
		
	public MethodArgumentNotValidException(String msg, Throwable cause) {
		super(msg,cause);
	}

}
