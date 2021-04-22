package org.howard.edu.lsp.exam.question40;

public class Airplane extends Flying {
	
	public Airplane() {
		
	}
	
	/**
	 * This is a Flying object when called prints about how airplanes fly
	 */
	@Override
	public void fly() {
		System.out.println("Airplane flies with the help of pilots");
	}

}
