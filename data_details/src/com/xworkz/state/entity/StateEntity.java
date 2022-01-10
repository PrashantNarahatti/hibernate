package com.xworkz.state.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "state_details")
public class StateEntity implements Serializable {

	@Id
	@Column(name = "s_id")
	private int id;
	@Column(name = "s_name")
	private String name;
	@Column(name = "s_noOfDistricts")
	private int noOfDistricts;
	@Column(name = "s_capitalCity")
	private String capitalCity;

	public StateEntity() {
		System.out.println("invoked no-arg const");
	}

	public StateEntity(int id, String name, int noOfDistricts, String capitalCity) {
		super();
		this.id = id;
		this.name = name;
		this.noOfDistricts = noOfDistricts;
		this.capitalCity = capitalCity;
	}

	@Override
	public String toString() {
		return "StateEntity [id=" + id + ", name=" + name + ", noOfDistricts=" + noOfDistricts + ", capitalCity="
				+ capitalCity + "]";
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

	public int getNoOfDistricts() {
		return noOfDistricts;
	}

	public void setNoOfDistricts(int noOfDistricts) {
		this.noOfDistricts = noOfDistricts;
	}

	public String getCapitalCity() {
		return capitalCity;
	}

	public void setCapitalCity(String capitalCity) {
		this.capitalCity = capitalCity;
	}

	
}
