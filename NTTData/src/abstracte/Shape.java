package abstracte;

public abstract class Shape {
	String color;

	public Shape() {
		System.out.println("shape constructor");
	}

	abstract void show();

}
