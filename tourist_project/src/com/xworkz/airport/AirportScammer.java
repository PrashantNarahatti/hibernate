package com.xworkz.airport;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.airport.dao.AirportDAO;
import com.xworkz.airport.dao.AirportDAOImpl;
import com.xworkz.airport.entity.AirportEntity;

public class AirportScammer {

	public static void main(String[] args) {
		//AirportEntity entity1= new AirportEntity(1,"KIAB","Bangalore","KIA",true ,15);
		
		List<AirportEntity> airportList = new ArrayList<AirportEntity>();
		
		airportList.add(new AirportEntity(1,"Kempegowda International Airport ","Bangalore","Commercial",true ,45));
		airportList.add(new AirportEntity(2,"Chhatrapati Shivaji International Airport ","Mumbai","Commercial",true ,67));
		airportList.add(new AirportEntity(3,"Rajkot Airport","Gujarat","Defence",true ,53));
		airportList.add(new AirportEntity(4,"Netaji Subhas Chandra Bose International Airport","Kolkata","Commercial",true ,87));
		airportList.add(new AirportEntity(5,"Chaudhary Charan Singh International Airport ","Lucknow","Commercial",true ,55));
		airportList.add(new AirportEntity(6,"Sri Guru Ram Dass Jee International Airport ","Punjab","Commercial",true ,39));
		airportList.add(new AirportEntity(7,"Visakhapatnam International Airport","Visakhapatnam","Commercial",true ,45));
		airportList.add(new AirportEntity(8,"Kannur International Airport","Kerala","Commercial",true ,35));
		airportList.add(new AirportEntity(9,"Surat International Airport ","surat","Commercial",true ,40));
		airportList.add(new AirportEntity(10,"Devi Ahilya Bai Holkar Airport","MP","Commercial",true ,65));
		airportList.add(new AirportEntity(11,"Cochin International Airport ","Kochi","Commercial",true ,25));
		airportList.add(new AirportEntity(12,"Sardar Vallabhbhai Patel International Airport","Gujarat","Commercial",true ,15));
		airportList.add(new AirportEntity(13,"Indira Gandhi International Airport","Delhi","Commercial",true ,15));
		airportList.add(new AirportEntity(14,"Dabolim Airport","Goa","Commercial",true ,38));
		airportList.add(new AirportEntity(15,"Pune Airport","Maharashtra","Commercial",true ,35));
		airportList.add(new AirportEntity(16,"Thiruvananthapuram International Airport ","Thiruvananthapuram","Commercial",true ,45));
		airportList.add(new AirportEntity(17,"Coimbatore International Airport ","Coimbatore","Commercial",true ,55));
		airportList.add(new AirportEntity(18,"Calicut International Airport","Calicut","Commercial",true ,27));
		airportList.add(new AirportEntity(19,"Biju Patnaik International Airport","Odisha","Commercial",true ,60));
		airportList.add(new AirportEntity(20,"Lokpriya Gopinath Bordoloi International Airport","Assam","Commercial",true ,59));
		airportList.add(new AirportEntity(21,"Lal Bahadur Shastri International","UP","Commercial",true ,55));
		airportList.add(new AirportEntity(22,"Rajiv Gandhi International Airport"," Telangana","Commercial",true ,40));
		airportList.add(new AirportEntity(23,"Tiruchirappalli International Airport","Tiruchirappalli","Commercial",true ,25));
		airportList.add(new AirportEntity(24,"Dr. Babasaheb Ambedkar International Airport","Maharashtra","Commercial",true ,44));
		airportList.add(new AirportEntity(25,"Sheikhul Aalam International Airport","JK","Commercial",true ,56));
		airportList.add(new AirportEntity(26,"Imphal International Airport ","Manipur","Commercial",true ,45));
		airportList.add(new AirportEntity(27,"Jaipur International Airport","Jaipur","Commercial",true ,15));
		airportList.add(new AirportEntity(28,"Madurai Airport","Madurai","Commercial",true ,29));
		airportList.add(new AirportEntity(29,"Bagdogra International Airport","West Bengal","Commercial",true ,50));
		airportList.add(new AirportEntity(30,"Jay Prakash Narayan International Airport","Bihar","Commercial",true ,45));
		airportList.add(new AirportEntity(31,"Mangalore International Airport","Mangalore","Commercial",true ,45));
		airportList.add(new AirportEntity(32,"Chandigarh International Airport","Chandigarh","Commercial",true ,44));
		airportList.add(new AirportEntity(33,"Veer Savarkar International Airport","A & N islands","Civil-Enclave",true ,15));
		airportList.add(new AirportEntity(34,"Kadapa Airport","Andra Pradesh","Civil-Enclave",true ,15));
		airportList.add(new AirportEntity(35,"Rajahmundry Airport","Andra Pradesh","Civil-Enclave",true ,42));
		airportList.add(new AirportEntity(36,"Tirupati Airport","Andra Pradesh","Civil-Enclave",true ,45));
		airportList.add(new AirportEntity(37,"Pasighat Airport","Arunachal Pradesh","Civil-Enclave",true ,38));
		airportList.add(new AirportEntity(38,"Gaya Airport","Bihar","Civil-Enclave",true ,41));
		airportList.add(new AirportEntity(39,"Ambikapur Airport","Chhattisgarh","Civil-Enclave",true ,60));
		airportList.add(new AirportEntity(40,"Bilaspur Airport","Chhattisgarh","Civil-Enclave",true ,62));
		airportList.add(new AirportEntity(41,"Swami Vivekananda Airport","Chhattisgarh","Civil-Enclave",true ,32));
		airportList.add(new AirportEntity(42,"Diu Airport","Duman and Diu","Civil-Enclave",true ,28));
		airportList.add(new AirportEntity(43,"Indira Gandhi International Airport","Delhi","Civil-Enclave",true ,31));
		airportList.add(new AirportEntity(44,"Dibrugarh Airport","Assam","Civil-Enclave",true ,47));
		airportList.add(new AirportEntity(45,"Jorhat Airport","Assam","Civil-Enclave",true ,51));
		airportList.add(new AirportEntity(46,"Vijayawada Airport","Andra Pradesh","Commercial",true ,65));
		airportList.add(new AirportEntity(47,"Lilabari Airport","Assam","Defence",true ,25));
		airportList.add(new AirportEntity(48,"Tezpur Airport","Assam","Defence",true ,55));
		airportList.add(new AirportEntity(49,"Silchar Airport","Assam","Defence",true ,65));
		airportList.add(new AirportEntity(50,"Vadodara Airport","Gujarat","Defence",true ,50));
		airportList.add(new AirportEntity(51,"Bhuj Airport","Gujarat","Defence",true ,45));
		airportList.add(new AirportEntity(52,"Kandla Airport","Gujarat","Defence",true ,38));
		airportList.add(new AirportEntity(53,"Jamnagar Airport","Gujarat","Defence",true ,37));
		airportList.add(new AirportEntity(54,"Chennai International Airport","Chennai","Commercial",true ,52));
		
		

		AirportDAO dao = new AirportDAOImpl();
		//dao.put(entity1);
		
		dao.addAll(airportList);

	}

}
