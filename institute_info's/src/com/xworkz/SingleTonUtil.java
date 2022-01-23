package com.xworkz;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SingleTonUtil {
	private static EntityManagerFactory entityManagerFactory;

	public static EntityManagerFactory getEntityManagerFactory() {

		return entityManagerFactory;
	}
	static {
		System.out.println("invoked the presistence file ");
		entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
		System.out.println("saving data");
	}
}
