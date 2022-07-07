package com.qa.animal;

public class Animal implements Everyone {
	
	private String name ="Animal";
	private int age = 5;
	private double weight = 160.5;
	
	public void move() {
		System.out.println("The animal moves.");
	}
	
	public void noise() {
		System.out.println("The animal makes noise");
	}

	@Override
	public void sleep() {
		System.out.println("zzzzz");
		
	}

}
