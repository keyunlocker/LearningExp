package com.client;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.BAD_REQUEST,reason="data mismatch")
public class ResponseStatusException extends Exception{
	
	private static final long serialVersionUID = 1L;
	public ResponseStatusException(String message) {
		super(message);
	}
	
	
}
