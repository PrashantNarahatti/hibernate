package com.xworkz.device;

public class Camera {
	public Camera() {
		System.out.println(this.getClass().getSimpleName().concat("invoked no args of camera"));
	}
	public void pactureImage() {
		System.out.println("pacture images");
	}

}
