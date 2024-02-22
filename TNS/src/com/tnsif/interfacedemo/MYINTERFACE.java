package com.tnsif.interfacedemo;

public interface MYINTERFACE {

	 void calculatearea();
	 
	 // nested(inner ) interface
	 
	 interface Myinnerinterface{
		 int id=20;    // data member
		 
		 void print();
	 }

}
