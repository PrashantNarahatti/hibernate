package com.xworkz.patient.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patient_details")
public class PatientEntity implements Serializable {
	@Id
	@Column(name = "p_id")
	private int id;
	@Column(name = "p_name")
	private String name;
	@Column(name = "p_birthPlace")
	private String birthPlace;
	@Column(name = "p_corona")
	private String corona;
	@Column(name = "p_age")
	private int age;
	@Column(name = "p_buNo")
	private int buNo;

	public PatientEntity() {
		System.out.println("invoked no-arg const");
	}

	public PatientEntity(int id, String name, String birthPlace, String corona, int age, int buNo) {
		super();
		this.id = id;
		this.name = name;
		this.birthPlace = birthPlace;
		this.corona = corona;
		this.age = age;
		this.buNo = buNo;
	}

	@Override
	public String toString() {
		return "PatientEntity [id=" + id + ", name=" + name + ", birthPlace=" + birthPlace + ", corona=" + corona
				+ ", age=" + age + ", buNo=" + buNo + "]";
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

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public String getCorona() {
		return corona;
	}

	public void setCorona(String corona) {
		this.corona = corona;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getBuNo() {
		return buNo;
	}

	public void setBuNo(int buNo) {
		this.buNo = buNo;
	}

}
