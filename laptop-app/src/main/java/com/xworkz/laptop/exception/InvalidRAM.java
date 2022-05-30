package com.xworkz.laptop.exception;

@SuppressWarnings("serial")
public class InvalidRAM extends RuntimeException{
	public InvalidRAM(String msg) {
		super(msg);
	}
}
