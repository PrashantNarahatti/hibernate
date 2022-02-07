package com.xworkz.laptop.director;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.laptop.Charger;
import com.xworkz.laptop.ElectricCookTop;
import com.xworkz.laptop.SolarWaterHeater;
import com.xworkz.laptop.ToothPaste;
import com.xworkz.laptop.Ups;


public class SpringDirector {

	public static void main(String[] args) {
		String xmlpath = "resource/spring.xml";
		ApplicationContext application = new ClassPathXmlApplicationContext(xmlpath);
		
		
		Charger charge=application.getBean("charger2",Charger.class);
		System.out.println(charge.getColor());
		System.out.println(charge.getVolt());
        System.out.println(charge.isWorking());
        System.err.println("---------charger");
        
        SolarWaterHeater solarWaterHeater=application.getBean("solarWaterHeater",SolarWaterHeater.class);
        System.out.println(solarWaterHeater.getCapacity());
        System.out.println(solarWaterHeater.getBrand());
        System.out.println(solarWaterHeater.getPrice());
        System.out.println(solarWaterHeater.isColdWater());
        System.err.println("---------SolarWaterHeater");
        
        ToothPaste toothPaste=application.getBean(ToothPaste.class);
        System.out.println(toothPaste.isSalt());
        System.err.println("---------ToothPaste");
        
        Ups ups=application.getBean(Ups.class);
        System.out.println(ups.getWeight());
        System.out.println(ups.getBackupHours());
        System.out.println(ups.getChargeHours());
        System.err.println("---------Ups");
        
        ElectricCookTop electricCookTop=application.getBean(ElectricCookTop.class);
        System.out.println(electricCookTop.getCustomer());
        System.out.println(electricCookTop.getWireLength());
        System.out.println(electricCookTop.getWarranty());
        
        
		

	}

}
