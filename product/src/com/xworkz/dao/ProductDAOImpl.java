package com.xworkz.dao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.xworkz.SingleTonUtil;
import com.xworkz.entity.ProductEntity;

public class ProductDAOImpl implements ProductDAO
{

	@Override
	public void save(ProductEntity entity) 
	{
		EntityManager manager=SingleTonUtil.getEntityManagerFactory().createEntityManager();
		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
		
	}

	@Override
	public void saveAll(List<ProductEntity> entities) 
	{
		
		EntityManager manager =SingleTonUtil.getEntityManagerFactory().createEntityManager();
		for (ProductEntity productEntity : entities) 
		{
			manager.persist(productEntity);

			EntityTransaction transaction = manager.getTransaction();

			transaction.begin();
			int flushcount = 0;

			try {
				for (int i = 0; i < 10; i++) {
					if (flushcount ==10) {
						manager.flush();
						flushcount = 0;
						manager.clear();
					}
					manager.flush();
					flushcount++;
					transaction.commit();
				}
			} catch (PersistenceException e) {
				e.printStackTrace();
				transaction.rollback();
			}

		}
	}

	@Override
	public List<ProductEntity> getAll(List<ProductEntity> entities) 
	{
		EntityManager manager=null;
		try
		{
			manager=SingleTonUtil.getEntityManagerFactory().createEntityManager();
			Query query=manager.createNamedQuery("getAll");
		    return (List<ProductEntity>)query.getResultList();
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
		return null;
		
	}

	@Override
	public ProductEntity getMaxPrice() 
	{
		EntityManager manager=null;
		try
		{
			manager=SingleTonUtil.getEntityManagerFactory().createEntityManager();
			Query query=manager.createNamedQuery("getMaxPrice");
			return (ProductEntity)query.getSingleResult();
			
			
		}
		catch (PersistenceException e) {
			e.printStackTrace();
		}
		finally
		{
			if(manager!=null)
			{
				manager.close();
			}
		}
		
		return null;
	}

	@Override
	public ProductEntity getTotalPrice() 
	{
		EntityManager manager=null;
		try
		{
			manager=SingleTonUtil.getEntityManagerFactory().createEntityManager();
			Query query=manager.createNamedQuery("getMaxPrice");
			return (ProductEntity)query.getSingleResult();
			
			
		}
		catch (PersistenceException e) {
			e.printStackTrace();
		}
		finally
		{
			if(manager!=null)
			{
				manager.close();
			}
		}
		return null;
	}

	@Override
	public String getBrandByName(String name) 
	{
		EntityManager manager=null;
		try
		{
			manager=SingleTonUtil.getEntityManagerFactory().createEntityManager();
			Query query=manager.createNamedQuery("getBrandByName");
			query.setParameter("nm", name);
		    return(String) query.getSingleResult();
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
		return null;
		
	}

	@Override
	public ProductEntity getByBrand(String brand) 
	{
		EntityManager manager=null;
		try
		{
			manager=SingleTonUtil.getEntityManagerFactory().createEntityManager();
			Query query=manager.createNamedQuery("getByBrand");
			query.setParameter("bd", brand);
			return (ProductEntity)query.getSingleResult();
			
			
		}
		catch (PersistenceException e) {
			e.printStackTrace();
		}
		finally
		{
			if(manager!=null)
			{
				manager.close();
			}
		}
		return null;
	}
	
}