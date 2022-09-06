package polymorphism;

public class Area {
	//area of a square
	public int area(int side) {
		return side*side;
		
	}
	//area of a circle
  public double area(double radius) {
	  return 3.14*radius*radius;
  }
  //area of a rectangle
  public int area(int length,int breadth) {
	  return length*breadth;
  }
}
