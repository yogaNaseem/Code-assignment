package com.assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.assignment.Animal.Sex;
import com.assignment.Fish.Colour;
import com.assignment.Fish.Size;

public class Solution {
	static List<Animal> animals;
	public static void main(String[] args) {
		
		printA1Answer();

		printA2Answer();
		
		printA3Answer();
		
		printA4Answer();
		
		
		printB1Answer();
		
		printB2Answer();
		
		printB3Answer();
		
		printC1Answer();
		
		printC2Answer();
		
		printDAnswer();
		
		
		printBonus1Answer();
		
		
	}
	private static void printBonus1Answer() {
		Chicken secondLangC = new Chicken();
		secondLangC.setSex(Sex.MALE);
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("Danish", "kykyliky");
		map.put("Dutch", "kukeleku");
		map.put("Finnish", "kukko kiekuu");
		map.put("French", "cocorico");
		map.put("German", "kikeriki");
		map.put("Greek", "kikiriki");
		map.put("Hebrew", "coo- koo - ri-koo");
		map.put("Hungarian", "kukuriku");
		map.put("Italian", "chicchirichi");
		map.put("Japanese", "ko - ke - kok - ko -o");
		map.put("Portuguese", "cucurucu");
		map.put("Russian", "kukareku");
		map.put("Swedish", "kuckeliku");
		map.put("Turkish", "kuk-kurri-kuuu");
		map.put("Urdu", "kuklooku");
		Chicken.languageTranslator = map;
		
		System.out.println("Native language is Danish");
		secondLangC.singInNativeTongue("Danish");
		
		System.out.println("Native language is Dutch");
		secondLangC.singInNativeTongue("Dutch");
		
		System.out.println("Native language is Finnish");
		secondLangC.singInNativeTongue("Finnish");
		
		System.out.println("Native language is French");
		secondLangC.singInNativeTongue("French");
		
		System.out.println("Native language is German");
		secondLangC.singInNativeTongue("German");
		
		System.out.println("Native language is Greek");
		secondLangC.singInNativeTongue("Greek");
		
		System.out.println("Native language is Hebrew");
		secondLangC.singInNativeTongue("Hebrew");
		
		System.out.println("Native language is Hungarian");
		secondLangC.singInNativeTongue("Hungarian");
		
		System.out.println("Native language is Italian");
		secondLangC.singInNativeTongue("Italian");
		
		System.out.println("Native language is Japanese");
		secondLangC.singInNativeTongue("Japanese");
		
		System.out.println("Native language is Portuguese");
		secondLangC.singInNativeTongue("Portuguese");
		
		System.out.println("Native language is Russian");
		secondLangC.singInNativeTongue("Russian");
		
		System.out.println("Native language is Swedish");
		secondLangC.singInNativeTongue("Swedish");
		
		System.out.println("Native language is Turkish");
		secondLangC.singInNativeTongue("Turkish");
		
		System.out.println("Native language is Urdu");
		secondLangC.singInNativeTongue("Urdu");
	}
	private static void printDAnswer() {
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
	private static void printC2Answer() {
		Catterpillar c = new Catterpillar();
		System.out.println("Catterpillar");
		c.walk();
		
		ButterFly butterFlyFromCaterpillar = new Metamorphosis().trnasform(c);
		System.out.println("butterFlyFromCaterpillar");
		butterFlyFromCaterpillar.fly();
	}
	private static void printC1Answer() {
		ButterFly b = new ButterFly();
		System.out.println("ButterFly");
		b.fly();
	}
	private static void printB3Answer() {
		Dolphins dolphins = new Dolphins();
		System.out.println("Dolphins");
		dolphins.swim();
	}
	private static void printB2Answer() {
		ClownFish clownFish = new ClownFish(Size.SMALL, Colour.ORANGE);
		System.out.println("clownFish");
		clownFish.makeJokes();
		
		SharkFish sharkFish = new SharkFish(Size.LARGE, Colour.GREY);
		System.out.println("sharkFish");
		sharkFish.eat(clownFish);
	}
	private static void printB1Answer() {
		Fish fish = new Fish();
		System.out.println("Fish");
		fish.swim();
	}
	private static void printA4Answer() {
		ParrotLivingWithDog parrotLivingWithDog = new ParrotLivingWithDog(new Bird());
		System.out.println("parrotLivingWithDog");
		parrotLivingWithDog.sing();
		
		ParrotLivingWithCat parrotLivingWithCat = new ParrotLivingWithCat(new Parrot());
		System.out.println("parrotLivingWithCat");
		parrotLivingWithCat.sing();
		
		ParrotLivingWithRooster parrotLivingWithRooster = new ParrotLivingWithRooster(new Bird());
		System.out.println("parrotLivingWithRooster");
		parrotLivingWithRooster.sing();
	}
	private static void printA3Answer() {
		Chicken chicken1 = new Chicken();
		chicken1.setSex(Sex.FEMALE);
		System.out.println("Chicken");
		chicken1.sing();
		Chicken rooster = new Chicken();
		rooster.setSex(Sex.MALE);
		System.out.println("Rooster");
		rooster.sing();
	}
	private static void printA2Answer() {
		Duck duck = new Duck();
		System.out.println("Duck");
		duck.sing();
		duck.swim();
		
		Chicken chicken = new Chicken();
		System.out.println("Chicken");
		chicken.sing();
	}
	private static void printA1Answer() {
		Bird bird = new Bird();
		System.out.println("Bird");
		bird.walk();
	//	bird.fly();
		bird.sing();
	}

}
