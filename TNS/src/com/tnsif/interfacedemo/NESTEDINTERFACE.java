package com.tnsif.interfacedemo;

public class NESTEDINTERFACE implements MYINTERFACE.Myinnerinterface {
	@Override
	public void print() {
		System.out.println("welcome to inner interface");
		
	}
}
