package com.assignment;

public class SwimmingAnimals  extends Animal implements SwimInterface{
	@Override
	public void swim(){
		System.out.println("I can swim");
	}
}
