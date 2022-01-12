package com.xworkz.tourist.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.tourist.entity.BiscuitEntity;
import com.xworkz.tourist.entity.FactoryEntity;
import com.xworkz.tourist.entity.MedicineEntity;
import com.xworkz.tourist.entity.RailwayStationEntity;
import com.xworkz.tourist.entity.SilkManufacturerEntity;
import com.xworkz.tourist.entity.TouristEntity;
import com.xworkz.tourist.util.EMFUtil;

public class TouristDAOImpl implements TouristDAO {

	@Override
	public void put(TouristEntity entity) 
	{
	  EntityManagerFactory entityManagerFactory=EMFUtil.getEntityManagerFactory();
	  EntityManager manager=entityManagerFactory.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		tx.begin();
		manager.persist(entity);
		tx.commit();
		
	}
	@Override
	public void put1(BiscuitEntity entity) 
	{
	  EntityManagerFactory entityManagerFactory=EMFUtil.getEntityManagerFactory();
	  EntityManager manager=entityManagerFactory.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		tx.begin();
		manager.persist(entity);
		tx.commit();
		
	}
	@Override
	public void put2(RailwayStationEntity entity) 
	{
	  EntityManagerFactory entityManagerFactory=EMFUtil.getEntityManagerFactory();
	  EntityManager manager=entityManagerFactory.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		tx.begin();
		manager.persist(entity);
		tx.commit();
		
	}
	@Override
	public void put3(FactoryEntity entity) 
	{
	  EntityManagerFactory entityManagerFactory=EMFUtil.getEntityManagerFactory();
	  EntityManager manager=entityManagerFactory.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		tx.begin();
		manager.persist(entity);
		tx.commit();
		
	}
	@Override
	public void put4(MedicineEntity entity) 
	{
	  EntityManagerFactory entityManagerFactory=EMFUtil.getEntityManagerFactory();
	  EntityManager manager=entityManagerFactory.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		tx.begin();
		manager.persist(entity);
		tx.commit();
		
	}
	@Override
	public void put5(SilkManufacturerEntity entity) 
	{
	  EntityManagerFactory entityManagerFactory=EMFUtil.getEntityManagerFactory();
	  EntityManager manager=entityManagerFactory.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		tx.begin();
		manager.persist(entity);
		tx.commit();
		
	}
}