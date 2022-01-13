package com.xworkz.sugarCane.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.sugarCane.entity.SugarCaneEntity;
import com.xworkz.util.EMFUtil;

public class SugarCaneDAOImpl  implements SugarCaneDAO{

	@Override
	public void put(SugarCaneEntity entity) {
		EntityManagerFactory entityManagerFactory = EMFUtil.getEntityManagerFactory();
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		manager.persist(entity);
		tx.commit();

	}


}
