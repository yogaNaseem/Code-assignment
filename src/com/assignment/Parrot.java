/**
 * 
 */
package com.assignment;

/**
 * @author Yoga
 *
 */
public class Parrot implements SingInterface{

	protected Bird bird;
	
	public Parrot(Bird b){
		this.bird=b;
	}
	
	@Override
	public void sing() {
		this.bird.sing();
	}

}
