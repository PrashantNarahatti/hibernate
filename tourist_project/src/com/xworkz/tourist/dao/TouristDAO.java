package com.xworkz.tourist.dao;

import java.util.List;


import com.xworkz.tourist.entity.TouristEntity;

public interface TouristDAO {
	public void put(TouristEntity entity);
	public void addAll(List<TouristEntity> entities);
}
