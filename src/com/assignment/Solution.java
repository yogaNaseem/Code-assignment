package com.assignment;

import com.assignment.Animal.Sex;
import com.assignment.Fish.Colour;
import com.assignment.Fish.Size;

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
		
		ParrotLivingWithDog parrotLivingWithDog = new ParrotLivingWithDog(new Bird());
		System.out.println("parrotLivingWithDog");
		parrotLivingWithDog.sing();
		
		ParrotLivingWithCat parrotLivingWithCat = new ParrotLivingWithCat(new Bird());
		System.out.println("parrotLivingWithCat");
		parrotLivingWithCat.sing();
		
		ParrotLivingWithRooster parrotLivingWithRooster = new ParrotLivingWithRooster(new Bird());
		System.out.println("parrotLivingWithRooster");
		parrotLivingWithRooster.sing();
		
		
		Fish fish = new Fish();
		System.out.println("Fish");
		fish.swim();
		
		ClownFish clownFish = new ClownFish(Size.SMALL, Colour.ORANGE);
		System.out.println("clownFish");
		clownFish.makeJokes();
		
		SharkFish sharkFish = new SharkFish(Size.LARGE, Colour.GREY);
		System.out.println("sharkFish");
		sharkFish.eat(clownFish);
	}

}
