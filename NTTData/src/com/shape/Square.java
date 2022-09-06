package com.shape;

public class Square implements Polygon {
	float side = 5.0f;
	float ar = 0;

	@Override
	public void calcArea() {
		System.out.println("Perimeter of Square :" + 4 * side);

	}

	@Override
	public void calcPeri() {
		ar = side * side;
		System.out.println("Area of Square :" + ar);

	}

}
