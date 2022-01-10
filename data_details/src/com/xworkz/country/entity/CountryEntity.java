package com.xworkz.country.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="country_details")
public class CountryEntity implements Serializable {
	@Id
	@Column(name = "c_id")
	private int id;
	@Column(name = "c_name")
	private String name;
	@Column(name = "c_continent")
	private String continent;
	@Column(name = "c_population")
	private String population;

	public CountryEntity() {
		System.out.println("invoked no-arg const");
	}

	public CountryEntity(int id, String name, String continent, String population) {
		super();
		this.id = id;
		this.name = name;
		this.continent = continent;
		this.population = population;
	}

	@Override
	public String toString() {
		return "CountryEntity [id=" + id + ", name=" + name + ", continent=" + continent + ", population=" + population
				+ "]";
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

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}

}
