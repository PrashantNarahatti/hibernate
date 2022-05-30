package com.xworkz.test;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Vaccine {
 int age;
 float dosage;
 public Vaccine(int age)
 {
	 this.age=age;

 }
 public Vaccine(int age ,float dosage)
 {
	 this.age=age;
	 this.dosage=dosage;
 }
}

class VaccinationCamp
{
	void assignVaccine(ArrayList<Vaccine>list)
	{
		int age=0;
		float dosage=0.0f;
		if(age>=45)
		{
			dosage=250.0f;
		}
		else if(age>=20)
		{
			dosage=200.0f;
			
		}
		else if(age<20)
		{
		 dosage=100.0f;
		 
		}
		else {
			
		}
	}
	float vaccineInjected(ArrayList<Vaccine>list)
	{
		float dosage=0;
		float totalDosage=0;
		totalDosage=dosage+dosage+dosage;
	System.out.println(totalDosage);
		return totalDosage;
	}
	
}




