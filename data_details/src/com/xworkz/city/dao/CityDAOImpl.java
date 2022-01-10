package com.xworkz.city.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.city.entity.CityEntity;
import com.xworkz.company.entity.CompanyEntity;

public class CityDAOImpl implements CityDAO {
	@Override
	public void create(CityEntity entity) {
		System.out.println("Create :".concat(entity.toString()));

		System.out.println("invoked create method");

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(CityEntity.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(entity);
		tx.commit();
		session.close();
		factory.close();

	}

	@Override
	public CityEntity getById(int id) {
		CityEntity entity = null;
		System.out.println("invoked getById");
		System.out.println("id passed as arg :" + id);
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(CityEntity.class);
		SessionFactory factory = configuration.buildSessionFactory();
		if (factory != null) {
			Session session = factory.openSession();
			entity = session.get(CityEntity.class, id);
			if (entity != null) {
				System.out.println("entity is found");
			} else {
				System.out.println("entity is not found");
			}
		}
		return entity;

	}

	@Override
	public void updateFamousForById(String newFamousFor, int id) {
		System.out.println("invoked updateFamousForById");
		System.out.println("Args passed :" + newFamousFor + "" + id);
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(CityEntity.class)
				.buildSessionFactory();
		if (factory != null) {
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			CityEntity entity = session.get(CityEntity.class, id);
			if (entity != null) {
				entity.setFamousFor(newFamousFor);
				session.update(entity);
				transaction.commit();
				System.out.println("entity FamousFor update");
				session.close();
			} else {
				System.out.println("entity not found to update FamousFor");
			}
			factory.close();
		}
	}

	@Override
	public void deleteById(int Id) {
		System.out.println("invoked the delete row");
		System.out.println(Id);
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(CityEntity.class).buildSessionFactory();
		if (factory != null) {
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			CityEntity entity = session.get(CityEntity.class, Id);
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
