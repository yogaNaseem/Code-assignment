package com.assignment;

public class ParrotLivingWithCat extends ParrotBehaviour  {
	public ParrotLivingWithCat(Parrot b) {
		super(b);
	}

	@Override
	public void sing(){
		System.out.println("Meow, meow");
	}
}
