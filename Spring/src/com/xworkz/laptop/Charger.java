package com.xworkz.laptop;

public class Charger {
	private String brand;
	private double price;
	private String color;
	private double volt;
	private boolean working;
	
	public Charger() {
		System.out.println("created"+ this.getClass().getSimpleName());
	}

	public Charger(String brand, double price) {
		super();
		this.brand = brand;
		this.price = price;
		System.out.println("invoked paramiter charger :"+ brand);
		System.out.println("invoked paramiter charger :"+ price);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getVolt() {
		return volt;
	}

	public void setVolt(double volt) {
		this.volt = volt;
	}

	public boolean isWorking() {
		return working;
	}

	public void setWorking(boolean working) {
		this.working = working;
	}

	
	

}
