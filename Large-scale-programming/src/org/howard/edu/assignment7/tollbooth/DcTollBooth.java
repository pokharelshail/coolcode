package org.howard.edu.assignment7.tollbooth;

public class DcTollBooth implements TollBooth{
	
	float money = 0;
	int numOfTrucks= 0;
	@Override
	public void calculateToll(Truck truck) {
		// TODO Auto-generated method stub
		float total = (truck.getAxels()*5)+ (10 * (truck.getWeight()/500));
		//Truck arrival - Axles: 5 Total weight: 12500 Toll due: $145
		System.out.println("Truck Arrival- Axels: "+truck.getAxels()+" Weight: "+truck.getWeight()+" Toll Due: $"+total );
		money+=total;
		numOfTrucks ++;	
		
	}
	@Override
	public void displayData() {
		// TODO Auto-generated method stub
		System.out.println("*** Collecting Reciepts *** \n Totals since the last collection - Receipts: "+money+" Trucks: "+ numOfTrucks);
	}
	@Override
	public void reset() {
		// TODO Auto-generated method stub
		money =0;
		numOfTrucks =0;
		
		
	}
	

}
