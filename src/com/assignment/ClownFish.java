package com.assignment;

public class ClownFish extends Fish {

	public ClownFish(Size sz, Colour c) {
		super(sz, c);
	}
	
	public void makeJokes(){
		System.out.println("Clown fish can crack jokes");
		System.out.println("Fish size is "+getSize());
		System.out.println("Fish colour is "+getColour());
	}

}
