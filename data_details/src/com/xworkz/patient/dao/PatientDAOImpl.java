package com.xworkz.patient.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.country.entity.CountryEntity;
import com.xworkz.patient.entity.PatientEntity;

public class PatientDAOImpl implements PatientDAO {
	@Override
	public void create(PatientEntity entity) {
		System.out.println("Create :".concat(entity.toString()));

		System.out.println("invoked create method");

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(PatientEntity.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(entity);
		tx.commit();
		session.close();
		factory.close();

	}

	@Override
	public PatientEntity getById(int id) {
		PatientEntity entity = null;
		System.out.println("invoked getById");
		System.out.println("id passed as arg :" + id);
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(PatientEntity.class);
		SessionFactory factory = configuration.buildSessionFactory();
		if (factory != null) {
			Session session = factory.openSession();
			entity = session.get(PatientEntity.class, id);
			if (entity != null) {
				System.out.println("entity is found");
			} else {
				System.out.println("entity is not found");
			}
		}
		return entity;

	}

	@Override
	public void updateBirthPlaceById(String newBirthPlace, int id) {
		System.out.println("invoked updateWebsiteById");
		System.out.println("Args passed :" + newBirthPlace + "" + id);
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(PatientEntity.class).buildSessionFactory();
		if (factory != null) {
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			PatientEntity entity = session.get(PatientEntity.class, id);
			if (entity != null) {
				entity.setBirthPlace(newBirthPlace);
				session.update(entity);
				transaction.commit();
				System.out.println("entity BirthPlace update");
				session.close();
			} else {
				System.out.println("entity not found to update BirthPlace");
			}
			factory.close();
		}
	}
	@Override
	public void deleteById(int Id) {
		System.out.println("invoked the delete row");
		System.out.println(Id);
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(PatientEntity.class).buildSessionFactory();
		if (factory != null) {
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			PatientEntity entity = session.get(PatientEntity.class, Id);
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

