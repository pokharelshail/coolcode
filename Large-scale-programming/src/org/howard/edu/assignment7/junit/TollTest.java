package org.howard.edu.assignment7.junit;



import static org.junit.Assert.assertEquals;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.howard.edu.assignment7.tollbooth.DcTollBooth;
import org.howard.edu.assignment7.tollbooth.TeslaTruck;
import org.howard.edu.assignment7.tollbooth.TollBooth;
import org.howard.edu.assignment7.tollbooth.Truck;
import org.howard.edu.assignment7.tollbooth.VolvoTruck;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;




class TollTest {
	
	Truck tesla;
	Truck volvo;
	Truck miniTesla;
	TollBooth dc; 
	
	
	
	PrintStream standardOut = System.out;
	ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

	

	@BeforeEach
	void setup() {
		
		dc =  new DcTollBooth();
		miniTesla = new TeslaTruck(2,5000);
		volvo = new VolvoTruck(5,150000);
		tesla = new TeslaTruck(10,10000);
		System.setOut(new PrintStream(outputStreamCaptor));

	}
	
	@AfterEach
	void tearDown() {
		dc= null;
		miniTesla=null;
		volvo=null;
		tesla=null;
		System.setOut(standardOut);	
	}
	
	
	
	@Test
	@DisplayName("Test case for calculate Toll for Tesla")
	void testCalculateTollTesla() {
		dc.calculateToll(tesla);
		assertEquals("Truck Arrival- Axels: 10 Weight: 10000 Toll Due: $250.0",outputStreamCaptor.toString().trim());
		
	}
	@Test
	@DisplayName("Test case for calculate Toll for mini Tesla")
	void testCalculateTollMini() {
		dc.calculateToll(miniTesla);
		assertEquals("Truck Arrival- Axels: 2 Weight: 5000 Toll Due: $110.0",outputStreamCaptor.toString().trim());
	}
	
	@Test
	@DisplayName("Test case for displayData")
	void testDisplayData() {
		
		dc.calculateToll(miniTesla);
		dc.calculateToll(volvo);
		outputStreamCaptor.reset();
		dc.displayData();
		assertEquals("*** Collecting Reciepts *** \n"
				+ " Totals since the last collection - Receipts: 3135.0 Trucks: 2",outputStreamCaptor.toString().trim());
		
	}
	
	@Test
	@DisplayName("Test case for reset. Truck and Reciepts must be 0 after reset.")
	void testReset() {
		dc.calculateToll(miniTesla);
		dc.calculateToll(volvo);
		outputStreamCaptor.reset();
		dc.reset();
		dc.displayData();
		assertEquals("*** Collecting Reciepts *** \n"
				+ " Totals since the last collection - Receipts: 0.0 Trucks: 0",outputStreamCaptor.toString().trim());
		
	}
	

}
