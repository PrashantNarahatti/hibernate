package com.xworkz.laptop;

public class Tablet {
	public Tablet() {
		System.out.println(this.getClass().getSimpleName().concat("invoked no args of tablet"));
	}

	public boolean killBacteria() {
		System.out.println("invoked kill Bacteria");
		return true;

	}
	public String immunity() {
		System.out.println("invoked immunity");
		return "Azithromycin";
	}

}
