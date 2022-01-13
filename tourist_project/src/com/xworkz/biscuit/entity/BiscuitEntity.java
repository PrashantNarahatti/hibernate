package com.xworkz.biscuit.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "biscuit_table")
public class BiscuitEntity implements Serializable {
	@Id
	@Column(name = "b_id")
	private int id;
	@Column(name = "b_brand")
	private String brand;
	@Column(name = "b_name")
	private String name;
	@Column(name = "b_colour")
	private String colour;
	@Column(name = "b_price")
	private int price;
	@Column(name = "b_quantity")
	private int quantity;
	@Column(name = "b_invented")
	private String invented;

	public BiscuitEntity() {
		System.out.println("invoked  no-arg const");
	}

	public BiscuitEntity(int id, String brand, String name, String colour, int price, int quantity, String invented) {
		super();
		this.id = id;
		this.brand = brand;
		this.name = name;
		this.colour = colour;
		this.price = price;
		this.quantity = quantity;
		this.invented = invented;
	}

	@Override
	public String toString() {
		return "BiscuitEntity [id=" + id + ", brand=" + brand + ", name=" + name + ", colour=" + colour + ", price="
				+ price + ", quantity=" + quantity + ", invented=" + invented + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getInvented() {
		return invented;
	}

	public void setInvented(String invented) {
		this.invented = invented;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BiscuitEntity other = (BiscuitEntity) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

}
