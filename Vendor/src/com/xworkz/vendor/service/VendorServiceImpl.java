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
		boolean valid = false;
		if (entity.getName() != null && !(entity.getName().isEmpty()) && !(entity.getName().length() < 5)
				&& !(entity.getName().length() > 30)) {
			valid = true;
		} else {
			System.out.println("invalid name");
			valid = false;
			return valid;
		}
		if (entity.getEmail().contains("@") && entity.getEmail().endsWith(".com") || entity.getEmail().endsWith(".in")
				|| entity.getEmail().endsWith(".org")) {
			valid = true;
		} else {
			System.out.println("invalid email");
			valid = false;
			return valid;
		}

		if (entity.getAddress() != null && !(entity.getAddress().isEmpty()) && !(entity.getAddress().length() < 30)
				&& !(entity.getAddress().length() > 100)) {
			valid = true;
		} else {
			System.out.println("invalid address");
			valid = false;
			return valid;
		}
		if (entity.getCreatedBy() != null && !(entity.getCreatedBy().isEmpty()) && !(entity.getCreatedBy().length() < 5)
				&& !(entity.getCreatedBy().length() > 30)) {
			valid = true;
		} else {
			System.out.println("invalid createdBy");
			valid = false;
			return valid;
		}
		if (entity.getLoginName() != null && !(entity.getLoginName().isEmpty()) && !(entity.getLoginName().length() < 5)
				&& !(entity.getLoginName().length() > 30)) {
			valid = true;
		} else {
			System.out.println("invalid login name");
			valid = false;
			return valid;
		}
		if (entity.getGstNo() != null && !(entity.getGstNo().isEmpty()) && entity.getGstNo().length() == 15) {
			valid = true;
		} else {
			System.out.println("invalid gstNo");
			valid = false;
			return valid;
		}

		if (valid)
			dao.save(entity);
		return valid;
	}

	@Override
	public boolean validateAndLogin(String loginName, String password) {
		boolean valid = false;
		if (loginName != null && !(loginName.isEmpty()) && !(loginName.length() > 20) && !(loginName.length() < 7)
				&& (password != null && !(password.isEmpty()) && !(password.length() > 20)
						&& !(password.length() < 7))) {
			valid = dao.findLogin(loginName, password);
		} else {
			System.out.println("invalid loginName and password");
			valid = false;
			return valid;
		}

		return valid;

	}

	@Override
	public void validateAndChangePassword(String email, String newPassword) {
		boolean valid = false;
		if (email.contains("@") && email.endsWith(".in")) {
			valid = dao.findByEmail(email);
		}

		else {
			System.out.println("invalid email");

		}

		if (valid && (newPassword != null && !(newPassword.isEmpty()) && !(newPassword.length() > 20)
				&& !(newPassword.length() < 7))) {
			dao.updatePasswordByEmail(email, newPassword);
		} else {
			System.out.println("cannot udate the password ,invalid email");

		}
	}

}
