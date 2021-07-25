package com.assignment;

import com.assignment.Animal.Sex;

public class AnimalFactory {
	public static Animal getAnimal(String type) {
		if(type.equals("BIRD"))
			return new Bird();
		else if (type.equals("DUCK"))
			return new Duck();
		else if (type.equals("CHICKEN"))
			return new Chicken();
		else if (type.equals("ROOSTER")) {
			Chicken rooster = new Chicken();
			rooster.setSex(Sex.MALE);
				return rooster;
		}else if (type.equals("PARROT"))
			return new Parrot();
		else if (type.equals("FISH"))
			return new Fish();
		else if (type.equals("SHARKFISH"))
			return new SharkFish();
		else if (type.equals("CLOWNFISH"))
			return new ClownFish();
		else if (type.equals("DOLPHIN"))
			return new Dolphins();
		else if (type.equals("FROG"))
			return new Frog();
		else if (type.equals("DOG"))
			return new Dog();
		else if (type.equals("BUTTERFLY"))
			return new ButterFly();
		else if (type.equals("CAT"))
			return new Cat();
		else
			return null;
	}
}
