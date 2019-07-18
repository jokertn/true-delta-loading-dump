package com.delta.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class MyFileNotFoundException extends RuntimeException {
	/**
	 * 
	 * @author AMINE SAFI
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyFileNotFoundException(String message) {
        super(message);
    }

    public MyFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}