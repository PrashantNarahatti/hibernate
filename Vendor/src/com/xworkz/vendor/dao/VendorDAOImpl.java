package com.xworkz.vendor.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.xworkz.SingleTonUtil;

import com.xworkz.vendor.entity.VendorEntity;


public class VendorDAOImpl implements VendorDAO {

	@Override
	public void save(VendorEntity entity) {
		EntityManager manager = null;
		try {
			manager =SingleTonUtil.getEntityManagerFactory().createEntityManager();
			manager.getTransaction().begin();
			manager.persist(entity);
			manager.getTransaction().commit();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();

			}
		}
	}

	@Override
	public boolean findLogin(String loginName, String password) {
		EntityManager manager=null;
		try
		{
			manager=SingleTonUtil.getEntityManagerFactory().createEntityManager();
			Query query=manager.createNamedQuery("getLoginNameAndPassword");
			query.setParameter("bd",loginName);
			query.setParameter("psd", password);
		    Object obj= query.getSingleResult();
		    VendorEntity entity=(VendorEntity)obj;
		    System.out.println(entity);
		    if(obj!=null) {
		    	
		    return true;
		}
		}
		catch (PersistenceException e) {
			e.printStackTrace();
			return false;
		}
		finally {
			if(manager!=null)
			{
				manager.close();
			}
		}
		return false;
		
	}

	@Override
	public boolean findByEmail(String email) {
		EntityManager manager=null;
		try
		{
			manager=SingleTonUtil.getEntityManagerFactory().createEntityManager();
			Query query=manager.createNamedQuery("getEmail");
			query.setParameter("em",email);
			Object obj= query.getSingleResult();
		    VendorEntity entity=(VendorEntity)obj;
		    System.out.println(entity);
		    if(obj!=null) {
		    	
		    return true;
		}
		}
		catch (PersistenceException e) {
			e.printStackTrace();
			return false;
			
		}
		finally {
			if(manager!=null)
			{
				manager.close();
			}
		}
		return false;
	}

	@Override
	public void updatePasswordByEmail(String email, String password) {
		EntityManager manager=null;
		try
		{
			manager=SingleTonUtil.getEntityManagerFactory().createEntityManager();
			Query query=manager.createNamedQuery("updatePasswordByEmail");
			manager.getTransaction().begin();
			query.setParameter("psd",password);
			query.setParameter("em", email);
			int obj=query.executeUpdate();
			//query.getSingleResult();
			manager.getTransaction().commit();
			
		}
		catch (PersistenceException e) {
			e.printStackTrace();
		}
		finally {
			if(manager!=null)
			{
				manager.close();
			}
		}
		
	}
}

