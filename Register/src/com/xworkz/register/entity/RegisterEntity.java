package com.xworkz.register.entity;

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
import lombok.ToString;
@NoArgsConstructor
@Setter
@Getter
@ToString
@AllArgsConstructor
@Table(name = "register_table")
@Entity
public class RegisterEntity implements Serializable {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "userName")
	private String userName;
	@Column(name = "email")
	private String email;
	@Column(name = "password")
	private String password;
	@Column(name = "city")
	private String city;
	@Column(name = "country")
	private String country;
	@Column(name = "mobileNo")
	private long mobileNo;
	@Column(name = "indianCitizen")
	private boolean indianCitizen;
	
	public RegisterEntity(String userName, String email, String password, String city, String country, long mobileNo,
			boolean indianCitizen) {
		super();
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.city = city;
		this.country = country;
		this.mobileNo = mobileNo;
		this.indianCitizen = indianCitizen;
	}
	
	

}
