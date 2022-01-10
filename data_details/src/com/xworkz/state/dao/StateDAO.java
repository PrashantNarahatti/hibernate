package com.xworkz.state.dao;

import com.xworkz.state.entity.StateEntity;

public interface StateDAO {
	public void create(StateEntity entity);

	default StateEntity getById(int i) {
		return null;
	}

	default void updateCapitalCityById(String newCapitalCity, int id) {

	}

	default void deleteById(int id) {

	}

}
