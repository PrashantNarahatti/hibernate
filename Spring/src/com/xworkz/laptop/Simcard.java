package com.xworkz.laptop;

public class Simcard {
	public Simcard() {
		System.out.println(this.getClass().getSimpleName().concat("invoked no args of simcard"));
	}

	public boolean working() {
		System.out.println("invoked working");
		return true;
	}

	public String calling() {
		System.out.println("invoked calling");
		return "Talking";
	}
}
