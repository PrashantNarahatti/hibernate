package com.xworkz.institute.dao;

import javax.persistence.EntityManager;

import com.xworkz.SingleTonUtil;
import com.xworkz.institute.entity.InstituteEntity;


public class InstituteDAOImpl implements InstituteDAO {
	@Override
	public void save(InstituteEntity entity) 
	{
		EntityManager manager=SingleTonUtil.getEntityManagerFactory().createEntityManager();
		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
		
	}

}
