package com.assignment;

public class ParrotLivingWithRooster extends ParrotBehaviour  {
	public ParrotLivingWithRooster(Bird b) {
		super(b);
	}

	@Override
	public void sing(){
		System.out.println("Cock-a-doodle-doo");
	}
}
