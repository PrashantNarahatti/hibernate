package com.xworkz.country;

import com.xworkz.country.dao.CountryDAO;
import com.xworkz.country.dao.CountryDAOImpl;
import com.xworkz.country.entity.CountryEntity;

public class CountryScammer {

	public static void main(String[] args) {
		//CountryEntity entity=new CountryEntity(1,"India","Asia","1.39 Billion");
		//CountryEntity entity1=new CountryEntity(2,"Australia","Oceania","2.57 crores");
		//CountryEntity entity2=new CountryEntity(3,"Germany","Europe","8.32 crores");
		//CountryEntity entity3=new CountryEntity(4,"Bangladesh","Asia","16.47 crores");
		//CountryEntity entity4=new CountryEntity(5,"Sri lanka","Asia","2.19 crores");
		
		CountryDAO dao=new CountryDAOImpl();
		//dao.create(entity);
		//dao.create(entity1);
		//dao.create(entity2);
		//dao.create(entity3);
		//dao.create(entity4);
		
		//CountryEntity entity=dao.getById(2);
		//System.out.println(entity);

		dao.updateContinentById("Europe :", 5);

	}

}
