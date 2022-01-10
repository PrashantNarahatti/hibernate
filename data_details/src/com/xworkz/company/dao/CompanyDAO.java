package com.xworkz.company.dao;

import com.xworkz.company.entity.CompanyEntity;

public interface CompanyDAO {
	public void create(CompanyEntity entity);

	default CompanyEntity getById(int i) {
		return null;
	}

	default void updateWebsiteById(String newWebsite, int id) {

	}

	default void deleteById(int id) {
	}

}
