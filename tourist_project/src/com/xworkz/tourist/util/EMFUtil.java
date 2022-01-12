package com.xworkz.tourist.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMFUtil {
	private static EntityManagerFactory entityManagerFactory;

	public static EntityManagerFactory getEntityManagerFactory() {

		return entityManagerFactory;
	}

	static {
		System.out.println("invoked the presistence file ");
		entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz.tourist");
		System.out.println("saving data");

	}
}
