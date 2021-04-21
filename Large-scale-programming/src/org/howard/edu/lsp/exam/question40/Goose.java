package org.howard.edu.lsp.exam.question40;

public class Goose extends Flying implements Animal{
	
	public Goose() {
		
	}
	public void fly() {
		System.out.println("Goose can fly by itself");
	}
	@Override
	public void speak() {
		System.out.println("This Goose speaks");
	}

	@Override
	public void move() {
		System.out.println("This Goose moves");
		
	}
	
}
