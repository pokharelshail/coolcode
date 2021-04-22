package org.howard.edu.lsp.exam.question40;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AnimalTest {
	
	Animal tiger;
	Animal goose;
	Flying airplane;
	Flying flyingBird;
	PrintStream standardOut = System.out;
	ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
	
	
	
	@BeforeEach
	void setup() {
		 tiger = new Tiger();
		 goose = new Goose();
		 airplane= new Airplane();
		 flyingBird= new Goose();
		 System.setOut(new PrintStream(outputStreamCaptor));

	}
	
	@AfterEach
	void tearDown() {
		tiger = null;
		goose = null;
		airplane = null;
		flyingBird = null;
		System.setOut(standardOut);
		
	}

	@Test
	@DisplayName("Test case for Tiger Speaking")
	void testTigerSpeak() {
		tiger.speak();
		assertEquals("This Tiger speaks",outputStreamCaptor.toString().trim());
	}
	
	@Test
	@DisplayName("Test case for Tiger Moving")
	void testTigerMove() {
		tiger.move();
		assertEquals("This Tiger moves",outputStreamCaptor.toString().trim());
	}
	
	@Test
	@DisplayName("Test case for Goose Speaking")
	void testGooseSpeak() {
		goose.speak();
		assertEquals("This Goose speaks",outputStreamCaptor.toString().trim());
	}
	
	@Test
	@DisplayName("Test case for Goose Moving")
	void testGooseMove() {
		goose.move();
		assertEquals("This Goose moves",outputStreamCaptor.toString().trim());
	}
	
	@Test
	@DisplayName("Test case for Airplane Flying")
	void testAirplane() {
		airplane.fly();
		assertEquals("Airplane flies with the help of pilots",outputStreamCaptor.toString().trim());
	}
	
	@Test
	@DisplayName("Test case for Goose Flying")
	void testGooseFly() {
		flyingBird.fly();
		assertEquals("Goose can fly by itself",outputStreamCaptor.toString().trim());
	}
	

}
