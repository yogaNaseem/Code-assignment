package com.assignment;

public class Fish extends SwimmingAnimals {
	

	
	protected enum Size {LARGE, SMALL};
	protected enum Colour {GREY, ORANGE};
	protected Size size;
	protected Colour colour;
	
	
	public Size getSize() {
		return size;
	}
	public void setSize(Size size) {
		this.size = size;
	}
	public Colour getColour() {
		return colour;
	}
	public void setColour(Colour colour) {
		this.colour = colour;
	}	
	
	public Fish(Size sz, Colour c){
		this.size = sz;
		this.colour = c;
	}
	
	public Fish(){
		
	}
	
}
