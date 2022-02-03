package com.xworkz.laptop;

public class Tissue {
	public Tissue() {
		System.out.println(this.getClass().getSimpleName().concat("invoked no args of tissue"));
	}
	public boolean handClean() {
		System.out.println("invoked hand clean");
		return true;
	}
	public String colour() {
		System.out.println("invoked colour");
		return "White";
	}

}
