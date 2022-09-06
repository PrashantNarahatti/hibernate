package inheritance;

public class ArmoredClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ArmoredCar ac=new ArmoredCar();
   ac.floatOnWater();
   ac.fly();
   String model=ac.displayModel();
   System.out.println(model);
   System.out.println(ac.bulletProofWindows);
	}

}
