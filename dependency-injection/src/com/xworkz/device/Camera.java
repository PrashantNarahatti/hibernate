package com.xworkz.device;

public class Camera {
	public Camera() {
		System.out.println(this.getClass().getSimpleName().concat("invoked no args of camera"));
	}
	public void captureImage() {
		System.out.println("capture images");
	}

}
