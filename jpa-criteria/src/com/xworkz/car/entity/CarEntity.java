package com.xworkz.car.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "car_table")
@Entity
public class CarEntity implements Serializable {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "type")
	private String type;
	@Column(name = "price")
	private float price;
	@Column(name = "weight")
	private double weight;
	
	public CarEntity(String name, String type, float price, double weight) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
		this.weight = weight;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}


	@Override
	public String toString() {
		return "CarEntity [id=" + id + ", name=" + name + ", type=" + type + ", price=" + price + ", weight=" + weight
				+ "]";
	}
	
	
}
