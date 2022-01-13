package com.xworkz.airport;

import com.xworkz.airport.dao.AirportDAO;
import com.xworkz.airport.dao.AirportDAOImpl;
import com.xworkz.airport.entity.AirportEntity;

public class AirportScammer {

	public static void main(String[] args) {
		AirportEntity entity1= new AirportEntity(1,"KIAB","Bangalore","KIA",true ,15);

		AirportDAO dao = new AirportDAOImpl();
		dao.put(entity1);

	}

}
