package com.tnsif.override;

public class OVERRIDEDEMO {
	public static void main(String[] args)
	{
		
		SBI s = new SBI();
		System.out.println(s.getRateofInterest());
		
		RBI r = new RBI();
		System.out.println(r.getRateofInterest());
	}

}
