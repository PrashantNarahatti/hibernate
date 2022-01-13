package com.xworkz.silkManufacturer.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.silkManufacturer.entity.SilkManufacturerEntity;
import com.xworkz.util.EMFUtil;

public class SilkManufacturerDAOImpl implements SilkManufacturerDAO {

	@Override
	public void put(SilkManufacturerEntity entity) {
		EntityManagerFactory entityManagerFactory = EMFUtil.getEntityManagerFactory();
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		manager.persist(entity);
		tx.commit();

	}

}
