package com.xworkz.silkManufacturer;

import com.xworkz.silkManufacturer.dao.SilkManufacturerDAO;
import com.xworkz.silkManufacturer.dao.SilkManufacturerDAOImpl;
import com.xworkz.silkManufacturer.entity.SilkManufacturerEntity;

public class SilkManufacturerScammer {

	public static void main(String[] args) {
		//SilkManufacturerEntity entity16=new SilkManufacturerEntity(16,"Banarasi silk", "Guddadahalli-Bangalore", "silk", " Wedding wear", "no border",7);
	    //SilkManufacturerEntity entity17=new SilkManufacturerEntity(17,"Kanjivaram silk", "Mahadevapura-Bangalore", "silky", "Wedding wear", "thick border", 10);
	    SilkManufacturerEntity entity18=new SilkManufacturerEntity(18,"Handwoven Kanchipuram silk", "Yemalur-Bangalore", "woven", "party wear", "thin border",15);
		
	    SilkManufacturerDAO dao=new SilkManufacturerDAOImpl();
	    //dao.put(entity16);
	    //dao.put(entity17);
	    dao.put(entity18);
	}

}
