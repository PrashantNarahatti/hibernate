package com.xworkz.laptop;

public class Sanitizer {
	public Sanitizer() {
		System.out.println(this.getClass().getSimpleName().concat("invoked no args of sanitizer"));
	}
	
	public boolean killGerm() {
		System.out.println("invoked killGerm method");
		return true;
		
	}
	
	 public String killsVirus() {
		System.out.println("invoked killsVirus method");
		return "Corona";
		
	}

}
