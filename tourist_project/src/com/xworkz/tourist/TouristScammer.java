package com.xworkz.tourist;

import com.xworkz.tourist.dao.TouristDAO;
import com.xworkz.tourist.dao.TouristDAOImpl;
import com.xworkz.tourist.entity.TouristEntity;

public class TouristScammer {

	public static void main(String[] args) {

		// TouristEntity entity1 = new TouristEntity(1, "Shimogga", 1200.34f,
		// "Waterfalls", 500, "Rainy Season");
		// TouristEntity entity2 = new TouristEntity(2, "Mysore", 700.0f, "Palace",
		// 500,"Rainy Season");
		TouristEntity entity3 = new TouristEntity(3, "Hampi", 998.0f, "Virupakshatemple", 200, "All Season");

		TouristDAO dao = new TouristDAOImpl();

		// dao.put(entity1);
		// dao.put(entity2);
		dao.put(entity3);

	}

}
