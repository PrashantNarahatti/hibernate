package com.xworkz.state.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.patient.entity.PatientEntity;
import com.xworkz.state.entity.StateEntity;

public class StateDAOImpl implements StateDAO {
	@Override
	public void create(StateEntity entity) {
		System.out.println("Create :".concat(entity.toString()));

		System.out.println("invoked create method");

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(StateEntity.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(entity);
		tx.commit();
		session.close();
		factory.close();

	}

	@Override
	public StateEntity getById(int id) {
		StateEntity entity = null;
		System.out.println("invoked getById");
		System.out.println("id passed as arg :" + id);
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(StateEntity.class);
		SessionFactory factory = configuration.buildSessionFactory();
		if (factory != null) {
			Session session = factory.openSession();
			entity = session.get(StateEntity.class, id);
			if (entity != null) {
				System.out.println("entity is found");
			} else {
				System.out.println("entity is not found");
			}
		}
		return entity;

	}

	@Override
	public void updateCapitalCityById(String newCapitalCity, int id) {
		System.out.println("invoked updateCapitalCityById");
		System.out.println("Args passed :" + newCapitalCity + "" + id);
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(StateEntity.class)
				.buildSessionFactory();
		if (factory != null) {
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			StateEntity entity = session.get(StateEntity.class, id);
			if (entity != null) {
				entity.setCapitalCity(newCapitalCity);
				session.update(entity);
				transaction.commit();
				System.out.println("entity CapitalCity update");
				session.close();
			} else {
				System.out.println("entity not found to update CapitalCity");
			}
			factory.close();
		}
	}
	@Override
	public void deleteById(int Id) {
		System.out.println("invoked the delete row");
		System.out.println(Id);
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(StateEntity.class).buildSessionFactory();
		if (factory != null) {
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			StateEntity entity = session.get(StateEntity.class, Id);
			if (entity != null) {
				entity.setId(Id);
				session.delete(entity);
				transaction.commit();
				System.out.println("delete entity id:" + Id);
			} else {
				System.out.println("not delete");
			}
			session.close();
		}
		factory.close();
	}

}

