package com.xworkz.city;

import com.xworkz.city.dao.CityDAO;
import com.xworkz.city.dao.CityDAOImpl;
import com.xworkz.city.entity.CityEntity;


public class CityScammer {

	public static void main(String[] args) {
		//CityEntity entity=new CityEntity(1,"Bengaluru","12.7 million","Sillicon valley","Red zone");
		//CityEntity entity1=new CityEntity(2,"Bagalkot","1.11 lakh","Tourist Places","yellow zone");
		//CityEntity entity2=new CityEntity(3,"Gangavathi","5.7 lakh","Rice","Green zone");
		//CityEntity entity3=new CityEntity(4,"Koppal","4.6 lakh","Gavimath","Red zone");
		//CityEntity entity4=new CityEntity(5,"Gadag","4.5 lakh","Basaveshwara","yellow");
		
		CityDAO dao = new CityDAOImpl();
		 //dao.create(entity);
		 //dao.create(entity1);
		 //dao.create(entity2);
		 //dao.create(entity3);
		 //dao.create(entity4);

		 //CityEntity entity=dao.getById(2);
		 //System.out.println(entity);

		dao.updateFamousForById("Rice :", 5);
	}

}
