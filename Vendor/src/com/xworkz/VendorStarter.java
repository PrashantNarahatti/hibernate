package com.xworkz;

import java.time.LocalDateTime;

import com.xworkz.vendor.dao.VendorDAO;
import com.xworkz.vendor.dao.VendorDAOImpl;
import com.xworkz.vendor.entity.VendorEntity;
import com.xworkz.vendor.service.VendorService;
import com.xworkz.vendor.service.VendorServiceImpl;

public class VendorStarter {

	public static void main(String[] args) {
		VendorEntity entity1=new VendorEntity("Prashant","prashant@gmail.com","Prashant Narahatti","Pacchu@037","sector number 3  Navanager Bagalkot ","01BNBPC6055Q123","Prashanth N", LocalDateTime.now());
		VendorEntity entity2=new VendorEntity("Vinayak","vinayak@gmail.com","Vinayak Narahatti","Pacchu@037","sector number 3  Navanager Bagalkot ","02BNBPC6055Q124","Vinayak N", LocalDateTime.now());
		VendorEntity entity3=new VendorEntity("Rajeshwari","rajeshwari@gmail.com","Rejeshwari Hiremath","Raju@037","sector number 3  Navanager Bagalkot ","03BNBPC6055Q124","Prashanth N", LocalDateTime.now());
		VendorEntity entity4=new VendorEntity("Shivasai","shivasai@gmail.com","Nagappa Sorale","Shivu@037","sector number 3  Navanager Bagalkot ","04BNBPC6055Q125","Prashanth N", LocalDateTime.now());
		VendorEntity entity6=new VendorEntity("Shivasai","shivasai@gmail.com","Sorale N A","shivusorale@123","sector number 3  Navanager Bagalkot ","04BNBPC6055Q125","Prashanth N", LocalDateTime.now());
		VendorEntity entity7=new VendorEntity("Parasuram","parasuram@gmail.com","Parasuram N","parasuram@33","sector number 3  Navanager Bagalkot ","04BNBPC6055Q125","Prashanth N", LocalDateTime.now());
		VendorEntity entity8=new VendorEntity("Ramshankar","ramshankar@gmail.in","Ramshankar ","ramshankar@0123","sector number 3  Navanager Bagalkot ","04BNBPC6055Q125","Prashanth N", LocalDateTime.now());
		
		
		VendorDAO dao=new VendorDAOImpl();
		
		VendorService service=new VendorServiceImpl(dao);
//		service.validateAndSave(entity1);
//		service.validateAndSave(entity2);
//		service.validateAndSave(entity3);
//		service.validateAndSave(entity4);
		//service.validateAndSave(entity6);
		//service.validateAndSave(entity7);
		//service.validateAndSave(entity8);
		
//		boolean valid=service.validateAndLogin("Parasuram N", "parasuram@333");
//		System.out.println(valid);
//		
		service.validateAndChangePassword("ramshankar@gmail.in", "ramshankar@");
		
	
	}

}
