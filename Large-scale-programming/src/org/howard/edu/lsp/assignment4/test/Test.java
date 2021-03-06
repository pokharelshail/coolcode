package org.howard.edu.lsp.assignment4.test;

import java.util.Arrays;
import org.howard.edu.lsp.assignment4.implementation.IntegerSet;
import org.howard.edu.lsp.assignment4.implementation.IntegerSetException;

/**
 * Test of IntegerSetClass
 * @author shailpokharel 
 */

public class Test {
	
	public static void main(String[] args) {
		
		// Setting different instances of integerSet
		
		IntegerSet integerSetTestEmpty = new IntegerSet(Arrays.asList());//Empty
		
		
		
		
		
		//Test1: clear() Test
		IntegerSet integerSetTest1 = new IntegerSet(Arrays.asList(2,4,6,8,10));
		System.out.println("Test1: Run clear()");
		System.out.println("Initial Set:"+ integerSetTest1.toString());
		System.out.println("Set Result:"+ integerSetTest1.toString());
		System.out.println("\n-------------------------------------------------------------\n");
		
	
		
		
		//Test2: length() Test
		IntegerSet integerSetTest2 = new IntegerSet(Arrays.asList(1,2,3,4));
		System.out.println("Test2: Run length.()");
		System.out.println("Expected length of "+integerSetTest2.toString()+": "+ integerSetTest2.getSet().size());
		System.out.println("Result:"+ integerSetTest2.length());
		System.out.println("\n-------------------------------------------------------------\n");
		
		//Test3  equals()
		IntegerSet integerSetTest3 = new IntegerSet(Arrays.asList(2,4,6,8,10));
		IntegerSet integerSetTest4 = new IntegerSet(Arrays.asList(2,4,6,8,10));
		System.out.println("Test3: Run equals() Expect true");
		System.out.println("IntegerSet 3 and 4 values:"+ integerSetTest3.toString()+","+integerSetTest4.toString() );
		System.out.println("Expected:"+ true);
		System.out.println("Result:"+ integerSetTest3.equals(integerSetTest4));
		System.out.println();
		System.out.println("Test3: Run equals() Expect false");
		System.out.println("IntegerSet 2 and 4 values:"+ integerSetTest2.toString()+","+integerSetTest4.toString() );
		System.out.println("Expected:"+ false);
		System.out.println("Result:"+ integerSetTest2.equals(integerSetTest4));
		System.out.println("\n-------------------------------------------------------------\n");
		
		// Test4 contains
		System.out.println("Test4: contains()");
		System.out.println("Initial Set:"+ integerSetTest2.toString());
		System.out.println("Check if set contains 2 (Expected true)");
		System.out.println("-Result:"+ integerSetTest2.contains(2));
		System.out.println();
		System.out.println("Test4: contains()");
		System.out.println("Initial Set:"+ integerSetTest2.toString());
		System.out.println("Check if set contains 99 (Expected false)");
		System.out.println("-Result:"+ integerSetTest2.contains(99));
		System.out.println("\n-------------------------------------------------------------\n");
		
		// Test5 largest 
		System.out.println("Test5: largest()");
		IntegerSet emptySet = new IntegerSet(Arrays.asList());
		System.out.println("Initial Set:"+ emptySet.toString());
		try {
			System.out.println("Expected: Error");
			System.out.println(emptySet.largest());
			
		}catch (IntegerSetException integerE) {
			System.out.println("-Result: "+integerE.getMessage());
		}
		
		System.out.println();
		System.out.println("Test5: largest()");
		System.out.println("Initial Set:"+ integerSetTest2.toString());
		try {
			System.out.println("Expected: 4");
			System.out.println("-Result: "+ integerSetTest2.largest());
			
		}catch (IntegerSetException integerE) {
			System.out.println(integerE.getMessage());
			
		}
		System.out.println("\n-------------------------------------------------------------\n");

		
		
		
		
		//Test6 smallest
		System.out.println("Test6: smallest()");
		System.out.println("Initial Set:"+ emptySet.toString());
		try {
			System.out.println("Expected: Error");
			System.out.println(emptySet.smallest());
			
		}catch (IntegerSetException integerE) {
			System.out.println("-Result: "+integerE.getMessage());
		}
		
		System.out.println();
		System.out.println("Test6: smallest()");
		System.out.println("Initial Set:"+ integerSetTest2.toString());
		try {
			System.out.println("Expected: 1");
			System.out.println("-Result: "+ integerSetTest2.smallest());
			
		}catch (IntegerSetException integerE) {
			System.out.println(integerE.getMessage());
			
		}
		System.out.println("\n-------------------------------------------------------------\n");

		
		
		//Test 7
		System.out.println("Test7: add(19)");
		System.out.println("Initial Set:"+ integerSetTest2.toString());
		System.out.println("Check if set contains 2 (Expected [1,2,3,4,19])");
		integerSetTest2.add(19);
		System.out.println("-Result:"+ integerSetTest2.toString());
		System.out.println("\n-------------------------------------------------------------\n");
		
		
		
		//Test 8
		System.out.println("Test8: remove(2)");
		System.out.println("Initial Set:"+ integerSetTest2.toString());
		System.out.println("Check if set contains 2 (Expected [1,3,4,19])");
		integerSetTest2.remove(2);
		System.out.println("-Result:"+ integerSetTest2.toString());
		System.out.println("\n-------------------------------------------------------------\n");
		
		
		
		//Test 9
		System.out.println("Test9: Union");
		System.out.println("Initial Set:"+ integerSetTest2.toString());
		System.out.println("Second Set:"+ integerSetTest3.toString());
		System.out.println("Expected: [1, 3, 4, 19, 2, 6, 8, 10]");
		integerSetTest2.union(integerSetTest3);
		System.out.println("-Result:"+ integerSetTest2.toString());
		System.out.println();
		System.out.println("Test9: Union");
		IntegerSet integerSetTest8 = new IntegerSet(Arrays.asList(10,20,30,40));
		IntegerSet integerSetTest9 = new IntegerSet(Arrays.asList(10,20,50,60));
		System.out.println("Initial Set:"+ integerSetTest8.toString());
		System.out.println("Second Set:"+ integerSetTest9.toString());
		System.out.println("Expected: [10,20,30,40,50,60]");
		integerSetTest8.union(integerSetTest9);
		System.out.println("-Result:"+ integerSetTest8.toString());		
		System.out.println("\n-------------------------------------------------------------\n");
		
		//Test 10
		
		System.out.println("Test10: intersect()");
		IntegerSet integerSetTest10 = new IntegerSet(Arrays.asList(1,2,3,4,5,6));
		IntegerSet integerSetTest11 = new IntegerSet(Arrays.asList(2,3,4,10));
		System.out.println("First Set:"+ integerSetTest10.toString());
		System.out.println("Second Set:"+ integerSetTest11.toString());
		System.out.println("Expected: [2, 3, 4]");
		integerSetTest10.intersect(integerSetTest11);
		System.out.println("-Result:"+ integerSetTest10.toString());		
		System.out.println("\n-------------------------------------------------------------\n");
		
		
		//Test 11
		System.out.println("Test11: diff()");
		IntegerSet integerSetTest12 = new IntegerSet(Arrays.asList(1,2,3,4,5,6));
		IntegerSet integerSetTest13 = new IntegerSet(Arrays.asList(2,3,4,10));
		System.out.println("First Set:"+ integerSetTest12.toString());
		System.out.println("Second Set:"+ integerSetTest13.toString());
		System.out.println("Expected: [5,6,10]");
		integerSetTest12.diff(integerSetTest13);
		System.out.println("-Result:"+ integerSetTest12.toString());		
		System.out.println("\n-------------------------------------------------------------\n");
		
		//Test 12 
		System.out.println("Test12: isEmpty()");
		System.out.println("Set:"+ integerSetTest12.toString());
		System.out.println("Expected: true");
		System.out.println("-Result: "+emptySet.isEmpty());
		System.out.println();
		System.out.println("Test12: isEmpty()");
		IntegerSet integerSetTest14 = new IntegerSet(Arrays.asList(2,3,4,10));
		System.out.println("Set:"+ integerSetTest14.toString());
		System.out.println("Expected: false");
		System.out.println("-Result: "+integerSetTest14.isEmpty());
		System.out.println("\n-------------------------------------------------------------\n");
		
		//Test13
		boolean result;
		if (integerSetTest14.toString() instanceof String) {
			result = true;
		} else {
			result = false;
		}
		System.out.println("Test 13: toString()");
		System.out.println("The type for integerSetTest14.toString() is a String");
		System.out.println("Expected: true");
		System.out.println("-Result:"+ result);

		
		
		

		
		

		
		
		
		
		
		
		
		
		
	}

}
