package com.xworkz.city.dao;

import com.xworkz.city.entity.CityEntity;

public interface CityDAO {
	public void create(CityEntity entity);

	default CityEntity getById(int i) {
		return null;
	}

	default void updateFamousForById(String newFamousFor, int id) {

	}

	default void deleteById(int id) {
	}

}
