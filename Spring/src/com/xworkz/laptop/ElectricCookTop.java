package com.xworkz.laptop;

public class ElectricCookTop {
	private String brand;
	private String color;
	private double weight;
	private double liters;
	private double wireLength;
	private String customer;
	private double warranty;
	
	public ElectricCookTop() {
		System.out.println(this.getClass().getSimpleName()+"invoked ElectricCookTop no args const ");
	}

	public ElectricCookTop(String brand, String color, double weight, double liters) {
		super();
		this.brand = brand;
		this.color = color;
		this.weight = weight;
		this.liters = liters;
		System.out.println("invoked ElectricCookTop :"+brand);
		System.out.println("invoked ElectricCookTop :"+color);
		System.out.println("invoked ElectricCookTop :"+weight);
		System.out.println("invoked ElectricCookTop :"+liters);
	}

	public double getWireLength() {
		return wireLength;
	}

	public void setWireLength(double wireLength) {
		this.wireLength = wireLength;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public double getWarranty() {
		return warranty;
	}

	public void setWarranty(double warranty) {
		this.warranty = warranty;
	}
	
	
	

}
