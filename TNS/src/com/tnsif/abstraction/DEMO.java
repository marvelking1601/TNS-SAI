package com.tnsif.abstraction;

public class DEMO {
	public static void main(String[] args) {
//		SQUARE s=new SQUARE();
	//System.out.println(s);
//		SHAPE p1 =new SHAPE();
		
		SHAPE p=new SQUARE(4.5f);
		p.calarea();
		p.show();
	}
}
