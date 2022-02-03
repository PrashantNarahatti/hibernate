package com.xworkz.laptop;

public class Purifier {
	public Purifier() {
		System.out.println(this.getClass().getSimpleName().concat("invoked no args of purifier"));
	}

	public boolean cleanWater() {
		System.out.println("clean water");
		return true;
	}

	public String drinkWater() {
		System.out.println("invoked drink water");
		return "Milk";

	}

}
