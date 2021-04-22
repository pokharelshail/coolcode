package org.howard.edu.assignment7.tollbooth;

public abstract class Truck {
	
	int axels;
	int weight;
	
	Truck(int axels, int weight){
		this.axels = axels;
		this.weight = weight;
		
	}
	public int getWeight() {
		return this.weight;
	}
	public int getAxels() {
		return this.axels;
	}

}
