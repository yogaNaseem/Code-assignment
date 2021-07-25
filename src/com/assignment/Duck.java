	package com.assignment;

public class Duck extends Bird implements SwimInterface {

	@Override
	public void sing() {
		System.out.println("Quack, quack");
	}
	
	@Override
	public void swim() {
		System.out.println("I can swim");
		
	}
}
