package com.xworkz.factory.dao;

import java.util.List;

import com.xworkz.factory.entity.FactoryEntity;

public interface FactoryDAO {
	public void put(FactoryEntity entity);

	public void addAll(List<FactoryEntity> entities);
}
