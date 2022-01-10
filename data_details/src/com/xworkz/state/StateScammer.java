package com.xworkz.state;


import com.xworkz.state.dao.StateDAO;
import com.xworkz.state.dao.StateDAOImpl;
import com.xworkz.state.entity.StateEntity;

public class StateScammer {

	public static void main(String[] args) {
		 //StateEntity entity=new StateEntity(1,"Karnataka",31,"Bengaluru");
		 //StateEntity entity1=new StateEntity(2,"Assam",33,"Dispur");
		 //StateEntity entity2=new StateEntity(3,"Goa",2,"Panaji");
		 //StateEntity entity3=new StateEntity(4,"Gujarat",33,"Gandhinagar");
		 //StateEntity entity4=new StateEntity(5,"Haryana",22,"Chandigarh");

		StateDAO dao = new StateDAOImpl();
		 //dao.create(entity);
		 //dao.create(entity1);
		 //dao.create(entity2);
		 //dao.create(entity3);
		 //dao.create(entity4);

		 //StateEntity entity=dao.getById(2);
		 //System.out.println(entity);

		//dao.updateCapitalCityById("Chandigarh :", 2);
		dao.deleteById(1);
	}

}
