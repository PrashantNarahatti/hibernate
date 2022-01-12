package com.xworkz.tourist.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "factory_table")
public class FactoryEntity implements Serializable {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "location")
	private String location;
	@Column(name = "type")
	private String type;
	@Column(name = "noOfWorkers")
	private int noOfWorkers;
	@Column(name = "acres")
	private double acres;

	public FactoryEntity() {
		System.out.println("invoked default no-arg const");
	}

	public FactoryEntity(int id, String name, String location, String type, int noOfWorkers, double acres) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.type = type;
		this.noOfWorkers = noOfWorkers;
		this.acres = acres;
	}

	@Override
	public String toString() {
		return "FactoryEntity [id=" + id + ", name=" + name + ", location=" + location + ", type=" + type
				+ ", noOfWorkers=" + noOfWorkers + ", acres=" + acres + "]";
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNoOfWorkers() {
		return noOfWorkers;
	}

	public void setNoOfWorkers(int noOfWorkers) {
		this.noOfWorkers = noOfWorkers;
	}

	public double getAcres() {
		return acres;
	}

	public void setAcres(double acres) {
		this.acres = acres;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		FactoryEntity other = (FactoryEntity) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
