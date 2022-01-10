package com.xworkz.patient.dao;

import com.xworkz.patient.entity.PatientEntity;

public interface PatientDAO {
	public void create(PatientEntity entity);

	default PatientEntity getById(int i) {
		return null;
	}

	default void updateBirthPlaceById(String newBirthPlace, int id) {

	}

}
