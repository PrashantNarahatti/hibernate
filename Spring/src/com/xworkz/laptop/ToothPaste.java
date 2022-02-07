package com.xworkz.laptop;

public class ToothPaste {
	private String company;
	private double price;
	private boolean offer;
	private double ml;
	private boolean salt;


	public ToothPaste() {
		System.out.println(this.getClass().getSimpleName() + "invoked toothPaste no args const");
	}

	public ToothPaste(String company, double price, boolean offer, double ml) {
		super();
		this.company = company;
		this.price = price;
		this.offer = offer;
		this.ml = ml;
		System.out.println("invoked ToothPaste :" + company);
		System.out.println("invoked ToothPaste :" + price);
		System.out.println("invoked ToothPaste :" + offer);
		System.out.println("invoked ToothPaste :" + ml);
	}

	public boolean isSalt() {
		return salt;
	}

	public void setSalt(boolean salt) {
		this.salt = salt;
	}

}
