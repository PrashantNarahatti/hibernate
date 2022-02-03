package com.xworkz.laptop;

public class Paint {
	public Paint() {
		System.out.println(this.getClass().getSimpleName().concat("invoked no args of paint"));
	}
	public String decorate() {
		System.out.println("invoked ");
		return "3D decoration";
	}
	public String painting() {
		System.out.println("invoked painting");
		return "Wall Painting";
		
	}

}
