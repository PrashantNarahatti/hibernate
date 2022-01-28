package com.xworkz.vendor.service;

import com.xworkz.vendor.entity.VendorEntity;

public interface VendorService {
	boolean validateAndSave(VendorEntity entity);
	boolean validateAndLogin(String loginName,String password);
	void validateAndChangePassword(String email,String newPassword);
	


}
