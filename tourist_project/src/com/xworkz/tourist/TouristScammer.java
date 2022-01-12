package com.xworkz.tourist;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.xworkz.tourist.dao.TouristDAO;
import com.xworkz.tourist.dao.TouristDAOImpl;
import com.xworkz.tourist.entity.BiscuitEntity;
import com.xworkz.tourist.entity.FactoryEntity;
import com.xworkz.tourist.entity.MedicineEntity;
import com.xworkz.tourist.entity.RailwayStationEntity;
import com.xworkz.tourist.entity.SilkManufacturerEntity;
import com.xworkz.tourist.entity.TouristEntity;

public class TouristScammer {

	public static void main(String[] args) {
		

		// TouristEntity entity1 = new TouristEntity(1, "Shimogga", 1200.34f, "Waterfalls", 500, "Rainy Season");
		// TouristEntity entity2 = new TouristEntity(2, "Mysore", 700.0f, "Palace", 500,"Rainy Season");
		// TouristEntity entity3 = new TouristEntity(3, "Hampi", 998.0f, "Virupakshatemple",200, "All Season");

		// BiscuitEntity entity4=new BiscuitEntity(4,"Cadbury","Bournvita","Orange",140,5,"1905-England");
		// BiscuitEntity entity5=new BiscuitEntity(5,"Parle","Parle-G","Yellow",100,5,"1879-England");
		// BiscuitEntity entity6=new BiscuitEntity(6,"cadbury ","cadbury Chocobakes","Purple",20,10,"200-Europe");
		
		// RailwayStationEntity entity7=new RailwayStationEntity(7, "	Toranagallu Railway Station", "	Toranagallu", 10, true, 61,"TNGL");
		//RailwayStationEntity entity8=new RailwayStationEntity(8, "Almatti", "Almatt", 3, true, 19, "LMT");
	   //RailwayStationEntity entity9=new RailwayStationEntity(9, "Bangalore City Junction", "Bangalore", 6, true, 42,"SBC");
		
		 //FactoryEntity entity10=new FactoryEntity(10, "Britannia Industries", "Bangalore", "Food", 4500, 23345d);
		 //FactoryEntity entity11=new FactoryEntity(11, "Mysore Sandal Shop", "Near Iskcon temple-Bangalore", "Soap", 2100, 13345d);
		 //FactoryEntity entity12=new FactoryEntity(12, "Sugar Factory", "Mundargi", "Food", 2500, 2334d);
		
		 //MedicineEntity entity13=new MedicineEntity(13,"Zincold", "Adarsh","capsules", "pink", 100.0f,12);
		 //MedicineEntity entity14=new MedicineEntity(14,"Dolo 650", "Med Plus","capsules", "white", 150.0f,10);
		 //MedicineEntity entity15=new MedicineEntity(15,"Respira", "Shakti","syrup", "orange", 300.0f,2);
		
		//SilkManufacturerEntity entity16=new SilkManufacturerEntity(16,"Banarasi silk", "Guddadahalli-Bangalore", "silk", " Wedding wear", "no border",7);
		//SilkManufacturerEntity entity17=new SilkManufacturerEntity(17,"Kanjivaram silk", "Mahadevapura-Bangalore", "silky", "Wedding wear", "thick border", 10);
		SilkManufacturerEntity entity18=new SilkManufacturerEntity(18,"Handwoven Kanchipuram silk", "Yemalur-Bangalore", "woven", "party wear", "thin border",15);
		
		 
		TouristDAO dao = new TouristDAOImpl();

		// dao.put(entity1);
		// dao.put(entity2);
		// dao.put(entity3);
		
		// dao.put1(entity4);
		// dao.put1(entity5);
		// dao.put1(entity6);
		
		//dao.put2(entity7);
		//dao.put2(entity8);
		//dao.put2(entity9);
		
		//dao.put3(entity10);
	    //dao.put3(entity11);
	    //dao.put3(entity12);
		
		//dao.put4(entity13);
	    //dao.put4(entity14);
	    //dao.put4(entity15);
		
		//dao.put5(entity16);
	    //dao.put5(entity17);
	    dao.put5(entity18);


	}

}
