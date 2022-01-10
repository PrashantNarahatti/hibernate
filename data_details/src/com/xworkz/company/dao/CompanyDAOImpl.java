package com.xworkz.company.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.company.entity.CompanyEntity;
import com.xworkz.country.entity.CountryEntity;

public class CompanyDAOImpl implements CompanyDAO {

	@Override
	public void create(CompanyEntity entity) {
		System.out.println("Create :".concat(entity.toString()));

		System.out.println("invoked create method");

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(CompanyEntity.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(entity);
		tx.commit();
		session.close();
		factory.close();

	}

	@Override
	public CompanyEntity getById(int id) {
		CompanyEntity entity = null;
		System.out.println("invoked getById");
		System.out.println("id passed as arg :" + id);
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(CompanyEntity.class);
		SessionFactory factory = configuration.buildSessionFactory();
		if (factory != null) {
			Session session = factory.openSession();
			entity = session.get(CompanyEntity.class, id);
			if (entity != null) {
				System.out.println("entity is found");
			} else {
				System.out.println("entity is not found");
			}
		}
		return entity;

	}

	@Override
	public void updateWebsiteById(String newWebsite, int id) {
		System.out.println("invoked updateWebsiteById");
		System.out.println("Args passed :" + newWebsite + "" + id);
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(CompanyEntity.class).buildSessionFactory();
		if (factory != null) {
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			CompanyEntity entity = session.get(CompanyEntity.class, id);
			if (entity != null) {
				entity.setWebsite(newWebsite);
				session.update(entity);
				transaction.commit();
				System.out.println("entity website update");
				session.close();
			} else {
				System.out.println("entity not found to update wibsite");
			}
			factory.close();
		}
	}

	@Override
	public void deleteById(int Id) {
		System.out.println("invoked the delete row");
		System.out.println(Id);
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(CompanyEntity.class).buildSessionFactory();
		if (factory != null) {
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			CompanyEntity entity = session.get(CompanyEntity.class, Id);
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
