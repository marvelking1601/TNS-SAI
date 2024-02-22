package com.tnsif.abstraction;

public class SQUARE extends SHAPE {
	private float side;

	public SQUARE() {
		side=2.0f;
		
	}

	public SQUARE(float side) {
		this.side = side;
	}

	@Override
	void calarea() {
		super.area=side*side;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}


}
