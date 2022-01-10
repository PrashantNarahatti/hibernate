package com.xworkz.city.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "city_details")
public class CityEntity implements Serializable {
	@Id
	@Column(name = "c_id")
	private int id;
	@Column(name = "c_name")
	private String name;
	@Column(name = "c_population")
	private String population;
	@Column(name = "c_famousFor")
	private String famousFor;
	@Column(name = "c_coronaZone")
	private String coronaZone;

	public CityEntity() {
		System.out.println("invoked no-arg const");
	}

	public CityEntity(int id, String name, String population, String famousFor, String coronaZone) {
		super();
		this.id = id;
		this.name = name;
		this.population = population;
		this.famousFor = famousFor;
		this.coronaZone = coronaZone;
	}

	@Override
	public String toString() {
		return "CityEntity [id=" + id + ", name=" + name + ", population=" + population + ", famousFor=" + famousFor
				+ ", coronaZone=" + coronaZone + "]";
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

	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}

	public String getFamousFor() {
		return famousFor;
	}

	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}

	public String getCoronaZone() {
		return coronaZone;
	}

	public void setCoronaZone(String coronaZone) {
		this.coronaZone = coronaZone;
	}

}
