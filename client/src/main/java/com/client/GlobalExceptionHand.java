package com.client;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHand {
	
	@ExceptionHandler(value=RuntimeException.class)
	public MesaageBean handleError(Exception ex) {
		System.out.println("asdas");
		return new MesaageBean("ANI_00","First Error","ERROR");
		
	}

}
