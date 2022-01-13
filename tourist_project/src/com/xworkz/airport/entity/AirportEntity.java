package com.xworkz.airport.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "airport_details")
public class AirportEntity {
	@Id
	 @Column(name="a_id")
	 private int id;
	 @Column(name="a_name")
	 private String name;
	 @Column(name="a_location")
	 private String location;
	 @Column(name="a_type")
	 private String type;
	 @Column(name="a_sanitized")
	 private boolean sanitized;
	 @Column(name="a_noOfWorkers")
	 private int noOfWorkers;
	
	 
	public AirportEntity() {
		System.out.println("invoked no args const");
	}


	public AirportEntity(int id, String name, String location, String type, boolean sanitized, int noOfWorkers) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.type = type;
		this.sanitized = sanitized;
		this.noOfWorkers = noOfWorkers;
	}


	@Override
	public String toString() {
		return "AirportEntity [id=" + id + ", name=" + name + ", location=" + location + ", type=" + type
				+ ", sanitized=" + sanitized + ", noOfWorkers=" + noOfWorkers + "]";
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


	public boolean isSanitized() {
		return sanitized;
	}


	public void setSanitized(boolean sanitized) {
		this.sanitized = sanitized;
	}


	public int getNoOfWorkers() {
		return noOfWorkers;
	}


	public void setNoOfWorkers(int noOfWorkers) {
		this.noOfWorkers = noOfWorkers;
	}
	
}