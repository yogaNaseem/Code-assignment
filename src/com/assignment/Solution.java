package com.assignment;

import com.assignment.Animal.Sex;

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
		
		Chicken chicken1 = new Chicken();
		chicken1.setSex(Sex.FEMALE);
		System.out.println("Chicken");
		chicken1.sing();
		Chicken rooster = new Chicken();
		rooster.setSex(Sex.MALE);
		System.out.println("Rooster");
		rooster.sing();
	}

}
