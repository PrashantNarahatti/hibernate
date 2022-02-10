package com.xworkz.car;

import com.xworkz.car.dao.CarDAO;
import com.xworkz.car.dao.CarDAOImpl;
import com.xworkz.car.entity.CarEntity;

public class CarStarter {

	public static void main(String[] args) {
		CarEntity entity1=new CarEntity(1,"i20","Hatchback",800000.0f,1000);
		CarEntity entity2=new CarEntity(2,"Maruti","Hatchback",700000.0f,1000);
		
		CarDAO dao=new CarDAOImpl();
		dao.fetchById(2);
		dao.fetchById(1);;

	}

}
