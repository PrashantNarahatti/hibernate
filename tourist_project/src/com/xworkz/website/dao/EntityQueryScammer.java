package com.xworkz.website.dao;

import com.xworkz.website.entity.WebsiteEntity;

public class EntityQueryScammer {

	public static void main(String[] args) {
		WebsiteDAO dao=new WebsiteDAOImpl();
		
		WebsiteEntity entity=dao.getByNameGoogle();
		System.out.println(entity);
		WebsiteEntity entity1=dao.getByLikeUrlX();
		System.out.println(entity1);
		WebsiteEntity entity2=dao.getByMinSince();
		System.out.println(entity2);
		WebsiteEntity entity3=dao.getByMaxSince();
		System.out.println(entity3);
		WebsiteEntity entity4=dao.getBySecondMinSince();
		System.out.println(entity4);
		WebsiteEntity entity5=dao.getBySecondMaxSince();
		System.out.println(entity5);
		
		
	}

}
