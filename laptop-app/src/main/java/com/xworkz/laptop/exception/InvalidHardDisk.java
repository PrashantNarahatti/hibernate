package com.xworkz.laptop.exception;

@SuppressWarnings("serial")
public class InvalidHardDisk extends RuntimeException{
	public InvalidHardDisk(String msg) {
		super(msg);
	}
}
