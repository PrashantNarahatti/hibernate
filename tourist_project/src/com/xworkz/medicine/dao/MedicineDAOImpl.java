package com.xworkz.medicine.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.medicine.entity.MedicineEntity;
import com.xworkz.util.EMFUtil;

public class MedicineDAOImpl implements MedicineDAO {
	@Override
	public void put(MedicineEntity entity) {
		EntityManagerFactory entityManagerFactory = EMFUtil.getEntityManagerFactory();
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		manager.persist(entity);
		tx.commit();

	}

}
