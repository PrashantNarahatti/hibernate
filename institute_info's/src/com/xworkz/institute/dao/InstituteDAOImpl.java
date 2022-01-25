package com.xworkz.institute.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;

import com.xworkz.SingleTonUtil;
import com.xworkz.institute.entity.InstituteEntity;

public class InstituteDAOImpl implements InstituteDAO {
	@Override
	public void save(InstituteEntity entity) 
	{
		EntityManager manager=null;
		try {
	    manager=SingleTonUtil.getEntityManagerFactory().createEntityManager();
		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
		
	}
		catch(PersistenceException e) {
			e.printStackTrace();
		}
finally {
	if(manager!=null) {
		manager.close();
		
	}
}
	
}
}
