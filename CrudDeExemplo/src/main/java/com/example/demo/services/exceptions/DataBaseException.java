package com.example.demo.services.exceptions;

public class DataBaseException extends RuntimeException{

	private static final long serialVersionUID = -6062087554455305469L;
	
	public DataBaseException(String msg) {
		super(msg);
	}

}
