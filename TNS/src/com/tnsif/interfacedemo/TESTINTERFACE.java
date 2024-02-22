package com.tnsif.interfacedemo;

public class TESTINTERFACE {
	
public static void main(String[] args) {
	BANK1 b=new SBI();
	System.out.println("ROI"+b.rateofinterest());
	
	BANK1 p=new PNB();
	System.out.println("ROI " + p.rateofinterest());
}


}
