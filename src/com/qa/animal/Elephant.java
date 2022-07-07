package com.qa.animal;

public class Elephant extends Animal{
	
	private boolean scaredOfMice = true;
	
	public void mouse() {
		if (this.scaredOfMice) {
			System.out.println("Oh no, a mouse!");
		} else {
			System.out.println("I'm not scared of mice.");
		}
	}
	
	@Override
	public void move() {
		System.out.println("The animal moves.");
	}
	
	@Override
	public void noise() {
		System.out.println("*elephant noise*");
	}


}
