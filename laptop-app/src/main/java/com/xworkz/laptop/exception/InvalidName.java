package com.xworkz.laptop.exception;

@SuppressWarnings("serial")
public class InvalidName extends RuntimeException{
	public InvalidName(String msg) {
		super(msg);
	}
}