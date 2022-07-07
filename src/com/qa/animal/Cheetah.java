package com.qa.animal;

public class Cheetah extends Animal implements Hunters{
	
	private int spots = 202;
	
	public String spots() {
		return "This cheetah has " + this.spots + " spots.";
	}

	@Override
	public void hunt() {
		System.out.println("The cheetah hunts.");
		
	}
	
	@Override
	public void move() {
		System.out.println("The cheetah runs.");
	}
	
	@Override
	public void noise() {
		System.out.println("roar");
	}

}
