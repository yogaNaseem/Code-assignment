package com.assignment;

import java.util.ArrayList;
import java.util.List;

import com.assignment.Animal.Sex;
import com.assignment.Fish.Colour;
import com.assignment.Fish.Size;

public class Solution {
	static List<Animal> animals;
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
		
		ParrotLivingWithCat parrotLivingWithCat = new ParrotLivingWithCat(new Parrot());
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
		
		ButterFly b = new ButterFly();
		System.out.println("ButterFly");
		b.fly();
		
		Catterpillar c = new Catterpillar();
		System.out.println("Catterpillar");
		c.walk();
		
		ButterFly butterFlyFromCaterpillar = new Metamorphosis().trnasform(c);
		System.out.println("butterFlyFromCaterpillar");
		butterFlyFromCaterpillar.fly();
		
		animals = new ArrayList<Animal>();
		animals.add(AnimalFactory.getAnimal("BIRD"));
		animals.add(AnimalFactory.getAnimal("DUCK"));
		animals.add(AnimalFactory.getAnimal("CHICKEN"));
		animals.add(AnimalFactory.getAnimal("ROOSTER"));
		animals.add(AnimalFactory.getAnimal("PARROT"));
		animals.add(AnimalFactory.getAnimal("FISH"));
		animals.add(AnimalFactory.getAnimal("SHARKFISH"));
		animals.add(AnimalFactory.getAnimal("CLOWNFISH"));
		animals.add(AnimalFactory.getAnimal("DOLPHIN"));
		animals.add(AnimalFactory.getAnimal("FROG"));
		animals.add(AnimalFactory.getAnimal("DOG"));
		animals.add(AnimalFactory.getAnimal("BUTTERFLY"));
		animals.add(AnimalFactory.getAnimal("CAT"));
		
		int fly = 0,sing = 0,swim = 0,walk = 0;
		
		for(Animal animal : animals ){
			if (animal instanceof FlyInterface)
				fly++;
			if(animal instanceof SwimInterface)
				swim++;
			if(animal instanceof SingInterface)
				sing++;
			if(animal instanceof WalkInterface)
				walk++;
		}
		
		System.out.println("No of animals that can  fly is " + fly);
		System.out.println("No of animals that can  sing is " + sing);
		System.out.println("No of animals that can  swim is " + swim);
		System.out.println("No of animals that can  walk is " + walk);
	}

}
