package com.xworkz.laptop.exception;
@SuppressWarnings("serial")
public class InvalidROM extends RuntimeException{
	public InvalidROM(String msg) {
		super(msg);
	}
}