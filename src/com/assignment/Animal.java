/**
 * 
 */
package com.assignment;

/**
 * @author Yoga
 *
 */

public abstract class Animal {
	protected enum Sex {MALE,FEMALE};
	protected Sex sex;
	
	protected void setSex(Sex sex){
		this.sex = sex;
	}
	
	protected Sex getSex(){
		return sex;
	}
	
	
	public void sing() {
		System.out.println("I am Singing");		
		
	}


	public void walk() {
		System.out.println("I am walking");
		
	}

}
