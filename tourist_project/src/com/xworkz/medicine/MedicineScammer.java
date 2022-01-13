package com.xworkz.medicine;

import com.xworkz.medicine.dao.MedicineDAO;
import com.xworkz.medicine.dao.MedicineDAOImpl;
import com.xworkz.medicine.entity.MedicineEntity;

public class MedicineScammer {

	public static void main(String[] args) {
		// MedicineEntity entity13=new MedicineEntity(13,"Zincold", "Adarsh","capsules", "pink", 100.0f,12);
		// MedicineEntity entity14=new MedicineEntity(14,"Dolo 650", "Med Plus","capsules", "white", 150.0f,10);
		 MedicineEntity entity15=new MedicineEntity(15,"Respira", "Shakti","syrup", "orange", 300.0f,2);
		
		 MedicineDAO dao=new MedicineDAOImpl();
		 //dao.put(entity13);
		 //dao.put(entity14);
		 dao.put(entity15);
	}

}
