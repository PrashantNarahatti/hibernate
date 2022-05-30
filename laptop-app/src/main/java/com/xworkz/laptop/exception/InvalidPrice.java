package com.xworkz.laptop.exception;
@SuppressWarnings("serial")
public class InvalidPrice extends RuntimeException{
	public InvalidPrice(String msg) {
		super(msg);
	}
}