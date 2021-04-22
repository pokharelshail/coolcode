package org.howard.edu.lsp.exam.question40;

public class Goose extends Flying implements Animal{
	
	public Goose() {
		
	}
	/**
	 * Goose is a FLying object and it also implements Animal it overrides and prints Goose can fly by itself
	 */
	public void fly() {
		System.out.println("Goose can fly by itself");
	}
	/**
	 * Speak method specific to Goose
	 */
	@Override
	public void speak() {
		System.out.println("This Goose speaks");
	}

	/**
	 * Move method specific to Goose
	 */
	@Override
	public void move() {
		System.out.println("This Goose moves");
		
	}
	
}
