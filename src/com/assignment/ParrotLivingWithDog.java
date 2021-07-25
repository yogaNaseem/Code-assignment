package com.assignment;

public class ParrotLivingWithDog extends ParrotBehaviour  {
	public ParrotLivingWithDog(Bird b) {
		super(b);
	}

	@Override
	public void sing(){
		System.out.println("Woof, woof");
	}
}
