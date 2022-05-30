package com.xworkz.test;

import java.util.ArrayList;

public class Source{
	public static void main(String args[] )throws Exception{
		Vaccine vc=new Vaccine(0);
		ArrayList<Vaccine>list1=new ArrayList<Vaccine>();
		list1.add(new Vaccine(49));
		list1.add(new Vaccine(26));
		list1.add(new Vaccine(19));
		
		ArrayList<Vaccine>list2=new ArrayList<Vaccine>();
		list2.add(new Vaccine(49,250));
		list2.add(new Vaccine(26,200));
		list2.add(new Vaccine(19,100));
	}
	

}
