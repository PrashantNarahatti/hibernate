package com.xworkz.solarSystem.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.solarSystem.entity.SolarSystemEntity;
import com.xworkz.util.EMFUtil;

public class SolarSystemDAOImpl implements SolarSystemDAO {
	@Override
	public void put(SolarSystemEntity entity) {
		EntityManagerFactory entityManagerFactory = EMFUtil.getEntityManagerFactory();
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		manager.persist(entity);
		tx.commit();

	}

}
