package com.xworkz.website.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.util.EMFUtil;
import com.xworkz.website.entity.WebsiteEntity;

public class WebsiteDAOImpl implements WebsiteDAO {

	@Override
	public void save(WebsiteEntity entity) {
		EntityManagerFactory entityManagerFactory = EMFUtil.getEntityManagerFactory();
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		manager.persist(entity);
		tx.commit();

		
	}

}
