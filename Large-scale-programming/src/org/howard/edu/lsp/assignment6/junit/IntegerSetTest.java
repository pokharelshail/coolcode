package org.howard.edu.lsp.assignment6.junit;

import static org.junit.jupiter.api.Assertions.*;



import java.util.Arrays;
import org.howard.edu.lsp.assignment4.implementation.IntegerSetException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.howard.edu.lsp.assignment6.integerset.IntegerSet;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class IntegerSetTest {
	
	IntegerSet emptyTest;
	IntegerSet testOne;
	IntegerSet testTwo;
	IntegerSet newSet ;
	
	@BeforeEach
	void setup() {
		emptyTest = new IntegerSet(Arrays.asList());//Empty
		testOne = new IntegerSet(Arrays.asList(19));//One element
		testTwo = new IntegerSet(Arrays.asList(2,4,6,8,10));//Multiple elements
		newSet = new IntegerSet(Arrays.asList(19,10));
		
	}
	
	@AfterEach
	void tearDown() {
		
		emptyTest = null;
		testOne = null;
		testTwo = null;
			
	}
	

	@Test
	@DisplayName("Test case for clear")
	void testClear() {
		testOne.clear();
		assertEquals(testOne.getSet(),emptyTest.getSet());
	}
	
	@Test
	@DisplayName("Test case for length")
	void testLength() {
		testOne.clear();
		assertEquals(0,emptyTest.length());
	}
	
	@Test
	@DisplayName("Test case for equals")
	void testEqulas() {
		assertEquals(testTwo.equals(emptyTest),false);
		assertEquals(testTwo.equals(new IntegerSet(Arrays.asList(2,4,6,8,10))),true);
		
	}
	
	@Test
	@DisplayName("Test case for contains")
	void testContains() {
		assertEquals(testTwo.contains(2),true);
		assertEquals(testOne.contains(19),true);
		assertEquals(testTwo.contains(0),false);
		
	}
	
	@Test
	@DisplayName("Test case for largest")
	void testLargest() throws IntegerSetException{
		assertEquals(10,testTwo.largest());
		assertEquals(19,testOne.largest());
		
	}
	
	@Test
	@DisplayName("Test case for smallest")
	void testSmallest() throws IntegerSetException{
		assertEquals(2,testTwo.smallest());
		assertEquals(19,testOne.smallest());	
	}
	
	@Test
	@DisplayName("Test case for add")
	void testAdd() {
		testOne.add(10);
		assertEquals(testOne.getSet(),newSet.getSet());
		
	}
	
	@Test
	@DisplayName("Test case for remove")
	void testRemove() {
		newSet.remove(10);
		assertEquals(testOne.getSet(),newSet.getSet());
		
	}
	
	@Test
	@DisplayName("Test case for union")
	void testUnion() {
		emptyTest.union(newSet);
		assertEquals(Arrays.asList(19,10),emptyTest.getSet());
		testOne.union(newSet);
		assertEquals(Arrays.asList(19,10),testOne.getSet());
		
	}
	
	
	
	@Test
	@DisplayName("Test case for Intersect")
	void testIntersect() {
		newSet.intersect(testOne);
		assertEquals(Arrays.asList(19),newSet.getSet());
		testOne.intersect(emptyTest);
		assertEquals(Arrays.asList(),testOne.getSet());
		
	}
	
	@Test
	@DisplayName("Test case for Difference")
	void testDifference() {
		newSet.diff(testOne);
		assertEquals(Arrays.asList(10),newSet.getSet());
		
	}
	
	@Test
	@DisplayName("Test case for empty")
	void testEmpty() {

		assertEquals(emptyTest.isEmpty(),true);
		assertEquals(testTwo.isEmpty(),false);
		assertEquals(testOne.isEmpty(),false);
		
	}
	
	@Test
	@DisplayName("Test case for toString")
	void testToString() {

		
		assertEquals(testOne.toString(),"[19]");
		assertEquals(newSet.toString(),"[19, 10]");
		assertEquals(testTwo.toString(),"[2, 4, 6, 8, 10]");
		
		
	}
	
	

	
	
	
	
	
	
	
		
	
	
	

}
