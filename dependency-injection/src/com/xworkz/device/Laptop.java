package com.xworkz.device;

public class Laptop {

	private Camera camera;
	private String brand;

	public Laptop() {
		System.out.println(this.getClass().getSimpleName().concat("invoked no args of laptop"));
	}
	
	
	
	public Laptop(Camera camera, String brand) {
		super();
		this.camera = camera;
		this.brand = brand;
		System.out.println("shooting takePicture"+brand);
	}



	public void takePicture() {
		System.out.println("shooting take Picture");

	if(camera!=null) {
		camera.pactureImage();
	}
	else {
		System.err.println("shooting is not take Picture");
	}

}
}

