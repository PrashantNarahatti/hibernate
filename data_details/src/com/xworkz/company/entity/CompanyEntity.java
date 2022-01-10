package com.xworkz.company.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="company_details")

public class CompanyEntity implements Serializable
{
@Id
@Column(name="id")
 private int id;
@Column(name="name")	
 private String name;
@Column(name="type")
 private String type;
@Column(name="doamin")
 private String doamin;
@Column(name="website")
 private String website;
 
 public CompanyEntity() 
 {
	System.out.println("invoked no-arg const");
	}

public CompanyEntity(int id, String name, String type, String doamin, String website) {
	super();
	this.id = id;
	this.name = name;
	this.type = type;
	this.doamin = doamin;
	this.website = website;
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
	CompanyEntity other = (CompanyEntity) obj;
	if (id != other.id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
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

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public String getDoamin() {
	return doamin;
}

public void setDoamin(String doamin) {
	this.doamin = doamin;
}

public String getWebsite() {
	return website;
}

public void setWebsite(String website) {
	this.website = website;
}

@Override
public String toString() {
	return "CompanyEntity [id=" + id + ", name=" + name + ", type=" + type + ", doamin=" + doamin + ", website="
			+ website + "]";
}
 
 
}