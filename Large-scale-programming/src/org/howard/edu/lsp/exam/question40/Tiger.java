package org.howard.edu.lsp.exam.question40;

public class Tiger implements Animal {
	
	
	public Tiger() {
		
	}
	
	/**
	 * Speak method specific to Tiger
	 */
	@Override
	public void speak() {
		System.out.println("This Tiger speaks");
	}
    /**
     * Move method specific to Tiger
     */
	@Override
	public void move() {
		System.out.println("This Tiger moves");
		
	}

}
