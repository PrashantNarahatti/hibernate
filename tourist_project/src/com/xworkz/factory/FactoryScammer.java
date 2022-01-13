package com.xworkz.factory;

import com.xworkz.factory.dao.FactoryDAO;
import com.xworkz.factory.dao.FactoryDAOImpl;
import com.xworkz.factory.entity.FactoryEntity;

public class FactoryScammer {

	public static void main(String[] args) {
		// FactoryEntity entity10=new FactoryEntity(10, "Britannia Industries", "Bangalore", "Food", 4500, 23345d);
		// FactoryEntity entity11=new FactoryEntity(11, "Mysore Sandal Shop", "Near Iskcon temple-Bangalore", "Soap", 2100, 13345d);
		 FactoryEntity entity12=new FactoryEntity(12, "Sugar Factory", "Mundargi", "Food", 2500, 2334d);
		
		 FactoryDAO dao=new FactoryDAOImpl();
		 //dao.put(entity10);
		 //dao.put(entity11);
		 dao.put(entity12);
	}

}
