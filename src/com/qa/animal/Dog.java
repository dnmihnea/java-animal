package com.qa.animal;

public class Dog extends Animal{
	
	private String breed = "Terrier";
	
	
	public String breed() {
		return "Dog breed: " + this.breed;
	}
	
	@Override
	public void move() {
		System.out.println("The dog waddles.");
	}
	
	@Override
	public void noise() {
		System.out.println("bark");
	}


}
