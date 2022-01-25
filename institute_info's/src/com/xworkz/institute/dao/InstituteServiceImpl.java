package com.xworkz.institute.dao;


import com.xworkz.institute.entity.InstituteEntity;

public class InstituteServiceImpl implements InstituteService {

	private InstituteDAO dao;
	
public InstituteServiceImpl(InstituteDAO dao) {
	super();
	this.dao=dao;
}	

	@Override
	public void validateAndSave(InstituteEntity entity) {
		if (entity.getName() != null && entity.getName().isEmpty() && entity.getName().length() > 3
				&& entity.getName().length() < 25) {
			dao.save(entity);
		}

		if (entity.getOwner() != null && entity.getOwner().isEmpty() && entity.getOwner().length() > 3
				&& entity.getOwner().length() < 25) {
			dao.save(entity);
		}

		if (entity.getHrName() != null && entity.getHrName().isEmpty() && entity.getHrName().length() > 3
				&& entity.getHrName().length() < 25) {
			dao.save(entity);
		}

		if (entity.getEmail() != null && entity.getEmail().isEmpty() && entity.getEmail().length() > 3
				&& entity.getEmail().length() < 25) {
			dao.save(entity);
		}

		if (entity.getPhoneNo() > 0 && entity.getPhoneNo() <= 5000000000d) {
			dao.save(entity);
		}

		if (entity.getLocation() != null && entity.getLocation().isEmpty() && entity.getLocation().length() > 3
				&& entity.getLocation().length() < 25) {
			dao.save(entity);
		}

		if (entity.getStarted() > 0 && entity.getStarted() <= 500000d) {
			dao.save(entity);
		}

		if (entity.getCourseName() != null && entity.getCourseName().isEmpty() && entity.getCourseName().length() > 3
				&& entity.getCourseName().length() < 25) {
			dao.save(entity);
		}

		if (entity.getCourseInMonths() > 0 && entity.getCourseInMonths() <= 500) {
			dao.save(entity);
		}

		if (entity.getNoOfTrainies() > 0 && entity.getNoOfTrainies() <= 50000) {
			dao.save(entity);
		}

		if (entity.getNoOfTrainers() > 0 && entity.getNoOfTrainers() <= 500000) {
			dao.save(entity);
		}
		if (entity.getNoOfBranches() > 0 && entity.getNoOfBranches() <= 500000) {
			dao.save(entity);
		}
		if (entity.getRating() > 0 && entity.getRating() <= 500000.0f) {
			dao.save(entity);
		}
		if (entity.getFees() > 0 && entity.getFees() <= 50000d) {
			dao.save(entity);
		}

		if (entity.getUpdatedAt() != null) {
			dao.save(entity);
		}

		if (entity.getUpdatedBy() != null && entity.getUpdatedBy().isEmpty() && entity.getUpdatedBy().length() > 3
				&& entity.getUpdatedBy().length() < 25) {
			dao.save(entity);
		}

		if (entity.getCratedBy() != null && entity.getCratedBy().isEmpty() && entity.getCratedBy().length() > 3
				&& entity.getCratedBy().length() < 25) {
			dao.save(entity);
		}
		if (entity.getCratedAt() != null) {
			dao.save(entity);
		}

	}

}
