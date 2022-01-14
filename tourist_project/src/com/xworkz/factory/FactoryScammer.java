package com.xworkz.factory;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.factory.dao.FactoryDAO;
import com.xworkz.factory.dao.FactoryDAOImpl;
import com.xworkz.factory.entity.FactoryEntity;

public class FactoryScammer {

	public static void main(String[] args) {
		
		//FactoryEntity entity10=new FactoryEntity(10, "Nyamgoud Textiles", "Bagalkot", "NG", 4500, 2345d);
	    //FactoryEntity entity11=new FactoryEntity(11, "Mysore Sandal Shop", "Near Iskcon temple-Bangalore", "Soap", 2100, 13345d);
	    //FactoryEntity entity12=new FactoryEntity(12, "Sugar Factory", "Mundargi", "Food", 2500, 2334d);
		
		List<FactoryEntity> factoryList = new ArrayList<FactoryEntity>();
		
		factoryList.add(new FactoryEntity(1, "Ashok Leyland", "Bangalore", "MC", 4200, 40345d));
		factoryList.add(new FactoryEntity(2, "Bajaj Auto", "Bangalore", "MC", 5000, 52345d));
		factoryList.add(new FactoryEntity(3, "TVS Motors", "Bagalkot", "MC", 3200, 25876d));
		factoryList.add(new FactoryEntity(4, "Hero Honda", "Bangalore", "ELC",2400, 13545d));
		factoryList.add(new FactoryEntity(5, "Apollo Tyres", "Gadag", "NG", 4500, 23345d));
		factoryList.add(new FactoryEntity(6, "Asian Paints", "Bangalore", "NG", 12500, 35865d));
		factoryList.add(new FactoryEntity(7, "BPL Group", "Bangalore", "BPL", 2500, 28445d));
		factoryList.add(new FactoryEntity(8, "Videocon Group", "Koppal", "PTL", 4500, 12345d));
		factoryList.add(new FactoryEntity(9, "Britannia Industries", "Bangalore", "Food", 2500, 45845d));
		factoryList.add(new FactoryEntity(10, "Nyamgoud Textiles", "Bagalkot", "NG", 4500, 28345d));
		factoryList.add(new FactoryEntity(11, "Mysore Sandal Shop", "Near Iskcon temple-Bangalore", "Soap", 2100, 13345d));
		factoryList.add(new FactoryEntity(12, "Sugar Factory", "Mundargi", "Food", 2500, 2334d));
		factoryList.add(new FactoryEntity(13, "Britannia Industries", "Bangalore", "Food", 4500, 23345d));
		factoryList.add(new FactoryEntity(14, "Larsen", "Pune", "ELC",2400, 13545d));
		factoryList.add(new FactoryEntity(15, "Toubro", "Gujarat", "ELC",2400, 13545d));
		factoryList.add(new FactoryEntity(16, "Jindal Steel", "Bangalore", "ELC",3000,35545d));
		factoryList.add(new FactoryEntity(17, "Hindusthan UL", "Bangalore", "UL",2400, 13545d));
		factoryList.add(new FactoryEntity(18, "Moser Baer", "Bangalore", "MB",2400, 13545d));
		factoryList.add(new FactoryEntity(19, "Godrej Group", "Bangalore", "GP",2400, 13545d));
		factoryList.add(new FactoryEntity(20, "Bombay Dyeing", "Bangalore", "TLM",2400, 13545d));
		factoryList.add(new FactoryEntity(21, "Raymond Group", "Bangalore", "ELC",2400, 13545d));
		factoryList.add(new FactoryEntity(22, "Amul", "Bangalore", "MC",2400, 13545d));
		factoryList.add(new FactoryEntity(23, "Dabur India", "Bangalore", "ELC",2400, 13545d));
		factoryList.add(new FactoryEntity(24, "Cadila Healthcare", "Bangalore", "ELC",2400, 13545d));
		factoryList.add(new FactoryEntity(25, "Cipla", "Bangalore", "ELC",2400, 13545d));
		factoryList.add(new FactoryEntity(26, "Ranbaxy", "Bangalore", "ELC",2400, 13545d));
		
		
		 FactoryDAO dao=new FactoryDAOImpl();
		 //dao.put(entity10);
		 //dao.put(entity11);
		 //dao.put(entity12);
		 
		 dao.addAll(factoryList);
	}

}
