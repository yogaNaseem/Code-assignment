package com.assignment;

import java.util.HashMap;

public class Chicken extends Bird {

	public static HashMap<String, String> languageTranslator = new HashMap<String, String>();

	public void setLanguageTranslator(HashMap<String, String> t) {
		Chicken.languageTranslator = t;
	}

	@Override
	public void sing() {
		if (this.getSex() == Sex.FEMALE)
			System.out.println("Cluck, cluck");
		else
			System.out.println("Cock-a-doodle-doo");
	}
	
	public void singInNativeTongue(String Language){
		if(this.getSex() == Sex.FEMALE)
			System.out.println("Cluck, cluck");
		else
			System.out.println(languageTranslator.get(Language));
	}
}
