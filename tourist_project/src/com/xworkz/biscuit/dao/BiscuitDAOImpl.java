package com.xworkz.biscuit.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.biscuit.entity.BiscuitEntity;
import com.xworkz.util.EMFUtil;



public class BiscuitDAOImpl implements BiscuitDAO {
	@Override
	public void put(BiscuitEntity entity) 
	{
	  EntityManagerFactory entityManagerFactory=EMFUtil.getEntityManagerFactory();
	  EntityManager manager=entityManagerFactory.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		tx.begin();
		manager.persist(entity);
		tx.commit();
		
	}

}
