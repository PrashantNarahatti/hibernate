package com.xworkz.country.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.country.entity.CountryEntity;

public class CountryDAOImpl implements CountryDAO {
	@Override
	public void create(CountryEntity entity) {
		System.out.println("Create :".concat(entity.toString()));

		System.out.println("invoked create method");

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(CountryEntity.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(entity);
		tx.commit();
		session.close();
		factory.close();

	}

	@Override
	public CountryEntity getById(int id) {
		CountryEntity entity = null;
		System.out.println("invoked getById");
		System.out.println("id passed as arg :" + id);
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(CountryEntity.class);
		SessionFactory factory = configuration.buildSessionFactory();
		if (factory != null) {
			Session session = factory.openSession();
			entity = session.get(CountryEntity.class, id);
			if (entity != null) {
				System.out.println("entity is found");
			} else {
				System.out.println("entity is not found");
			}
		}
		return entity;

	}

	@Override
	public void updateContinentById(String newContinent, int id) {
		System.out.println("invoked updateContinentById");
		System.out.println("Args passed :" + newContinent + "" + id);
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(CountryEntity.class).buildSessionFactory();
		if (factory != null) {
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			CountryEntity entity = session.get(CountryEntity.class, id);
			if (entity != null) {
				entity.setContinent(newContinent);
				session.update(entity);
				transaction.commit();
				System.out.println("entity Continent update");
				session.close();
			} else {
				System.out.println("entity not found to update Continent");
			}
			factory.close();
		}
	}

}
