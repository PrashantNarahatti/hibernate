package com.xworkz.register;

import com.xworkz.register.dao.RegisterDAO;
import com.xworkz.register.dao.RegisterDAOImpl;
import com.xworkz.register.entity.RegisterEntity;
import com.xworkz.register.service.RegisterService;
import com.xworkz.register.service.RegisterServiceImpl;

public class RegisterStarter {

	public static void main(String[] args) {
		RegisterEntity entity1 = new RegisterEntity("Prasanth","prashant@gmail.com","Pacchu@037","Bagalkot","India",6362762260l,true);
		RegisterEntity entity2 = new RegisterEntity("Pacchu","Pacchu@gmail.com","Pacchu@037","Navanagr","India",9164768473l,true);
		RegisterEntity entity3 = new RegisterEntity("Vinayak","vinayak@gmail.com","Vinayak@037","Badami","India",9483631018l,true);
		RegisterEntity entity4 = new RegisterEntity("Raju","raju@gmail.com","Raju@037","Bagalkot","India",6362762260l,true);
		RegisterEntity entity5 = new RegisterEntity("Pranu","pranu@gmail.com","Pranu@037","Gangavathi","India",6362762260l,true);
		
		RegisterDAO dao=new RegisterDAOImpl();
		
		
		RegisterService service=new RegisterServiceImpl(dao);
		service.validateAndSave(entity1);
//		service.validateAndSave(entity2);
//		service.validateAndSave(entity3);
//		service.validateAndSave(entity4);
//		service.validateAndSave(entity5);
//		
	}

}
