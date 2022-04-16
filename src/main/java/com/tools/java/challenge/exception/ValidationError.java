package com.tools.java.challenge.exception;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {

	private static final long serialVersionUID = 1L;

	private List<FieldMessage> list = new ArrayList<>();
	
	public ValidationError(Integer status, String message, Long timesTemp) {
		super(status, message, timesTemp);
	}
	
	public List<FieldMessage> getErros() {
		return list;
	}
	
	public void addErrors(String fieldName, String message ) {
		list.add(new FieldMessage(fieldName,message));
	}
}
