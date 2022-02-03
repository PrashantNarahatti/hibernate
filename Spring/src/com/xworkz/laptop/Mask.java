package com.xworkz.laptop;

public class Mask {
	public Mask() {
		System.out.println(this.getClass().getSimpleName().concat("invoked no args of mask"));
	}
	public boolean safety() {
		System.out.println("invoked safety");
		return true;
	}
	public String protectVirus() {
		System.out.println("invoked protect virus");
		return "Corona";
	}

}
