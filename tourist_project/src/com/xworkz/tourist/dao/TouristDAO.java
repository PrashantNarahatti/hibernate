package com.xworkz.tourist.dao;

import com.xworkz.tourist.entity.BiscuitEntity;
import com.xworkz.tourist.entity.FactoryEntity;
import com.xworkz.tourist.entity.MedicineEntity;
import com.xworkz.tourist.entity.RailwayStationEntity;
import com.xworkz.tourist.entity.SilkManufacturerEntity;
import com.xworkz.tourist.entity.TouristEntity;

public interface TouristDAO {
	public void put(TouristEntity entity);
	public void put1(BiscuitEntity entity);
	public void put2(RailwayStationEntity entity);
	public void put3(FactoryEntity entity);
	public void put4(MedicineEntity entity);
	public void put5(SilkManufacturerEntity entity);


}


