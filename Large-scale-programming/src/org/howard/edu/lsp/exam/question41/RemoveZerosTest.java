package org.howard.edu.lsp.exam.question41;

import java.util.ArrayList;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RemoveZerosTest {
	
	RemoveZeros test;
	ArrayList<Integer> allZeros;
	ArrayList<Integer> noZeros;
	ArrayList<Integer> someZeros;
	ArrayList<Integer> manyZeros;
	
	
	
	@BeforeEach
	void setup() {
		test = new RemoveZeros();
		allZeros = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0));
		noZeros =  new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		someZeros = new ArrayList<Integer>(Arrays.asList(1,0,4,0,5,6,7,8,0,9));
		manyZeros = new ArrayList<Integer>(Arrays.asList(0,0,3,0,0,0,5,0,0));
	
		
			 

	}
	
	@AfterEach
	void teardown() {
		test=null;
		allZeros = null;
		noZeros = null;
		someZeros = null;
		manyZeros = null;
		
	}
	
	
	
	

	@Test
	@DisplayName("Test case for all zeros ")
	void testAllZeros() {
		//Should return empty List
		test.removeZeros(allZeros);
		assertEquals(allZeros.equals(new ArrayList<Integer>()),true);
		
	}
	@Test
	@DisplayName("Test case for no zeros ")
	void testNoZeros() {
		//Should have no values taken out
		test.removeZeros(noZeros);
		assertEquals(noZeros.equals(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5))),true);
	}
	@Test
	@DisplayName("Test case for some zeros ")
	void testSomeZeros() {
		//Should take out all the zeros
		test.removeZeros(someZeros);
		assertEquals(someZeros.equals(new ArrayList<Integer>(Arrays.asList(1,4,5,6,7,8,9))),true);
	}
	@Test
	@DisplayName("Test case for many zeros ")
	void testManyZeros() {
		//Should take out all the zeros
		test.removeZeros(manyZeros);
		assertEquals(manyZeros.equals(new ArrayList<Integer>(Arrays.asList(3,5))),true);
	}



}
