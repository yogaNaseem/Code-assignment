package com.assignment;

public class ParrotLivingWithCat extends Parrot  {
	public ParrotLivingWithCat(Bird b) {
		super(b);
	}

	@Override
	public void sing(){
		System.out.println("Meow, meow");
	}
}
