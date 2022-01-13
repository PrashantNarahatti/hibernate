package com.xworkz.solarSystem;

import com.xworkz.solarSystem.dao.SolarSystemDAO;
import com.xworkz.solarSystem.dao.SolarSystemDAOImpl;
import com.xworkz.solarSystem.entity.SolarSystemEntity;

public class SolarSystemScammer {

	public static void main(String[] args) {
		SolarSystemEntity entity=new SolarSystemEntity(1,"Tata Power","Big",9000,15,250);
		
		SolarSystemDAO dao=new SolarSystemDAOImpl();
		dao.put(entity);

	}

}
