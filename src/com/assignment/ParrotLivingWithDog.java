package com.assignment;

public class ParrotLivingWithDog extends Parrot  {
	public ParrotLivingWithDog(Bird b) {
		super(b);
	}

	@Override
	public void sing(){
		System.out.println("Woof, woof");
	}
}
