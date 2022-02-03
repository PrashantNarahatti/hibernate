package com.xworkz.laptop;

public class Steamer {
	public Steamer() {
		System.out.println(this.getClass().getSimpleName().concat("invoked no args of steamer"));
	}
	public boolean clean() {
		System.out.println("invoked clean");
		return true;
	}
	public String heat() {
		System.out.println("invoked heat");
		return null;
	}

}
