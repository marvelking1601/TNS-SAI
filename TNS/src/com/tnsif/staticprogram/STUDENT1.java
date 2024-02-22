package com.tnsif.staticprogram;

public class STUDENT1 {
	int rollno;
	String name;
	static String college = "srys";
	
	//static method change value
	static void change()
	{
		college="SREYAS";
		
	}
	
	STUDENT1(int r, String n)
	{
		rollno=r;
		name=n;
	}
	void display() {
		System.out.println(rollno+" "+name+" "+college);
	}
	

}
