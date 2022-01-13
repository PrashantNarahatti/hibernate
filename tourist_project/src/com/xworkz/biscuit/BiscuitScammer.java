package com.xworkz.biscuit;

import com.xworkz.biscuit.dao.BiscuitDAO;
import com.xworkz.biscuit.dao.BiscuitDAOImpl;
import com.xworkz.biscuit.entity.BiscuitEntity;

public class BiscuitScammer {
	public static void main(String[] args) {
		//BiscuitEntity entity4=new BiscuitEntity(4,"Cadbury","Bournvita","Orange",140,5,"1905-England");
	    //BiscuitEntity entity5=new BiscuitEntity(5,"Parle","Parle-G","Yellow",100,5,"1879-England");
	    BiscuitEntity entity6=new BiscuitEntity(6,"cadbury ","cadbury Chocobakes","Purple",20,10,"200-Europe");
	    
	    BiscuitDAO dao=new BiscuitDAOImpl();
	    //dao.put(entity4);
	    //dao.put(entity5);
	    dao.put(entity6);
	}       
}
