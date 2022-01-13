package com.xworkz.medicine.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medicine_table")
public class MedicineEntity implements Serializable {
	@Id
	@Column(name = "m_id")
	private int id;
	@Column(name = "m_name")
	private String name;
	@Column(name = "m_shopName")
	private String shopName;
	@Column(name = "m_type")
	private String type;
	@Column(name = "m_colour")
	private String colour;
	@Column(name = "m_grams")
	private float grams;
	@Column(name = "m_quantity")
	private int quantity;

	public MedicineEntity() {
		System.out.println("invoked default no-arg const");
	}

	public MedicineEntity(int id, String name, String shopName, String type, String colour, float grams, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.shopName = shopName;
		this.type = type;
		this.colour = colour;
		this.grams = grams;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "MedicineEntity [id=" + id + ", name=" + name + ", shopName=" + shopName + ", type=" + type + ", colour="
				+ colour + ", grams=" + grams + ", quantity=" + quantity + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		MedicineEntity other = (MedicineEntity) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
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

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public float getGrams() {
		return grams;
	}

	public void setGrams(float grams) {
		this.grams = grams;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}