package com.example.demo.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{

	private static final long serialVersionUID = -6062087554455305469L;
	
	public ResourceNotFoundException(String msg) {
		super(msg);
	}

}
