package com.xworkz.sugarCane;

import com.xworkz.sugarCane.dao.SugarCaneDAO;
import com.xworkz.sugarCane.dao.SugarCaneDAOImpl;
import com.xworkz.sugarCane.entity.SugarCaneEntity;

public class SugarCaneScammer {

	public static void main(String[] args) {
		SugarCaneEntity entity=new SugarCaneEntity(1,"Purple Ribbon","Bajaj Hindusthan",13,"Bengalore");
		
		SugarCaneDAO dao=new SugarCaneDAOImpl();
		dao.put(entity);

	}

}
