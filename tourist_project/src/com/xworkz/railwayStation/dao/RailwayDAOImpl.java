package com.xworkz.railwayStation.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.railwayStation.entity.RailwayStationEntity;
import com.xworkz.util.EMFUtil;

public class RailwayDAOImpl implements RailwayStationDAO{
	@Override
	public void put(RailwayStationEntity entity) {
		EntityManagerFactory entityManagerFactory = EMFUtil.getEntityManagerFactory();
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		manager.persist(entity);
		tx.commit();

	}


}
