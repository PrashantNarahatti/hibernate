package com.xworkz.vendor.service;


import com.xworkz.vendor.dao.VendorDAO;
import com.xworkz.vendor.entity.VendorEntity;

public class VendorServiceImpl implements VendorService {
	private VendorDAO dao;
	
	
	public VendorServiceImpl(VendorDAO dao) {
		super();
		this.dao = dao;
	}


	@Override
	public boolean validateAndSave(VendorEntity entity) {
	   boolean valid=false;
	   if(entity.getName()!=null && !(entity.getName().isEmpty()) && !(entity.getName().length()<5) && !(entity.getName().length()>30)) {
		   valid=true;
	   }
	   else {
		   System.out.println("invalid name");
		   valid=false;
		   return valid;
	   }
	   if(entity.getEmail().contains("@") && entity.getEmail().endsWith(".com")|| entity.getEmail().endsWith(".in")|| entity.getEmail().endsWith(".org")) {
		   valid=true;
	   }
	   else {
		   System.out.println("invalid email");
		   valid=false;
		   return valid;
	   }  
	   
	   if(entity.getAddress()!=null && !(entity.getAddress().isEmpty()) && !(entity.getAddress().length()<30) && !(entity.getAddress().length()>100)) {
		   valid=true;
	   }
	   else {
		   System.out.println("invalid address");
		   valid=false;
		   return valid;
	   }
	   if(entity.getCreatedBy()!=null && !(entity.getCreatedBy().isEmpty()) && !(entity.getCreatedBy().length()<5) && !(entity.getCreatedBy().length()>30)) {
		   valid=true;
	   }
	   else {
		   System.out.println("invalid createdBy");
		   valid=false;
		   return valid;
	   }
	   if(entity.getLoginName()!=null && !(entity.getLoginName().isEmpty()) && !(entity.getLoginName().length()<5) && !(entity.getLoginName().length()>30)) {
		   valid=true;
	   }
	   else {
		   System.out.println("invalid login name");
		   valid=false;
		   return valid;
	   }
	   if(entity.getGstNo()!=null && 
			   !(entity.getGstNo().isEmpty()) && 
			  entity.getGstNo().length()==15) 
	   {
		   valid=true;
	   }
	   else {
		   System.out.println("invalid gstNo");
		   valid=false;
		   return valid;
	   }
	   
	   if(valid)dao.save(entity);
		return valid;
	}

}
