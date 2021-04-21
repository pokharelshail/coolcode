package org.howard.edu.assignment7.tollbooth;

public class VolvoTruck implements Truck {
	
	
	public VolvoTruck(int axels, int weight) {
		this.axels = axels;
		this.weight = weight;
	}

	@Override
	public int getWeight() {
		return weight;
	}

	@Override
	public int getAxels() {
		return axels;
	}
	int axels;
	int weight;

}
