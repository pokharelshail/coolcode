/* Shreeshail Pokharel   */
package org.howard.edu.lsp.assignment2.test;
import org.howard.edu.lsp.assignment2.combination.Combination;
import java.util.ArrayList;
import java.util.Arrays;


public class Test {

	public static void main(String[] args) {
		
		
		Combination test = new Combination(); // Making Combination object to start testing
		
		
		/* 11 different test cases with description of each case */
		
		//Test0
		int[] arr0 = new int[] {};
		int target0=15;
		ArrayList<String> test0= test.calculateCombinations(arr0,target0);
		System.out.println("Test 0 - Empty Array");
		System.out.println("Inputs  : "+ Arrays.toString(arr0)+ " Target: " +target0);
		System.out.println("Outputs : "+ test0);
		System.out.println();
		
		//Test1
		int[] arr1 = new int[] {5,5,10,15};
		int target1 =15;
		ArrayList<String> test1= test.calculateCombinations(arr1,target1);
		System.out.println("Test 1 - Regular");
		System.out.println("Inputs  : "+ Arrays.toString(arr1)+ " Target: " +target1);
		System.out.println("Outputs : "+ test1);
		System.out.println();
		
		//Test2
	    int[] arr2 = new int[] {1,2,3,4,5,6};
		int target2= 6;
		ArrayList<String> test2= test.calculateCombinations(arr2,target2);
		System.out.println("Test 2 - If target is last num");
		System.out.println("Inputs  : "+ Arrays.toString(arr2)+ " Target: " +target2);
		System.out.println("Outputs : "+ test2);
		System.out.println();
		
		
		//Test3
	    int[] arr = new int[] {4};
		int target= 4;
		ArrayList<String> totalCombinations= test.calculateCombinations(arr,target);
		System.out.println("Test 3 - One element and one target");
		System.out.println("Inputs  : "+ Arrays.toString(arr)+ " Target: " +target);
		System.out.println("Outputs : "+ totalCombinations);
		System.out.println();
		
		//Test 4
		int [] arr4 = new int[]{1,1,1,1,1};
		int target4= 6;
	    ArrayList<String> totalCombinations2= test.calculateCombinations(arr4,target4);
		System.out.println("Test 4 - Target not reached");
		System.out.println("Inputs  : "+ Arrays.toString(arr4)+ " Target: " +target4);
		System.out.println("Outputs : "+ totalCombinations2);
		System.out.println();
		
		//Test5
		int [] arr5 = new int[]{1,2,3};
		int target5= 3;
	    ArrayList<String> totalCombinations5= test.calculateCombinations(arr5,target5);
		System.out.println("Test 5 - Regular");
		System.out.println("Inputs  : "+ Arrays.toString(arr5)+ " Target: " +target5);
		System.out.println("Outputs : "+ totalCombinations5);
		System.out.println();	
		
		//Test6
		int [] arr6 = new int[]{0,1,0,1,0,1};
		int target6= 1;
	    ArrayList<String> totalCombinations6= test.calculateCombinations(arr6,target6);
		System.out.println("Test 6 - Dataset with multiple zeros and target");
		System.out.println("Inputs  : "+ Arrays.toString(arr6)+ " Target: " +target6);
		System.out.println("Outputs : "+ totalCombinations6);
		System.out.println();	
		
		//Test7
		int [] arr7 = new int[]{9,9,9,9,9,9,9};
		int target7= 9;
	    ArrayList<String> totalCombinations7= test.calculateCombinations(arr7,target7);
		System.out.println("Test 7 - All nums are target");
		System.out.println("Inputs  : "+ Arrays.toString(arr7)+ " Target: " +target7);
		System.out.println("Outputs : "+ totalCombinations7);
		System.out.println();	
		
		//Test8
		int [] arr8 = new int[]{2,2,2,2,2};
		int target8= 4;
	    ArrayList<String> totalCombinations8= test.calculateCombinations(arr8,target8);
		System.out.println("Test 8 - adding any two equals target");
		System.out.println("Inputs  : "+ Arrays.toString(arr8)+ " Target: " +target8);
		System.out.println("Outputs : "+ totalCombinations8);
		System.out.println();	

		//Test9
		int [] arr9 = new int[]{3,10,10,10,10,10,10,10,10,10};
		int target9= 3;
	    ArrayList<String> totalCombinations9= test.calculateCombinations(arr9,target9);
		System.out.println("Test 9 - First num is target");
		System.out.println("Inputs  : "+ Arrays.toString(arr9)+ " Target: " +target9);
		System.out.println("Outputs : "+ totalCombinations9);
		System.out.println();	
		
		//Test10
		int [] arr10 = new int[]{-1,3,-1};
		int target10= 2;
	    ArrayList<String> totalCombinations10= test.calculateCombinations(arr10,target10);
		System.out.println("Test 10- Negative numbers ");
		System.out.println("Inputs  : "+ Arrays.toString(arr10)+ " Target: " +target10);
		System.out.println("Outputs : "+ totalCombinations10);
		System.out.println();	
		
		
		
		

	}

}
