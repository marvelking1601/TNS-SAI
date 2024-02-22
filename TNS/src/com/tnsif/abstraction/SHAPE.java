package com.tnsif.abstraction;

public abstract class SHAPE {
protected float area;      // variable
	
	// abstract method
	
	abstract void calarea();
	
	// concrete method
	void show() {
		System.out.println("area of a shape"+area);
	}


}
