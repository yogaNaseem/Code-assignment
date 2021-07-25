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
	
	

}
