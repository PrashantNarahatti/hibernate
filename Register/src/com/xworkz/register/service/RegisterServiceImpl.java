package com.xworkz.register.service;

import com.xworkz.register.dao.RegisterDAO;
import com.xworkz.register.entity.RegisterEntity;

public class RegisterServiceImpl implements RegisterService {

	private RegisterDAO dao;

	public RegisterServiceImpl(RegisterDAO dao) {
		super();
		this.dao = dao;
	}

	@Override
	public boolean validateAndSave(RegisterEntity entity) {
		boolean valid = false;
		if (entity.getUserName() != null && !(entity.getUserName().isEmpty()) && !(entity.getUserName().length() < 6)
				&& !(entity.getUserName().length() > 25)) {
			valid = true;
		} else {
			System.out.println("invalid userName");
			valid = false;
			return valid;

		}
		if (entity.getPassword() != null && !(entity.getPassword().isEmpty()) && !(entity.getPassword().length() < 8)
				&& !(entity.getPassword().length() > 36)) {
			valid = true;
		} else {
			System.out.println("invalid password");
			valid = false;
			return valid;
		}

		if (entity.getCity() != null && !(entity.getCity().isEmpty()) && !(entity.getCity().length() < 6)
				&& !(entity.getCity().length() > 56)) {
			valid = true;
		} else {
			System.out.println("invalid city");
			valid = false;
			return valid;

		}
		if (entity.getCountry() != null && !(entity.getCountry().isEmpty()) && !(entity.getCountry().length() < 3)
				&& !(entity.getCountry().length() > 56)) {
			valid = true;
		} else {
			System.out.println("invalid country");
			valid = false;
			return valid;
		}
		if (String.valueOf(entity.getMobileNo()).length() == 10) {
			valid = true;
		} else {
			System.out.println("invalid mobileNo");
			valid = false;
			return valid;

		}
		if (valid)
			dao.save(entity);

		return valid;
	}

}
