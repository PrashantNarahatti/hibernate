package com.xworkz.vendor.dao;

import com.xworkz.vendor.entity.VendorEntity;

public interface VendorDAO {
	public void save(VendorEntity entity);
   boolean findLogin(String loginName,String password);
   boolean findByEmail(String email);
   void updatePasswordByEmail(String email,String password);
}
