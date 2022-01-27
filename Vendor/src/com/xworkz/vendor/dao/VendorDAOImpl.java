package com.xworkz.vendor.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;

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
}


