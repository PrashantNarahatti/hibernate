package com.xworkz.tourist.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="railway_table")
public class RailwayStationEntity implements Serializable
{
 @Id
 @Column(name="r_id")
 private int id;
 @Column(name="r_name")
 private String name;
 @Column(name="r_location")
 private String location;
 @Column(name="r_noOfTracks")
 private int noOfTracks;
 @Column(name="r_sanitized")
 private boolean sanitized;
 @Column(name="r_noOfWorkers")
 private int noOfWorkers;
 @Column(name="r_stationCode")
 private String stationCode;
 
 public RailwayStationEntity() {
	System.out.println("invoked default no-arg const");
  }

public RailwayStationEntity(int id, String name, String location, int noOfTracks, boolean sanitized, int noOfWorkers,
		String stationCode) {
	super();
	this.id = id;
	this.name = name;
	this.location = location;
	this.noOfTracks = noOfTracks;
	this.sanitized = sanitized;
	this.noOfWorkers = noOfWorkers;
	this.stationCode = stationCode;
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

public int getNoOfTracks() {
	return noOfTracks;
}

public void setNoOfTracks(int noOfTracks) {
	this.noOfTracks = noOfTracks;
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

public String gerStationCode() {
	return stationCode;
}

public void setStationCode(String stationCode) {
	this.stationCode = stationCode;
}

@Override
public String toString() {
	return "RailwayStationEntity [id=" + id + ", name=" + name + ", location=" + location + ", noOfTracks=" + noOfTracks
			+ ", sanitized=" + sanitized + ", noOfWorkers=" + noOfWorkers + ", stationCode=" + stationCode + "]";
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
	RailwayStationEntity other = (RailwayStationEntity) obj;
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