package com.xworkz.director;

import com.xworkz.device.Camera;
import com.xworkz.device.Laptop;

public class LaptopDirector {

	public static void main(String[] args) {
		Laptop laptop=new Laptop();
		Camera camera=new Camera();
		camera.pactureImage();
		String brand="Dell";
		System.out.println(brand);
		laptop.takePicture();

	}

}
