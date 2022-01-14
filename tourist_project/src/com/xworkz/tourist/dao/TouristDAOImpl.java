package com.xworkz.tourist.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;


import com.xworkz.tourist.entity.TouristEntity;
import com.xworkz.util.EMFUtil;

public class TouristDAOImpl implements TouristDAO {

	@Override
	public void put(TouristEntity entity) {
		EntityManagerFactory entityManagerFactory = EMFUtil.getEntityManagerFactory();
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		manager.persist(entity);
		tx.commit();

	}
	@Override
	public void addAll(List<TouristEntity> entities) {
		EntityManager manager = EMFUtil.getEntityManagerFactory().createEntityManager();
		for (TouristEntity touristEntity : entities) {
			manager.persist(touristEntity);

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