package com.assignment;

public class Solution {

	public static void main(String[] args) {
		
		Bird bird = new Bird();
		System.out.println("Bird");
		bird.walk();
	//	bird.fly();
		bird.sing();

		Duck duck = new Duck();
		System.out.println("Duck");
		duck.sing();
		duck.swim();
		
		Chicken chicken = new Chicken();
		System.out.println("Chicken");
		chicken.sing();
	}

}
