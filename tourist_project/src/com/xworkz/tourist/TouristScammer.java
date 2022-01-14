package com.xworkz.tourist;

import java.util.ArrayList;
import java.util.List;


import com.xworkz.tourist.dao.TouristDAO;
import com.xworkz.tourist.dao.TouristDAOImpl;
import com.xworkz.tourist.entity.TouristEntity;

public class TouristScammer {

	public static void main(String[] args) {

		// TouristEntity entity1 = new TouristEntity(1, "Shimogga", 1200.34f,"Waterfalls", 500, "Rainy Season");
		// TouristEntity entity2 = new TouristEntity(2, "Mysore", 700.0f, "Palace",500,"Rainy Season");
		//TouristEntity entity3 = new TouristEntity(3, "Hampi", 998.0f, "Virupakshatemple", 200, "All Season");
         
		List<TouristEntity> touristList = new ArrayList<TouristEntity>();
		
		//touristList.add(new TouristEntity(1, "Shimogga", 1200.34f, "Waterfalls", 500, "Rainy Season"));
		//touristList.add(new TouristEntity(2, "Mysore", 700.0f, "Palace",500,"Rainy Season"));
		//touristList.add(new TouristEntity(3, "Hampi", 998.0f, "Virupakshatemple", 200, "All Season"));
		touristList.add(new TouristEntity(4, "Udaipur", 1000.34f, "Lake Pichola", 700, "Rainy Season"));
		touristList.add(new TouristEntity(5, "Jaipur", 2000.20f, "Hawa Mahal", 500, "All Season"));
		touristList.add(new TouristEntity(6, "Island", 2200.41f, "Radhanagar Beach", 400, "Summer Season"));
		touristList.add(new TouristEntity(7, "Varanasi", 1200.34f, "Kashi Vishwanth", 700, "Rainy Season"));
		touristList.add(new TouristEntity(8, "Goa", 2000.34f, "Calangute Beach", 500, "Summer Season"));
		touristList.add(new TouristEntity(9, "Agra", 1200.24f, "Taj Mahal", 500, "Rainy Season"));
		touristList.add(new TouristEntity(10, "Kerala", 3000.06f, "Tea Estaters", 200, "Rainy Season"));
		touristList.add(new TouristEntity(11, "Gokarna", 1000.34f, "OM Beach", 800, "Rainy Season"));
		touristList.add(new TouristEntity(12, "West Bengal", 2000.58f, "Darjeeling Himalayan Railway", 500, "Rainy Season"));
		touristList.add(new TouristEntity(13, "Himachal Pradesh", 3000.34f, "Hidimba Temple", 500, "Rainy Season"));
		touristList.add(new TouristEntity(14, "Talakaveri", 1200.34f, "Abbey Falls", 200, "Rainy Season"));
		touristList.add(new TouristEntity(15, "Island", 2000.03f, "Unspoiled Beaches", 300, "Rainy Season"));
		touristList.add(new TouristEntity(16, "Madhya Pradesh", 2000.24f, "Kanha National Park", 400, "Rainy Season"));
		touristList.add(new TouristEntity(17, "New Delhi", 3200.12f, "Mughal  Garden", 500, "Rainy Season"));
		touristList.add(new TouristEntity(18, "Himachal Pradesh", 2000.34f, "Dalhousia", 1000, "Rainy Season"));
		touristList.add(new TouristEntity(19, "Rajasthan", 2200.04f, "Gadisar Lake", 700, "Rainy Season"));
		touristList.add(new TouristEntity(20, "Pondicherry", 3200.34f, "Paradise Beach", 500, "Summer Season"));
		touristList.add(new TouristEntity(21, "Kerala", 4000.80f, "Marari Beach", 300, "Summer Season"));
		touristList.add(new TouristEntity(22, "Jummu & Kashmir", 1200.34f, "Moonland", 750, "Rainy Season"));
		touristList.add(new TouristEntity(23, "Punjab", 3000.10f, "Golden Temple", 500, "Rainy Season"));
		touristList.add(new TouristEntity(24, "Tamil Nadu", 3200.34f, "Ooty Lake", 800, "Rainy Season"));
		touristList.add(new TouristEntity(25, "Hampi", 1000.34f, "Vithala Temple", 900, "All Season"));
		touristList.add(new TouristEntity(26, "Hampi", 1200.34f, "Lotus Palace", 500, "Rainy Season"));
		touristList.add(new TouristEntity(27, "Tamil Nadu", 3200.13f, "Kodaikanal", 400, "Rainy Season"));
		touristList.add(new TouristEntity(28, "Tamil Nadu", 1200.34f, "Bear Shola Falls", 500, "Rainy Season"));
		touristList.add(new TouristEntity(29, "Rajasthan", 3200.02f, "Mehrangarth", 500, "Rainy Season"));
		touristList.add(new TouristEntity(30, "Uttarakhand", 2000.20f, "Kempty Falls", 300, "Rainy Season"));
		touristList.add(new TouristEntity(31, "Himachal Pradesh", 2000.34f, "Bhhagsu Falls", 400, "Summer Season"));
		touristList.add(new TouristEntity(32, "Uttarakhand", 3000.34f, "Naini Lake", 400, "All Season"));
		touristList.add(new TouristEntity(33, "Andhra Pradesh", 3000.10f, "Sri Venkateshwara Temple", 500, "All Season"));
		touristList.add(new TouristEntity(34, "Jammu & Kashmir", 1200.34f, "Vaishno Devi", 300, "All Season"));
		touristList.add(new TouristEntity(35, "Madhya Pradesh", 2200.20f, "Dulhadev Temple", 500, "Rainy Season"));
		touristList.add(new TouristEntity(36, "Madhya Pradesh", 1200.23f, "Kandariya Mahadev Temple", 300, "Rainy Season"));
		touristList.add(new TouristEntity(37, "Rajasthan", 2600.04f, "Nakki Lake", 200, "Rainy Season"));
		touristList.add(new TouristEntity(38, "Tamil Nadu", 5100.34f, "Rameshwaram Temple", 500, "Rainy Season"));
		touristList.add(new TouristEntity(39, "Tamil Nandu", 2300.20f, "Jatayu Tirtham", 500, "Summer Season"));
		touristList.add(new TouristEntity(40, "Maharashtra", 1200.00f, "Dhobi Waterfalls", 300, "Rainy Season"));
		touristList.add(new TouristEntity(41, "Shimogga", 1200.34f, "Waterfalls", 500, "Rainy Season"));
		touristList.add(new TouristEntity(42, "Maharashta", 1200.02f, "Chinamans Falls", 300, "Rainy Season"));
		touristList.add(new TouristEntity(43, "Maharashta", 5000.02f, "Juhu Beach", 500, "Rainy Season"));
		touristList.add(new TouristEntity(44, "Jammu & Kashmir", 1200.33f, "Dal Lake", 500, "Rainy Season"));
		touristList.add(new TouristEntity(45, "Jammu & Kashmir", 3300.02f, "Wular Lake", 300, "Rainy Season"));
		touristList.add(new TouristEntity(46, "Shimogga", 1200.34f, "Waterfalls", 500, "Rainy Season"));
		touristList.add(new TouristEntity(47, "Kerala", 3000.25f, "Mattancherry  Palace", 300, "Rainy Season"));
		touristList.add(new TouristEntity(48, "Uttar Pradesh", 1200.34f, "Bara Imambara", 500, "Rainy Season"));
		

		TouristDAO dao = new TouristDAOImpl();

		// dao.put(entity1);
		// dao.put(entity2);
		//dao.put(entity3);
		
		dao.addAll(touristList);

	}

}
