package com.xworkz.company;

import com.xworkz.company.dao.CompanyDAO;
import com.xworkz.company.dao.CompanyDAOImpl;
import com.xworkz.company.entity.CompanyEntity;

public class CompanyScammer {

	public static void main(String[] args) {
		//CompanyEntity entity=new CompanyEntity(1,"Accenture","service based","IT","www.accenture.itjob");
		//CompanyEntity entity1=new CompanyEntity(2,"Xworkz ODC","Training Ist","IT","www.xworkzodc.btm");
		//CompanyEntity entity2=new CompanyEntity(3,"Xworkz ODC","Training Ist","IT","www.xworkzodc.btm");
		
		//entity.setId(4);
		//entity.setName("TCS");
		//entity.setType("Service based");
		//entity.setDoamin("IT");
		//entity.setWebsite("www.tcshub.itjob");
		
		CompanyDAO dao=new CompanyDAOImpl();
		//dao.create(entity);
		//dao.create(entity1);
		//dao.create(entity2);
		
		//CompanyEntity entity=dao.getById(2);
		//System.out.println(entity);

		//dao.updateWebsiteById("www.tcshub.itjob :", 3);
		dao.deleteById(3);
	}

}
