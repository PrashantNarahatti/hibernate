package com.xworkz.solarSystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "solarSystem_details")
public class SolarSystemEntity {
	@Id
	 @Column(name="s_id")
	 private int id;
	 @Column(name="s_name")
	 private String name;
	 @Column(name="s_size")
	 private String size;
	 @Column(name="a_price")
	 private int price;
	 @Column(name="a_noOfPanels")
	 private int noOfPanels;
	 @Column(name="a_TotalVoltages")
	 private int TotalVoltages;
	 
	 public SolarSystemEntity() {
		System.out.println("invoked no arg const");
	}

	public SolarSystemEntity(int id, String name, String size, int price, int noOfPanels, int totalVoltages) {
		super();
		this.id = id;
		this.name = name;
		this.size = size;
		this.price = price;
		this.noOfPanels = noOfPanels;
		TotalVoltages = totalVoltages;
	}

	@Override
	public String toString() {
		return "SolarSystemEntity [id=" + id + ", name=" + name + ", size=" + size + ", price=" + price
				+ ", noOfPanels=" + noOfPanels + ", TotalVoltages=" + TotalVoltages + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNoOfPanels() {
		return noOfPanels;
	}

	public void setNoOfPanels(int noOfPanels) {
		this.noOfPanels = noOfPanels;
	}

	public int getTotalVoltages() {
		return TotalVoltages;
	}

	public void setTotalVoltages(int totalVoltages) {
		TotalVoltages = totalVoltages;
	}
	

}
