package com.assignment;

public class Parrot extends Bird implements FlyInterface{

	@Override
	public void fly() {
		System.out.println("I can fly");
		
	}

}