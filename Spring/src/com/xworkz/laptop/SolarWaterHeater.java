package com.xworkz.laptop;

public class SolarWaterHeater {
	private double capacity;
	private String brand;
	private double price;
	private boolean coldWater;
	
	public SolarWaterHeater() {
		System.out.println("created SolarWaterHeater "+this.getClass().getSimpleName());
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isColdWater() {
		return coldWater;
	}

	public void setColdWater(boolean coldWater) {
		this.coldWater = coldWater;
	}
	

}
