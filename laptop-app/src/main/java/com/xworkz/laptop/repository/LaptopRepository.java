package com.xworkz.laptop.repository;

import java.util.List;

import com.xworkz.laptop.entity.LaptopEntity;

public interface LaptopRepository {
	public boolean saveLaptopEntity(Object obj);

	default LaptopEntity findByName(String name) {
		return null;

	}

	default LaptopEntity upadteByName(LaptopEntity entity) {
		return null;
	}

	List<LaptopEntity> getAll();

	boolean deleteByName(String name);

}
