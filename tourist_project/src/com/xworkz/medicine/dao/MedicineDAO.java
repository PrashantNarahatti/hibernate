package com.xworkz.medicine.dao;

import java.util.List;

import com.xworkz.medicine.entity.MedicineEntity;

public interface MedicineDAO {
	public void put(MedicineEntity entity);

	public void addAll(List<MedicineEntity> entities);
}
