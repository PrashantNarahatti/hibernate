package com.xworkz.institute.dao;

import javax.persistence.PersistenceException;


import com.xworkz.institute.entity.InstituteEntity;

public class InstituteServiceImpl implements InstituteService {

	private InstituteDAO dao;

	public InstituteServiceImpl(InstituteDAO dao) {
		super();
		this.dao = dao;
	}
	

	@Override
	public boolean validateAndSave(InstituteEntity entity) {
		boolean valid=false;

		
		
			if (entity.getName() != null && entity.getName().isEmpty() && entity.getName().length() > 3
					&& entity.getName().length() < 25) {
				   valid=true;

			} else {
				System.out.println("invalid name");
				   valid=false;
				   return valid;
				   
				
			}

			if (entity.getOwner() != null && entity.getOwner().isEmpty() && entity.getOwner().length() > 3
					&& entity.getOwner().length() < 25) {
				 valid=true;

			} else {
				System.out.println("invalid owner");
				valid = false;
				return valid;
			}
			if (entity.getHrName() != null && entity.getHrName().isEmpty() && entity.getHrName().length() > 3
					&& entity.getHrName().length() < 25) {
				 valid=true;
			} else {
				System.out.println("invalid HR name");
				valid=false;
				return valid;
				
			}

			if (entity.getEmail() != null && entity.getEmail().isEmpty() && entity.getEmail().length() > 3
					&& entity.getEmail().length() < 25) {
				 valid=true;
			} else {
				System.out.println("invalid email");
				valid=false;
				return valid;
			
			}

			if (!(entity.getPhoneNo() < 3) && !(entity.getPhoneNo() > 1000000000)){
				 valid=true;

			} else {
				System.out.println("invalid phoneNo");
				valid=false;
				return valid;
			}
			if (entity.getLocation() != null && entity.getLocation().isEmpty() && entity.getLocation().length() > 3
					&& entity.getLocation().length() < 25) {
				 valid=true;
			} else {
				System.out.println("invalid location");
				valid=false;
				return valid;
			}

			if (!(entity.getStarted() <3) && !(entity.getStarted() > 500000) ){
				 valid=true;

			} else {
				System.out.println("invalid started");
				valid=false;
				return valid;
			}

			if (entity.getCourseName() != null && entity.getCourseName().isEmpty()
					&& entity.getCourseName().length() > 3 && entity.getCourseName().length() < 25) {
				 valid=true;
			} else {
				System.out.println("invalid course name");
				valid=false;
				return valid;
			}

			if (!(entity.getCourseInMonths() < 3) && !(entity.getCourseInMonths() > 500000)) {
				 valid=true;
			} else {
				System.out.println("invalid courseInManths");
				valid=false;
				return valid;
			}

			if (!(entity.getNoOfTrainies() <3) && !(entity.getNoOfTrainies() > 50000)) {
				 valid=true;
			} else {
				System.out.println("invalid No of trainies");
				valid=false;
				return valid;
			}

			if (!(entity.getNoOfTrainers() <3) && !(entity.getNoOfTrainers() > 500000)) {
				 valid=true;
			} else {
				System.out.println("invalid No of Trainers");
				valid=false;
				return valid;
			}

			if (!(entity.getNoOfBranches() <3) && !(entity.getNoOfBranches() > 500000)) {
				 valid=true;
			} else {
				System.out.println("invalid No of branches");
				valid=false;
				return valid;
			}

			if (!(entity.getRating() <3) && !(entity.getRating() > 500000)) {
				 valid=true;
			} else {
				System.out.println("invalid rating");
				valid=false;
				return valid;
			}

			if (!(entity.getFees() <3) && !(entity.getFees() > 500000)) {
				 valid=true;
			} else {
				System.out.println("invalid fees");
				valid=false;
				return valid;
			}

			if (entity.getUpdatedAt() != null) {
				 valid=true;
			} else {
				System.out.println("invalid updated");
				valid=false;
				return valid;
			}

			if (entity.getUpdatedBy() != null && entity.getUpdatedBy().isEmpty() && entity.getUpdatedBy().length() > 3
					&& entity.getUpdatedBy().length() < 25) {
				 valid=true;
			} else {
				System.out.println("invalid updatedBy");
				valid=false;
				return valid;
			}

			if (entity.getCratedBy() != null && entity.getCratedBy().isEmpty() && entity.getCratedBy().length() > 3
					&& entity.getCratedBy().length() < 25) {
				 valid=true;
			} else {
				System.out.println("invalid createdBy");
				valid=false;
				return valid;
			}

			if (entity.getCratedAt() != null) {
				 valid=true;
			} else {
				System.out.println("invalid createdAt");
				valid=false;
				return valid;
				
			}
			
			if(valid)dao.save(entity);
		
			return valid;

	
		}
}
	
