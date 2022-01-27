package com.xworkz;

import java.time.LocalDateTime;

import com.xworkz.institute.dao.InstituteDAO;
import com.xworkz.institute.dao.InstituteDAOImpl;
import com.xworkz.institute.dao.InstituteService;
import com.xworkz.institute.dao.InstituteServiceImpl;
import com.xworkz.institute.entity.InstituteEntity;

public class InstituteScammer {

	public static void main(String[] args) {
		InstituteEntity entity=new InstituteEntity("X-workz-ODC BTM","Mr.Omkar","Mr.Vinay","contact@x-workz.in",9886971480d,"BTM Layout",2019,"java full stack",5,37,5,2,4.5f,20000d,LocalDateTime.now(),"Pranu","Pacchu",LocalDateTime.now());
		InstituteEntity entity1=new InstituteEntity("X-workz-ODC","Mr.Omkar","Mr.Akshara","contact@x-workz.in",9886971483d,"Rajajinagar",2017,"java full stack",5,60,8,2,7.5f,20000d,LocalDateTime.now(),"Pranu","Pacchu",LocalDateTime.now());
		InstituteEntity entity2=new InstituteEntity("QSpiders Rajajinagar","Mr.Girish","Mr.Ajith Kumar","contact@qspiders.in",9972655088d,"Rajajinagar",2010,"java full stack",6,150,8,3,5.5f,34000d,LocalDateTime.now(),"Pranu","Pacchu",LocalDateTime.now());
		InstituteEntity entity3=new InstituteEntity("JSpiders Rajajinagar","Mr.Girish","Ms.Akshatha Acchu","contact@jspiders.in",9972655088d,"Rajajinagar",2012,"java full stack",6,120,8,2,4.5f,36000d,LocalDateTime.now(),"Pranu","Pacchu",LocalDateTime.now());
		InstituteEntity entity4=new InstituteEntity("QSpiders BTM","Mr.Girish","Ms.Akshatha Acchu","contact@qspiders.in",980500900d,"BTM",2020,"java full stack",6,200,8,5,4.5f,36000d,LocalDateTime.now(),"Pranu","Pacchu",LocalDateTime.now());
		InstituteEntity entity5=new InstituteEntity("JSpiders BTM","Mr.Girish","Ms.Akshatha Acchu","contact@jspiders.in",980500900d,"BTM",2020,"java full stack",6,220,8,5,4.5f,36000d,LocalDateTime.now(),"Pranu","Pacchu",LocalDateTime.now());
		InstituteEntity entity6=new InstituteEntity("Besant Technologies","Mr.Ravikumar Rajagopal","Mr.Bharath VM","contact@besanttechnology.in",7624941772d,"BTM Layout",2015,"java full stack",6,100,8,2,3.5f,30000d,LocalDateTime.now(),"Pranu","Pacchu",LocalDateTime.now());
		InstituteEntity entity7=new InstituteEntity("ABC Technology ","Mr.Mnajunath Aradhya","Mr.Gagana Hr","contact@ABC-technology.in",7676500600d,"Vijayanagar",2018,"java full stack",6,60,8,2,4.5f,32000d,LocalDateTime.now(),"Pranu","Pacchu",LocalDateTime.now());
		InstituteEntity entity8=new InstituteEntity("Codemithra ","Mr.Goutham.N","Ms.Avanthi Manohar","contact@codemithra.in",7815095095d,"Jayanagar",2015,"java full stack",6,45,8,2,2.5f,36000d,LocalDateTime.now(),"Pranu","Pacchu",LocalDateTime.now());
		InstituteEntity entity9=new InstituteEntity("Felight.io ","Mr.Nripen Chakrawarty","Mr.Shankar T","contact@felight.in",9611696116d,"Bandapura",2013,"javaScript ",6,120,8,2,3.5f,28000d,LocalDateTime.now(),"Pranu","Pacchu",LocalDateTime.now());
		InstituteEntity entity10=new InstituteEntity("SDLC ","Mr.Santosh Taye","Ms.Babita Singh ","contact@sdlc.in",08494840567d,"Marathahalli",2015,"javaScript",6,75,8,2,4.7f,25000d,LocalDateTime.now(),"Pranu","Pacchu",LocalDateTime.now());
		InstituteEntity entity11=new InstituteEntity("Tec-Mep Hvac ","Mr.Syed Rahil","Ms.Taiba ","contact@tec-mep.in",9341826525d,"J.P.Nagar",2013,"java full stack",6,175,8,1,4.9f,25000d,LocalDateTime.now(),"Pranu","Pacchu",LocalDateTime.now());
		InstituteEntity entity12=new InstituteEntity("5Square ","Mr.Ravi Kumar","Mr.Amrish Mishra ","contact@5square.in",9743220086d,"Rajajinagar",2015,"javaScript",6,200,10,1,4.5f,32000d,LocalDateTime.now(),"Pranu","Pacchu",LocalDateTime.now());
		InstituteEntity entity13=new InstituteEntity("Vector India ","Mr.Viswanatha Raju Dandu","Ms.Blessy Madhuri","contact@vector.in",8026546474d,"KV Layout",2010,"java full stack",6,80,7,2,7.5f,28000d,LocalDateTime.now(),"Pranu","Pacchu",LocalDateTime.now());
		InstituteEntity entity14=new InstituteEntity("Upshot Technology ","Mr.Narasimha Swamy","Mr.Rikin Valambia","contact@upshot.in",8095570001d,"BTM Layout",2015,"java full stack",6,120,8,2,4.5f,36000d,LocalDateTime.now(),"Pranu","Pacchu",LocalDateTime.now());
		
		InstituteDAO dao=new InstituteDAOImpl() ;
//		dao.save(entity1);
//		dao.save(entity2);
//		dao.save(entity3);
//		dao.save(entity4);
//		dao.save(entity5);
//		dao.save(entity6);
//		dao.save(entity7);
//		dao.save(entity8);
//		dao.save(entity9);
//		dao.save(entity10);
//		dao.save(entity11);
//		dao.save(entity12);
//		dao.save(entity13);
//		dao.save(entity14);
		
	InstituteService daoS=new InstituteServiceImpl(dao);
	daoS.validateAndSave(entity);
//	daoS.validateAndSave(entity1);
//	daoS.validateAndSave(entity2);
//	daoS.validateAndSave(entity3);
//	daoS.validateAndSave(entity4);
//	daoS.validateAndSave(entity5);
//	daoS.validateAndSave(entity6);
//	daoS.validateAndSave(entity7);
//	daoS.validateAndSave(entity8);
//	daoS.validateAndSave(entity9);
//	daoS.validateAndSave(entity10);
//	daoS.validateAndSave(entity11);
//	daoS.validateAndSave(entity12);
//	daoS.validateAndSave(entity13);
//	daoS.validateAndSave(entity14);
//	
		
	}

}
