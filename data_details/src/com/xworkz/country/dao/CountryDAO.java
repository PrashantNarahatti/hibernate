package com.xworkz.country.dao;

import com.xworkz.country.entity.CountryEntity;

public interface CountryDAO {
	public void create(CountryEntity entity);

	default CountryEntity getById(int i) {
		return null;
	}

	default void updateContinentById(String newContinent, int id) {

	}

}
