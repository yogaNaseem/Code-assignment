package com.assignment;

public class Frog extends SwimmingAnimals {
	@Override
	public void swim(){
		System.out.println("I can swim");
	}
	
	@Override
	public void sing() {
		System.out.println("ribbit, ribbit");
	}
	
	@Override
	public void walk() {
		System.out.println("I can walk");
		
	}
}
