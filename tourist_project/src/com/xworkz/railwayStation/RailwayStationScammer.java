package com.xworkz.railwayStation;


import com.xworkz.railwayStation.dao.RailwayDAOImpl;
import com.xworkz.railwayStation.dao.RailwayStationDAO;
import com.xworkz.railwayStation.entity.RailwayStationEntity;

public class RailwayStationScammer {

	public static void main(String[] args) {
		// RailwayStationEntity entity7=new RailwayStationEntity(7, "	Toranagallu Railway Station", "	Toranagallu", 10, true, 61,"TNGL");
		//RailwayStationEntity entity8=new RailwayStationEntity(8, "Almatti", "Almatt", 3, true, 19, "LMT");
	    RailwayStationEntity entity9=new RailwayStationEntity(9, "Bangalore City Junction", "Bangalore", 6, true, 42,"SBC");
		
		RailwayStationDAO dao=new RailwayDAOImpl();
		//dao.put(entity7);
		//dao.put(entity8);
		dao.put(entity9);
		
	}

}
