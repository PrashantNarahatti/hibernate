package com.xworkz.railwayStation;


import java.util.ArrayList;

import java.util.List;


import com.xworkz.railwayStation.dao.RailwayDAOImpl;
import com.xworkz.railwayStation.dao.RailwayStationDAO;
import com.xworkz.railwayStation.entity.RailwayStationEntity;

public class RailwayStationScammer {

	public static void main(String[] args) {
		// RailwayStationEntity entity7=new RailwayStationEntity(7, "	Toranagallu Railway Station", "	Toranagallu", 10, true, 61,"TNGL");
		//RailwayStationEntity entity8=new RailwayStationEntity(8, "Almatti", "Almatt", 3, true, 19, "LMT");
	    //RailwayStationEntity entity9=new RailwayStationEntity(9, "Bangalore City Junction", "Bangalore", 6, true, 42,"SBC");
		
		List<RailwayStationEntity> railwayStationList = new ArrayList<RailwayStationEntity>();
		
		railwayStationList.add(new RailwayStationEntity(1, "Toranagallu Railway Station", "Toranagallu", 10, true, 61,"TNGL"));
		railwayStationList.add(new RailwayStationEntity(2, "Bagalkot Station", "Bagalkot",3, true, 50,"BGK"));
		railwayStationList.add(new RailwayStationEntity(3, "Gadag Station", "Gadag", 3, true, 50,"GS"));
		railwayStationList.add(new RailwayStationEntity(4, "Hubli Station", "Hubli", 6, true, 70,"KSR"));
		railwayStationList.add(new RailwayStationEntity(5, "Yaluvagi Station", "Yaluvagi",2, true, 60,"YS"));
		railwayStationList.add(new RailwayStationEntity(6, "Haveri Station", "Haveri",3, true,75,"HRS"));
		railwayStationList.add(new RailwayStationEntity(7, "Badami Station", "Badami", 3, true,20,"BGK"));
		railwayStationList.add(new RailwayStationEntity(8, "Holehalur Station", "Holehalur",4, true,50,"HSR"));
		railwayStationList.add(new RailwayStationEntity(9, "Navanagar Station", "Bagalkot",2, true,20,"BGK"));
		railwayStationList.add(new RailwayStationEntity(10, "Samshi Station", "Samshi",4, true, 50,"SKR"));
		railwayStationList.add(new RailwayStationEntity(11, "Koppal Station", "Koppal", 4, true, 60,"KSR"));
		railwayStationList.add(new RailwayStationEntity(12, "Hampi Ststion", "Hampi",4, true, 50,"HSR"));
		railwayStationList.add(new RailwayStationEntity(13, "Dharwad Station", "Dharwad",4, true, 50,"DSR"));
		railwayStationList.add(new RailwayStationEntity(14, "Vijayapur Station", "Vijayapur", 4, true, 60,"VSR"));
		railwayStationList.add(new RailwayStationEntity(15, "Adrsh Nggr Station", "Delhi",3, true,120,"ANDI"));
		railwayStationList.add(new RailwayStationEntity(16, "Adra Junction", "Adra",5, true,200,"ADRA"));
		railwayStationList.add(new RailwayStationEntity(17, "Bagwall Station", "Bagwall", 4, true, 61,"BGZ"));
		railwayStationList.add(new RailwayStationEntity(18, "Baheri Station", "Baheri", 3, true, 50,"BHI"));
		railwayStationList.add(new RailwayStationEntity(19, "Bajva Station", "Bajva", 10, true, 61,"BJW"));
		railwayStationList.add(new RailwayStationEntity(20, "Bakhleta Station", "Bakhleta", 6, true, 60,"BQQ"));
		railwayStationList.add(new RailwayStationEntity(21, "Baktal Station", "Baktal", 7, true, 80,"BKTL"));
		railwayStationList.add(new RailwayStationEntity(22, "Barwala Station", "Barwala", 10, true, 61,"BXC"));
		railwayStationList.add(new RailwayStationEntity(23, "Basai Station", "Basai", 4, true,100,"BZY"));
		railwayStationList.add(new RailwayStationEntity(24, "Basbi Station", "Basbi",5, true, 10,"BAI"));
		railwayStationList.add(new RailwayStationEntity(25, "Basti Station", "Basti", 10, true, 61,"BST"));
		railwayStationList.add(new RailwayStationEntity(26, "Basta Station", "Basta",8, true, 120,"BST"));
		railwayStationList.add(new RailwayStationEntity(27, "Chatra Station", "Chatra",5, true, 80,"CTR"));
		railwayStationList.add(new RailwayStationEntity(28, "Chauk Station", "Chauk",3, true, 60,"CHK"));
		railwayStationList.add(new RailwayStationEntity(30, "Chennai Station", "Chennai", 10, true, 61,"MAS"));
		railwayStationList.add(new RailwayStationEntity(31, "Cheoki Station", "Cheoki", 2, true, 55,"COI"));
		railwayStationList.add(new RailwayStationEntity(32, "Chhapi Station", "Chhapi",8, true,70,"CHP"));
		railwayStationList.add(new RailwayStationEntity(33, "Chharra Station", "Chharra", 5, true, 120,"CHRA"));
		railwayStationList.add(new RailwayStationEntity(34, "Chilka Station", "Chilka", 7, true, 90,"CLK"));
		railwayStationList.add(new RailwayStationEntity(35, "Chilo Station", "Chilo", 2, true, 50,"CLO"));
		railwayStationList.add(new RailwayStationEntity(36, "Chinpal Station", "Chinpal",3, true, 61,"CPLR"));
		railwayStationList.add(new RailwayStationEntity(37, "Cuttack Station", "Cuttack",5, true,70,"CTC"));
		railwayStationList.add(new RailwayStationEntity(38, "Cumbum Station", "Cumbum", 4, true, 80,"CBM"));
		railwayStationList.add(new RailwayStationEntity(39, "Dabhoda Station", "Dabhoda", 3, true, 50,"DBO"));
		railwayStationList.add(new RailwayStationEntity(40, "Dabilpur Station", "Dabilpur",5, true, 61,"DBV"));
		railwayStationList.add(new RailwayStationEntity(41, "Dabka Station", "Dabka", 3, true, 70,"DBKA"));
		railwayStationList.add(new RailwayStationEntity(42, "Dabpal Station", "Dabpal", 7, true, 75,"DPF"));
		railwayStationList.add(new RailwayStationEntity(43, "Dabra Station", "Dabra", 8, true, 80,"DBA"));
		railwayStationList.add(new RailwayStationEntity(44, "Deori Station", "Deori",2, true, 80,"GD"));
		railwayStationList.add(new RailwayStationEntity(45, "Derol Station", "Derol", 3, true, 40,"DRL"));
		railwayStationList.add(new RailwayStationEntity(46, "Deswal Station", "Deswal",8, true, 45,"DSW"));
		railwayStationList.add(new RailwayStationEntity(47, "Dewas Station", "Dewas", 4, true, 80,"DWS"));
		railwayStationList.add(new RailwayStationEntity(48, "Dhule Station", "Dhule", 4, true,35,"DHE"));
		railwayStationList.add(new RailwayStationEntity(49, "Digod Station", "Digod",2, true,80,"DGD"));
		railwayStationList.add(new RailwayStationEntity(50, "Disa Station", "Disa",3, true, 50,"DSI"));
		railwayStationList.add(new RailwayStationEntity(51, "Diva Station", "Diva", 4, true, 55,"DVA"));
		railwayStationList.add(new RailwayStationEntity(52, "Dodhi Station", "Dodhi", 3, true, 50,"DHI"));
		railwayStationList.add(new RailwayStationEntity(53, "Dokwa Station", "Dokwa", 4, true, 58,"DKW"));
		railwayStationList.add(new RailwayStationEntity(54, "Dubaha Station", "Dubaha",3, true, 75,"DBH"));
		railwayStationList.add(new RailwayStationEntity(55, "Dumka Station", "Dumka", 3, true,40,"DKI"));
		railwayStationList.add(new RailwayStationEntity(56, "Fakhrabad Station", "Fakhrabad", 2, true, 60,"FKB"));
		railwayStationList.add(new RailwayStationEntity(57, "Falakata Station", "Falakata", 3, true,50,"FLK"));
		railwayStationList.add(new RailwayStationEntity(58, "Falna Station", "Falna",5, true, 50,"FA"));
		railwayStationList.add(new RailwayStationEntity(60, "Galgalla Station", "Galgalla", 2, true, 60,"GGL"));
		railwayStationList.add(new RailwayStationEntity(61, "Gamharia Station", "Gamharia", 5, true, 78,"GMH"));
		railwayStationList.add(new RailwayStationEntity(62, "Gnaur Station", "Gnaur", 5, true, 60,"GNU"));
		railwayStationList.add(new RailwayStationEntity(63, "Gangrar Station", "Gangrar", 5, true, 200,"GGR"));
		railwayStationList.add(new RailwayStationEntity(64, "Gani Station", "Gani", 2, true, 55,"BAQ"));
		railwayStationList.add(new RailwayStationEntity(65, "Gankar Station", "Gankar",3, true,25,"GALK"));
		railwayStationList.add(new RailwayStationEntity(66, "Hbl Ngr Station", "Hbl Ngr", 2, true, 65,"HBL"));
		railwayStationList.add(new RailwayStationEntity(67, "Halta Station", "Halta",3, true, 50,"HTL"));
		railwayStationList.add(new RailwayStationEntity(68, "Haveri Station", "Haveri", 3, true, 45,"HVR"));
		railwayStationList.add(new RailwayStationEntity(69, "Harsud Station", "Harsud", 5, true,85,"HSK"));
		railwayStationList.add(new RailwayStationEntity(70, "Harrad Station", "Harrad",3, true,50,"HRV"));
		railwayStationList.add(new RailwayStationEntity(71, "Harri Station", "Harri", 4, true,152,"HPB"));
		railwayStationList.add(new RailwayStationEntity(72, "Garot Station", "Garot", 3, true, 50,"GOH"));
		railwayStationList.add(new RailwayStationEntity(73, "Garla Station", "Garla", 2, true,45,"GLA"));
		
		RailwayStationDAO dao=new RailwayDAOImpl();
		//dao.put(entity7);
		//dao.put(entity8);
		//dao.put(entity9);
		
		dao.addAll(railwayStationList);
		
	}

}
