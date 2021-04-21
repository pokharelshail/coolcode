package org.howard.edu.assignment7.tollbooth;

public  class TeslaTruck implements Truck {
	
	public TeslaTruck(int axels, int weight) {
		this.axels = axels;
		this.weight = weight;
	}
	@Override
	public int getAxels() {
		return axels;
	}
	@Override
	public int getWeight() {
		return weight;
	}
	int axels;
	int weight;
		

}
