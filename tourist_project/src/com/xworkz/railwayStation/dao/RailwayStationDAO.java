package com.xworkz.railwayStation.dao;

import java.util.List;

import com.xworkz.railwayStation.entity.RailwayStationEntity;

public interface RailwayStationDAO {
	public void put(RailwayStationEntity entity);
	public void addAll(List<RailwayStationEntity> entities);
}
