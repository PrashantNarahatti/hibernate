package com.xworkz.laptop.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LaptopDTO {
	private String name;
	private String brand;
	private String color;
	private float price;
	private int ram;
	private int rom;
	private String hardDisk;

	public void setName(String name) {
		System.out.println("Invoked setName().setting the value");
		this.name = name;
	}

	public void setBrand(String brand) {
		System.out.println("Invoked setBrand().setting the value");

		this.brand = brand;
	}

	public void setColor(String color) {
		System.out.println("Invoked setColor().setting the value");

		this.color = color;
	}

	public void setPrice(int price) {
		System.out.println("Invoked setPrice().setting the value");
		this.price = price;
	}

	public void setRam(int ram) {
		System.out.println("Invoked setRam().setting the value");
		this.ram = ram;
	}

	public void setRom(int rom) {
		System.out.println("Invoked setRom().setting the value");
		this.rom = rom;
	}

	public void setHardDisk(String hardDisk) {
		System.out.println("Invoked setHardDisk().setting the value");
		this.hardDisk = hardDisk;
	}
	


	public String getName() {
		return name;
	}

	public String getBrand() {
		return brand;
	}

	public String getColor() {
		return color;
	}

	public float getPrice() {
		return price;
	}

	public int getRam() {
		return ram;
	}

	public int getRom() {
		return rom;
	}

	public String getHardDisk() {
		return hardDisk;
	}

}