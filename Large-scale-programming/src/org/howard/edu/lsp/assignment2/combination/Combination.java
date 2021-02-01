/* Shreeshail Pokharel   */
package org.howard.edu.lsp.assignment2.combination;
import java.util.ArrayList;

public class Combination {
	
	/**
	 * Given an array of ints and a desired target sum returns the set of 
	 * combinations of any length that add up to that target sum.
	 * 
	 * @param inputList  given array of ints containing numbers
	 * @param targetSum  the number that the combinations need to add up to.
	 * @return returnList an ArrayList containing sets of all possible combinations of indexes summing up to the target
	 */
	public static ArrayList<String> calculateCombinations(int [] inputList,int targetSum){ 
	    
		//ArrayList to store all valid combination indices
		ArrayList <String> returnList = new ArrayList<String>();
		
		//Use two pointers element, and j to itterate through list to find all combinations
	    for (int element =0 ; element< inputList.length-1; element++ ) { //First pointer can only reach second last number
	      
	      int j= element +1;
		  String temp = "[" ;
	      temp += Integer.toString(element);
	      int mySum= inputList[element];
	      int buffer = j;//To see where to itterate next.

	      
	      if (mySum != targetSum){ //If sum equals target before iterating fully it jumps to else statement
	        while (j < inputList.length){
	          
	          mySum += inputList[j];
	       
	          temp += ", "+ Integer.toString(j);
	          j+=1;
	          
	          if(mySum == targetSum){//If you reach target sum append the index
	            temp+="]";
	            returnList.add(temp);

	            temp ="[" + Integer.toString(element);//temp reset
	            j= buffer+1;
	            buffer+=1;
	            mySum=inputList[element];
	          }
	          
	          else if(j == inputList.length){//If nothing has happened after itterating whole list
	            temp ="[" + Integer.toString(element); //temp reset
	            j= buffer+1;
	            buffer+=1;		
	            mySum=inputList[element];
	          }
	          
	          else if (mySum > targetSum) {
	        	  //If mySum> target then restart wth next element
	        	  temp ="[" + Integer.toString(element); //temp reset
	        	  j=buffer+1;
	        	  buffer+=1;
	        	  mySum=inputList[element];
	        	  	  
	          }
	        }
	      }
	      else{
	    	
	    	 //Edge case: If a single element equals to target then it appends that element
	        temp = "[" + Integer.toString(element) +"]";
	        returnList.add(temp);
	      }

	    }
	    //Edge case: if target is last element of the list
	    if (inputList.length !=0 && inputList[inputList.length-1]== targetSum){
	      int lastNum= inputList[inputList.length-1];
	      String temp = "[" + Integer.toString(inputList.length-1) +"]";
	      returnList.add(temp);
	    }
	    return returnList;

	  }
}
