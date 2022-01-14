package com.xworkz.railwayStation.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

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
	@Override
	public void addAll(List<RailwayStationEntity> entities) {
		EntityManager manager = EMFUtil.getEntityManagerFactory().createEntityManager();
		for (RailwayStationEntity railwayStationEntity : entities) {
			manager.persist(railwayStationEntity);

			EntityTransaction transaction = manager.getTransaction();

			transaction.begin();
			int flushcount = 0;

			try {
				for (int i = 0; i < 73; i++) {
					if (flushcount ==10) {
						manager.flush();
						flushcount = 0;
						manager.clear();
					}
					manager.flush();
					flushcount++;
				}
			} catch (PersistenceException e) {
				e.printStackTrace();
				transaction.rollback();
			}

			transaction.commit();

		}
	}



}
