package com.xworkz.register.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;

import com.xworkz.register.entity.RegisterEntity;
import com.xworkz.SingleTonUtil;

public class RegisterDAOImpl implements RegisterDAO {

	@Override
	public void save(RegisterEntity entity) {
		EntityManager manager = null;
		try {
			manager = SingleTonUtil.getEntityManagerFactory().createEntityManager();
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