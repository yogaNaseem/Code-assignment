/**
 * 
 */
package com.assignment;

/**
 * @author Yoga
 *
 */
public class ParrotBehaviour implements SingInterface{

	protected Bird bird;
	
	public ParrotBehaviour(Bird b){
		this.bird=b;
	}
	

	
	@Override
	public void sing() {
		this.bird.sing();
	}

}
