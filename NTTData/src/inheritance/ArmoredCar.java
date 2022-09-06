package inheritance;

public class ArmoredCar extends Car implements Floatable,Flyable {
	int bulletProofWindows=6;
	void remoteStart() {
		System.out.println("controlled by remote control");
		
	}
	public String displayModel() {
		return model;
		
	}
	@Override
	public void fly() {
		System.out.println("it can fly");
	}
	@Override
	public void floatOnWater() {
		System.out.println("it can float");
	}

}
