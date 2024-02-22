package com.tnsif.staticprogram;

public class EMPLOYEE {
	int eid;
	String name;
	static String company="tns";
	
	EMPLOYEE(int e,String n)
	{
		eid=e;      //this keyword is not used here because we are using diff names
		name=n;
	}
	void display()
	{
		System.out.println(eid +" "+name+" "+company);
	}

}
