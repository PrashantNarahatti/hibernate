package com.xworkz.laptop;

public class Oximeter {
	public Oximeter() {
		System.out.println(this.getClass().getSimpleName().concat("invoked no args of Oximeter"));
	}
	public boolean skinPigmention() {
		System.out.println("invoked skinPigmention");
		return true;
	}
	public String detectVirus() {
		System.out.println("invoked detectVirus");
		return "corona";
	}

}
