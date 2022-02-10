package com.xworkz.car.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;

import com.xworkz.SingleTonUtil;
import com.xworkz.car.entity.CarEntity;

public class CarDAOImpl implements CarDAO {

	@Override
	public void fetchById(int id) {
		EntityManager manager = SingleTonUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {

			CriteriaBuilder builder = manager.getCriteriaBuilder();
			CriteriaQuery<CarEntity> criteriaQuery = builder.createQuery(CarEntity.class);
			Root<CarEntity> root = criteriaQuery.from(CarEntity.class);

			criteriaQuery.select(root);
			criteriaQuery.where(builder.equal(root. get("id"), id));
			TypedQuery<CarEntity> query = manager.createQuery(criteriaQuery);

			List<CarEntity> list = query.getResultList();
			list.forEach(System.out::println);
			for (CarEntity cars : list) {
				System.out.println(cars.getId());
				System.out.println(cars.getName());
				System.out.println(cars.getType());
				System.out.println(cars.getPrice());
				System.out.println(cars.getWeight());
			}

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();

			}
		}

	}

}