package com.xworkz.airport.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.airport.entity.AirportEntity;
import com.xworkz.util.EMFUtil;

public class AirportDAOImpl implements AirportDAO {
	@Override
	public void put(AirportEntity entity) {
		EntityManagerFactory entityManagerFactory = EMFUtil.getEntityManagerFactory();
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		manager.persist(entity);
		tx.commit();

	}
	@Override
	public void addAll(List<AirportEntity> entities) {
		EntityManager manager = EMFUtil.getEntityManagerFactory().createEntityManager();
		for (AirportEntity airportEntity : entities) {
			manager.persist(airportEntity);

			EntityTransaction transaction = manager.getTransaction();

			transaction.begin();
			int flushcount = 0;

			try {
				for (int i = 0; i <55; i++) {
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
