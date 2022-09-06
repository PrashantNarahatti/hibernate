package corejava;
import inheritance.Car;
public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Car bmw=new Car("BMWX1","White",12345,100000,"BMW",118,true);
       // bmw.disPlayDetails();
        bmw.setColor("black");
       // bmw.disPlayDetails();
        System.out.println(bmw);
        
        Car obj=new Car();
	}

}
