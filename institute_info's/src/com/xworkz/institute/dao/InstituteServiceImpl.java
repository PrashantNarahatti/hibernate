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

			} else {
				System.out.println("invalid name");
				
				
			}

			if (entity.getOwner() != null && entity.getOwner().isEmpty() && entity.getOwner().length() > 3
					&& entity.getOwner().length() < 25) {

			} else {
				System.out.println("invalid owner");
				return false;
			}
			if (entity.getHrName() != null && entity.getHrName().isEmpty() && entity.getHrName().length() > 3
					&& entity.getHrName().length() < 25) {
			} else {
				System.out.println("invalid HR name");
				
			}

			if (entity.getEmail() != null && entity.getEmail().isEmpty() && entity.getEmail().length() > 3
					&& entity.getEmail().length() < 25) {
			} else {
				System.out.println("invalid email");
			
			}

			if (!(entity.getPhoneNo() < 3) && !(entity.getPhoneNo() > 1000000000)){

			} else {
				System.out.println("invalid phoneNo");
			
			}
			if (entity.getLocation() != null && entity.getLocation().isEmpty() && entity.getLocation().length() > 3
					&& entity.getLocation().length() < 25) {
			} else {
				System.out.println("invalid location");
				
			}

			if (!(entity.getStarted() <3) && !(entity.getStarted() > 500000) ){

			} else {
				System.out.println("invalid started");
				
			}

			if (entity.getCourseName() != null && entity.getCourseName().isEmpty()
					&& entity.getCourseName().length() > 3 && entity.getCourseName().length() < 25) {
			} else {
				System.out.println("invalid course name");
			
			}

			if (!(entity.getCourseInMonths() < 3) && !(entity.getCourseInMonths() > 500000)) {
			} else {
				System.out.println("invalid courseInManths");
		
			}

			if (!(entity.getNoOfTrainies() <3) && !(entity.getNoOfTrainies() > 50000)) {
			} else {
				System.out.println("invalid No of trainies");
			
			}

			if (!(entity.getNoOfTrainers() <3) && !(entity.getNoOfTrainers() > 500000)) {
			} else {
				System.out.println("invalid No of Trainers");
			
			}

			if (!(entity.getNoOfBranches() <3) && !(entity.getNoOfBranches() > 500000)) {
			} else {
				System.out.println("invalid No of branches");
			
			}

			if (!(entity.getRating() <3) && !(entity.getRating() > 500000)) {
			} else {
				System.out.println("invalid rating");
		
			}

			if (!(entity.getFees() <3) && !(entity.getFees() > 500000)) {
			} else {
				System.out.println("invalid fees");
			
			}

			if (entity.getUpdatedAt() != null) {
			} else {
				System.out.println("invalid updated");
				
			}

			if (entity.getUpdatedBy() != null && entity.getUpdatedBy().isEmpty() && entity.getUpdatedBy().length() > 3
					&& entity.getUpdatedBy().length() < 25) {
			} else {
				System.out.println("invalid updatedBy");
			
			}

			if (entity.getCratedBy() != null && entity.getCratedBy().isEmpty() && entity.getCratedBy().length() > 3
					&& entity.getCratedBy().length() < 25) {
			} else {
				System.out.println("invalid createdBy");
			
			}

			if (entity.getCratedAt() != null) {
			} else {
				System.out.println("invalid createdAt");
				
				
			}
			
			if(valid)dao.save(entity);
		
			return false;

	
		}
}
	
