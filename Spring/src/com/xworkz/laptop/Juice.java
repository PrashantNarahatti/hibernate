package com.xworkz.laptop;

public class Juice {
	public Juice() {
		System.out.println(this.getClass().getSimpleName().concat("invoked no args of juice"));
	}
	public boolean drink() {
		System.out.println("invoked drink");
		return true;
	}
	public String coldJuice() {
		System.out.println("invoked cold juice");
		return "Lemon Juice";
	}

}
