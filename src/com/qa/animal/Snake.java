package com.qa.animal;

public class Snake extends Animal implements Hunters{

	private String species = "King Cobra";
	
	public void species() {
		System.out.println("Snake species: " + this.species);
	}

	@Override
	public void hunt() {
		System.out.println("The snake hunts.");
		
	}
	
	@Override
	public void move() {
		System.out.println("The snake slithers.");
	}
	
	@Override
	public void noise() {
		System.out.println("hiss");
	}
}
