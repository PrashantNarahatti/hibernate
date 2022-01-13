package com.xworkz.silkManufacturer.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "silkManufacturer_table")
public class SilkManufacturerEntity implements Serializable {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "location")
	private String location;
	@Column(name = "pattern")
	private String pattern;
	@Column(name = "occasion")
	private String occasion;
	@Column(name = "bordersType")
	private String bordersType;
	@Column(name = "quantity")
	private int quantity;

	public SilkManufacturerEntity() {
		System.out.println("invoked default no-arg const");
	}

	public SilkManufacturerEntity(int id, String name, String location, String pattern, String occasion,
			String bordersType, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.pattern = pattern;
		this.occasion = occasion;
		this.bordersType = bordersType;
		this.quantity = quantity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "SilkManufacturerEntity [id=" + id + ", name=" + name + ", location=" + location + ", pattern=" + pattern
				+ ", occasion=" + occasion + ", bordersType=" + bordersType + ", quantity=" + quantity + "]";
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	public String getOccasion() {
		return occasion;
	}

	public void setOccasion(String occasion) {
		this.occasion = occasion;
	}

	public String getBordersType() {
		return bordersType;
	}

	public void setBordersType(String bordersType) {
		this.bordersType = bordersType;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SilkManufacturerEntity other = (SilkManufacturerEntity) obj;
		if (id != other.id)
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}