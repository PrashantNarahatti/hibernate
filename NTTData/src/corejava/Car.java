package corejava;

public class Car {
	
	private String model;
	private String color;
	private int engineNo;
	private float price;
	private String brand;
	private int fuel_tank_capacity;
	private boolean automatic;
	public Car(String model, String color, int engineNo, float price, String brand, int fuel_tank_capacity,
			boolean automatic) {
		super();
		this.model = model;
		this.color = color;
		this.engineNo = engineNo;
		this.price = price;
		this.brand = brand;
		this.fuel_tank_capacity = fuel_tank_capacity;
		this.automatic = automatic;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getEngineNo() {
		return engineNo;
	}
	public void setEngineNo(int engineNo) {
		this.engineNo = engineNo;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getFuel_tank_capacity() {
		return fuel_tank_capacity;
	}
	public void setFuel_tank_capacity(int fuel_tank_capacity) {
		this.fuel_tank_capacity = fuel_tank_capacity;
	}
	public boolean isAutomatic() {
		return automatic;
	}
	public void setAutomatic(boolean automatic) {
		this.automatic = automatic;
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + ", engineNo=" + engineNo + ", price=" + price + ", brand="
				+ brand + ", fuel_tank_capacity=" + fuel_tank_capacity + ", automatic=" + automatic + "]";
	}
	
	public void disPlayDetails()
	{
		System.out.println("Model:"+this.model);
		System.out.println("color:"+this.color);
		System.out.println("enginNo:"+this.engineNo);
		System.out.println("automatic:"+this.automatic);
	}

}
