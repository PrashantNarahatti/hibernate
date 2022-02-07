package com.xworkz.laptop;

public class Ups {
	private String company;
	private String type;
	private double weight;
	private double backupHours;
	private double chargeHours;
	
	
	public Ups() {
	  System.out.println(this.getClass().getSimpleName()+"invoked ups no args const");
	}


	public Ups(String company, String type) {
		super();
		this.company = company;
		this.type = type;
		System.out.println("invoked ups :"+company);
		System.out.println("invoked ups :"+type);
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public double getBackupHours() {
		return backupHours;
	}


	public void setBackupHours(double backupHours) {
		this.backupHours = backupHours;
	}


	public double getChargeHours() {
		return chargeHours;
	}


	public void setChargeHours(double chargeHours) {
		this.chargeHours = chargeHours;
	}
	
	
	

}
