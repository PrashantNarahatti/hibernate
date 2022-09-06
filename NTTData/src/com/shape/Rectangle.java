package com.shape;

import java.awt.Polygon;

public class Rectangle extends Polygon {
	float length = 3.0f;
	float breadth = 6.0f;
	float ar=0;
  
	public void calcPeri() {

		System.out.println("Perimeter of rectangle:" + (length + breadth));
	}
	public void calcArea() {
		ar=length*breadth;
		System.out.println("Area of rectangle:"+ar);
	}
}
