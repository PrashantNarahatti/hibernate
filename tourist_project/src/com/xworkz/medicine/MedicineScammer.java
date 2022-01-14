package com.xworkz.medicine;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.medicine.dao.MedicineDAO;
import com.xworkz.medicine.dao.MedicineDAOImpl;
import com.xworkz.medicine.entity.MedicineEntity;

public class MedicineScammer {

	public static void main(String[] args) {
		// MedicineEntity entity13=new MedicineEntity(13,"Zincold", "Adarsh","capsules", "pink", 100.0f,12);
		// MedicineEntity entity14=new MedicineEntity(14,"Dolo 650", "Med Plus","capsules", "white", 150.0f,10);
	    //MedicineEntity entity15=new MedicineEntity(15,"Respira", "Shakti","syrup", "orange", 300.0f,2);
		
		List<MedicineEntity> medicineList = new ArrayList<MedicineEntity>();
		
		medicineList.add(new MedicineEntity(1,"Zincold", "Adarsh","capsules", "pink", 100.0f,12));
		medicineList.add(new MedicineEntity(2,"Azithral", "Apoll0","Azithromycin", "White",120.0f,7));
		medicineList.add(new MedicineEntity(3,"Augmentin", "Ram","Amoxycillin", "Light Pink", 120.0f,8));
		medicineList.add(new MedicineEntity(4,"Ascoril LS syrup", "Appu","Ambroxol", "pink", 130.0f,5));
		medicineList.add(new MedicineEntity(5,"Azee 500", "Laxmi","Cilpla", "White", 99.0f,12));
		medicineList.add(new MedicineEntity(6,"Allegra ", "Vasavi","Fexofenadine", "pink", 160.0f,10));
		medicineList.add(new MedicineEntity(7,"Alex Syrup", "Adarsh","Phenyleprine", "yellow", 118.0f,12));
		medicineList.add(new MedicineEntity(8,"Amoxyclav", "Shakti","Abbott", "White", 113.0f,10));
		medicineList.add(new MedicineEntity(9,"Betnovate-N", "Med +","Glaxo Smithkline", "White", 100.0f,15));
		medicineList.add(new MedicineEntity(10,"Betacap TR", "Adarsh","Propranolol", "pink", 42.0f,3));
		medicineList.add(new MedicineEntity(11,"Broclear", "Vinayak","Acetylcysteine", "White", 190.0f,20));
		medicineList.add(new MedicineEntity(12,"Cheston Cold", "Prashant","Strip", "White", 45.0f,10));
		medicineList.add(new MedicineEntity(13,"Chymoral Forte", "Raju","Trypsin", "light pink", 405.0f,10));
		medicineList.add(new MedicineEntity(14,"Clavam 625", "Jyoti","Amoxycillin", "White", 201.0f,10));
		medicineList.add(new MedicineEntity(15,"Cefix 200", "Laxmi","Cefixime", "White", 100.0f,12));
		medicineList.add(new MedicineEntity(16,"Ceftum ", "Adarsh","Cefuroxime", "yellow", 431.0f,30));
		medicineList.add(new MedicineEntity(17,"Calpol", "Renukadevi","Paracetamol", "Blue", 15.0f,10));
		medicineList.add(new MedicineEntity(18,"Cetrizine", "Prakash","Cetirizine", "White", 18.0f,15));
		medicineList.add(new MedicineEntity(19,"Ciplox 500", "Teju","Cefpodoxime", "White", 172.0f,25));
		medicineList.add(new MedicineEntity(20,"Dolo 650", "Adarsh","Paracetamol", "Blue", 30.0f,15));
		medicineList.add(new MedicineEntity(21,"Duphaston", "Vijay","Dydrogesterone", "White", 758.0f,30));
		medicineList.add(new MedicineEntity(22,"Doxt-SL", "Ramu","Doxycycline", "White", 120.0f,12));
		medicineList.add(new MedicineEntity(23,"Dexona", "Manjunath","Dexamethasone", "White", 3.0f,12));
		medicineList.add(new MedicineEntity(24,"Ecosprin 75", "Adarsh","Aspirin", "White", 4.0f,8));
		medicineList.add(new MedicineEntity(25,"Enzoflam ", "Krishna","Diclofenac", "White", 195.0f,25));
		medicineList.add(new MedicineEntity(26,"Evion LC", "Mahesh","Levo-camitine", "Green", 50.0f,15));
		medicineList.add(new MedicineEntity(27,"Emeset", "Adarsh","Ondansetron", "White", 52.0f,20));
		medicineList.add(new MedicineEntity(28,"Zincold", "Shivanada","capsules", "pink", 100.0f,12));
		medicineList.add(new MedicineEntity(29,"Ketorol-DT", "Shiva","Ketorolac", "White", 133.0f,22));
		medicineList.add(new MedicineEntity(30,"Kenacort", "Shankar","Trimcinolone", "yellow", 154.0f,50));
		medicineList.add(new MedicineEntity(31,"Krimson", "Sai","Cyproterone", "blue", 393.0f,45));
		medicineList.add(new MedicineEntity(32,"Ketoadd", "Adarsh","Alpha", "yellow", 415.0f,28));
		medicineList.add(new MedicineEntity(33,"Kuff Q", "Sunil","Bromhexine", "White", 100.0f,12));
		medicineList.add(new MedicineEntity(34,"Vigore 100", "Vinayak","Sildenafil", "pink", 116.0f,20));
		
		
		 MedicineDAO dao=new MedicineDAOImpl();
		 //dao.put(entity13);
		 //dao.put(entity14);
		 //dao.put(entity15);
		 
		 dao.addAll(medicineList);
	}

}
