package com.xworkz.website.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
public class WebsiteEntity implements Serializable{
	
	
	private int id;	
	 private String name;	
	 private String url;
	 private String since;
	 private String owner;
	 private String domain;
	 
	 

}
